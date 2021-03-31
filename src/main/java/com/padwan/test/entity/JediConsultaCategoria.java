package com.padwan.test.entity;

public class JediConsultaCategoria {
    private Integer quantidade;
    private StatusEnum categoria;

    public JediConsultaCategoria(Integer quantidade, StatusEnum categoria) {
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public StatusEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(StatusEnum categoria) {
        this.categoria = categoria;
    }
}
