package com.sistema_bancario;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ewerton Hecsley");

        System.out.println(conta.getNome());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getListaHistorico());
    }
}