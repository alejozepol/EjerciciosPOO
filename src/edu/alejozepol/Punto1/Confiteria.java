/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alejozepol.Punto1;
/**
 *
 * @author alejozepol
 */
public class Confiteria {
    private int idProducto;
    private String producto;
    private long valor;

    public Confiteria(int idProducto, String producto, long valor) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.valor = valor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Codigo de Producto=" + idProducto + " Descripcion=" + producto + " Valor=" + valor+"\n";
    }
    

 
}
