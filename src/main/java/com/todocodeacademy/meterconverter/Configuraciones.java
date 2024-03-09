package com.todocodeacademy.meterconverter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuraciones { //Configuraciones tiene que crearse en el paquete configuracion, en este caso lo cree
                               // donde esta el main como clase independiente

    @Bean
    public Double myDouble() {
        return 0.0;
    }
}
