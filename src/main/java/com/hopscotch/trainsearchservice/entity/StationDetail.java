package com.hopscotch.trainsearchservice.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "station_details")
public class StationDetail implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "station_id")
    private Long stationId;
    @Column(name = "station_name")
    private String stationName;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "zone")
    private String zone;


}
