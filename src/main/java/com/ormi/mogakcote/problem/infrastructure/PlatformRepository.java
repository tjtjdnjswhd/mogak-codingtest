package com.ormi.mogakcote.problem.infrastructure;

import com.ormi.mogakcote.problem.domain.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Repository
@Transactional(readOnly = true)
public interface PlatformRepository extends JpaRepository<Platform, Long> {
    @Transactional(readOnly = true)
    Optional<Platform> findById(Long id);

    void deleteById(Long id);
}
