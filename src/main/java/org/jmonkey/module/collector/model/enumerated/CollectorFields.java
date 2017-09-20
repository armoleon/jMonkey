package org.jmonkey.module.collector.model.enumerated;

public enum CollectorFields {
    TYPE("type"), STATUS("status"), RESPONSE_COUNT("'response_count"), DATE_CREATED("date_created"), DATE_MODIFIED("date_modified"), URL("url");


    private String name;

    CollectorFields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
