package testingmvc.model.dto;

import lombok.Getter;
import lombok.Setter;

public class StudentDto {
    @Getter
    @Setter
    private String name;
    private String id;

    public StudentDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

}
