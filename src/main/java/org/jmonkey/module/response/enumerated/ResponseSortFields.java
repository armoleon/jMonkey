package org.jmonkey.module.response.enumerated;

public enum ResponseSortFields {
    DATE_MODIFIED("date_modified");

    private String name;

    ResponseSortFields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
