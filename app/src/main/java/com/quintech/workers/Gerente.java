package com.quintech.workers;

public class Gerente extends Trabajadores {
    protected String area;
    public Gerente() {
        super(28, "Ricardo Garcia Capuchino", "Francisco Villa #315", "956734", true);
        this.area = "Desarrollo Web";
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
