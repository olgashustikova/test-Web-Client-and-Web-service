package webserver.webserver.dto;

import java.util.Date;

public class HouseInformationDto {
    private Long id;
    private Date date;
    private String street;

    public HouseInformationDto(String street, Date currentDate) {
        this.street = street;
    }

    public HouseInformationDto(String street) {
        this.street = street;
    }


    public String getStreet() {
        return street;
    }

    public HouseInformationDto( Long id, String street ) {
        this.id= id;
        this.date =  new Date();
        this.street = street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public HouseInformationDto() {
    }
}
