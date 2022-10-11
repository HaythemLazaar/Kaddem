package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

    @Override
    default List<Etudiant> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Etudiant getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void delete(Etudiant entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default Optional<Etudiant> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
    
}
