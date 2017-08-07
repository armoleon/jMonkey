package org.jmonkey.module.base.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jmonkey.module.common.filter.CustomRequestHeaderFilter;
import org.jmonkey.module.error.filter.SurveyMonkeyServiceResponseFilter;

import javax.ws.rs.core.UriBuilder;

public abstract class BaseClientProxy<T extends BaseClient> {

    private static final String BASE_SURVEY_MONKEY_API_URL = "https://api.surveymonkey.net/v3";

    private static ResteasyClient resteasyClient = new ResteasyClientBuilder().register(SurveyMonkeyServiceResponseFilter.class).build();

    protected T generateClient(Class<T> t, CustomRequestHeaderFilter customRequestHeaderFilter) {
        ResteasyWebTarget resteasyWebTarget = resteasyClient.target(UriBuilder.fromPath(BASE_SURVEY_MONKEY_API_URL));
        resteasyWebTarget.register(customRequestHeaderFilter);
        return resteasyWebTarget.proxy(t);
    }
}
