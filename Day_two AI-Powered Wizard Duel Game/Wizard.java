// File: Wizard.java
public abstract class Wizard {
    private String name;
    private int health;
    private int mana;

    public Wizard(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 100;
    }

    public abstract void castSpell(Wizard opponent);

    public abstract void specialAbility(Wizard opponent);

    public void defend() {
        System.out.println(name + " defends and restores 10 mana.");
        mana = Math.min(mana + 10, 100);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void useMana(int cost) {
        mana -= cost;
        if (mana < 0) mana = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void status() {
        System.out.println(name + " [HP: " + health + ", Mana: " + mana + "]");
    }
}
