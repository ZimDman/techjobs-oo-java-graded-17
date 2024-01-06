package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String space = System.lineSeparator();

        if (name == null || name.isEmpty()) {
            name = "Data not available";
        }
        if (employer == null || employer.getValue().isEmpty() || employer.getValue() == null) {
            employer = new Employer ("Data not available");
        }
        if (location == null || location.getValue().isEmpty() || location.getValue() == null) {
            location = new Location("Data not available");
        }
        if (positionType == null || positionType.getValue().isEmpty() || positionType.getValue() == null) {
            positionType = new PositionType("Data not available");
        }
        if (coreCompetency == null || coreCompetency.getValue().isEmpty() || coreCompetency.getValue() == null) {
            coreCompetency = new CoreCompetency("Data not available");
        }

        /*if (name.equals( "Data not available") &&
                employer.getValue().equals("Data not available") &&
                location.getValue().equals("Data not available") &&
                positionType.getValue().equals("Data not available") &&
                coreCompetency.getValue().equals("Data not available")) {

            return space + "ID: " + id + space +
                    "OOPS! this job does not seem to exist." + space;
        }*/

        return space + "ID: " + id + space + "Name: " + name + space + "Employer: " + employer + space +
             "Location: " + location + space + "Position Type: " + positionType + space +
             "Core Competency: " + coreCompetency + space;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
