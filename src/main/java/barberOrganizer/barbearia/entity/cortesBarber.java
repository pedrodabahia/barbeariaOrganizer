/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberOrganizer.barbearia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author MARKETING
 */
@Entity
public class cortesBarber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String corte;
    private double valor;
    
    
    public cortesBarber(Long id,String corte, double valor ){
        this.id = id;
        this.corte = corte;
        this.valor = valor;
    }
    
    public cortesBarber(){};
    
    public Long getId(){
        return id;
    }
    
    public String getCorte(){
        return corte;
    }
    public double getValor(){
        return valor;
    }
}
    