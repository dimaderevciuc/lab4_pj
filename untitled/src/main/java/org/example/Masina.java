package org.example;

public class Masina extends Autoturism{
    public int pret;
    public String model;

    public Masina(String firma, Combustibil combustibil, int pret, String model) {
        super(firma, combustibil);
        this.pret = pret;
        this.model = model;
    }

    public int getPret() {
        return pret;
    }

    public String getModel() {
        return model;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "pret=" + pret +
                ", model='" + model + '\'' +
                ", firma='" + firma + '\'' +
                ", combustibil=" + combustibil +
                '}';
    }
}
