package com.esercizio.gestioneprodotti.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class ProdottoService {
    private final PrezzoService prezzoService;
    List<String> nomiProdotti;
    Map<String, Double> prezzi;

    public ProdottoService(PrezzoService prezzoService){
        this.prezzoService = prezzoService;
    }

    @PostConstruct
    public void init(){

        this.nomiProdotti= new ArrayList<>();
        this.prezzi = new HashMap<>();
        nomiProdotti.add("Laptop");
        prezzi.put("Laptop", 1000.0);

        nomiProdotti.add("Smartphone");
        prezzi.put("Smartphone", 500.0);

        nomiProdotti.add("Tablet");
        prezzi.put("Tablet", 300.0);
    }

    public void stampaCatalogo(int percentualeSconto){
        System.out.println("--- Catalogo Scontato del " + percentualeSconto + "% ---");
    
    for (String nome : nomiProdotti) {
        double prezzoOriginale = prezzi.get(nome);
        double prezzoScontato = prezzoService.calcolaPrezzoScontato(prezzoOriginale, percentualeSconto);
        
       System.out.printf(" %-25s %.2f€ -> %.2f%%%n", nome, prezzoOriginale, prezzoScontato);
    }
}
}
