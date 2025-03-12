package it.unipi.GuitarTeacherservice.controllers;

import it.unipi.GuitarTeacherservice.modelli.Canzone;
import it.unipi.GuitarTeacherservice.repository.CanzoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/canzoni") //path per la richiesta HTTP 
public class CanzoneController {
    @Autowired
    private CanzoneRepository canzoneRepository;
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Canzone> getAllUsers(){
        return canzoneRepository.findAll();
    }
    
    @GetMapping(path="/canzone") //lo uso per associare la canzone alle note al suo interno
    public @ResponseBody Canzone getCanzoneByIdcanzone(@RequestParam int idcanzone){
        return canzoneRepository.findByIdcanzone(idcanzone);
    }
    
    @DeleteMapping(path="/remove")
    public @ResponseBody Canzone removeCanzoneByIdcanzone(@RequestParam int idcanzone){
        Canzone canzone = canzoneRepository.findByIdcanzone(idcanzone);
        canzoneRepository.delete(canzone);
        return canzone;
    }
}
