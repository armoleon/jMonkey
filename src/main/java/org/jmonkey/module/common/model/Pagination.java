package org.jmonkey.module.common.model;

import org.jmonkey.module.base.model.BaseDto;

public class Pagination extends BaseDto {

    private Integer total;
    private Integer page;
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
