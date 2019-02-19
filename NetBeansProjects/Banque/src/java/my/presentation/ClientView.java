/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.ClientFacade;
import entities.Client;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author nathannzenou
 */

@Named(value = "ClientView")
@RequestScoped
public class ClientView {
    

    @EJB
    private ClientFacade clientFacade;
    private Client client;
    /**
     * Creates a new instance of ClientView
     */
    public ClientView() {
        this.client = new Client();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
     
     
     public Client client(){
         return client; 
     }
     public int getNumberOfClient(){
         return clientFacade.findAll().size();
     }
     public String postClient(){
         this.clientFacade.create(client);
         return "ClientResult";
     }
}
