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
public class serviceBarber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cliente;
    private String servico;
    private double valor;
    private String dataCorte;
    
    public serviceBarber(Long id,String cliente, String servico, double valor, String dataCorte){
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        this.dataCorte = dataCorte;
       
    }
    public serviceBarber(){}
    
    public Long getId(){
        return id;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public String getServico(){
        return servico;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getDataCorte(){
        return dataCorte;
    }
}
