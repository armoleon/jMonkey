package org.jmonkey.module.user.client;

import org.jmonkey.module.base.client.BaseClientProxy;
import org.jmonkey.module.user.model.UserEntity;

public class UserClientProxy extends BaseClientProxy<UserClient> implements UserClient {

    private UserClient userClient;

    public UserClientProxy() {
        userClient = generateClient(UserClient.class);
    }

    public UserEntity getUser() {
        return userClient.getUser();
    }
}
