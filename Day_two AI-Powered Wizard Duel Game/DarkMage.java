// File: DarkMage.java
public class DarkMage extends Wizard {
    public DarkMage(String name) {
        super(name);
    }

    @Override
    public void castSpell(Wizard opponent) {
        System.out.println(getName() + " casts Shadow Bolt!");
        opponent.takeDamage(22);
        useMana(18);
    }

    @Override
    public void specialAbility(Wizard opponent) {
        System.out.println(getName() + " uses Life Drain!");
        opponent.takeDamage(20);
        useMana(20);
        System.out.println(getName() + " absorbs 10 health!");
        // Heal self
        // Limited to 100 HP
    }
}
