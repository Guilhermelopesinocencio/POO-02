package org.model;

import java.util.Date;

public class Vistoria {
    private long id;
    private Date data;
    private String checklist;
    private String observacoes;
    private float combustivel;
    private int kmAtual;
    private String danos;
    private Locacao locacao;

    public Vistoria() {}

    public Vistoria(long id, Date data, String checklist, String observacoes, float combustivel,
                    int kmAtual, String danos, Locacao locacao) {
        this.id = id;
        this.data = data;
        this.checklist = checklist;
        this.observacoes = observacoes;
        this.combustivel = combustivel;
        this.kmAtual = kmAtual;
        this.danos = danos;
        this.locacao = locacao;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public String getChecklist() { return checklist; }
    public void setChecklist(String checklist) { this.checklist = checklist; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public float getCombustivel() { return combustivel; }
    public void setCombustivel(float combustivel) { this.combustivel = combustivel; }

    public int getKmAtual() { return kmAtual; }
    public void setKmAtual(int kmAtual) { this.kmAtual = kmAtual; }

    public String getDanos() { return danos; }
    public void setDanos(String danos) { this.danos = danos; }

    public Locacao getLocacao() { return locacao; }
    public void setLocacao(Locacao locacao) { this.locacao = locacao; }
}
