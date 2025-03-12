package it.unipi.GuitarTeacherservice.repository;

import it.unipi.GuitarTeacherservice.modelli.Esecuzione;
import org.springframework.data.repository.CrudRepository;


public interface EsecuzioneRepository extends CrudRepository<Esecuzione,Integer>{
    //prendo tutte le entrate di esecuzione con un determinato idcanzone
    Iterable<Esecuzione> findByIdcanzone(int idcanzone);
}
