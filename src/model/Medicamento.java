package model;

import java.util.ArrayList;

public class Medicamento{
    private int id;
    private String descricao;
    private ArrayList<Lote> lotes;
    
    public void adicionarLote(Lote obj){
        lotes.add(obj);
    }

    public Medicamento() {
    }
    public Medicamento(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}