package com.buildstuff.crap.fi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by vvennava on 3/29/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Diagnostics {
    @XmlElement(name="url")
    private Url Url;
    @XmlElement(name="publiclyCallable")
    private String publiclyCallable;
    @XmlElement(name="query")
    private InnerQuery InnerQuery;
    @XmlElement(name="javascript")
    private Javascript Javascript;
    @XmlElement(name="user-time")
    private String user_time;
    @XmlElement(name="service-time")
    private String service_time;
    @XmlElement(name="build-version")
    private String build_version;

    public Diagnostics() {
    }

    public Url getUrl() {
        return Url;
    }

    public void setUrl(Url url) {
        Url = url;
    }

    public String getPubliclyCallable() {
        return publiclyCallable;
    }

    public void setPubliclyCallable(String publiclyCallable) {
        this.publiclyCallable = publiclyCallable;
    }

    public InnerQuery getInnerQuery() {
        return InnerQuery;
    }

    public void setInnerQuery(InnerQuery innerQuery) {
        InnerQuery = innerQuery;
    }

    public Javascript getJavascript() {
        return Javascript;
    }

    public void setJavascript(Javascript javascript) {
        Javascript = javascript;
    }

    public String getUser_time() {
        return user_time;
    }

    public void setUser_time(String user_time) {
        this.user_time = user_time;
    }

    public String getService_time() {
        return service_time;
    }

    public void setService_time(String service_time) {
        this.service_time = service_time;
    }

    public String getBuild_version() {
        return build_version;
    }

    public void setBuild_version(String build_version) {
        this.build_version = build_version;
    }
}
