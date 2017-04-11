package org.jmonkey.module.survey.service;

import org.jmonkey.module.base.service.BaseService;
import org.jmonkey.module.survey.client.SurveyClient;
import org.jmonkey.module.survey.client.SurveyClientProxy;
import org.jmonkey.module.survey.model.SurveyList;

public class SurveyService extends BaseService {
    private SurveyClient surveyClient;

    public SurveyService(String accessToken) {
        surveyClient = new SurveyClientProxy(addAuthorizationHeader(accessToken));
    }

    public SurveyList getSurveys() {
        return surveyClient.getSurveys().toDto();
    }
}
