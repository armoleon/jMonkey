package org.jmonkey.module.base.service;

import org.jmonkey.module.common.filter.CustomRequestHeaderFilter;
import org.jmonkey.module.common.model.HeaderParameter;

public abstract class BaseService {

    private CustomRequestHeaderFilter customRequestHeaderFilter = new CustomRequestHeaderFilter();

    protected CustomRequestHeaderFilter addAuthorizationHeader(String accessToken) {
        HeaderParameter authorizationHeaderParameter = new HeaderParameter("Authorization", "bearer" + " " + accessToken);
        customRequestHeaderFilter.addHeaderParameter(authorizationHeaderParameter);
        return customRequestHeaderFilter;
    }


}
