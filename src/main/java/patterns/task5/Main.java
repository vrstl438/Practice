package patterns.task5;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory ClassicFurnitureFactory = new ClassicFurnitureFactory();
        FurnitureFactory ModernFurnnitureFactory = new ModernFurnitureFactory();

        Chair classicChair = ClassicFurnitureFactory.createChair();
        Table modernTable = ModernFurnnitureFactory.createTable();
        Table classicTable = ClassicFurnitureFactory.createTable();
        Chair modernChair = ModernFurnnitureFactory.createChair();

        modernTable.use();
        classicTable.use();


        classicChair.sitOn();
        modernChair.sitOn();

    }
}
