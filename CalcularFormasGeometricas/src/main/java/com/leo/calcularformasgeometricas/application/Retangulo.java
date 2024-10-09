package com.leo.calcularformasgeometricas.application;

import com.leo.calcularformasgeometricas.util.Calculavel;

public class Retangulo implements Calculavel {

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }

    @Override
    public double calcularPerim() {
        return 2 * (largura + comprimento);
    }

    @Override
    public double calcularCirc() {
        return 0;
    }
}
