    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberOrganizer.barbearia.controller;

import barberOrganizer.barbearia.entity.serviceBarber;
import barberOrganizer.barbearia.repository.serviceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MARKETING
 */
@RestController
@RequestMapping("api/services")
public class servicesController {
    @Autowired
    serviceRepository repository;
    
    @GetMapping
    public List<serviceBarber> list (){
        System.out.println("Recuperando Servicos");
        return repository.findAll();
    }
    
    @PostMapping
    public void salvar (@RequestBody serviceBarber services){
        System.out.println("Salvando servico" + services.getCliente());
        repository.save(services);
    }
    
    
}
