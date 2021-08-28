package com.android.kutmoblie;

import java.sql.Time;
import java.util.Date;

public class Event {
    private long id;
    private String subject;
    private Date start_date;
    private Date end_date;
    private Time start_time;
    private Time end_time;
    private int priority;

    public Event(long id, String subject, Date start_date, Date end_date, Time start_time, Time end_time, int priority) {
        this.id = id;
        this.subject = subject;
        this.start_date = start_date;
        this.end_date = end_date;
        this.start_time = start_time;
        this.end_time = end_time;
        this.priority = priority;
    }

    public Event() {

    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", priority=" + priority +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
