
package com.factura.model;

/**
 *
 * @author lreye
 */
public class FacturaElectronica {
    private int numero;
    private String cliente;
    private double monto;

    public FacturaElectronica(int numero, String cliente, double monto) {
        this.numero = numero;
        this.cliente = cliente;
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}
