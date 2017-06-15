package org.jmonkey.module.survey.model.enumerated;

public enum SurveySortFields {
    TITLE("title"), DATE_MODIFIED("date_modified"), NUMBER_OF_RESPONSES("num_responses");

    private String name;

    SurveySortFields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
