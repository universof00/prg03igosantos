/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author igo2
 */
public class Main {
     public static void main(String[] args) {
        Forma[] formas = new Forma[] {
            new Circulo(3),
            new Quadrado(4),
            new Triangulo(5, 2),
            new Esfera(2),
            new Cubo(3),
            new Piramide(4, 6)
        };

        for (Forma f : formas) {
            System.out.println(f.toString());

            if (f instanceof Forma2D) {
                System.out.println("Área: " + ((Forma2D) f).obterArea());
            } else if (f instanceof Forma3D) {
                System.out.println("Área: " + ((Forma3D) f).obterArea());
                System.out.println("Volume: " + ((Forma3D) f).obterVolume());
            }

            System.out.println("--------------------------");
        }
    }
}
