package org.jmonkey.module.common.model.enumerated;

public enum SortOrder {
    ASCENDING("ASC"), DESCENDING("DESC");

    private String name;

    SortOrder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
