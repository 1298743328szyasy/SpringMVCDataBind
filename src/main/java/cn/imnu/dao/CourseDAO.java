package cn.imnu.dao;

import cn.imnu.bean.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository("courseDao")
public class CourseDAO {
    private Map<Integer, Course> courses = new HashMap<Integer, Course>();
    public void add(Course course){
        courses.put(course.getId(),course);
    }
    public Collection<Course> getAll(){
        return courses.values();
    }
}
