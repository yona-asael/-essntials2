package com.quintech;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.quintech.workers.Works;
import com.quintech.workers.Trabajadores;
import com.quintech.workers.Gerente;
import com.quintech.workers.Obrero;
import com.quintech.workers.Supervisor;

// import com.quintech.entties.Light;

public class App {
    
    public static void main(String[] args) {
        // Light light = new Light(10000);
        // light.turnOn();
        // System.out.println(
        //     String.format(
        //         "The light with intesity %s is Turn on? %s", 
        //         light.getIntenesntiy().toPlainString(),
        //         light.itIsOn()
        //     )
        // );
        System.out.println("---------Home Work 2: The Workers---------");
        List<Optional<Trabajadores>> trabajador = new ArrayList<>();
            trabajador.add(Optional.ofNullable(new Gerente()));
            trabajador.add(Optional.ofNullable(new Obrero()));
            trabajador.add(Optional.ofNullable(new Supervisor()));
            Works works = new Works( trabajador);
            works.filterAge(); 
            works.filterName();
            works.filterCode();
            // corral.anyAnimal("Camila");
            
    }
}
