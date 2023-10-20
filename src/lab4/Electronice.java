package lab4;

public class Electronice{
    public String nume, zona_mag;
    public int inventar, pret;
    public enum Situatie{ACHIZITIONAT, VANDUT, EXPUS};
    public Situatie situatie;
    public Electronice(String nume, String zona_mag, int inventar, int pret, Situatie situatie){
        this.nume = nume;
        this.zona_mag = zona_mag;
        this.inventar = inventar;
        this.pret = pret;
        this.situatie = situatie;
    }

    public Situatie getSituatie() {
        return situatie;
    }

    public void setSituatie(Situatie situatie) {
        this.situatie = situatie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public void setInventar(int inventar) {
        this.inventar = inventar;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public int getInventar() {
        return inventar;
    }

    public int getPret() {
        return pret;
    }
}
