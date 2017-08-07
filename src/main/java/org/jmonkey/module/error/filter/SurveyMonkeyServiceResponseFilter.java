package org.jmonkey.module.error.filter;

import org.codehaus.jackson.map.ObjectMapper;
import org.jmonkey.module.base.model.BaseEntity;
import org.jmonkey.module.error.SurveyMonkeyServiceException;
import org.jmonkey.module.error.model.ErrorEntity;
import org.jmonkey.module.error.model.enumerated.ErrorCode;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class SurveyMonkeyServiceResponseFilter implements ClientResponseFilter {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) throws IOException {

        if (responseContext.getStatus() == Response.Status.OK.getStatusCode()) {
            return;
        }
        BaseEntity baseEntity = objectMapper.readValue(responseContext.getEntityStream(), BaseEntity.class);
        ErrorEntity errorEntity = baseEntity.getError();
        if (errorEntity != null) {
            throw new SurveyMonkeyServiceException(errorEntity.getMessage(), ErrorCode.toErrorCode(errorEntity.getId()), errorEntity
                    .getHttpStatusCode());
        }

    }
}
