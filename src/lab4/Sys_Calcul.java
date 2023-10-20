package lab4;

public class Sys_Calcul extends Electronice{
    public String tip_monitor;
    public int vit_proc, c_hdd;
    public enum Sys_Operare{LINUX, WINDOWS};
    public Sys_Operare sys_operare;
    public Sys_Calcul(String nume, String zona_mag, int inventar, int pret, String tip_monitor, int vit_proc, int c_hdd, Situatie situatie,Sys_Operare sys_operare) {
        super(nume, zona_mag, inventar, pret, situatie);
        this.tip_monitor = tip_monitor;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sys_operare = sys_operare;
    }

    public Sys_Operare getSys_operare() {
        return sys_operare;
    }

    public void setSys_operare(Sys_Operare sys_operare) {
        this.sys_operare = sys_operare;
    }

    public String getTip_monitor() {
        return tip_monitor;
    }

    public int getVit_proc() {
        return vit_proc;
    }

    public int getC_hdd() {
        return c_hdd;
    }

    public void setTip_monitor(String tip_monitor) {
        this.tip_monitor = tip_monitor;
    }

    public void setVit_proc(int vit_proc) {
        this.vit_proc = vit_proc;
    }

    public void setC_hdd(int c_hdd) {
        this.c_hdd = c_hdd;
    }

    @Override
    public String toString() {
        return "Sys_Calcul{}";
    }
}
