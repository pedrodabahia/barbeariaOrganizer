/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberOrganizer.barbearia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import barberOrganizer.barbearia.entity.serviceBarber;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MARKETING
 */
@Repository
public interface serviceRepository extends JpaRepository<serviceBarber, Long> {
        
}
