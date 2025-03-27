package Clase;

import Interfete.AbstractBuilder;

public class PacientBuilder implements AbstractBuilder {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuci;
    private boolean areHalat;
    private String numeInsotior;

    public PacientBuilder() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuci = false;
        this.areHalat = false;
        this.numeInsotior = "N/A";
    }

    public PacientBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilder setNumeInsotior(String numeInsotior) {
        this.numeInsotior = numeInsotior;
        return this;
    }

    @Override
    public Pacient build2() {
        return new Pacient(this.numePacient, this.arePatRabatabil, this.areMicDejun, this.arePapuci, this.areHalat, this.numeInsotior);
    }
}
