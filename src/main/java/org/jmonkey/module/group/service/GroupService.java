package org.jmonkey.module.group.service;

import org.jmonkey.module.base.service.BaseService;
import org.jmonkey.module.group.client.GroupClient;
import org.jmonkey.module.group.client.GroupClientProxy;
import org.jmonkey.module.group.model.GroupList;

public class GroupService extends BaseService {

    private GroupClient groupClient;

    public GroupService(String accessToken) {
        groupClient = new GroupClientProxy(addAuthorizationHeader(accessToken));
    }

    public GroupList ownerGroup() {
        return groupClient.getGroups().toDto();
    }
}
