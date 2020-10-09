package com.hopscotch.trainsearchservice.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "train_schedule_details")
public class TrainScheduleDetail implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "train_id")
    private Long train_id;
    @Column(name = "arrival")
    private String arrival;
    @Column(name = "departure")
    private String departure;
    @Column(name = "created_on")
    private Date createdOn;
    @Column(name = "updated_on")
    private Date updatedOn;
    @OneToOne(targetEntity = StationDetail.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private StationDetail stationDetails;

}
