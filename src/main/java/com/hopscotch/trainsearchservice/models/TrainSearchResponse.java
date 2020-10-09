package com.hopscotch.trainsearchservice.models;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.List;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrainSearchResponse  extends AbstractResponse {
    private List<TrainInfo> trainInfoList;
}
