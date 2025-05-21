/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import java.util.List;

/**
 *
 * @author igo2
 */


/**
 * Classe que representa o perfil de um usuário no sistema.
 * Cada perfil possui uma descrição e uma lista de permissões.
 */
public class PerfilUsuario {
     private Long id;
    private String descricao;
    private List<String> permissoes;

    /**
     * Construtor padrão.
     */
    public PerfilUsuario() {
    }

     /**
     * Construtor com todos os atributos.
     * @param id Identificador do perfil
     * @param descricao Descrição do perfil
     * @param permissoes Lista de permissões
     */
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    @Override
    public String toString() {
        return "PerfilUsuario{id=" + id + ", descricao='" + descricao + "', permissoes=" + permissoes + '}';
    }
}
