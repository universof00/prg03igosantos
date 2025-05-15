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
 * Implementa um pagamento realizado via cartão.
 * Calcula o valor total com a taxa do cartão e exibe um recibo.
 */
public class PagamentoCartao implements Pagamento{
    
    private double valor;
    private double taxaDoCartao = 0.05;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }
    
    /**
     * Calcula o total juntamente com a taxa de 5%
     * @return 
     */
    @Override
    public double calcularTotal() {
         return valor + (valor * taxaDoCartao); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      /**
     * Exibe um recibo do pagamento com detalhes do valor, taxa e total.
     * Utiliza uma janela de diálogo (JOptionPane) para exibir as informações.
     */
    @Override
    public void ImprimirRecibo() {
        double taxinhaDoAmor = this.valor * 0.98;
        String recibo = "Pagamento realizado com cartão.\n" +
            "Valor: R$ " + String.format("%.2f", valor) + "\n" +
            "Taxa: R$ " + String.format("%.2f", valor * taxaDoCartao) + "\n" +
            "Taxa do Amor: R$ " + String.format("%.2f", taxinhaDoAmor) + "\n" +
            "Total: R$ " + String.format("%.2f", calcularTotal() + taxinhaDoAmor);

    JOptionPane.showMessageDialog(null, recibo, "Recibo - Cartão", JOptionPane.INFORMATION_MESSAGE);
        
        /*String recibo = "Pagamento realizado com cartão.\n" +
                        "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                        "Taxa: R$ " + String.format("%.2f", valor * taxaDoCartao) + "\n" +
                        "Total: R$ " + String.format("%.2f", calcularTotal());
        JOptionPane.showMessageDialog(null, recibo, "Recibo - Cartão", JOptionPane.INFORMATION_MESSAGE);*/
    }
    
}
