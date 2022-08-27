package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String jobTitle;
    private LocalDate birthDate;


}
