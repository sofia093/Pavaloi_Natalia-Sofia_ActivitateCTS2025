package Clase;

import Interfete.AbstractBuilder;

public class PacientBuilder implements AbstractBuilder {

    private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient=new Pacient(nume, false, false, false, false, nume);
    }

    public PacientBuilder arePatRabatabil(boolean arePatRabatabil) {
        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public PacientBuilder areMicDejun(boolean areMicDejun) {
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public PacientBuilder numePacient(String numePacient) {
        this.pacient.setNumePacient(numePacient);
        return this;
    }

    public PacientBuilder areHalat(boolean areHalat) {
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    public PacientBuilder arePapuci(boolean arePapuci){
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    public PacientBuilder areInsotitor(String numeInsotitor) {
        this.pacient.setNumeInsotior(numeInsotitor);
        return this;
    }

    @Override
    public Pacient buildPacient() {
        return null;
    }
}
