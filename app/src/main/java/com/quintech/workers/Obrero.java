package com.quintech.workers;

public class Obrero extends Trabajadores {
    protected String location;
    public Obrero() {
        super(25, "Diana Muñoz Estrada", "2 de Abril #423", "875237", false);
        this.location = "Aguascalientes";
    }

    @Override
    public void details() {
        System.out.println("his age is %int his name is %s his direction is %s his code is %s and his status is %boolean");
    }

    @Override
    public void desabilite() {  
        System.out.println(false);  
    }
    
}
