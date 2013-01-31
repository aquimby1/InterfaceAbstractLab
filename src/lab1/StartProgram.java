/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author aquimby1
 */
public class StartProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Courses entry1 = new IntroToProgrammingCourse();
        entry1.setCourseName("Intro To Programing");
        entry1.setCourseNumber("156348");
        entry1.setCredits(2);
        System.out.println("Name " + entry1.getCourseName() + " Number " + entry1.getCourseNumber() + " Credits " + entry1.getCredits());
    }
}
