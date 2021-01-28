/* Alex Losser - GradleSkillDrill
 * Due Wed, Jan 27
 * Student.java
 */

package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String firstName;
    String lastName;
    List<Course> enrolledIn;

    public Student() {
        firstName = "";
        lastName = "";
        enrolledIn = new ArrayList<>();
    }

    public Student(String firstname, String lastname) {
        firstName = firstname;
        lastName = lastname;
        enrolledIn = new ArrayList<>();
    }

    public void setFirstName(String firstname) {
        firstName = firstname;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastname) {
        lastName = lastname;
    }
    public String getLastName() {
        return lastName;
    }

    public List<Course> getCourses() {
        return enrolledIn;
    }

    public void addCourse(Course course) {
        enrolledIn.add(course);
    }

    @Override
    public String toString() {
        return (firstName + " " + lastName);
    }
}
