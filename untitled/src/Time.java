public class Time {
    private int h;
    private int m;

    public Time() {  //default constructor
        h = 0;
        m = 0;
    }

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public int getH() {
        return (this.h);
    }

    public int getM() {
        return (this.m);
    }

    static String intToString(int t) {
        if (t < 0)
            return ("00");
        else if (t < 10)
            return (("0") + String.valueOf(t));
        else
            return (String.valueOf(t));
    }

    public String toString() {
        return (intToString(this.h) + ":" + intToString(this.m));
    }

    String difference(Time t) {
        int t1 = (t.getH() * 60) + t.getM();
        int t2 = (this.h * 60) + this.m;
        int m3 = t1 - t2;
        if (m3 <= 0) {
            return ("00.00");
        } else {
            int m = m3 % 60;
            int h = m3 / 60;
            return ((new Time(h, m)).toString());
        }

    }

    String difference(int h1, int m1) {
        int t1 = (h1 * 60) + m1;
        int t2 = this.h * 60 + this.m;
        int m3 = t1 - t2;
        if (m3 <= 0) {
            return ("00.00");
        } else {
            int m = m3 % 60;
            int h = m3 / 60;
            return ((new Time(h, m)).toString());
        }

    }

    String difference(int h1, int m1, int h2, int m2) {
        int t1 = (h1 * 60) + m1;
        int t2 = (h2 * 60) + m2;
        int m3 = t1 - t2;
        if (m3 <= 0)
            return ("00.00");
        else {
            int m = m3 % 60;
            int h = m3 / 60;
            return ((new Time(h, m)).toString());
        }
    }
}