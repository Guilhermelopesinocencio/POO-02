package org.model;

public class Pagamento {
    
    // Atributos privados
    private long id;
    private TipoPagamento tipoPagamento;
    private float valorTotal;
    
    // Construtor com parâmetros
    public Pagamento(long id, TipoPagamento tipoPagamento, float valorTotal) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }
    
    // Getters e Setters
    public long getId() { 
        return id; 
    }
    
    public void setId(long id) { 
        this.id = id; 
    }
    
    public TipoPagamento getTipoPagamento() { 
        return tipoPagamento; 
    }
    
    public void setTipoPagamento(TipoPagamento tipoPagamento) { 
        this.tipoPagamento = tipoPagamento; 
    }
    
    public float getValorTotal() { 
        return valorTotal; 
    }
    
    public void setValorTotal(float valorTotal) { 
        this.valorTotal = valorTotal; 
    }
}
