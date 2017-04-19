package org.jmonkey.module.base.model;

import io.beanmapper.annotations.BeanIgnore;
import io.beanmapper.config.BeanMapperBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BaseEntity {

    @BeanIgnore
    private BeanMapperBuilder beanMapperBuilder = new BeanMapperBuilder();

    protected BeanMapperBuilder getBeanMapperBuilder() {
        return beanMapperBuilder;
    }

    public <T extends BaseDto> T toDto(Class<T> t) {
        return beanMapperBuilder.build().map(this, t);
    }
}
