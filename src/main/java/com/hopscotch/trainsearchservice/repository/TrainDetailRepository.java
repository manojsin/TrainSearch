package com.hopscotch.trainsearchservice.repository;
import com.hopscotch.trainsearchservice.entity.TrainDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface TrainDetailRepository extends JpaRepository<TrainDetail,Long> {
    Optional<TrainDetail> findByTrainId(Long trainNumber);
}
