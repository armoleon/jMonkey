package org.jmonkey.module.survey.service;

import org.jmonkey.module.base.service.BaseService;
import org.jmonkey.module.collector.model.CollectorList;
import org.jmonkey.module.response.model.ResponseList;
import org.jmonkey.module.survey.client.SurveyClient;
import org.jmonkey.module.survey.client.SurveyClientProxy;
import org.jmonkey.module.survey.model.Survey;
import org.jmonkey.module.survey.model.SurveyList;

public class SurveyService extends BaseService {
    private SurveyClient surveyClient;

    public SurveyService(String accessToken) {
        surveyClient = new SurveyClientProxy(addAuthorizationHeader(accessToken));
    }

    public SurveyList getSurveys() {
        return surveyClient.getSurveys().toDto();
    }

    public Survey getSurvey(String surveyId) {
        return surveyClient.getSurvey(surveyId).toDto();
    }

    public Survey getSurveyDetails(String surveyId) {
        return surveyClient.getSurveyDetails(surveyId).toDto();
    }

    public CollectorList getSurveyCollectors(String surveyId) {
        return surveyClient.getSurveyCollectors(surveyId).toDto();
    }

    public ResponseList getAllSurveyResponses(String surveyId) {
        return surveyClient.getAllSurveyResponses(surveyId).toDto();
    }
}
