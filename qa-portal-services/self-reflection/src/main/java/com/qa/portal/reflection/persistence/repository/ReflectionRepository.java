package com.qa.portal.reflection.persistence.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.portal.common.persistence.entity.TraineeEntity;
import com.qa.portal.common.persistence.entity.TrainerEntity;
import com.qa.portal.reflection.persistence.entity.ReflectionEntity;

@Repository
public interface ReflectionRepository extends JpaRepository<ReflectionEntity, Integer> {

	Optional<ReflectionEntity> findByReviewerAndDate(TrainerEntity reviewer, LocalDate date);

	List<ReflectionEntity> findAllByResponder(TraineeEntity responder);

}
