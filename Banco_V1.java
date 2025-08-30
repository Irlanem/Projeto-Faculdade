package com.mycompany.banco_v1;

public class Banco_V1 {

    public static void main(String[] args) {
        
        //System.out.println("ADS - UNIP - ALPHAVILLE!!!");
        
        /* CRIAÇÃO DO OBJETO DA CLASSE CONTA: */
        Conta objConta = new Conta();
        
        //MOSTRAR SALDO:
        objConta.verificarSaldo();
        
        //REALIZAR DEPÓSITO:
        objConta.realizarDeposito(1500);
        
        //MOSTRAR SALDO:
        objConta.verificarSaldo();
        
        //REALIZAR SAQUE:
        objConta.realizarSaque(836);
        
        //MOSTRAR SALDO:
        objConta.verificarSaldo();
    
    }
}
