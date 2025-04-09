package com.example.exercicio2.service;

import org.springframework.stereotype.Service;
import com.example.exercicio2.repository.FreteRepository;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteRepository> estrategias;

    public FreteService(List<FreteRepository> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String modalidade, double peso) {
        System.out.println("Calculando frete para modalidade: " + modalidade + " com peso: " + peso);
        double valor = estrategias.stream()
                .filter(estrategia ->
                        estrategia.modalidade().equalsIgnoreCase(modalidade))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de frete não encontrado"))
                .calcular(peso);
        System.out.println("Valor calculado: " + valor);
        return valor;
    }
}
