package org.model;

import java.util.Date;

public class NotaFiscal {
    private long id;
    private String numero;
    private String serie;
    private Date dataEmissao;
    private float valor;
    private float impostos;
    private Locacao locacao;

    public NotaFiscal() {}

    public NotaFiscal(long id, String numero, String serie, Date dataEmissao, float valor, float impostos, Locacao locacao) {
        this.id = id;
        this.numero = numero;
        this.serie = serie;
        this.dataEmissao = dataEmissao;
        this.valor = valor;
        this.impostos = impostos;
        this.locacao = locacao;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }

    public Date getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(Date dataEmissao) { this.dataEmissao = dataEmissao; }

    public float getValor() { return valor; }
    public void setValor(float valor) { this.valor = valor; }

    public float getImpostos() { return impostos; }
    public void setImpostos(float impostos) { this.impostos = impostos; }

    public Locacao getLocacao() { return locacao; }
    public void setLocacao(Locacao locacao) { this.locacao = locacao; }
}
