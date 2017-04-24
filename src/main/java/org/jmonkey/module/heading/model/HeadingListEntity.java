package org.jmonkey.module.heading.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

import java.util.List;

public class HeadingListEntity extends BaseEntity {

    @JsonProperty("headings")
    private List<HeadingEntity> headings;

    public List<HeadingEntity> getHeadings() {
        return headings;
    }

    public void setHeadings(List<HeadingEntity> headings) {
        this.headings = headings;
    }
}
