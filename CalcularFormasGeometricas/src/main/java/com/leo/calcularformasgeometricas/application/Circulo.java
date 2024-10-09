package com.leo.calcularformasgeometricas.application;

import com.leo.calcularformasgeometricas.util.Calculavel;

public class Circulo implements Calculavel {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerim() {
        return 0;
    }

    @Override
    public double calcularCirc() {
        return 2 * Math.PI * raio;
    }
}
