package com.ejercicio.espaniol.java.capitulo7.videojuego.ejercicioFinalAbstraccionCajeroAutomatico.java.com.david.banco;

public class CuentaAhorro extends  CuentaBancaria{

    private final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipoCuenta, double saldo){
        super(titular, tipoCuenta,saldo);
    }

    public CuentaAhorro(String titular, double saldo){
        super(titular,saldo);
    }

     public CuentaAhorro(){
        super();
    }

    @Override
    public void sacarDinero(double cantidad){
        if (cantidad<0) return;
        saldo -= cantidad;
        saldo-= COMISION;
    }




    @Override
    public void informarSobreCondicionesLegales() {
        System.out.println("Condiciones Legales de la cuenta Ahorro del banco Patito Feliz");
        System.out.println("Bla bla bla bla bla");
        System.out.println("Bla bla bla bla bla");
        System.out.println("Comision por retiro es de: $"+ COMISION+ " Pesotes Papa!!!");
    }
}
