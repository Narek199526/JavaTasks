package generics;

public class Box<T extends Number> {
    private T length;
    private T width;
    private T height;

    Box(T length, T width, T height){
        setLength(length);
        setWidth(width);
        setHeight(height);

    }

    public void setLength(T length) {
        if (length.doubleValue() > 0) {
            this.length = length;
        }
    }
    public T getLength(){
        return length;
    }

    public void setHeight(T height) {
        if (height.doubleValue() > 0) {
            this.height = height;
        }
    }
    public T getHeight() {
        return height;
    }

    public void setWidth(T width) {
        if (width.doubleValue() > 0){
            this.width = width;
        }
    }
    public T getWidth() {
        return width;
    }


    public static Number sum(Box<?> box, Box<?> box1){
        return box.length.doubleValue() + box.width.doubleValue() + box.height.doubleValue() + box1.length.doubleValue() + box1.width.doubleValue() + box1.height.doubleValue() ;
    }

//    public static Number sum(Box box, Box box1){
//        return box.length.doubleValue() + box.width.doubleValue() + box.height.doubleValue() + box1.length.doubleValue() + box1.width.doubleValue() + box1.height.doubleValue() ;
//    }
}
