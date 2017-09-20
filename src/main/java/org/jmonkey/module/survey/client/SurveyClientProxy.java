package org.jmonkey.module.survey.client;

import org.jmonkey.module.base.client.BaseClientProxy;
import org.jmonkey.module.collector.model.CollectorListEntity;
import org.jmonkey.module.common.filter.CustomRequestHeaderFilter;
import org.jmonkey.module.response.model.ResponseListEntity;
import org.jmonkey.module.survey.model.SurveyEntity;
import org.jmonkey.module.survey.model.SurveyListEntity;

import java.util.Date;

public class SurveyClientProxy extends BaseClientProxy<SurveyClient> implements SurveyClient {
    private SurveyClient surveyClient;

    public SurveyClientProxy(CustomRequestHeaderFilter customRequestHeaderFilter) {
        surveyClient = generateClient(SurveyClient.class, customRequestHeaderFilter);
    }

    public SurveyListEntity getSurveys(Integer page, Integer limit, String sortBy, String sortOrder, String include, String title, Date
            startModifiedAt, Date endModifiedAt) {
        return surveyClient.getSurveys(page, limit, sortBy, sortOrder, include, title, startModifiedAt, endModifiedAt);
    }

    public SurveyEntity getSurvey(String surveyId) {
        return surveyClient.getSurvey(surveyId);
    }

    public SurveyEntity getSurveyDetails(String surveyId) {
        return surveyClient.getSurveyDetails(surveyId);
    }

    public CollectorListEntity getSurveyCollectors(String surveyId, Integer page, Integer limit, String sortBy, String sortOrder, String include,
                                                   String name, Date startCreatedAt, Date endCreatedAt) {
        return surveyClient.getSurveyCollectors(surveyId, page, limit, sortBy, sortOrder, include, name, startCreatedAt, endCreatedAt);
    }

    public ResponseListEntity getAllSurveyResponses(String surveyId, Integer page, Integer limit, String sortBy, String sortOrder, Date
            startCreatedAt, Date endCreatedAt, Date startModifiedAt, Date endModifiedAt) {
        return surveyClient.getAllSurveyResponses(surveyId, page, limit, sortBy, sortOrder, startCreatedAt, endCreatedAt, startModifiedAt,
                endModifiedAt);
    }
}
