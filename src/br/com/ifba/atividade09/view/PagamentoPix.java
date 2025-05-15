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
 * Implementa um pagamento realizado via Pix.
 * Não aplica taxas nem descontos ao valor, mas oferece cashback informativo.
 */

public class PagamentoPix implements Pagamento{
    private double valor;
    private double dinheiroCash = 0.02;
    
    /**
     * Construtor recebe o valor e adiciona na variavél valor.
     * @param valor 
     */
    public PagamentoPix(double valor) {
        this.valor = valor;
    }
    
     /**
     * Retorna o valor total pago via Pix.
     * Nenhuma taxa ou desconto é aplicado.
     */
    @Override
    public double calcularTotal() {
        return this.valor; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Exibe um recibo do pagamento via Pix, incluindo valor original e cashback oferecido.
     * Utiliza uma janela de diálogo (JOptionPane) para mostrar as informações.
     */
    
    @Override
    public void ImprimirRecibo() {
        double cashBack = this.valor * dinheiroCash;
       
         
        String recibo = "Pagamento realizado via Pix.\n" +
                        "Valor original: R$ " + String.format("%.2f", valor) + "\n" +
                        "Cashback (2%): R$ " + String.format("%.2f", cashBack) + "\n";

        JOptionPane.showMessageDialog(null, recibo, "Recibo - Pix com Cashback", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
