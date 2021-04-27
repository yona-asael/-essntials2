package com.quintech.workers;

public class Supervisor extends Trabajadores {
    protected String charge;
    public Supervisor() {
        super(23, "Juan Perez Duran", "Juarez #23", "542132", true);
        this.charge = "Supervisor";
    }

    @Override
    public void details() {
        System.out.println("his age is %int his name is %s his direction is %s his code is %s and his status is %boolean"); 
    }

    @Override
    public void desabilite() {
        System.out.println(true);
    }
    
}
