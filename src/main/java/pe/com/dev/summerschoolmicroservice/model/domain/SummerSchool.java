package pe.com.dev.summerschoolmicroservice.model.domain;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "summer_schools")
@Entity
@Data
public class SummerSchool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long year;
    private String month;
    private String frecuency;
    private String title;
    private String description;
    private String schedule;
    private String place;
    private String address;
    @Column(name = "number_of_registers")
    private Long numberOfRegisters;
}
