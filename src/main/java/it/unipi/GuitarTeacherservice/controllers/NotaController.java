package it.unipi.GuitarTeacherservice.controllers;

import it.unipi.GuitarTeacherservice.modelli.Nota;
import it.unipi.GuitarTeacherservice.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/note") //path per la richiesta HTTP 
public class NotaController {
    @Autowired
    private NotaRepository notaRepository;
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Nota> getAllUsers(){
        return notaRepository.findAll();
    }
    
    @GetMapping(path="/nota") //lo uso per stampare solo le note presenti in una canzone
    public @ResponseBody Nota getNotaByNome(@RequestParam String nome){
        return notaRepository.findByNome(nome);
    }
}
