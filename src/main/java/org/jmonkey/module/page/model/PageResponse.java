package org.jmonkey.module.page.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.base.model.BaseDto;
import org.jmonkey.module.question.model.QuestionResponse;

import java.util.List;

public class PageResponse extends BaseDto {

    private String id;
    private String title;
    private String description;
    private Integer position;
    private Integer questionCount;

    @BeanCollection(elementType = QuestionResponse.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<QuestionResponse> questions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public List<QuestionResponse> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionResponse> questions) {
        this.questions = questions;
    }
}
