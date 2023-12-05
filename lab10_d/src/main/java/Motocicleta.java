public class Motocicleta extends Vehicul{
    private int viteza;

    public Motocicleta(String marca, int pret, int viteza) {
        super(marca, pret);
        this.viteza = viteza;
    }

    public Motocicleta(String marca, int pret) {
        super(marca, pret);
    }

    public int getViteza() {
        return viteza;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "viteza=" + viteza +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
