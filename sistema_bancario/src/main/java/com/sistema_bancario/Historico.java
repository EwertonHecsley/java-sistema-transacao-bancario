package com.sistema_bancario;

public class Historico {
    private String tipo;
    private Double valor;

    public Historico(String tipo,Double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }
}
