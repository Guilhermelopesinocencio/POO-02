package org.model;

import java.util.Date;
import java.util.List;

public class Modelo {
    
    // Atributos privados
    private long id;
    private String nome;
    private Date ano;
    private int qtModelo;
    private List<Veiculo> listVeiculo;
    
    // Construtor com parâmetros
    public Modelo(long id, String nome, Date ano, int qtModelo, List<Veiculo> listVeiculo) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.qtModelo = qtModelo;
        this.listVeiculo = listVeiculo;
    }
    
    // Getters e Setters
    public long getId() { 
        return id; 
    }
    
    public void setId(long id) { 
        this.id = id; 
    }
    
    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    
    public Date getAno() { 
        return ano; 
    }
    
    public void setAno(Date ano) { 
        this.ano = ano; 
    }
    
    public int getQtModelo() { 
        return qtModelo; 
    }
    
    public void setQtModelo(int qtModelo) { 
        this.qtModelo = qtModelo; 
    }
    
    public List<Veiculo> getListVeiculo() { 
        return listVeiculo; 
    }
    
    public void setListVeiculo(List<Veiculo> listVeiculo) { 
        this.listVeiculo = listVeiculo; 
    }
}
