package org.jmonkey.module.answer.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.base.model.BaseDto;
import org.jmonkey.module.choice.model.Choice;
import org.jmonkey.module.column.model.Column;
import org.jmonkey.module.row.model.Row;

import java.util.List;

public class Answer extends BaseDto {
    @BeanCollection(elementType = Row.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Row> rows;

    @BeanCollection(elementType = Column.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Column> columns;

    @BeanCollection(elementType = Choice.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Choice> choices;

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
