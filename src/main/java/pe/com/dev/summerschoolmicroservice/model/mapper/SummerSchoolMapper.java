package pe.com.dev.summerschoolmicroservice.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.com.dev.summerschoolmicroservice.model.domain.SummerSchool;
import pe.com.dev.summerschoolmicroservice.model.dto.SummerSchoolDto;

@Mapper
public interface SummerSchoolMapper {
    SummerSchoolMapper INSTANCE = Mappers.getMapper(SummerSchoolMapper.class);
    SummerSchoolDto toDto(SummerSchool summerSchool);
    SummerSchool toEntity(SummerSchoolDto summerSchoolDto);
}
