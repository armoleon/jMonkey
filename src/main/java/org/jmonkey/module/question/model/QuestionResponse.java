package org.jmonkey.module.question.model;

import io.beanmapper.annotations.BeanCollection;
import io.beanmapper.annotations.BeanCollectionUsage;
import org.jmonkey.module.answer.model.AnswerResponse;
import org.jmonkey.module.base.model.BaseDto;
import org.jmonkey.module.heading.model.Heading;

import java.util.List;

public class QuestionResponse extends BaseDto {

    private String id;
    private String visible;
    private String family;
    private String subtype;

    @BeanCollection(elementType = AnswerResponse.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<AnswerResponse> answers;

    @BeanCollection(elementType = Heading.class, beanCollectionUsage = BeanCollectionUsage.CONSTRUCT)
    private List<Heading> headings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public List<AnswerResponse> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerResponse> answers) {
        this.answers = answers;
    }

    public List<Heading> getHeadings() {
        return headings;
    }

    public void setHeadings(List<Heading> headings) {
        this.headings = headings;
    }
}
