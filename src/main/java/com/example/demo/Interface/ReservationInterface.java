/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Reservation;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;



/**
 *
 * @author MIGUEL ANGEL ALVAREZ G.
 */

public interface ReservationInterface extends CrudRepository<Reservation, Integer> {

    /*
        -------- CODIGO RETO 5   ----------------
    El código es el mismo como en el reto 3 y 4 y solo le agregamos
     *para el reto 5 la parte de los reportes de Reservation
     */

    public List<Reservation> findAllByStatus (String status);
    
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore (Date datoUno, Date datoDos); 
    
    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();
    
}
