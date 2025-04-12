package pe.com.dev.summerschoolmicroservice.model.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class SummerSchoolDto {
    private Long id;
    private Long year;
    private String month;
    private String frecuency;
    private String title;
    private String description;
    private String schedule;
    private String place;
    private String address;
    private Long numberOfRegisters;
}
