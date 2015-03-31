package com.buildstuff.crap.fi.model;

import javax.xml.bind.annotation.*;

/**
 * Created by vvennava on 3/29/15.
 */
@XmlRootElement(name="query")
@XmlAccessorType(XmlAccessType.FIELD)
public class Query {
    @XmlAttribute(name="xmlns:yahoo")
    private String nameSpace;
    @XmlAttribute(name="yahoo:count")
    private String count;
    @XmlAttribute(name="yahoo:created")
    private String createTime;
    @XmlAttribute(name="yahoo:lang")
    private String language;
    @XmlElement(name="diagnostics")
    private Diagnostics diagnostics;
    @XmlElement(name="results")
    private Results results;

    public Query() {
    }

    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
