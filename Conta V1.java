package com.mycompany.banco_v1;

public class Conta {
    
    /* DECLARAÇÃO DOS ATRIBUTOS: */
    public String agencia;
    public String nroConta;
    public float saldo = 10000;
    
    /* DECLARANDO O MÉTODO DE VERIFICAR O SALDO: */
    public void verificarSaldo(){
        System.out.println("SALDO R$" + saldo);
    }
    
    /* DECLARANDO O MÉTODO DE REALIZAR DEPÓSITO: */
    public void realizarDeposito(float valorDeposito){
    
        //saldo = saldo + valorDeposito;
        saldo += valorDeposito;
    }
    
    /* DECLARANDO O MÉTODO DE REALIZAR SAQUE: */
    public void realizarSaque(float valorSaque){
    
        saldo -= valorSaque;
        
    }
    
    
    
    
    
}
