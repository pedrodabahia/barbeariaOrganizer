/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberOrganizer.barbearia.controller;

import barberOrganizer.barbearia.entity.cortesBarber;
import barberOrganizer.barbearia.repository.cortesRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MARKETING
 */
@RestController
@RequestMapping("api/cortes")
public class cortesController {
    @Autowired
    cortesRepository repository;
    
    @GetMapping
    public List<cortesBarber> list (){
        System.out.println("Recuperando Cortes");
        return repository.findAll();
    }
    
    @PostMapping
    public void salvar (@RequestBody cortesBarber cortes){
       System.out.println("Salvando o corte "+cortes.getCorte());
        repository.save(cortes);
    }
    @DeleteMapping("/delete/{corte}")
    @Transactional
    public void deletarNome(@PathVariable String corte){
    repository.deleteByCorte(corte);
    }
}
