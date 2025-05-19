/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import java.util.Arrays;

/**
 *
 * @author igo2
 */
public class Main {
     public static void main(String[] args) {
        // Criar perfil
        PerfilUsuario adminPerfil = new PerfilUsuario(1L, "Administrador", Arrays.asList("GERENCIAR_USUARIOS", "VISUALIZAR_LOGS"));

        // Criar usuário
        Usuario admin = new Usuario(1L, adminPerfil, "admin", "admin@email.com", "123456", true);

        // Tentar login
        System.out.println("Login com senha correta: " + admin.logar("123456"));
        System.out.println("Login com senha incorreta: " + admin.logar("senhaErrada"));

        // Criar sessão
        Sessao sessao = admin.criarSessao();
        System.out.println("Sessão criada: " + sessao);

        // Exibir logs
        System.out.println("Logs de auditoria:");
        for (LogAuditoria log : admin.getLogs()) {
            System.out.println(log);
        }
    }
}
