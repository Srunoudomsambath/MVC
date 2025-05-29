package testingmvc.model.dao;

import testingmvc.model.entites.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private List<Student> students = new ArrayList<>();
    public void save(Student student) {
        students.add(student);
    }
    public Student findById(int id) {
        for (Student student : students) {
            if(student.getId().equals(id))
                return student;
            }
            return null;
        }
        public List<Student> findAll(){
            return students;
        }
    }
}
