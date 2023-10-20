package lab4;
import java.util.*;

public class Copiatoare extends Electronice{
    public int p_ton;
    public enum Format{A3,A4};
    public Format format;
    public Copiatoare(String nume, String zona_mag, int inventar, int pret, int p_ton, Situatie situatie,  Format format) {
        super(nume, zona_mag, inventar, pret, situatie);
        this.p_ton = p_ton;
        this.format = format;
    }


    public int getP_ton() {
        return p_ton;
    }

    public Format getFormat() {
        return format;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Copiatoare{}";
    }
}
