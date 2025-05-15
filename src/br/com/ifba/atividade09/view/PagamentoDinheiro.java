/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import javax.swing.JOptionPane;

/**
 *
 * @author igo2
 */


/**
 * Implementa um pagamento realizado em dinheiro.
 * Aplica um desconto ao valor original e exibe um recibo com os detalhes.
 */
public class PagamentoDinheiro implements Pagamento{
    
    
    private double valor;
    private double descontoDinheiro = 0.10;
    
    /**
     * Construtor recebe o valor e adiciona na variavél valor.
     * @param valor 
     */
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    
    /**
     * Calcula o total a se pagar mais o desconto, por estar usando o dinheiro como
     * forma de pagamento.
     * @return 
     */
    @Override
    public double calcularTotal() {
        return valor - (valor * descontoDinheiro); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Exibe um recibo do pagamento em dinheiro, com detalhes do valor, desconto e total.
     * Utiliza uma janela de diálogo (JOptionPane) para exibir as informações.
     */
    @Override
    public void ImprimirRecibo() {
        String recibo = "Pagamento realizado com Dinheiro.\n" +
                        "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                        "Desconto: R$ " + String.format("%.2f", valor * descontoDinheiro) + "\n" +
                        "Total: R$ " + String.format("%.2f", calcularTotal());
        JOptionPane.showMessageDialog(null, recibo, "Recibo - Cartão", JOptionPane.INFORMATION_MESSAGE); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
