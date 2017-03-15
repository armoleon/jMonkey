package org.jmonkey.module.common.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

public class LinkEntity extends BaseEntity {

    @JsonProperty("self")
    private String selfLink;

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }
}
