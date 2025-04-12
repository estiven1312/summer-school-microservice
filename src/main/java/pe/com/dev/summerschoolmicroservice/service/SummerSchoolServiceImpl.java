package pe.com.dev.summerschoolmicroservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.com.dev.summerschoolmicroservice.model.domain.SummerSchool;
import pe.com.dev.summerschoolmicroservice.model.dto.SummerSchoolDto;
import pe.com.dev.summerschoolmicroservice.model.filter.SummerSchoolFilter;
import pe.com.dev.summerschoolmicroservice.model.mapper.SummerSchoolMapper;
import pe.com.dev.summerschoolmicroservice.repository.SummerSchoolRepository;

@Service
@RequiredArgsConstructor
public class SummerSchoolServiceImpl implements SummerSchoolService {

    private final SummerSchoolRepository summerSchoolRepository;

    @Override
    public Page<SummerSchool> filterSummerSchools(SummerSchoolFilter filter, Pageable pageable) {
        return summerSchoolRepository.findByFilter(
                filter.getYear(),
                filter.getTitle(),
                filter.getDescription(),
                filter.getSchedule(),
                filter.getPlace(),
                filter.getAddress(),
                filter.getNumberOfRegisters(),
                pageable
        );
    }

    @Override
    public SummerSchoolDto findById(Long id) {
        SummerSchool summerSchool = summerSchoolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Summer School not found"));
        SummerSchoolDto summerSchoolDto = SummerSchoolMapper.INSTANCE.toDto(summerSchool);
        return summerSchoolDto;
    }

    @Override
    public SummerSchool save(SummerSchoolDto summerSchoolDto) {
        SummerSchool summerSchool = SummerSchoolMapper.INSTANCE.toEntity(summerSchoolDto);
        summerSchool = summerSchoolRepository.save(summerSchool);
        return summerSchool;
    }
}
