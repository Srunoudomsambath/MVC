package testingmvc.view;

import testingmvc.model.entites.Student;

public class StudentView {
    public void printStudentDetails(String name,String id) {
        System.out.println("Student details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
