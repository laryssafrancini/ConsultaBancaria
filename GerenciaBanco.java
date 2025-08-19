/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

/**
 *
 * @author usuario
 */
public class GerenciaBanco {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public GerenciaBanco(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    
}
