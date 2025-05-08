/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author igo2
 */

/**
 * Classe Fatoriall que realiza o cálculo do fatorial de um número 
 * e gera a fórmula correspondente para o cálculo do fatorial.
 */
class Fatoriall {
    // Variável para armazenar o resultado do fatorial
    private int fatorial = 1;
    // Variável para armazenar a fórmula do cálculo do fatorial
    private String formula = "";
    
    
    
     /**
     * Método que calcula o fatorial de um número e gera a fórmula correspondente.
     * O cálculo é realizado multiplicando os números de `num` até 1.
     * A fórmula é montada concatenando os números e o símbolo "x".
     */
    public void setValor(int num){
        for(int i = num; i > 1; i--){
            fatorial = fatorial * i;
            formula = formula + i + "x";
        }
        // Adiciona o número 1 e o sinal de igual à fórmula
        formula = formula + "1 = ";
    }

    
    /**
     * Método que retorna o valor do fatorial calculado.
     * 
     * @return O valor do fatorial.
     */
    public int getFatorial() {
        return fatorial;
    }
    /**
     * Método que retorna a fórmula do cálculo do fatorial.
     * 
     * @return A fórmula do cálculo do fatorial como uma string.
     */
    public String getFormula() {
        return formula;
    }

}
