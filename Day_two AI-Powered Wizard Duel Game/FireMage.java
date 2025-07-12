// File: FireMage.java
public class FireMage extends Wizard {
    public FireMage(String name) {
        super(name);
    }

    @Override
    public void castSpell(Wizard opponent) {
        System.out.println(getName() + " casts Fireball!");
        opponent.takeDamage(20);
        useMana(15);
    }

    @Override
    public void specialAbility(Wizard opponent) {
        System.out.println(getName() + " uses Flame Storm (AoE)!");
        opponent.takeDamage(30);
        useMana(25);
    }
}
