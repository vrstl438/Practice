package HomeTasks.Final_HomeTasks.Task_1;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = new EntityManager();

        entityManager.addEssence(new EssenceModel("Max", 20, true));
        entityManager.addEssence(new EssenceModel("Anton", 21, false));
        entityManager.addEssence(new EssenceModel("Sara", 32, true));
        entityManager.addEssence(new EssenceModel("Misha", 17, false));


        System.out.println(entityManager.sortedEssenceForAge(21, 30));

        System.out.println(entityManager.sortedEssenceForName("Sara"));
        System.out.println(entityManager.sortedEssenceForActivity(true));
    }
}