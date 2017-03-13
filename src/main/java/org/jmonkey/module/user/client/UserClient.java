package org.jmonkey.module.user.client;

import org.jmonkey.module.base.client.BaseClient;
import org.jmonkey.module.user.model.UserEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public interface UserClient extends BaseClient {

    @GET
    @Path("/me")
    @Produces({MediaType.APPLICATION_JSON})
    UserEntity getUser();

}
