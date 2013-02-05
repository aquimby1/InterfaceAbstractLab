/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author AJ
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Character fighter1 = new MeleeFighter("Marcus",100,70,110,"Sword");
        System.out.println(fighter1.listStats());
        
        Character fighter2 = new RangedFighter("Greg",80,120,60,"Bow");
        System.out.println(fighter2.listStats());
    }
}
