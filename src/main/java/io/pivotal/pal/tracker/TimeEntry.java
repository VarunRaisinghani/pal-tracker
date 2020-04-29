package io.pivotal.pal.tracker;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;

public class TimeEntry {

    private Long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public Long getProjectId() {
        return this.projectId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getHours() {
        return this.hours;
    }


    public TimeEntry(){

    }

    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        TimeEntry timeEntry = (TimeEntry) obj;
        if(timeEntry.getId().equals(this.id)) return true;

        return false;
    }
}
