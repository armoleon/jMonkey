package org.jmonkey.module.survey.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;

import java.util.List;

public class Answer {
    @BeanCollection(elementType = Question.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Row> rows;
    @BeanCollection(elementType = Choice.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Choice> choices;

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
