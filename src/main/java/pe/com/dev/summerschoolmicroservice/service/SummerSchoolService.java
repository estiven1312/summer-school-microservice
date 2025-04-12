package pe.com.dev.summerschoolmicroservice.service;

import org.springframework.data.domain.Pageable;
import pe.com.dev.summerschoolmicroservice.model.domain.SummerSchool;
import pe.com.dev.summerschoolmicroservice.model.dto.SummerSchoolDto;
import pe.com.dev.summerschoolmicroservice.model.filter.SummerSchoolFilter;
import org.springframework.data.domain.Page;

public interface SummerSchoolService {
    Page<SummerSchool> filterSummerSchools(SummerSchoolFilter filter, Pageable pageable);
    SummerSchoolDto findById(Long id);
    SummerSchool save(SummerSchoolDto summerSchoolDto);
}
