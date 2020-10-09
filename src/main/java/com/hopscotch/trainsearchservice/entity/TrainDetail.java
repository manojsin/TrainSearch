package com.hopscotch.trainsearchservice.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "train_details")
public class TrainDetail implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "train_id")
    private Long trainId;
    @Column(name = "stationId")
    private Long station_id;
    @Column(name = "train_name")
    private String trainName;
    @Column(name = "source")
    private String source;
    @Column(name = "destination")
    private String destination;
    @Column(name = "created_on")
    private Date createdOn;
    @Column(name = "updated_on")
    private Date updatedOn;
    @OneToMany(targetEntity = TrainScheduleDetail.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "train_id")
    private List<TrainScheduleDetail> trainScheduleDetail;
}
