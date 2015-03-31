package com.buildstuff.crap.fi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by vvennava on 3/29/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InnerQuery {
    @XmlAttribute(name="execution-start-time")
    private String execution_start_time;
    @XmlAttribute(name="execution-stop-time")
    private String execution_stop_time;
    @XmlAttribute(name="execution-time")
    private String execution_time;
    @XmlAttribute(name="params")
    private String params;

    public InnerQuery() {
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

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }
}
