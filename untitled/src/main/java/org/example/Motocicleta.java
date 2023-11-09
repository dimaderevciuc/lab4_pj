package org.example;

public class Motocicleta extends Autoturism{
    public String data;

    public Motocicleta(String firma, Combustibil combustibil, String data) {
        super(firma, combustibil);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "data='" + data + '\'' +
                ", firma='" + firma + '\'' +
                ", combustibil=" + combustibil +
                '}';
    }
}
