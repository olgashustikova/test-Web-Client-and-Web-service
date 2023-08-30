package webserver.webserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webserver.webserver.dto.HouseInformationDto;
import webserver.webserver.service.HouseInformationService;

@RestController
@RequestMapping("/api")
public class HouseInformationController {
    private final HouseInformationService houseInformationService;
    @Autowired
    public HouseInformationController(HouseInformationService houseInformationService) {
        this.houseInformationService = houseInformationService;
    }
    @PostMapping("/add-house")
    public ResponseEntity<String> addAd(@RequestBody HouseInformationDto houseInformationDto) {
        houseInformationService.addInformationAboutHouse(houseInformationDto);
        return ResponseEntity.ok("Information about house added successfully.");
    }

}
