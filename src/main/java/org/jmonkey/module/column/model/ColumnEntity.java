package org.jmonkey.module.column.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;
import org.jmonkey.module.choice.model.ChoiceEntity;

import java.util.List;

public class ColumnEntity extends BaseEntity {

    @JsonProperty("text")
    private String text;

    @JsonProperty("choices")
    private List<ChoiceEntity> choices;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ChoiceEntity> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceEntity> choices) {
        this.choices = choices;
    }
}
