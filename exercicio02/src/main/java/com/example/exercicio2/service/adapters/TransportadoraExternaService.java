package com.example.exercicio2.service.adapters;

import com.example.exercicio2.repository.FreteRepository;
import com.example.exercicio2.service.strategies.TransportadoraService;
import org.springframework.stereotype.Service;

@Service("transportadoraExterna")
public class TransportadoraExternaService implements FreteRepository {
    private final TransportadoraService transportadoraService;

    public TransportadoraExternaService() {
        transportadoraService = new TransportadoraService();
    }

    @Override
    public double calcular(double peso) {
        System.out.println("Calculando frete com a transportadora...");
        return transportadoraService.calcular(peso) * 1.2;
    }

    @Override
    public String modalidade() {
        return "transportadoraExterna";
    }
}

