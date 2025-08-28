package org.model;

import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    
    // Atributos privados
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private Status status;
    private List<Locacao> listaLocacao;
    private float valorTotal;
    private String funcionario; // Funcionário responsável pelo contrato
    private Cliente cliente;
    
    // Construtor com parâmetros
    public ContratoLocacao(long id, Date dataContrato, float valorCaucao, Status status, List<Locacao> listaLocacao, float valorTotal, String funcionario, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        this.valorCaucao = valorCaucao;
        this.status = status;
        this.listaLocacao = listaLocacao;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }
    
    // Getters e Setters
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public Date getDataContrato() {
        return dataContrato;
    }
    
    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }
    
    public float getValorCaucao() {
        return valorCaucao;
    }
    
    public void setValorCaucao(float valorCaucao) {
        this.valorCaucao = valorCaucao;
    }
    
    public Status getStatus() {
        return status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    public List<Locacao> getListaLocacao() {
        return listaLocacao;
    }
    
    public void setListaLocacao(List<Locacao> listaLocacao) {
        this.listaLocacao = listaLocacao;
    }
    
    public float getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public String getFuncionario() {
        return funcionario;
    }
    
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
