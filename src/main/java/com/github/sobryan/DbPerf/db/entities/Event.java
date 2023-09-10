package com.github.sobryan.DbPerf.db.entities;

import java.util.Date;


public class Event {
    
    private Date createDate;
    private Date lastUpdated;
    private String status;
    private String username;
    private String message;

    // Constructors
    public Event() {}

    public Event(Date createDate, Date lastUpdated, String status, String username, String message) {
        this.createDate = createDate;
        this.lastUpdated = lastUpdated;
        this.status = status;
        this.username = username;
        this.message = message;
    }

    // Getters and Setters
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // toString Method
    @Override
    public String toString() {
        return "Event{" +
                "createDate=" + createDate +
                ", lastUpdated=" + lastUpdated +
                ", status='" + status + '\'' +
                ", username='" + username + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
