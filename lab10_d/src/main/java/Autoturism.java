public class Autoturism extends Vehicul {
    private String volum_port;
    private int greutate_port;

    public Autoturism(String marca, int pret, String volum_port, int greutate_port) {
        super(marca, pret);
        this.volum_port = volum_port;
        this.greutate_port = greutate_port;
    }

    public String getVolum_port() {
        return volum_port;
    }

    public void setVolum_port(String volum_port) {
        this.volum_port = volum_port;
    }

    public int getGreutate_port() {
        return greutate_port;
    }

    public void setGreutate_port(int greutate_port) {
        this.greutate_port = greutate_port;
    }

    @Override
    public String toString() {
        return "Autoturism{" +
                "volum_port='" + volum_port + '\'' +
                ", greutate_port=" + greutate_port +
                ", marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
