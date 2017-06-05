package org.jmonkey.module.survey.model.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.jmonkey.module.common.model.enumerated.SortOrder;
import org.jmonkey.module.common.model.param.PagingQuery;
import org.jmonkey.module.survey.model.enumerated.SurveyFields;
import org.jmonkey.module.survey.model.enumerated.SurveySortFields;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.StringJoiner;

public class SurveyQuery extends PagingQuery<SurveyQuery> {

    private SurveySortFields sortBy;
    private SortOrder sortOrder;
    private HashSet<SurveyFields> includeFields;
    private String title;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date startModifiedAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date endModifiedAt;

    public SurveyQuery sortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public SurveyQuery title(String title) {
        this.title = title;
        return this;
    }

    public SurveyQuery includeFields(SurveyFields... surveyFields) {
        if (includeFields == null) {
            includeFields = new HashSet<>();
        }
        this.includeFields.addAll(Arrays.asList(surveyFields));
        return this;
    }

    public SurveyQuery sortBy(SurveySortFields surveyFields) {
        this.sortBy = surveyFields;
        return this;
    }

    public SurveyQuery fromModifiedDate(Date fromModifiedDate) {
        this.startModifiedAt = fromModifiedDate;
        return this;
    }

    public SurveyQuery toModifiedDate(Date toModifiedDate) {
        this.endModifiedAt = toModifiedDate;
        return this;
    }

    public SurveySortFields getSortBy() {
        return sortBy;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public String getIncludeFieldsQueryParam() {
        if (includeFields == null || includeFields.isEmpty()) {
            return null;
        }
        StringJoiner stringJoiner = new StringJoiner(",");
        for (SurveyFields surveyFields : includeFields) {
            stringJoiner.add(surveyFields.getName());
        }
        return stringJoiner.toString();
    }

    public String getTitle() {
        return title;
    }

    public Date getStartModifiedAt() {
        return startModifiedAt;
    }

    public Date getEndModifiedAt() {
        return endModifiedAt;
    }
}
