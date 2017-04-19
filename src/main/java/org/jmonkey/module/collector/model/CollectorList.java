package org.jmonkey.module.collector.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.common.model.Link;
import org.jmonkey.module.common.model.Pagination;

import java.util.List;

public class CollectorList extends Pagination {

    @BeanCollection(elementType = Collector.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Collector> collectors;
    private Link links;

    public List<Collector> getCollectors() {
        return collectors;
    }

    public void setCollectors(List<Collector> collectors) {
        this.collectors = collectors;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }
}
