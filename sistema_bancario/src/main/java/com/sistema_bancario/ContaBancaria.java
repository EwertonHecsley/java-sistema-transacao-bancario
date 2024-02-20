package com.sistema_bancario;

import java.util.List;
import java.util.ArrayList;

public class ContaBancaria {
   private String nome;
   private Double saldo;
   private List<Historico> listaHistorico;

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.listaHistorico = new ArrayList<Historico>();
    }

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<Historico> getListaHistorico() {
        return listaHistorico;
    }
}
