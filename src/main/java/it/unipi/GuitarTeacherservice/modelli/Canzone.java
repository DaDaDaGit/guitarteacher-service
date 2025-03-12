package it.unipi.GuitarTeacherservice.modelli;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="canzone", schema="616954")
public class Canzone implements Serializable{
    @Id
    @Column(name="idcanzone")
    private int idcanzone;
    
    @Column(name="titolo")
    private String titolo;
    @Column(name="artista")
    private String artista;
    @Column(name="durata")
    private String durata;
    
    public Canzone(int id, String t, String a, String d){
        idcanzone = id;
        titolo = t;
        artista = a;
        durata = d;
    }
    
    public Canzone(){}
    
    //GETTERS & SETTERS
    public int getIdCanzone(){
        return idcanzone;
    }
    
    public void setIdCanzone(int idcanzone){
        this.idcanzone = idcanzone;
    }
    
    public String getTitolo(){
        return titolo;
    }
    
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    
    public String getArtista(){
        return artista;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getDurata(){
        return durata;
    }
    
    public void setDurata(String durata){
        this.durata = durata;
    }
}
