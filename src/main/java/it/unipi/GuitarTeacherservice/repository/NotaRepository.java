package it.unipi.GuitarTeacherservice.repository;

import it.unipi.GuitarTeacherservice.modelli.Nota;
import org.springframework.data.repository.CrudRepository;


public interface NotaRepository extends CrudRepository<Nota,Integer>{
    Nota findByNome(String n);
}
