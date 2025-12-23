package HomeTasks.createClassAndObjects;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int someWight, int someHeight){
        this.width = someWight;
        this.height = someHeight;
    }

    //геттеры
    public int getWight(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    //сеттер
    public void setWidth(int newWight){
        this.width = newWight;
    }

    public void calculateArea(){
        int area = width * height;
        System.out.println("Плоащдь прямоугольника равно: " +  area);
    }

}
