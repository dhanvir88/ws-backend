package com.ws.applcation.handle;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class packageHandle<VALUE> {

    private List<VALUE> values = new ArrayList<VALUE>();

    @XmlAnyElement(lax=true)
    public List<VALUE> getValues() {
        return values;
    }

}