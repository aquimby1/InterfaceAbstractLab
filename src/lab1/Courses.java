/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author aquimby1
 */
public abstract class Courses {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public Courses(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
//was calling on its self to set its self        
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
//value was never set to propery
        this.courseName = courseName;
    }

    public double getCredits() {
        return credits;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
}
