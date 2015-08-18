package com.redhat.lightblue.migrator;

import java.util.Date;

public class MigrationJob {

    public static final String STATE_AVAILABLE="available";
    public static final String STATE_ACTIVE="active";
    public static final String STATE_COMPLETED="completed";
    public static final String STATE_FAILED="failed";
    
    /**
     * The migration job id
     */
    private String _id;

    private String configurationName;

    /**
     * Date job is scheduled to run
     */
    private Date scheduledDate;

    /**
     * A back-end specific query to retrieve documents that will be migrated by this job
     */
    private String query;

    private String status; // available, processing, complete

    public String get_id() {
        return _id;
    }

    public void set_id(String s) {
        _id=s;
    }

    public String getConfigurationName() {
        return configurationName;
    }

    public void setConfigurationName(String s) {
        configurationName=s;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(Date d) {
        scheduledDate=d;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String s) {
        query=s;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String s) {
        status=s;
    }

}
