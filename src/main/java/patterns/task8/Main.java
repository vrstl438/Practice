package patterns.task8;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Character person1 = game.createCharacter(
                new Character.CharacterBuilder()
                        .health(111)
        );
        System.out.println(person1);

        Character person2 = game.createCharacter(
                new Character.CharacterBuilder()
                        .health(1)
                        .armor(1)
                        .magic(11)
                        .damage(1111)
        );
        System.out.println(person2);
    }
}
