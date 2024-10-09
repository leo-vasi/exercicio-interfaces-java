package com.leo.calcularformasgeometricas.application;


import com.leo.calcularformasgeometricas.util.Calculavel;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma forma geométrica:");
        System.out.println("1 - Triângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Círculo");
        System.out.println("4 - Retângulo");
        System.out.println("5 - Trapézio");
        System.out.print("Escolha um número: ");

        int escolhaForma = sc.nextInt();

        Calculavel forma = null;
        boolean formaValida = true; 

        switch (escolhaForma) {
            case 1:
                System.out.println("Você escolheu Triângulo.");
                System.out.println("Informe os lados do triângulo (A, B, C): ");
                System.out.print("Lado A: ");
                double ladoA = sc.nextDouble();
                System.out.print("Lado B: ");
                double ladoB = sc.nextDouble();
                System.out.print("Lado C: ");
                double ladoC = sc.nextDouble();
                forma = new Triangulo(ladoA, ladoB, ladoC);
                break;
            case 2:
                System.out.println("Você escolheu Quadrado.");
                System.out.print("Informe o lado do quadrado: ");
                double ladoQuadrado = sc.nextDouble();
                forma = new Quadrado(ladoQuadrado);
                break;
            case 3:
                System.out.println("Você escolheu Círculo.");
                System.out.print("Informe o raio do círculo: ");
                double raio = sc.nextDouble();
                forma = new Circulo(raio);
                break;
            case 4:
                System.out.println("Você escolheu Retângulo.");
                System.out.println("Informe a largura e a altura do retângulo: ");
                System.out.print("Largura: : ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                forma = new Retangulo(largura, altura);
                break;
            case 5:
                System.out.println("Você escolheu Trapézio.");
                System.out.println("Informe a base maior, base menor, altura e os lados 1 e 2 do trapézio: ");
                System.out.print("Base maior: ");
                double baseMaior = sc.nextDouble();
                System.out.print("Base menor: ");
                double baseMenor = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaTrapezio = sc.nextDouble();
                System.out.println("Lado 1: ");
                double lado1 = sc.nextDouble();
                System.out.println("Lado 2: ");
                double lado2 = sc.nextDouble();
                forma = new Trapezio(baseMaior, baseMenor, alturaTrapezio, lado1, lado2);
                break;
            default:
                System.out.println("Opção inválida.");
                formaValida = false;
                break;
        }

        if (formaValida) {

            System.out.println("Selecione o tipo de cálculo:");
            System.out.println("1 - Área");
            System.out.println("2 - Perímetro");
            System.out.println("3 - Circunferência");
            System.out.print("Escolha um número: ");

            int escolhaCalculo = sc.nextInt();
            switch (escolhaCalculo) {
                case 1:
                    System.out.println("A área é: " + forma.calcularArea());
                    break;
                case 2:
                    System.out.println("O perímetro é: " + forma.calcularPerim());
                    break;
                case 3:
                    System.out.println("A circunferência é: " + forma.calcularCirc());
                    break;
                default:
                    System.out.println("Opção de cálculo inválida.");
                    break;
            }
        }

        sc.close();
    }
}
