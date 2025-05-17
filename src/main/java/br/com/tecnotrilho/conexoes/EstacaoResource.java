package br.com.tecnotrilho.conexoes;

import br.com.tecnotrilho.beans.Estacao;
import br.com.tecnotrilho.dao.EstacaoDAO;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/estacoes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstacaoResource {

    private EstacaoDAO estacaoDAO;

    public EstacaoResource() {
        try {
            this.estacaoDAO = new EstacaoDAO();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @GET
    public Response listar() {
        try {
            List<Estacao> estacoes = estacaoDAO.listar();
            return Response.ok(estacoes).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao buscar estações: " + e.getMessage()).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response atualizar(@PathParam("id") int id, Estacao estacao) {
        try {
            estacao.setIdEstacao(id);
            String resultado = estacaoDAO.atualizar(estacao);
            if(resultado.startsWith("Erro") || resultado.contains("não encontrada")) {
                return Response.status(Response.Status.NOT_FOUND).entity(resultado).build();
            }
            return Response.ok(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao atualizar estação: " + e.getMessage()).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deletar(@PathParam("id") int id) {
        try {
            String resultado = estacaoDAO.deletar(id);
            if (resultado.contains("não encontrada")) {
                return Response.status(Response.Status.NOT_FOUND).entity(resultado).build();
            }
            return Response.ok(resultado).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao deletar estação: " + e.getMessage()).build();
        }
    }


}
