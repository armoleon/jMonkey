package org.jmonkey.module.collector.model.enumerated;

public enum CollectorSortFields {

    ID("id"), DATE_MODIFIED("date_modified"), TYPE("type"), STATUS("status"), NAME("name"),;

    private String name;

    CollectorSortFields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
