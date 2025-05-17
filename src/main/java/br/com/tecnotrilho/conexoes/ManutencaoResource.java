package br.com.tecnotrilho.conexoes;

import br.com.tecnotrilho.beans.Manutencao;
import br.com.tecnotrilho.dao.ManutencaoDAO;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/manutencoes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ManutencaoResource {

    private ManutencaoDAO manutencaoDAO;

    public ManutencaoResource() {
        try {
            this.manutencaoDAO = new ManutencaoDAO();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @POST
    public Response inserir(Manutencao manutencao) {
        try {
            String resultado = manutencaoDAO.inserir(manutencao);
            if (resultado.startsWith("Erro")) {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                        .entity(resultado).build();
            }
            return Response.status(Response.Status.CREATED).entity(resultado).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao cadastrar manutenção: " + e.getMessage()).build();
        }
    }

    @GET
    public Response listar() {
        try {
            List<Manutencao> manutencoes = manutencaoDAO.listar();
            return Response.ok(manutencoes).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao buscar manutenções: " + e.getMessage()).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(@PathParam("id") int id, Manutencao manutencao) {
        try {
            manutencao.setIdManutencao(id);
            String resultado = manutencaoDAO.atualizar(manutencao);
            if(resultado.startsWith("Erro") || resultado.contains("não encontrada")) {
                return Response.status(Response.Status.NOT_FOUND).entity(resultado).build();
            }
            return Response.ok(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao atualizar manutenção: " + e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") int id) {
        try {
            String resultado = manutencaoDAO.deletar(id);
            if (resultado.contains("não encontrada")) {
                return Response.status(Response.Status.NOT_FOUND).entity(resultado).build();
            }
            return Response.ok(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao deletar manutenção: " + e.getMessage()).build();
        }
    }

}
