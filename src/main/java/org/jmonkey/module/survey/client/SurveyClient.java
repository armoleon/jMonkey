package org.jmonkey.module.survey.client;

import org.jmonkey.module.base.client.BaseClient;
import org.jmonkey.module.collector.model.CollectorListEntity;
import org.jmonkey.module.survey.model.SurveyEntity;
import org.jmonkey.module.survey.model.SurveyListEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/surveys")
public interface SurveyClient extends BaseClient {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    SurveyListEntity getSurveys();

    @GET
    @Path("/{surveyId}")
    @Produces({MediaType.APPLICATION_JSON})
    SurveyEntity getSurvey(@PathParam("surveyId") String surveyId);

    @GET
    @Path("/{surveyId}/details")
    @Produces({MediaType.APPLICATION_JSON})
    SurveyEntity getSurveyDetails(@PathParam("surveyId") String surveyId);

    @GET
    @Path("/{surveyId}/collectors")
    @Produces({MediaType.APPLICATION_JSON})
    CollectorListEntity getSurveyCollectors(@PathParam("surveyId") String surveyId);
}
