package org.jmonkey.service;

import org.jmonkey.module.user.service.UserService;
import org.jmonkey.service.model.JMonkeyConfig;

public class JMonkey {

    private UserService userService;

    public JMonkey(JMonkeyConfig jMonkeyConfig) {
        String accessToken = jMonkeyConfig.getAccessToken();
        this.userService = new UserService(accessToken);
    }

    public UserService users() {
        return userService;
    }
}
