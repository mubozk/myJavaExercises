public class Lira {
    private int l;
    private int k;
    public Lira() {
        this.l = 0;
        this.k = 0;
    }
    public Lira(int l, int k) {
        this.l = l;
        this.k = k;
    }
    public int getL() {
        return (this.l) ;
    }
    public int getK() {
        return (this.k) ;
    }
    static String intToString( int m) {
        if (m < 0)
            return ("00");
        else if (m < 10)
            return ("0" + String.valueOf(m));
        else
            return (String.valueOf(m));
    }
    public String toString() {
        return (intToString(this.l) + "." + intToString(this.k));
    }

    String diffrence(Lira m) {
        int m1 = (m.getL()*100) + m.getK();
        int m2 = (this.l*100) + this.k;
        int k3 = m1 - m2;
        if (k3 <= 0){
            return("000.00");
        } else {
            int k = k3 % 100; // mod for
            int l = k3 / 100;
            return ((new Lira(l, k)).toString());
        }
    }
}
