package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {

    private TimeEntryRepository repo = null;

    @Autowired
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.repo = timeEntryRepository;
    }

    public ResponseEntity<TimeEntry> create(TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> read(Long timeEntryId) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity<TimeEntry> update(Long timeEntryId, TimeEntry timeEntry) {
        return null;
    }

    public ResponseEntity<TimeEntry> delete(long timeEntryId) {
        return null;
    }



}
