package com.padwan.test.dto;

import com.padwan.test.entity.Jedi;
import com.padwan.test.entity.StatusEnum;

public class JediDTO {

    private Integer id;
    private String nome;
    private String mentor;
    private StatusEnum status;
    private Double midichlorians;

    public JediDTO() {

    }

    public JediDTO(Jedi jedi) {
        this.id = jedi.getId();
        this.nome = jedi.getNome();
        this.mentor = jedi.getMentor();
        this.status = jedi.getStatus();
        if(jedi.getMidichlorians() != null){
            this.midichlorians = jedi.getMidichlorians().doubleValue();
        } else{
            this.midichlorians = 0.0;

        };

    }

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

    public void setMentor(String mentor) {
        this.mentor = mentor;
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