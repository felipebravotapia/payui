package com.felipebravo.payui;

public class Deuda {
    String Empresa;
    String Fecha;
    Integer Precio;

    public Deuda() {
    }

    public Deuda(String empresa, String fecha, Integer precio) {
        Empresa = empresa;
        Fecha = fecha;
        Precio = precio;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }
}
