/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author igo2
 */
public class Piramide extends Forma3D {
    private double base, altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return base * base + 2 * base * (altura / 2); // aproximação
    }

    @Override
    public double obterVolume() {
        return (1.0 / 3) * base * base * altura;
    }

    @Override
    public String toString() {
        return "Pirâmide (base = " + base + ", altura = " + altura + ")";
    }
}
