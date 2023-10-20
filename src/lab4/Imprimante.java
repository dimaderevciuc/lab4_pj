package lab4;
import java.util.*;

public class Imprimante extends Electronice{
    int nr_ppm,p_car;
    String rez, culoare;

    public Imprimante(int nr_ppm, int p_car, String rez, String culoare, String nume, String zona_mag, int inventar, int pret, Situatie situatie){
        super(nume,zona_mag,inventar, pret,situatie);
        this.nr_ppm = nr_ppm;
        this.p_car = p_car;
        this.rez = rez;
        this.culoare = culoare;
    }

    public void setNr_ppm(int nr_ppm) {
        this.nr_ppm = nr_ppm;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public void setRez(String rez) {
        this.rez = rez;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNr_ppm() {
        return nr_ppm;
    }

    public int getP_car() {
        return p_car;
    }

    public String getRez() {
        return rez;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Imprimante{}";
    }
}
