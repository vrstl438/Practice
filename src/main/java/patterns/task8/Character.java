package patterns.task8;

import lombok.ToString;

@ToString

public class Character {
    private final int health;
    private final int damage;
    private final int armor;
    private final int magic;

    private Character(CharacterBuilder characterBuilder) {
        this.health = characterBuilder.health;
        this.damage = characterBuilder.damage;
        this.armor = characterBuilder.armor;
        this.magic = characterBuilder.magic;
    }

    public static class CharacterBuilder {
        private int health;
        private int damage;
        private int armor;
        private int magic;

        public CharacterBuilder health(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder armor(int armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder magic(int magic) {
            this.magic = magic;
            return this;
        }

        public CharacterBuilder damage(int damage) {
            this.damage = damage;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
