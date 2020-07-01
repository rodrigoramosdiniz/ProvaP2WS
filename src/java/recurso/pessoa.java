/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.Pessoa;

/**
 * REST Web Service
 *
 * @author Rodrigo
 */
@Path("pessoa")
public class pessoa {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of pessoa
     */
    public pessoa() {
    }

    /**
     * Retrieves representation of an instance of recurso.pessoa
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String retornaPessoa(Pessoa pessoa) {
               
        pessoa.setImc(pessoa.getPeso()/(pessoa.getAltura() * pessoa.getAltura()));

        return String.valueOf(pessoa.getImc());
        
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    
    public void inserePessoa(Pessoa pessoa) {

        System.out.println("Dados da Pessoa");  
            System.out.println("Altura da Pessoa é: "+pessoa.getAltura());
            System.out.println("Peso da Pessoa é: "+pessoa.getPeso());
        System.out.println("-----------------");

    }
}
