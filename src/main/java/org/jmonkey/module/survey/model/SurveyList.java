package org.jmonkey.module.survey.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.common.model.Pagination;
import org.jmonkey.module.link.model.Link;

import java.util.List;

public class SurveyList extends Pagination {

    @BeanCollection(elementType = Survey.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Survey> surveys;

    private Link links;

    public List<Survey> getSurveys() {
        return surveys;
    }

    public void setSurveys(List<Survey> surveys) {
        this.surveys = surveys;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }
}
