package com.mycompany.banco_v2;

public class Conta {
    
    /* DECLARAÇÃO DOS ATRIBUTOS: */
    private String agencia;
    private String nroConta;
    private float saldo = 10000;
    
    /* DECLARAÇÃO DO MÉTODO CONSTRUTOR DE CONTA: */
    public Conta(String agencia, String nroConta){
    
        this.agencia = agencia;
        this.nroConta = nroConta;
        
    }
    
    /* DECALRAÇÃO DO M ÉTODO DE SAUDAÇÃO: */
    public void saudacao(){
    
        System.out.println("BANCO UNIP");
        System.out.println("AGENCIA: " + this.getAgencia());
        System.out.println("CONTA: " + this.getNroConta());
        
    }
    
    /* DECLARANDO O MÉTODO DE VERIFICAR O SALDO: */
    public void verificarSaldo(){
        System.out.println("SALDO R$" + getSaldo());
    }
    
    /* DECLARANDO O MÉTODO DE REALIZAR DEPÓSITO: */
    public void realizarDeposito(float valorDeposito){
    
        //saldo = saldo + valorDeposito;
        setSaldo(getSaldo() + valorDeposito);
    }
    
    /* DECLARANDO O MÉTODO DE REALIZAR SAQUE: */
    public void realizarSaque(float valorSaque){
    
        setSaldo(getSaldo() - valorSaque);
        
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the nroConta
     */
    public String getNroConta() {
        return nroConta;
    }

    /**
     * @param nroConta the nroConta to set
     */
    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
