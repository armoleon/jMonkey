package org.jmonkey.module.survey.client;

import org.jmonkey.module.base.client.BaseClient;
import org.jmonkey.module.survey.model.SurveyListEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/surveys")
public interface SurveyClient extends BaseClient {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    SurveyListEntity getSurveys();
}
