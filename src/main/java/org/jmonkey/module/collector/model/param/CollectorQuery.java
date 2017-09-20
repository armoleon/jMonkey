package org.jmonkey.module.collector.model.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.jmonkey.module.collector.model.enumerated.CollectorFields;
import org.jmonkey.module.collector.model.enumerated.CollectorSortFields;
import org.jmonkey.module.common.model.enumerated.SortOrder;
import org.jmonkey.module.common.model.param.PagingQuery;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.StringJoiner;

public class CollectorQuery extends PagingQuery<CollectorQuery> {

    private CollectorSortFields sortBy;
    private SortOrder sortOrder;
    private HashSet<CollectorFields> includeFields;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date startCreatedAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DDTHH:MM:SS")
    private Date endCreatedAt;

    public CollectorQuery sortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public CollectorQuery name(String name) {
        this.name = name;
        return this;
    }

    public CollectorQuery includeFields(CollectorFields... collectorFields) {
        if (includeFields == null) {
            includeFields = new HashSet<>();
        }
        this.includeFields.addAll(Arrays.asList(collectorFields));
        return this;
    }

    public CollectorQuery sortBy(CollectorSortFields collectorSortFields) {
        this.sortBy = collectorSortFields;
        return this;
    }

    public CollectorQuery startCreatedAt(Date startCreatedAt) {
        this.startCreatedAt = startCreatedAt;
        return this;
    }

    public CollectorQuery endCreatedAt(Date endCreatedAt) {
        this.endCreatedAt = endCreatedAt;
        return this;
    }

    public CollectorSortFields getSortBy() {
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
        for (CollectorFields collectorFields : includeFields) {
            stringJoiner.add(collectorFields.getName());
        }
        return stringJoiner.toString();
    }

    public String getName() {
        return name;
    }

    public Date getStartCreatedAt() {
        return startCreatedAt;
    }

    public Date getEndCreatedAt() {
        return endCreatedAt;
    }
}
