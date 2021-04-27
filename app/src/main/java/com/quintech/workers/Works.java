package com.quintech.workers;


import java.util.List;
import java.util.Optional;

public class Works {
    private List<Optional<Trabajadores>> trabajador;

    public Works(List<Optional<Trabajadores>> trabajador) {
        this.trabajador = trabajador;
    }

    public void filterAge(){
        trabajador.stream().filter(Optional::isPresent)
        .map(Optional::get)
        .map(Trabajadores::getAge)
        .forEach(System.out::println);
    }

    public void filterName(){
        trabajador.stream().filter(Optional::isPresent)
        .map(Optional::get)
        .map(Trabajadores::getName)
        .forEach(System.out::println);
    }

    public void filterCode(){
        trabajador.stream().filter(Optional::isPresent)
        .map(Optional::get)
        .map(Trabajadores::getCode)
        .forEach(System.out::println);
    }

    // Predicate<desabilite> mapDesabilite = new Predicate<desabilite>(){
    //     @Override
    //     public boolean test(desabilite desabilite){
    //         return false;
    //     }
    // }

    // public void mapDesabilited(){
    //     trabajador.stream().filter(Optional::isPresent)
    //     .map(Optional::get)
    //     .map(Trabajadores::getCode)
    //     .forEach(System.out::println);
    // }

    public void reviewInstances(){
        trabajador.stream().filter(Optional::isPresent)
        .map(Optional::get)
        .map(Trabajadores::instance)
        .forEach(System.out::println);
    }
}
