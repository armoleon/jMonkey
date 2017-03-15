package org.jmonkey.module.common.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

public class PaginationEntity extends BaseEntity {

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("page")
    private Integer page;

    @JsonProperty("per_page")
    private Integer perPage;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }
}
