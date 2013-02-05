/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author AJ
 */
public interface ProgramingCourses {

    String getCourseNumber();

    double getCredits();

    String getPrerequisites();

    void setCourseNumber(String courseNumber);

    void setCredits(double credits);

    void setPrerequisites(String prerequisites);
    
}
