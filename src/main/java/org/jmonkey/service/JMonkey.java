package org.jmonkey.service;

import org.jmonkey.module.group.service.GroupService;
import org.jmonkey.module.survey.service.SurveyService;
import org.jmonkey.module.user.service.UserService;
import org.jmonkey.service.model.JMonkeyConfig;

public class JMonkey {

    private static JMonkey instance;
    private UserService userService;
    private GroupService groupService;
    private SurveyService surveyService;

    private JMonkey(JMonkeyConfig jMonkeyConfig) {
        String accessToken = jMonkeyConfig.getAccessToken();
        this.userService = new UserService(accessToken);
        this.groupService = new GroupService(accessToken);
        this.surveyService = new SurveyService(accessToken);
    }

    public static synchronized JMonkey getInstance(JMonkeyConfig jMonkeyConfig) {
        if (instance == null) {
            instance = new JMonkey(jMonkeyConfig);
        }
        return instance;
    }

    public UserService users() {
        return userService;
    }

    public GroupService groups() {
        return groupService;
    }

    public SurveyService surveys() {
        return surveyService;
    }
}
