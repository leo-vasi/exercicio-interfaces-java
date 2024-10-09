package com.leo.calcularformasgeometricas.application;

import com.leo.calcularformasgeometricas.util.Calculavel;

public class Quadrado implements Calculavel{
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
       return lado * lado;
    }

    @Override
    public double calcularPerim() {
        return 4 * lado;
    }

    @Override
    public double calcularCirc() {
        return 0;
    }
    
}
