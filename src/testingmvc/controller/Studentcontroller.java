package controller;

import testingmvc.model.dao.StudentDao;
import testingmvc.model.dto.StudentDto;
import testingmvc.model.entites.Student;
import testingmvc.view.StudentView;

public class StudentController {
    private StudentDao studentDAO;
    private StudentView view;

    public StudentController(StudentDao dao, StudentView view) {
        this.studentDAO = dao;
        this.view = view;
    }

    public void addStudent(StudentDto dto) {

    }

    public void showStudent(String id) {
        Student student = studentDAO.findById(id);
        if (student != null) {
            view.printStudentDetails(student.getName(), student.getId());
        } else {
            System.out.println("Student not found.");
        }
    }
}
