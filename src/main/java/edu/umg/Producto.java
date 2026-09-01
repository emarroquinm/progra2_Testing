package edu.umg;

public class Producto {

    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int existencia;

    public Producto(String codigo, String nombre, String categoria,
                    double precio, int existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencia() {
        return existencia;
    }
}
