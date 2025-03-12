package it.unipi.GuitarTeacherservice.controllers;

import it.unipi.GuitarTeacherservice.modelli.Esecuzione;
import it.unipi.GuitarTeacherservice.repository.EsecuzioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/esecuzione")
public class EsecuzioneController {
    @Autowired
    private EsecuzioneRepository esecuzioneRepository;
    
    @GetMapping(path="/canzone") //dato un id recupero tutti dati relativi all'esecuzione della canzone
    public @ResponseBody Iterable<Esecuzione> getEsecuzioneByIdcanzone(@RequestParam int idcanzone){
        return esecuzioneRepository.findByIdcanzone(idcanzone);
    }
}

