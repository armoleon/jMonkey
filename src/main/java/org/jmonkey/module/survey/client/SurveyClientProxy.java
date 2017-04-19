package org.jmonkey.module.survey.client;

import org.jmonkey.module.base.client.BaseClientProxy;
import org.jmonkey.module.collector.model.CollectorListEntity;
import org.jmonkey.module.common.filter.CustomRequestHeaderFilter;
import org.jmonkey.module.survey.model.SurveyEntity;
import org.jmonkey.module.survey.model.SurveyListEntity;

public class SurveyClientProxy extends BaseClientProxy<SurveyClient> implements SurveyClient {
    private SurveyClient surveyClient;

    public SurveyClientProxy(CustomRequestHeaderFilter customRequestHeaderFilter) {
        surveyClient = generateClient(SurveyClient.class, customRequestHeaderFilter);
    }

    public SurveyListEntity getSurveys() {
        return surveyClient.getSurveys();
    }

    public SurveyEntity getSurvey(String surveyId) {
        return surveyClient.getSurvey(surveyId);
    }

    public SurveyEntity getSurveyDetails(String surveyId) {
        return surveyClient.getSurveyDetails(surveyId);
    }

    public CollectorListEntity getSurveyCollectors(String surveyId) {
        return surveyClient.getSurveyCollectors(surveyId);
    }
}
