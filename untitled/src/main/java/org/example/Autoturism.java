package org.example;

public class Autoturism {
    public String firma;
    public Combustibil combustibil;

    public Autoturism(String firma, Combustibil combustibil) {
        this.firma = firma;
        this.combustibil = combustibil;
    }

    public String getFirma() {
        return firma;
    }

    public Combustibil getCombustibil() {
        return combustibil;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setCombustibil(Combustibil combustibil) {
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return "Autoturism{" +
                "firma='" + firma + '\'' +
                ", combustibil=" + combustibil +
                '}';
    }
}
