package pe.com.dev.summerschoolmicroservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import pe.com.dev.summerschoolmicroservice.model.domain.SummerSchool;
import pe.com.dev.summerschoolmicroservice.model.dto.SummerSchoolDto;
import pe.com.dev.summerschoolmicroservice.model.filter.SummerSchoolFilter;
import pe.com.dev.summerschoolmicroservice.service.SummerSchoolService;

@RestController
@RequestMapping("/summer-school")
@RequiredArgsConstructor
public class SummerSchoolController {
    private final SummerSchoolService summerSchoolService;

    @PostMapping("/create")
    public SummerSchool createSummerSchool(@RequestBody SummerSchoolDto summerSchool) {
        return summerSchoolService.save(summerSchool);
    }

    @GetMapping("/{id}")
    public SummerSchoolDto getSummerSchoolById(@PathVariable Long id) {
        return summerSchoolService.findById(id);
    }

    @GetMapping("/api/v1/schools")
    public Page<SummerSchool> getSummerSchools(
            @ModelAttribute SummerSchoolFilter filter,
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return summerSchoolService.filterSummerSchools(
                filter,
                pageable
        );
    }

}
