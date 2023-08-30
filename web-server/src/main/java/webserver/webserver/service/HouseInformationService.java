package webserver.webserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webserver.webserver.dto.HouseInformationDto;
import webserver.webserver.entity.HouseInformation;
import webserver.webserver.repository.HouseInformationRepository;

@Service

public class HouseInformationService {
    private final HouseInformationRepository houseInformationRepository;

    @Autowired
    public HouseInformationService(HouseInformationRepository houseInformationRepository) {
        this.houseInformationRepository = houseInformationRepository;
    }

    public HouseInformationDto addInformationAboutHouse(HouseInformationDto houseInformationDto) {
        HouseInformation houseInformation = new HouseInformation();
        houseInformation.setDate(houseInformationDto.getDate());
        houseInformation.setStreet(houseInformationDto.getStreet());

        HouseInformation savedInformation = houseInformationRepository.save(houseInformation);

    HouseInformationDto savedHouseInformationDto = new HouseInformationDto();
    savedHouseInformationDto.setId(savedInformation.getId());
    savedHouseInformationDto.setDate(savedInformation.getDate());
    savedHouseInformationDto.setStreet(savedInformation.getStreet());
        return savedHouseInformationDto;

    }
}
