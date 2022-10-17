
package com.example.demo.Repositorio;
import com.example.demo.Modelo.Client;

/* 
    --------- RETO 5   ---------
Corresponde a Codigo para conteo de clientes. Solicitado para reporte 
*/

/**
 * @author MIGUEL ANGEL ALVAREZ G.
 */


public class CountClient {

    private Long total;
    private Client client;

    public CountClient(Long total, Client client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }    
    
}
