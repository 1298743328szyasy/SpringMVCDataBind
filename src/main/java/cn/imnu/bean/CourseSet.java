package cn.imnu.bean;

import java.util.HashSet;
import java.util.Set;

public class CourseSet {
    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    private Set<Course> courses = new HashSet<Course>();
    public CourseSet(){
        courses.add(new Course());
        courses.add(new Course());
    }

}
