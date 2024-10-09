package com.leo.calcularformasgeometricas.application;

import com.leo.calcularformasgeometricas.util.Calculavel;

public class Trapezio implements Calculavel {

    private double baseMaior;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;
    
    public Trapezio (double baseMaior, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double calcularPerim() {
        return baseMaior + baseMenor + lado1 + lado2;
    }

    @Override
    public double calcularCirc() {
        return 0;
    }

}
