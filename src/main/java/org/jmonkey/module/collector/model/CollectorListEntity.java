package org.jmonkey.module.collector.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.common.model.PaginationEntity;
import org.jmonkey.module.link.model.Link;
import org.jmonkey.module.link.model.LinkEntity;

import java.util.List;

public class CollectorListEntity extends PaginationEntity {

    @JsonProperty("data")
    private List<CollectorEntity> collectors;

    @JsonProperty("links")
    private LinkEntity links;

    public List<CollectorEntity> getCollectors() {
        return collectors;
    }

    public void setCollectors(List<CollectorEntity> collectors) {
        this.collectors = collectors;
    }

    public LinkEntity getLinks() {
        return links;
    }

    public void setLinks(LinkEntity links) {
        this.links = links;
    }

    public CollectorList toDto() {
        return getBeanMapperBuilder().addPackagePrefix(Link.class).build().map(this, CollectorList.class);
    }
}
