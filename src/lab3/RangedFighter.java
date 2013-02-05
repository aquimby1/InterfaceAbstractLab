/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author AJ
 */
public class RangedFighter implements Character{
    private String name;
    private int health;
    private int speed;
    private int strength;
    private String weapon;

    public RangedFighter(String name, int health, int speed, int strength, String weapon) {
        this.name = name;
        this.health = (health-10);
        this.speed = (speed+20);
        this.strength = (strength-5);
        this.weapon = weapon;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = (health-10);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = (speed+20);
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = (strength-5);
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public String listStats() {
        return ("Name: "+name+"\n Health:"+health+"\n Speed: "+speed+"\n Strength: "+strength+"\n Weapon: "+weapon);
    }
}
