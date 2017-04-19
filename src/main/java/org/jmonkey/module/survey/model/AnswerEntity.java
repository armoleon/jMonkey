package org.jmonkey.module.survey.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

import java.util.List;

public class AnswerEntity extends BaseEntity {

    @JsonProperty("rows")
    private List<RowEntity> rows;

    @JsonProperty("choices")
    private List<ChoiceEntity> choices;

    public List<RowEntity> getRows() {
        return rows;
    }

    public void setRows(List<RowEntity> rows) {
        this.rows = rows;
    }

    public List<ChoiceEntity> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceEntity> choices) {
        this.choices = choices;
    }
}
