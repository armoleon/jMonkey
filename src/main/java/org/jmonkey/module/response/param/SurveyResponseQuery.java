package org.jmonkey.module.response.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.jmonkey.module.common.model.enumerated.SortOrder;
import org.jmonkey.module.common.model.param.PagingQuery;
import org.jmonkey.module.response.enumerated.ResponseSortFields;

import java.util.Date;

public class SurveyResponseQuery extends PagingQuery<SurveyResponseQuery> {
    private ResponseSortFields sortBy;
    private SortOrder sortOrder;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date startCreatedAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date endCreatedAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date startModifiedAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date endModifiedAt;

    public Date getStartCreatedAt() {
        return startCreatedAt;
    }

    public Date getEndCreatedAt() {
        return endCreatedAt;
    }

    public SurveyResponseQuery sortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public SurveyResponseQuery sortBy(ResponseSortFields responseSortFields) {
        this.sortBy = responseSortFields;
        return this;
    }

    public SurveyResponseQuery startModifiedAt(Date startModifiedAt) {
        this.startModifiedAt = startModifiedAt;
        return this;
    }

    public SurveyResponseQuery endModifiedAt(Date endModifiedAt) {
        this.endModifiedAt = endModifiedAt;
        return this;
    }

    public SurveyResponseQuery startCreatedAt(Date startCreatedAt) {
        this.startCreatedAt = startCreatedAt;
        return this;
    }

    public SurveyResponseQuery endCreatedAt(Date endCreatedAt) {
        this.endCreatedAt = endCreatedAt;
        return this;
    }

    public ResponseSortFields getSortBy() {
        return sortBy;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public Date getStartModifiedAt() {
        return startModifiedAt;
    }

    public Date getEndModifiedAt() {
        return endModifiedAt;
    }
}
