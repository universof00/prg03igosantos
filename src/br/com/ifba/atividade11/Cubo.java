/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author igo2
 */
public class Cubo extends Forma3D {
    private final double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obterVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public String toString() {
        return "Cubo (lado = " + lado + ")";
    }
}
