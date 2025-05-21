/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author igo2
 */

/**
 * Representa uma sessão de login de um usuário.
 */
public class Sessao {
    
    private Long id;
    private Usuario usuario;
    private String token;

    public Sessao() {
    }
    
       /**
     * Construtor com atributos.
     * @param id ID da sessão
     * @param usuario Usuário associado
     * @param token Token de autenticação
     */
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getToken() {
        return token;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Sessao{id=" + id + ", usuario=" + usuario.getNomeUsuario() + ", token='" + token + "'}";
    }
}
