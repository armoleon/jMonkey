package org.jmonkey.module.page.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.base.model.BaseDto;
import org.jmonkey.module.question.model.AnsweredQuestion;

import java.util.List;

public class AnsweredPage extends BaseDto {

    private String id;
    private String title;
    private String description;
    private Integer position;
    private Integer questionCount;

    @BeanCollection(elementType = AnsweredQuestion.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<AnsweredQuestion> questions;

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

    public List<AnsweredQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<AnsweredQuestion> answeredQuestions) {
        this.questions = answeredQuestions;
    }
}
