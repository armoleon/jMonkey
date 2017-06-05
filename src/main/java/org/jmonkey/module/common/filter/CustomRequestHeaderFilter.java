package org.jmonkey.module.common.filter;

import org.jmonkey.module.common.model.param.HeaderParameter;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomRequestHeaderFilter implements ClientRequestFilter {

    private final List<HeaderParameter> headerParameterList = new ArrayList<>();


    public void addHeaderParameter(HeaderParameter headerParameter) {
        headerParameterList.add(headerParameter);
    }

    public void filter(ClientRequestContext clientRequestContext) throws IOException {
        for (HeaderParameter headerParameter : headerParameterList) {
            clientRequestContext.getHeaders().add(headerParameter.getName(), headerParameter.getValue());
        }
    }
}
