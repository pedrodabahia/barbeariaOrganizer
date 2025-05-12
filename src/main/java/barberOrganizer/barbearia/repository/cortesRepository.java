/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberOrganizer.barbearia.repository;

import barberOrganizer.barbearia.entity.cortesBarber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MARKETING
 */
@Repository
public interface cortesRepository extends JpaRepository<cortesBarber, Long>{
    void deleteByCorte(String corte);
}
