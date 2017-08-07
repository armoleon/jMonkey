package org.jmonkey.module.response.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.common.model.Pagination;
import org.jmonkey.module.link.model.Link;

import java.util.List;

public class ResponseList extends Pagination {
    @BeanCollection(elementType = Response.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Response> responses;

    private Link links;

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }
}
