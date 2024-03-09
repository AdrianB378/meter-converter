package com.todocodeacademy.meterconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConverterService implements IConverterService {

    @Autowired
    public Double convertCentimeters(Double meters) {

        return meters*100;
    }

}
