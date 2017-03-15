package org.jmonkey.module.common.model;

import org.jmonkey.module.base.model.BaseDto;

public class Link extends BaseDto {
    private String selfLink;

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }
}
