package com.sistema_bancario;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ewerton Hecsley");

        System.out.println(conta.getNome());

        System.out.println(conta.getSaldo());

        conta.sacar(1000);

        conta.depositar(500);

        conta.sacar(50);

        conta.listarHistoricoTransacoes();

        System.out.println(conta.getSaldo());

        conta.sacar(100);

        conta.depositar(50);

        conta.extrato();

        
    }
}