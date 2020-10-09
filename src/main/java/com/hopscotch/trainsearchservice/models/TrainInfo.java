package com.hopscotch.trainsearchservice.models;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class TrainInfo {
    private Long trainId;
    private String stationName;
    private String arrival;
    private String departure;
    private Long stationId;
}
