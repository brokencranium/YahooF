package com.buildstuff.crap.fi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by vvennava on 3/29/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Javascript {
    @XmlAttribute(name="execution-start-time")
    private String execution_start_time;
    @XmlAttribute(name="execution-stop-time")
    private String execution_stop_time;
    @XmlAttribute(name="execution_time")
    private String execution_time;
    @XmlAttribute(name="instructions-used")
    private String instructions_used;
    @XmlAttribute(name="table-name")
    private String table_name;

    public Javascript() {
    }

    public String getExecution_start_time() {
        return execution_start_time;
    }

    public void setExecution_start_time(String execution_start_time) {
        this.execution_start_time = execution_start_time;
    }

    public String getExecution_stop_time() {
        return execution_stop_time;
    }

    public void setExecution_stop_time(String execution_stop_time) {
        this.execution_stop_time = execution_stop_time;
    }

    public String getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(String execution_time) {
        this.execution_time = execution_time;
    }

    public String getInstructions_used() {
        return instructions_used;
    }

    public void setInstructions_used(String instructions_used) {
        this.instructions_used = instructions_used;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }
}
