package br.com.tecnotrilho.conexoes;

import br.com.tecnotrilho.beans.Tecnico;
import br.com.tecnotrilho.dao.TecnicoDAO;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;

@Path("/tecnicos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TecnicoResource {

    private TecnicoDAO tecnicoDAO;

    public TecnicoResource() {
        try {
            this.tecnicoDAO = new TecnicoDAO();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @GET
    public Response listarTecnicos() {
        try {
            return Response.ok(tecnicoDAO.listarTodos()).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao buscar técnicos: " + e.getMessage()).build();
        }
    }

    @POST
    public Response inserir(Tecnico tecnico) {
        try {
            String resultado = tecnicoDAO.inserir(tecnico);
            if(resultado.startsWith("Erro")) {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                        .entity(resultado).build();
            }
            return Response.status(Response.Status.CREATED).entity(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao cadastrar técnico: " + e.getMessage()).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(@PathParam("id") int id, Tecnico tecnico) {
        try {
            tecnico.setIdTecnico(id);
            String resultado = tecnicoDAO.atualizar(tecnico);
            if(resultado.startsWith("Erro") || resultado.contains("não encontrado")) {
                return Response.status(Response.Status.NOT_FOUND).entity(resultado).build();
            }
            return Response.ok(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao atualizar técnico: " + e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") int id) {
        try {
            String resultado = tecnicoDAO.deletar(id);
            if (resultado.contains("não encontrado")) {
                return Response.status(Response.Status.NOT_FOUND).entity(resultado).build();
            }
            return Response.ok(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao deletar técnico: " + e.getMessage()).build();
        }
    }


}
