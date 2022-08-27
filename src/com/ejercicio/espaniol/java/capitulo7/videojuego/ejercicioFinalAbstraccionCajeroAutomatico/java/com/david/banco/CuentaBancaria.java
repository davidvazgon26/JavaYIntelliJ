package com.ejercicio.espaniol.java.capitulo7.videojuego.ejercicioFinalAbstraccionCajeroAutomatico.java.com.david.banco;

public abstract class CuentaBancaria {

//    private = solo su clase, public = desde cualquier lugar del proyecto, default = desde su paquete, protected = desde cualquier clase del mismo paquete y tambien desde una clase que herede de la clase contenedora

    //Agregando modificadores de acceso (private, public, default o protected) a variables de instancia para hacerlos inaccesibles desde fuera de la clase.
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    protected double saldo;  //Se cambia a protected para poder acceder a ella en las subclases
    String otroDato;

    //Constantes
    private final double COMISION = 1.2;


    //Constructores

    public CuentaBancaria(String titular, TipoDeCuenta tipoCuenta, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    public CuentaBancaria(){
        tipoDeCuenta = TipoDeCuenta.AHORRO;
    }
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        tipoDeCuenta = TipoDeCuenta.AHORRO;
        this.saldo = saldo;
    }

    public void sacarDinero(double cantidad){
        if (cantidad<0) return;
        saldo -= cantidad;
    }

    public void ingresarDinero(double cantidad){
        if (cantidad<0) return;
        saldo += cantidad;
    }

    protected void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public abstract void informarSobreCondicionesLegales();
}

