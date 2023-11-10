package model;

public class Generico extends Medicamento {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Generico() {
    }

    public Generico(int id, String descricao, float valor) {
        super(id, descricao);
        this.valor = valor;
    }

    
}
