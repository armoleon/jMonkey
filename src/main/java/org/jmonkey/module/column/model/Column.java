package org.jmonkey.module.column.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.base.model.BaseDto;
import org.jmonkey.module.choice.model.Choice;

import java.util.List;

public class Column extends BaseDto {
    private String text;
    @BeanCollection(elementType = Choice.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Choice> choices;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
