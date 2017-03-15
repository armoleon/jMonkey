package org.jmonkey.module.group.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.common.model.Link;
import org.jmonkey.module.common.model.Pagination;

import java.util.List;

public class GroupList extends Pagination {

    @BeanCollection(elementType = Group.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Group> groups;
    private Link links;

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }
}
