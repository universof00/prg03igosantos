/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

import java.time.LocalDateTime;

/**
 *
 * @author igo2
 */


/**
 * Representa um log de auditoria de ações de um usuário.
 */
public class LogAuditoria {
      private Long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    public LogAuditoria() {
    }
    
      /**
     * Construtor com todos os campos.
     * @param id ID do log
     * @param usuario Usuário relacionado
     * @param acao Descrição da ação
     * @param dataHora Data e hora da ação
     * @param ip IP de origem
     */
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = dataHora;
        this.ip = ip;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getAcao() {
        return acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "LogAuditoria{id=" + id + ", usuario=" + usuario.getNomeUsuario() + ", acao='" + acao + "', dataHora=" + dataHora + ", ip='" + ip + "'}";
    }
}
