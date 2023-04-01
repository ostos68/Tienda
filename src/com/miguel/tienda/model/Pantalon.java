package com.miguel.tienda.model;

public class Pantalon extends Ropa {

    private boolean tieneCremallera;

    public boolean isTieneCremallera() {
        return tieneCremallera;
    }

    public void setTieneCremallera(boolean tieneCremallera) {
        this.tieneCremallera = tieneCremallera;
    }

    @Override
    public String getTipo() {
        return "Pantalon";
    }
}
