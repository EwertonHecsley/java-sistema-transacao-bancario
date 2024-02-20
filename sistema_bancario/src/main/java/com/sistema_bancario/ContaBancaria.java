package com.sistema_bancario;

import java.util.List;
import java.util.ArrayList;

public class ContaBancaria {
    String nome;
    Double saldo;
    List<Historico> listaHistorico;

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.listaHistorico = new ArrayList<Historico>();
    }
}
