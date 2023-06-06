package collections.map;

public class Monitor implements Comparable<Monitor>{
    @Override
    public int compareTo(Monitor o) {
        if (o.pixel == this.getPixel()){
            return 0;
        } else if (o.pixel > this.pixel){
            return 1;
        }else
            return -1;
    }


    private int diagonal;
    private int pixel;

    Monitor(int diagonal, int pixel){
        setDiagonal(diagonal);
        setPixel(pixel);
    }

    public void setDiagonal(int diagonal) {
        if (diagonal > 0) {
            this.diagonal = diagonal;
        } else
            throw new IllegalArgumentException();
    }
    public int getDiagonal() {
        return diagonal;
    }


    public void setPixel(int pixel) {
        if (pixel > 0) {
            this.pixel = pixel;
        } else
            throw new IllegalArgumentException();
    }
    public int getPixel() {
        return pixel;
    }
}

