package org.jmonkey.module.answer.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;
import org.jmonkey.module.choice.model.ChoiceEntity;
import org.jmonkey.module.column.model.ColumnEntity;
import org.jmonkey.module.row.model.RowEntity;

import java.util.List;

public class AnswerEntity extends BaseEntity {

    @JsonProperty("rows")
    private List<RowEntity> rows;

    @JsonProperty("cols")
    private List<ColumnEntity> columns;

    @JsonProperty("choices")
    private List<ChoiceEntity> choices;

    public List<RowEntity> getRows() {
        return rows;
    }

    public void setRows(List<RowEntity> rows) {
        this.rows = rows;
    }

    public List<ColumnEntity> getColumns() {
        return columns;
    }

    public void setColumns(List<ColumnEntity> columns) {
        this.columns = columns;
    }

    public List<ChoiceEntity> getChoices() {
        return choices;
    }

    public void setChoices(List<ChoiceEntity> choices) {
        this.choices = choices;
    }
}
