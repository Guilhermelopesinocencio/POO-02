package org.model;

import java.util.List;

public class Marca {
    
    // Atributos privados
    private long id;
    private String nome;
    private List<Modelo> listModelo;
    
    // Construtor com parâmetros
    public Marca(long id, String nome, List<Modelo> listModelo) {
        this.id = id;
        this.nome = nome;
        this.listModelo = listModelo;
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
    
    public List<Modelo> getListModelo() { 
        return listModelo; 
    }
    
    public void setListModelo(List<Modelo> listModelo) { 
        this.listModelo = listModelo; 
    }
}
