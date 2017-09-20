package org.jmonkey.module.survey.service;

import org.jmonkey.module.base.service.BaseService;
import org.jmonkey.module.collector.model.CollectorList;
import org.jmonkey.module.collector.model.param.CollectorQuery;
import org.jmonkey.module.response.model.ResponseList;
import org.jmonkey.module.response.param.SurveyResponseQuery;
import org.jmonkey.module.survey.client.SurveyClient;
import org.jmonkey.module.survey.client.SurveyClientProxy;
import org.jmonkey.module.survey.model.Survey;
import org.jmonkey.module.survey.model.SurveyList;
import org.jmonkey.module.survey.model.param.SurveyQuery;

public class SurveyService extends BaseService {
    private SurveyClient surveyClient;

    public SurveyService(String accessToken) {
        surveyClient = new SurveyClientProxy(addAuthorizationHeader(accessToken));
    }

    public SurveyList getSurveys(SurveyQuery surveyQuery) {
        return surveyClient.getSurveys(surveyQuery.getPage(), surveyQuery.getLimit(), surveyQuery.getSortBy() == null ? null : surveyQuery
                .getSortBy().getName(), surveyQuery.getSortOrder() == null ? null : surveyQuery.getSortOrder().getName(), surveyQuery
                .getIncludeFieldsQueryParam(), surveyQuery.getTitle(), surveyQuery.getStartModifiedAt(), surveyQuery.getEndModifiedAt()).toDto();
    }

    public Survey getSurvey(String surveyId) {
        return surveyClient.getSurvey(surveyId).toDto();
    }

    public Survey getSurveyDetails(String surveyId) {
        return surveyClient.getSurveyDetails(surveyId).toDto();
    }

    public CollectorList getSurveyCollectors(String surveyId, CollectorQuery collectorQuery) {
        return surveyClient.getSurveyCollectors(surveyId, collectorQuery.getPage(), collectorQuery.getLimit(), collectorQuery.getSortBy() == null ?
                null : collectorQuery.getSortBy().getName(), collectorQuery.getSortOrder() == null ? null : collectorQuery.getSortOrder().getName()
                , collectorQuery.getIncludeFieldsQueryParam(), collectorQuery.getName(), collectorQuery.getStartCreatedAt(), collectorQuery
                        .getEndCreatedAt()).toDto();
    }

    public ResponseList getAllSurveyResponses(String surveyId, SurveyResponseQuery surveyResponseQuery) {
        return surveyClient.getAllSurveyResponses(surveyId, surveyResponseQuery.getPage(), surveyResponseQuery.getLimit(), surveyResponseQuery
                .getSortBy() == null ? null : surveyResponseQuery.getSortBy().getName(), surveyResponseQuery.getSortOrder() == null ? null :
                surveyResponseQuery.getSortOrder().getName(), surveyResponseQuery.getStartCreatedAt(), surveyResponseQuery.getEndCreatedAt(),
                surveyResponseQuery.getStartModifiedAt(), surveyResponseQuery.getEndModifiedAt()).toDto();
    }
}
