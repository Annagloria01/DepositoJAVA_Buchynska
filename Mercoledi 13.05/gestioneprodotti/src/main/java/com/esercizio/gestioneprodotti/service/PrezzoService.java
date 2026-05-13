package com.esercizio.gestioneprodotti.service;

import org.springframework.stereotype.Service;

@Service
public class PrezzoService {
    public double calcolaPrezzoScontato (double prezzoOriginale, int percentualeSconto){
        return prezzoOriginale * (1-percentualeSconto / 100.00);
    }
}
