package it.unipi.GuitarTeacherservice.repository;

import it.unipi.GuitarTeacherservice.modelli.Canzone;
import org.springframework.data.repository.CrudRepository;


public interface CanzoneRepository extends CrudRepository<Canzone,Integer>{
    Canzone findByIdcanzone(int id);
}
