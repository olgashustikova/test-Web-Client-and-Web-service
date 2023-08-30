package webserver.webserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webserver.webserver.entity.HouseInformation;
    @Repository
    public interface HouseInformationRepository extends JpaRepository<HouseInformation, Long> {
    }


