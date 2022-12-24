package com.observationclass.model.response;

import com.observationclass.entity.ObservationDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EvaluationObservationReivewDetail {
    private String lessonName;
    private String advantage;
    private String disadvantage;
    private String comment;
    private Integer status;
    private List<ObservationDetail> listOfObservationDetail;
}
