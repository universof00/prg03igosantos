/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igo2
 */

/**
 * Representa um usuário do sistema.
 */
public class Usuario {
    
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
    private List<LogAuditoria> logs = new ArrayList<>();
    private List<Sessao> sessoes = new ArrayList<>();

    public Usuario() {
    }
    
     /**
     * Construtor com atributos principais.
     * @param id ID do usuário
     * @param perfil Perfil associado
     * @param nomeUsuario Nome de login
     * @param email E-mail
     * @param senha Senha
     * @param ativo Status do usuário
     */
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<LogAuditoria> getLogs() {
        return logs;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    /**
     * Tenta logar o usuário. Atualiza o último login e registra um log.
     * @param senha senha digitada
     * @return true se a senha estiver correta
     */
    public boolean logar(String senha) {
        if (this.senha.equals(senha)) {
            this.ultimoLogin = LocalDateTime.now();
            logs.add(new LogAuditoria(null, this, "Login bem-sucedido", LocalDateTime.now(), "127.0.0.1"));
            return true;
        } else {
            logs.add(new LogAuditoria(null, this, "Tentativa de login com senha incorreta", LocalDateTime.now(), "127.0.0.1"));
            return false;
        }
    }

    /**
     * Cria uma nova sessão para o usuário.
     * @return a nova sessão criada
     */
    public Sessao criarSessao() {
        Sessao sessao = new Sessao(null, this, "token_" + System.currentTimeMillis());
        sessoes.add(sessao);
        return sessao;
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nomeUsuario='" + nomeUsuario + "', email='" + email + "', ativo=" + ativo + "}";
    }

}
