package com.padwan.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jedi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String mentor;
    private StatusEnum status;
    private Double midichlorians;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMentor() {
        return mentor;
    }

    public void setMentor(String nomeMentor) {
        this.mentor = nomeMentor;
    }
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Double getMidichlorians() {
        return midichlorians;
    }

    public void setMidichlorians(Double midichlorians) {
        this.midichlorians = midichlorians;
    }
}
