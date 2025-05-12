/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author igo2
 */
public class Main {
    
    public static void main(String[] args) {
         ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta("Jonatas Bastos", "cp");
        conta1.depositar(10000000);
        conta1.sacar(789.8F);
        conta1.pagarMensalidade();
        conta1.sacar(conta1.getSaldo());
        conta1.fecharConta();

        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta("Maria", "cp");
        conta2.depositar(2500);
        conta2.sacar(500);
        conta2.pagarMensalidade();
        conta2.sacar(conta2.getSaldo());
        conta2.fecharConta();

        ContaBanco conta3 = new ContaBanco();
        conta3.abrirConta("Carlos", "cc");
        conta3.depositar(800);
        conta3.sacar(300);
        conta3.pagarMensalidade();
        conta3.sacar(conta3.getSaldo());
        conta3.fecharConta();

        ContaBanco conta4 = new ContaBanco();
        conta4.abrirConta("Ana", "cp");
        conta4.depositar(1200);
        conta4.sacar(600);
        conta4.pagarMensalidade();
        conta4.sacar(conta4.getSaldo());
        conta4.fecharConta();

        ContaBanco conta5 = new ContaBanco();
        conta5.abrirConta("Roberto", "cc");
        conta5.depositar(950);
        conta5.sacar(150);
        conta5.pagarMensalidade();
        conta5.sacar(conta5.getSaldo());
        conta5.fecharConta();

        ContaBanco conta6 = new ContaBanco();
        conta6.abrirConta("Lucia", "cp");
        conta6.depositar(3100);
        conta6.sacar(2000);
        conta6.pagarMensalidade();
        conta6.sacar(conta6.getSaldo());
        conta6.fecharConta();

        ContaBanco conta7 = new ContaBanco();
        conta7.abrirConta("Fernando", "cc");
        conta7.depositar(700);
        conta7.sacar(300);
        conta7.pagarMensalidade();
        conta7.sacar(conta7.getSaldo());
        conta7.fecharConta();

        ContaBanco conta8 = new ContaBanco();
        conta8.abrirConta("Patricia", "cp");
        conta8.depositar(1800);
        conta8.sacar(800);
        conta8.pagarMensalidade();
        conta8.sacar(conta8.getSaldo());
        conta8.fecharConta();

        ContaBanco conta9 = new ContaBanco();
        conta9.abrirConta("João", "cc");
        conta9.depositar(600);
        conta9.sacar(100);
        conta9.pagarMensalidade();
        conta9.sacar(conta9.getSaldo());
        conta9.fecharConta();

        ContaBanco conta10 = new ContaBanco();
        conta10.abrirConta("Beatriz", "cp");
        conta10.depositar(2100);
        conta10.sacar(1100);
        conta10.pagarMensalidade();
        conta10.sacar(conta10.getSaldo());
        conta10.fecharConta();
    }
    
}
