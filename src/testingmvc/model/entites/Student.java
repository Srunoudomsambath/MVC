package testingmvc.model.entites;

import lombok.Getter;
import lombok.Setter;

public class Student {
    @Getter
    @Setter
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

