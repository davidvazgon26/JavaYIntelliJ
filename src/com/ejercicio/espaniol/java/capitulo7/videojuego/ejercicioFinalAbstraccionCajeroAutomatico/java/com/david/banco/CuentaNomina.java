package com.ejercicio.espaniol.java.capitulo7.videojuego.ejercicioFinalAbstraccionCajeroAutomatico.java.com.david.banco;

public class CuentaNomina extends  CuentaBancaria{

    public CuentaNomina(String titular, TipoDeCuenta tipoCuenta, double saldo){
        super(titular, tipoCuenta,saldo);
    }

    public CuentaNomina(String titular, double saldo){
        super(titular,saldo);
    }

    public CuentaNomina(){
        super();
    }


    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones Legales de la cuenta Nomina del banco Patito Feliz");
        System.out.println("Bla bla bla bla bla");
        System.out.println("Bla bla bla bla bla");
    }
}












