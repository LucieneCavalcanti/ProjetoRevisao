package model;

public class Lote {
    private String numero;
    private String dataValidade;
    private int qtde;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public Lote() {
    }
    public Lote(String numero, String dataValidade, int qtde) {
        this.numero = numero;
        this.dataValidade = dataValidade;
        this.qtde = qtde;
    }
    
}
