package com.example.streamspractice;

public class Occupation {
    private String jobTitle;
    private float salary;
    private Sector sector;

    public Occupation() {}

    public Occupation(String jobTitle, float salary, Sector sector) {
        setJobTitle(jobTitle);
        setSalary(salary);
        setSector(sector);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
