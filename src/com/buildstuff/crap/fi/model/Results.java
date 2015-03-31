package com.buildstuff.crap.fi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

/**
 * Created by vvennava on 3/29/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Results {
    @XmlElement(name="quote")
    private ArrayList<Quote> Quote;

    public Results() {
    }

    public ArrayList<Quote> getQuote() {
        return Quote;
    }

    public void setQuote(ArrayList<Quote> quote) {
        Quote = quote;
    }
}
