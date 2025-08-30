package com.mycompany.banco_v2;

public class Banco_V2 {

    public static void main(String[] args) {
        
        /*CRIAÇÃO DO OBJETO DE CONTA*/
        Conta objConta = new Conta("1234", "56789-10");
        
        /*CRIAÇÃO DO METODO DE SAUDAÇÃO*/
        objConta.saudacao();
        //System.out.println("Agencia:" + objConta.agencia);
        //System.out.println("Conta:" + objConta.nroConta);
        
        /*CHAMADA DO MÉTODO DE SALDO*/
        objConta.verificarSaldo();
        //System.out.println("Saldo R$ " + objConta.saldo);
        
        /*CHAMADA DO MÉTODO DE DEPOSITO*/
        objConta.realizarDeposito(1500);
        
        /*CHAMADA DO MÉTODO DE SALDO*/
        objConta.verificarSaldo();
        
        /*CHAMADA DO MÉTODO DE SAQUE*/
        objConta.realizarSaque(500);
                
        /*CHAMADA DO MÉTODO DE SALDO*/
        objConta.verificarSaldo();
        
    }
}
