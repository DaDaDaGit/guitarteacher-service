package it.unipi.GuitarTeacherservice.modelli;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nota", schema="616954")
public class Nota implements Serializable{
    @Id
    @Column(name="nome")
    private String nome;
    @Column(name="pathaudio")
    private String pathaudio;
    @Column(name="pathimage")
    private String pathimage;
    
    public Nota(String n, String pa, String pi){
        nome = n;
        pathaudio = pa;
        pathimage = pi;
    }
    
    public Nota(){}
    
    //GETTERS & SETTERS
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getPathAudio(){
        return pathaudio;
    }
    
    public void setPathAudio(String pathaudio){
        this.pathaudio = pathaudio;
    }
    
    public String getPathImage(){
        return pathimage;
    }
    
    public void setPathImage(String pathimage){
        this.pathimage = pathimage;
    }

}

