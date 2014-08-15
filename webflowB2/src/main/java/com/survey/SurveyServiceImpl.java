package com.survey;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

//import blackboard.data.user.User;
//import blackboard.platform.context.Context;
//import blackboard.platform.context.ContextManagerFactory;

public class SurveyServiceImpl implements SurveyService {

	public boolean saveSurvey(Survey survey) {
		
		boolean smoking = survey.getHobby().equalsIgnoreCase("Smoking");
		if (smoking) {
			FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage("Sorry, smoking is not allowed."));
		}
		return !smoking;
	}

	public List<Survey> getSurveyList() {
		
		//User user = getUser();
		//String userName = user == null ? "Guest" : user.getUserName();
		String userName = "Simon";
		
		List<Survey> list = new ArrayList<Survey>();
		list.add(new Survey(userName, "Taekwondo", "Java"));
		list.add(new Survey("Peter", "Basketball", "PHP"));
		
		return list;
	}
	
	//private static User getUser() {
	//	Context context = ContextManagerFactory.getInstance().getContext();
	//	return context.getUser();
	//}

}
