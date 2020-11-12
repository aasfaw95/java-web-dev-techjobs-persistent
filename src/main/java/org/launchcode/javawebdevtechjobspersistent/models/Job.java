package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity {


    @ManyToMany
    private List<Skill> skills;

    @ManyToOne
    private Employer employer;

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Iterable<Skill> getSkills() {
        return this.skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
