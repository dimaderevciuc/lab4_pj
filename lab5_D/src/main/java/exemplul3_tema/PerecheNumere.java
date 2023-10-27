package exemplul3_tema;

public class PerecheNumere {
    private int a;
    private int b;

    public PerecheNumere (){

    }
    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean Fibonacci(){
        int nr1 = 1, nr2 = 1, nr3;
        if(a == nr1 && b == nr2){
            return true;
        }
        else {
            while() {
                nr3 = nr1 + nr2;
                nr1 = nr2;
                nr2 = nr3;
                if(a == nr1 && b == nr2){
                    return true;
                }
            }
        }
        return false;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a + ", b=" + b + '}';
    }
}
