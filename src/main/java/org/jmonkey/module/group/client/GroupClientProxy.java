package org.jmonkey.module.group.client;

import org.jmonkey.module.base.client.BaseClientProxy;
import org.jmonkey.module.common.filter.CustomRequestHeaderFilter;
import org.jmonkey.module.group.model.GroupListEntity;

public class GroupClientProxy extends BaseClientProxy<GroupClient> implements GroupClient {
    private GroupClient groupClient;

    public GroupClientProxy(CustomRequestHeaderFilter customRequestHeaderFilter) {
        groupClient = generateClient(GroupClient.class, customRequestHeaderFilter);
    }

    public GroupListEntity getGroups() {
        return groupClient.getGroups();
    }
}
