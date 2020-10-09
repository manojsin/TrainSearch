package com.hopscotch.trainsearchservice.controller;

import com.hopscotch.trainsearchservice.models.TrainSearchResponse;
import com.hopscotch.trainsearchservice.service.TrainSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TrainSearchController {

    private TrainSearchService trainSearchService;

    @Autowired
    public TrainSearchController(TrainSearchService trainSearchService) {
        this.trainSearchService=trainSearchService;
    }

    @RequestMapping(name = "search/train",method = RequestMethod.GET)
    public ResponseEntity<?> fetchTrainDetails(@RequestParam("trainNo") Long trainNo) {
        TrainSearchResponse trainSearchResponse=trainSearchService.getTrainDetails(trainNo);
        return  new ResponseEntity<>(trainSearchResponse, HttpStatus.OK);
    }
}
