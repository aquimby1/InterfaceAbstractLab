/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author AJ
 */
public class StartProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgramingCourses entry1 = new IntroToProgrammingCourse("Intro To Programing", "156348", 2, "none");
        System.out.println("Name " + entry1.getCourseName() + " Number " + entry1.getCourseNumber() + " Credits " + entry1.getCredits());
        
        ProgramingCourses entry2 = new IntroJavaCourse("Intro Java", "456389", 3, "Intro to programing");
        System.out.println("Name " + entry2.getCourseName() + " Number " + entry2.getCourseNumber() + " Credits " + entry2.getCredits() + " Prerec " + entry2.getPrerequisites());

        ProgramingCourses entry3 = new AdvancedJavaCourse("Advanced Java", "593183", 4, "Intro to programing,Intro to java");
        System.out.println("Name " + entry3.getCourseName() + " Number " + entry3.getCourseNumber() + " Credits " + entry3.getCredits() + " Prerec " + entry3.getPrerequisites());

        ///I think this is a better design for this program it seems like it works better.
        
        //i beleve this is a good implemention of the Liskov Substitution principle and it works well here
    }
}
