package org.jmonkey.module.heading.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

public class HeadingEntity extends BaseEntity {

    @JsonProperty("heading")
    private String heading;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
