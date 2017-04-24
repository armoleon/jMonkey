package org.jmonkey.module.answer.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

public class AnswerResponseEntity extends BaseEntity {

    @JsonProperty("choice_id")
    private String choiceId;

    @JsonProperty("row_id")
    private String rowId;

    @JsonProperty("col_id")
    private String columnId;

    @JsonProperty("other_id")
    private String otherId;

    @JsonProperty("text")
    private String text;

    public String getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
