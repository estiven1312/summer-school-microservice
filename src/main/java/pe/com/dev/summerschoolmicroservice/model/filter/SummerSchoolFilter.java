package pe.com.dev.summerschoolmicroservice.model.filter;

import lombok.Data;

@Data
public class SummerSchoolFilter {
    private Long year;
    private String title;
    private String description;
    private String schedule;
    private String place;
    private String address;
    private Long numberOfRegisters;
}