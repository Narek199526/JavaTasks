package collections.map;

import java.util.LinkedHashMap;

public class Triangle {
    private int XOfA;
    private int YOfA;
    private int XOfB;
    private int YOfB;
    private int XOfC;
    private int YOfC;
    static boolean comareTo(Object t,String color ){
        if (t.equals(color)){
            return true;
        } else
            return false;
    }

    Triangle(int XOfA, int YOfA, int XOfB, int YOfB, int XOfC, int YOfC){
        setXOfA(XOfA);
        setYOfA(YOfA);
        setXOfB(XOfB);
        setYOfB(YOfB);
        setXOfC(XOfC);
        setYOfC(YOfC);
    }


    public void setXOfA(int XOfA) {
        if (XOfA == this.XOfB && this.XOfB == this.XOfC ) {
            throw new IllegalArgumentException();
        } else {
            this.XOfA = XOfA;
        }

    }



    public void setYOfA(int YOfA) {
        if (YOfA == this.YOfB && this.YOfB == this.YOfC ) {
            throw new IllegalArgumentException();
        } else {
            this.YOfA = YOfA;
        }
    }


    public void setXOfB(int XOfB) {
        if (XOfB == this.XOfC && this.XOfC == this.XOfB) {
            throw new IllegalArgumentException();
        } else {
            this.XOfB = XOfB;
        }
    }



    public void setYOfB(int YOfB) {
        if (YOfB == this.YOfC && this.YOfC == this.YOfB) {
            throw new IllegalArgumentException();
        } else {
            this.YOfB = YOfB;
        }
    }



    public void setXOfC(int XOfC) {
        if (XOfC == this.XOfA && this.XOfA == this.XOfB) {
            throw new IllegalArgumentException();
        } else {
            this.XOfC = XOfC;
        }    }



    public void setYOfC(int YOfC) {
        if (YOfC == this.YOfA && this.YOfA == this.YOfB && this.XOfA == this.XOfB && this.XOfB == this.XOfC) {
            throw new IllegalArgumentException();
        } else {
            this.YOfC = YOfC;
        }
    }
}
