package org.jmonkey.module.group.client;

import org.jmonkey.module.base.client.BaseClient;
import org.jmonkey.module.group.model.GroupListEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/groups")
public interface GroupClient extends BaseClient {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    GroupListEntity getGroups();
}
