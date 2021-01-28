/* Alex Losser - GradleSkillDrill
 * Due Wed, Jan 27
 * Course.java
 */

package edu.isu.cs.cs2263;

public class Course {

    int courseNum;
    String courseSub;
    String courseTitle;

    public Course() {}

    public Course(int number, String subject, String title) {
        courseNum = number;
        courseSub = subject;
        courseTitle = title;
    }

    public void setCourseNum(int number) {
        courseNum = number;
    }
    public int getCourseNum() {
        return courseNum;
    }
    public void setCourseSub(String subject) {
        courseSub = subject;
    }
    public String getCourseSub() {
        return courseSub;
    }
    public void setCourseTitle(String title) {
        courseTitle = title;
    }
    public String getCourseTitle() {
        return courseTitle;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s: %s", courseNum, courseSub, courseTitle);
    }
}
