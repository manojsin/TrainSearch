package com.hopscotch.trainsearchservice.service;
import com.hopscotch.trainsearchservice.models.TrainSearchResponse;
public interface TrainSearchService {
    TrainSearchResponse getTrainDetails(Long trainNumber);
}
