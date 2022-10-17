package com.example.demo.Servicio;

/* 
    --------- RETO 5   ---------
Corresponde a Codigo para conteo de clientes. Solicitado para reporte 
*/

/**
 *
 * @author USUARIO
 */
public class Status {
    
    private int completed;
    private int cancelled;

    public Status(int completed, int cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getCancelled() {
        return cancelled;
    }

    public void setCancelled(int cancelled) {
        this.cancelled = cancelled;
    }
    
}