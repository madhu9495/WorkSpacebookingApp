package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.app.entities.ConferenceRoom;
import com.app.service.impl.RoomDetailsServiceImpl;






@Controller
@RequestMapping("wspbookingapp/Admin")
public class AdminController {

	@Autowired
	RoomDetailsServiceImpl roomDetailsServiceImpl;
	
	@GetMapping(value="/home")
	 public String index() {
	        return "admin-home";
	    }
	
	@GetMapping(value="/addroom")
	public String CreateRoomDetails(Model model) {
		model.addAttribute("roomdetails", new ConferenceRoom());
		return "editroom";
	}
	
	 @PostMapping(value = "/saveroom")
	 public String saveRoomdetails(ConferenceRoom roomdetails, Model model) {
		 
		 ConferenceRoom room= roomDetailsServiceImpl.saveRoomDetails(roomdetails);
		 
	     model.addAttribute("room",room);
	      return "AddRoomSuccess";
	    }	
	
	 @GetMapping(value="/allroomdetails")
	 public String AllRoomDetails(Model model) {
			model.addAttribute("roomdetails", roomDetailsServiceImpl.findAllRooms());
			return "roomdetails";
		}
	 
	 @GetMapping(value="/roomdetails/edit/{id}")
	 public String UpdateRoomDetails(Model model, @PathVariable(value = "id") Long roomid) {
		 
		 model.addAttribute("roomdetails",roomDetailsServiceImpl.findByRoomId(roomid));
		 
		 return "editroom";
		 
	 }
	 
	 @GetMapping(value = "/roomdetails/delete/{id}")
	  public String DeleteRoom(@PathVariable(name = "id") Long roomid) {
	        roomDetailsServiceImpl.DeleteRoom(roomid);
	        return "redirect:/wspbookingapp/Admin/allroomdetails";
	    }
	 

}
