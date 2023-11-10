package model;

public class Controlado extends Medicamento {
    private String medico;

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Controlado() {
    }

    public Controlado(int id, String descricao, String medico) {
        super(id, descricao);
        this.medico = medico;
    }

}
