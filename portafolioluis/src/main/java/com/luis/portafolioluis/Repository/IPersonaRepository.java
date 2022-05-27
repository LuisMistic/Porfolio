
package com.luis.portafolioluis.Repository;

import com.luis.portafolioluis.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPersonaRepository extends JpaRepository<Persona,Integer> {
    
}
