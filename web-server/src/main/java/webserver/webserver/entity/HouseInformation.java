package webserver.webserver.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class HouseInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  @Temporal(TemporalType.TIMESTAMP)
 private Date date;
    private String street;

    public HouseInformation() {
    }
    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public Date getDate() {
        return date;
    }
    public  void setDate(Date date) {
        this.date = date;
    }
    public HouseInformation(Long id, Date date, String street) {
        this.id = id;
        this.date = date;
        this.street = street;

    }
    @PrePersist
    protected void onCreate() {
        date = new Date(); // Set the current date and time before persisting the entity
    }
}
