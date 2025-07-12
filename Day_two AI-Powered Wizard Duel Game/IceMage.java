// File: IceMage.java
public class IceMage extends Wizard {
    public IceMage(String name) {
        super(name);
    }

    @Override
    public void castSpell(Wizard opponent) {
        System.out.println(getName() + " casts Ice Shard!");
        opponent.takeDamage(18);
        useMana(10);
    }

    @Override
    public void specialAbility(Wizard opponent) {
        System.out.println(getName() + " uses Frost Nova (Stun Effect)!");
        opponent.takeDamage(25);
        useMana(20);
    }
}
