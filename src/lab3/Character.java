/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author AJ
 */
public interface Character {

    public abstract int getHealth();

    public abstract String getName();

    public abstract int getSpeed();

    public abstract int getStrength();

    public abstract String getWeapon();
    
    public abstract String listStats();

    public abstract void setHealth(int health);

    public abstract void setName(String name);

    public abstract void setSpeed(int speed);

    public abstract void setStrength(int strength);

    public abstract void setWeapon(String weapon);
    
}
