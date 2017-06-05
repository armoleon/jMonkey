package org.jmonkey.module.common.model.param;

public class PagingQuery<T extends PagingQuery<T>> {

    private Integer page;
    private Integer limit;

    public T page(Integer page) {
        this.page = page;
        return (T) this;
    }

    public T limit(Integer limit) {
        this.limit = limit;
        return (T) this;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getLimit() {
        return limit;
    }
}
