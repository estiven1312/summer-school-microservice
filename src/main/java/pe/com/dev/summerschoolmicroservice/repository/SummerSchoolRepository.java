package pe.com.dev.summerschoolmicroservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.dev.summerschoolmicroservice.model.domain.SummerSchool;

public interface SummerSchoolRepository extends JpaRepository<SummerSchool, Long> {
    @Query("SELECT s FROM SummerSchool s WHERE " +
            "(s.year = :year OR (:year is null)) " +
            "AND (s.title ilike %:title% OR :title is null) " +
            "AND (s.description ilike :description OR :description is null) " +
            "AND (s.schedule ilike %:schedule% OR :schedule is null) " +
            "AND (s.place ilike %:place% OR :place is null) " +
            "AND (s.address ilike %:address% OR :address is null) " +
            "AND (s.numberOfRegisters = :numberOfRegisters OR :numberOfRegisters is null)")
    Page<SummerSchool> findByFilter(@Param("year") Long year,
                                    @Param("title") String title,
                                    @Param("description") String description,
                                    @Param("schedule") String schedule,
                                    @Param("place") String place,
                                    @Param("address") String address,
                                    @Param("numberOfRegisters") Long numberOfRegisters,
                                    Pageable pageable);
}
