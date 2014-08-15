package com.survey;

import java.util.List;

public interface SurveyService {

	public boolean saveSurvey(Survey survey);
	
	public List<Survey> getSurveyList();
	
}
