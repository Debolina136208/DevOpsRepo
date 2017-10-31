package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.service.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String getMainPage(@RequestParam("username") String username,
			@RequestParam("password") String password,
			Model map){
		String redirect;
		
		if(username.equals("bvk") && password.equalsIgnoreCase("bvk")){
			redirect = new String("traineemgtsys");
		}else{
			redirect = new String("../../login");
		}
		return redirect;
	}
	
	@RequestMapping("/addtrainee.htm")
	public String addTrainee(Model map){
		map.addAttribute("trainee", new Trainee());
		map.addAttribute("domainlist", new String[]{"FS","Admin","HR"});
		return "addtrainee";
	}
	
	@RequestMapping("/deletetrainee.htm")
	public String deleteTrainee(){
		return "deletetrainee";
	}
	
	@RequestMapping(value="/save.htm",method=RequestMethod.POST)
	public String saveTrainee(@ModelAttribute("trainee") Trainee trainee, Model model, BindingResult result){
		
		
		trainee =  traineeService.save(trainee);
		
		model.addAttribute("message","Trainee with id "+trainee.getTraineeId()+" added successfully!");
		return "traineemgtsys";
	}
	
	@RequestMapping(value="/update.htm")
	public String modifyTrainee(@RequestParam("traineeid")long traineeid, @RequestParam("traineename") String traineeName, @RequestParam("traineelocation") String traineeLocation, @RequestParam("traineedomain") String traineeDomain, Model model){
		Trainee trainee =  new Trainee();
		trainee.setTraineeId(traineeid);
		trainee.setTraineeName(traineeName);
		trainee.setTraineeDomain(traineeDomain);
		trainee.setTraineeLocation(traineeLocation);
		
		trainee =  traineeService.modify(trainee);
		
		model.addAttribute("message","Trainee with id "+trainee.getTraineeId()+" modified successfully!");
		return "traineemgtsys";
	}
	
	@RequestMapping(value="/get.htm")
	public String getTrainee(@RequestParam("traineeid") int id, Model model){
	Trainee	trainee =  traineeService.getTrainee(id);
	model.addAttribute("trainee",trainee);
	return "deletetrainee";
	}
	
	@RequestMapping(value="/modify.htm")
	public String getNewTrainee(@RequestParam("traineeid") int id, Model model){
	Trainee	trainee =  traineeService.getTrainee(id);
	model.addAttribute("trainee",trainee);
	return "modifytrainee";
	}
	
	
	@RequestMapping(value="/delete.htm")
	public String deleteTrainee(@RequestParam("traineeId") long id, Model model){
	Trainee	trainee =  traineeService.deleteTrainee(id);
	String message = null;
	
	if(trainee == null){
		message = new String("Couldn't find trainee");
	}else{
		message = new String("Trainee deleted");
	}
	model.addAttribute("message",message);
	return "traineemgtsys";
	}
	
	@RequestMapping(value="/retrievetrainee.htm")
	public String retrieveTrainee(){
		return "retrievetrainee";
	}
	
	@RequestMapping(value="/modifytrainee.htm")
	public String modifyTrainee(){
		return "modifytrainee";
	}
	
	@RequestMapping(value="/getatrainee.htm")
	public String retrieveTrainee(@RequestParam("traineeid") int id, Model model){
	Trainee	trainee =  traineeService.getTrainee(id);
	model.addAttribute("trainee",trainee);
	return "retrievetrainee";
	}
	
	@RequestMapping(value="/retrieveAlltrainees.htm")
	public String retrieveTrainees(Model model){
	List<Trainee>trainees =  traineeService.loadAll();
	
	model.addAttribute("traineeList",trainees);
	return "retrieveall";
	}
}