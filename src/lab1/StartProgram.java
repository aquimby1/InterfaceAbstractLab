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
        Courses entry1 = new IntroToProgrammingCourse("Intro To Programing", "156348", 2, "none");
        System.out.println("Name " + entry1.getCourseName() + " Number " + entry1.getCourseNumber() + " Credits " + entry1.getCredits());

        Courses entry2 = new IntroJavaCourse("Intro Java", "456389", 3, "Intro to programing");
        System.out.println("Name " + entry2.getCourseName() + " Number " + entry2.getCourseNumber() + " Credits " + entry2.getCredits() + " Prerec " + entry2.getPrerequisites());

        Courses entry3 = new AdvancedJavaCourse("Advanced Java", "593183", 4, "Intro to programing,Intro to java");
        System.out.println("Name " + entry3.getCourseName() + " Number " + entry3.getCourseNumber() + " Credits " + entry3.getCredits() + " Prerec " + entry3.getPrerequisites());

        //I think the arcitecture isnt set up very well with labeling classes the same as one of the properties that it contains 

        //the Liskov Substitution seemed to work fine and appered to make things simpler.
    }
}
