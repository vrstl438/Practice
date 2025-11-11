package createClassAndObjects;

public class Rectangle {
    int wight;
    int height;

    public Rectangle(int someWight, int someHeight){
        this.wight = someWight;
        this.height = someHeight;
    }

    //геттеры
    public int getWight(){
        return wight;
    }
    public int getHeight(){
        return height;
    }

    //сеттер
    public void setWight(int newWight){
        this.wight = newWight;
    }

    public void calculateArea(){
        int area = wight * height;
        System.out.println("Плоащдь прямоугольника равно: " +  area);
    }

}
