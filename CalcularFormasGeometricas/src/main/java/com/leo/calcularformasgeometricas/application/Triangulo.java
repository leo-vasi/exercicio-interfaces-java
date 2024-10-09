package com.leo.calcularformasgeometricas.application;

import com.leo.calcularformasgeometricas.util.Calculavel;

public class Triangulo implements Calculavel {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        double p = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    @Override
    public double calcularPerim() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double calcularCirc() {
        return 0;
    }
}
