package com.sistema_bancario;

import java.util.List;
import java.util.ArrayList;

public class ContaBancaria {
   private String nome;
   private Integer saldo;
   private List<Historico> listaHistorico;

    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0;
        this.listaHistorico = new ArrayList<Historico>();
    }

    public String getNome() {
        return nome;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void listarHistoricoTransacoes() {
                for (Historico transacao : listaHistorico) {
            System.out.println("Tipo: " + transacao.getTipo() + ", Valor: R$" + transacao.getValor());
        }
    }

    public void depositar(Integer valor) {
        this.saldo += valor;
        this.listaHistorico.add(new Historico("Deposito", valor));
        System.out.println("Depósito de: R$" + valor + " realizado para o cliente: " + this.getNome());
    }

    public void sacar(Integer valor){
        if(this.saldo < valor){
            System.out.println("Saldo insuficiente para saque de: " + this.nome);
        }else{
            this.saldo -= valor;
            this.listaHistorico.add(new Historico("Saque", valor));
            System.out.println("Saque realizado no valor de: R$" + valor);
        }
    }

    public void extrato(){
        int depositos =0;
        int saques = 0;
        
        for(Historico h : listaHistorico){
            if(h.getTipo().equals("Deposito")){
                depositos += h.getValor();
            }else if(h.getTipo().equals("Saque")){
                saques += h.getValor();
            }
        }
        System.out.println("Extrato de " + this.nome + " saldo: R$" + this.saldo);
        System.out.println("Histórico:");
        System.out.println("Depósitos de R$" + depositos);
        System.out.println("Saques de R$" + saques);
    }
}
