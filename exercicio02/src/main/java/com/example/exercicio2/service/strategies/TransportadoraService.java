package com.example.exercicio2.service.strategies;

import com.example.exercicio2.repository.FreteRepository;
import org.springframework.stereotype.Component;

@Component
public class TransportadoraService implements FreteRepository {
    @Override
    public double calcular(double peso) {
        return peso * 3;
    }

    @Override
    public String modalidade() {
        return "transportadora";
    }
}