package createClassAndObjects;

public class Point {
    int x;
    int y;

    public Point(int someX, int someY){
        this.x = someX;
        this.y = someY;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int newX){
        this.x = newX;
    }

    public void print(){
        System.out.println("Коррдинаты х: " + this.x + "    Коориднаты y: " + this.y);
    }

}
