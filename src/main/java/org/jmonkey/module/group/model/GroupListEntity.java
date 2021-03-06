package org.jmonkey.module.group.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.common.model.PaginationEntity;
import org.jmonkey.module.link.model.Link;
import org.jmonkey.module.link.model.LinkEntity;

import java.util.List;

public class GroupListEntity extends PaginationEntity {

    @JsonProperty("data")
    private List<GroupEntity> groups;

    @JsonProperty("links")
    private LinkEntity links;

    public List<GroupEntity> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupEntity> groups) {
        this.groups = groups;
    }

    public LinkEntity getLinks() {
        return links;
    }

    public void setLinks(LinkEntity links) {
        this.links = links;
    }

    public GroupList toDto() {
        return getBeanMapperBuilder().addPackagePrefix(Link.class).build().map(this, GroupList.class);
    }
}
