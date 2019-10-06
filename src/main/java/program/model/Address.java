package program.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private long houseNumber;

    public void Address(String country, String region, String city, String street, long houseNumber){
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public long getHouseNumber() {
        return houseNumber;
    }
}
