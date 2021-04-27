package com.quintech.workers;
import java.math.BigDecimal;
// import java.util.function.Predicate;

public abstract class Trabajadores {

    protected BigDecimal age;
    protected String name;
    protected String direction;
    protected String code;
    protected boolean status;

    public abstract void details();
    public abstract void desabilite();
     
    // Predicate<Integer> desabilite = new Predicate<Integer>(){
        
    // }

    public Trabajadores(int value, String name, String direction, String code, boolean status) {
        this.setAge(new BigDecimal(value));
        this.setName(name);
        this.setDirection(direction);
        this.setCode(code);
        this.status = false;

    }
    public BigDecimal getAge() {
        return this.age;
    }
    public void setAge(BigDecimal age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getdirection() {
        return this.direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void statusOn(String status) {
        this.status = true;
    }
    public void statusOff(String status) {
        this.status = false;
    }
    public boolean Satus() {
        return this.status;
    }
    public void instance(){
        if(supervisor instanceof Trabajadores)
        System.out.println(true);
        if(obrero instanceof Trabajadores){
        System.out.println(true);
        if(gerente instanceof Trabajadores){
        System.out.println(true);
        }else{
            System.out.println(false);
        }
        }
    } 
}
