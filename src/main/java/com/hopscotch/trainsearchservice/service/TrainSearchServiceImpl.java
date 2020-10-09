package com.hopscotch.trainsearchservice.service;
import com.hopscotch.trainsearchservice.entity.TrainDetail;
import com.hopscotch.trainsearchservice.models.ResponseUtil;
import com.hopscotch.trainsearchservice.models.TrainInfo;
import com.hopscotch.trainsearchservice.models.TrainSearchResponse;
import com.hopscotch.trainsearchservice.models.TrainServiceStatus;
import com.hopscotch.trainsearchservice.repository.TrainDetailRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrainSearchServiceImpl implements TrainSearchService {
    private ResponseUtil responseUtil;
    private TrainDetailRepository trainDetailRepository;

    public TrainSearchServiceImpl(TrainDetailRepository trainDetailRepository,ResponseUtil responseUtil) {
        this.trainDetailRepository=trainDetailRepository;
        this.responseUtil=responseUtil;
    }
    @Override
    public TrainSearchResponse getTrainDetails(Long trainNumber) {
        TrainSearchResponse response=new TrainSearchResponse();
        List<TrainInfo> trainInfoList;
        Optional<TrainDetail> trainDetail= trainDetailRepository.findByTrainId(trainNumber);
        if(trainDetail.isPresent()) {
            trainInfoList=trainDetail.get().getTrainScheduleDetail().stream().map(data->new TrainInfo(trainNumber,data.getStationDetails().getStationName(),data.getArrival(),data.getDeparture(),data.getStationDetails().getStationId())).collect(Collectors.toList());
            response.setTrainInfoList(trainInfoList);
            response.setStatus(responseUtil.populateBasicResponse(TrainServiceStatus.SUCCESS));
            return response;
        }
        response.setStatus(responseUtil.populateBasicResponse(TrainServiceStatus.DATA_NOT_AVAILABLE));
        return response;
    }
}
