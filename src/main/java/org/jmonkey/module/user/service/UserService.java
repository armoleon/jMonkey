package org.jmonkey.module.user.service;

import org.jmonkey.module.base.service.BaseService;
import org.jmonkey.module.user.client.UserClient;
import org.jmonkey.module.user.client.UserClientProxy;
import org.jmonkey.module.user.model.User;

public class UserService extends BaseService {
    private UserClient userClient;

    public UserService(String accessToken) {
        userClient = new UserClientProxy(addAuthorizationHeader(accessToken));
    }

    public User owner() {
        return userClient.getUser().toDto(User.class);
    }

}
