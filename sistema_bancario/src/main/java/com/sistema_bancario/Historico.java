package com.sistema_bancario;

public class Historico {
    private String tipo;
    private Integer valor;

    public Historico(String tipo,Integer valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getValor() {
        return valor;
    }

    
}
