package com.david.banco;

public class CuentaBancaria {

//    private = solo su clase, public = desde cualquier lugar del proyecto, default = desde su paquete, protected = desde cualquier clase del mismo paquete y tambien desde una clase que herede de la clase contenedora

    //Agregando modificadores de acceso (private, public, default o protected) a variables de instancia para hacerlos inaccesibles desde fuera de la clase.
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;
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
        double comision = calcularComision();
        // if (tipoDeCuenta.equals(TipoDeCuenta.AHORRO)) comision = COMISION; // Lo movemos a un metodo para hacerlo reutilizable
        saldo -= cantidad;
        saldo -= comision;
    }

    private double calcularComision(){
        switch (tipoDeCuenta){
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
        }
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
}

