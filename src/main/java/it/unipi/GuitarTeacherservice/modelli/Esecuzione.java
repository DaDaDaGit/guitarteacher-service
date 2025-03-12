package it.unipi.GuitarTeacherservice.modelli;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="esecuzione", schema="616954")
public class Esecuzione {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Column(name="idcanzone")
    private int idcanzone;
    @Column(name="nota")
    private String nota;
    @Column(name="tempo")
    private int tempo;

    public Esecuzione(Integer id, int idcanzone, String nota, int tempo) {
        this.id = id;
        this.idcanzone = idcanzone;
        this.nota = nota;
        this.tempo = tempo;
    }

    public Esecuzione(){
    }
    
   /*Getters & Setters*/
    public Integer getId() {
        return id;
    }

    public int getIdcanzone() {
        return idcanzone;
    }

    public String getNota() {
        return nota;
    }

    public int getTempo() {
        return tempo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIdcanzone(int idcanzone) {
        this.idcanzone = idcanzone;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
}
