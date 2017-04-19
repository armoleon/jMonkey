package org.jmonkey.module.survey.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.jmonkey.module.base.model.BaseEntity;

public class ChoiceEntity extends BaseEntity {

    @JsonProperty("id")
    private String id;

    @JsonProperty("description")
    private String description;

    @JsonProperty("text")
    private String text;

    @JsonProperty("position")
    private Integer position;

    @JsonProperty("visible")
    private Boolean visible;

    @JsonProperty("weight")
    private Integer weight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
