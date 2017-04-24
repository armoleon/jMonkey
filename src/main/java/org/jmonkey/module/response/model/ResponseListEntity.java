package org.jmonkey.module.response.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.common.model.Link;
import org.jmonkey.module.common.model.LinkEntity;
import org.jmonkey.module.common.model.PaginationEntity;

import java.util.List;

public class ResponseListEntity extends PaginationEntity {

    @JsonProperty("data")
    private List<ResponseEntity> responses;

    @JsonProperty("links")
    private LinkEntity links;

    public List<ResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<ResponseEntity> responses) {
        this.responses = responses;
    }

    public LinkEntity getLinks() {
        return links;
    }

    public void setLinks(LinkEntity links) {
        this.links = links;
    }

    public ResponseList toDto() {
        return getBeanMapperBuilder().addPackagePrefix(Link.class).build().map(this, ResponseList.class);
    }
}
