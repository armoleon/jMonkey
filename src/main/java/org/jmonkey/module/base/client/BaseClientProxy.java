package org.jmonkey.module.base.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import javax.ws.rs.core.UriBuilder;

public abstract class BaseClientProxy<T extends BaseClient> {

    private static final String BASE_SURVEY_MONKEY_API_URL = "https://api.surveymonkey.net/v3";
    private static ResteasyClient resteasyClient = new ResteasyClientBuilder().build();

    protected T generateClient(Class<T> t) {
        return resteasyClient.target(UriBuilder.fromPath(BASE_SURVEY_MONKEY_API_URL)).proxy(t);
    }
}
