package org.jmonkey.module.survey.model.enumerated;

public enum SurveyFields {
    RESPONSE_COUNT("response_count"), QUESTION_COUNT("question_count"), ANALYZE_URL("analyze_url"), DATE_CREATED("date_created"), DATE_MODIFIED
            ("date_modified"), LANGUAGE("language"), PREVIEW("preview"),;


    private String name;

    SurveyFields(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
