package org.jmonkey.module.base.model;

import io.beanmapper.annotations.BeanIgnore;
import io.beanmapper.config.BeanMapperBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.error.model.ErrorEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseEntity {

    @BeanIgnore
    private BeanMapperBuilder beanMapperBuilder = new BeanMapperBuilder();

    @JsonProperty("error")
    private ErrorEntity error;

    protected BeanMapperBuilder getBeanMapperBuilder() {
        return beanMapperBuilder;
    }

    public <T extends BaseDto> T toDto(Class<T> t) {
        return beanMapperBuilder.build().map(this, t);
    }

    public ErrorEntity getError() {
        return error;
    }

    public void setError(ErrorEntity error) {
        this.error = error;
    }
}
