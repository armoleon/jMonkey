package org.jmonkey.module.survey.client;

import org.jmonkey.module.base.client.BaseClient;
import org.jmonkey.module.collector.model.CollectorListEntity;
import org.jmonkey.module.response.model.ResponseListEntity;
import org.jmonkey.module.survey.model.SurveyEntity;
import org.jmonkey.module.survey.model.SurveyListEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/surveys")
public interface SurveyClient extends BaseClient {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    SurveyListEntity getSurveys(@QueryParam("page") Integer page, @QueryParam("per_page") Integer limit, @QueryParam("sort_by") String sortBy,
                                @QueryParam("sort_order") String sortOrder, @QueryParam("include") String include, @QueryParam("title") String
                                        title, @QueryParam("start_modified_at") Date startModifiedAt, @QueryParam("end_modified_at") Date
                                        endModifiedAt);

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

    @GET
    @Path("/{surveyId}/responses/bulk")
    @Produces({MediaType.APPLICATION_JSON})
    ResponseListEntity getAllSurveyResponses(@PathParam("surveyId") String surveyId, @QueryParam("page") Integer page, @QueryParam("per_page")
            Integer limit, @QueryParam("sort_by") String sortBy, @QueryParam("sort_order") String sortOrder, @QueryParam("start_created_at") Date
            start_created_at, @QueryParam("end_created_at") Date end_created_at, @QueryParam("start_modified_at") Date startModifiedAt, @QueryParam
            ("end_modified_at") Date endModifiedAt);

}


