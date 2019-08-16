package com.qa.portal.feedback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qa.portal.feedback.dto.CohortCourseFeedbackDto;
import com.qa.portal.feedback.persistence.repository.CohortCourseFeedbackRepository;
import com.qa.portal.feedback.services.mapper.CohortCourseEvaluationMapper;

@Component
public class CreateFeedbackOperation {
	
	private CohortCourseEvaluationMapper mapper;
	
	private CohortCourseFeedbackRepository feedbackRepo;
	
	@Autowired
	public CreateFeedbackOperation(CohortCourseEvaluationMapper mapper, CohortCourseFeedbackRepository feedbackRepo) {
		this.mapper = mapper;
		this.feedbackRepo = feedbackRepo;
	}
	
	public CohortCourseFeedbackDto createFeedbackForm(CohortCourseFeedbackDto cohortCourseFeedbackDto) {
		return this.mapper
				.mapToFeedbackDto(this.feedbackRepo.save(this.mapper.mapToCohortCourseFeedbackEntity(cohortCourseFeedbackDto)));
	}
}
