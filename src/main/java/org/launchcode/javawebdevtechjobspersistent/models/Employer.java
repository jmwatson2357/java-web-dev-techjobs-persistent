package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank")
    @Size(min = 2, max = 100, message = "Location must be between 2 and 100 characters long")
    private String location;

    @OneToMany(mappedBy = "employer")
    private List<Job> jobs = new ArrayList<>();

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
