package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location is required")
    private String location;

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @OneToMany
    @JoinColumn(name="employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }
}
