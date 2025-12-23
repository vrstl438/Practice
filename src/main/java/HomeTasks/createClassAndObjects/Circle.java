package HomeTasks.createClassAndObjects;

public class Circle {
    int radius;

    public Circle(int someRadius){
        this.radius = someRadius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int newRadius){
        this.radius = newRadius;
    }

    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга равна: " + area);
    }

    public void calculateCircumference(){
        double circum = 2 * Math.PI * radius;
        System.out.println("Длина окружности равна: " + circum);
    }
}
