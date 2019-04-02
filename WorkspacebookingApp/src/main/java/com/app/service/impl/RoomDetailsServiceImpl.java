package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.RoomDetailsRespository;
import com.app.entities.ConferenceRoom;

@Service
public class RoomDetailsServiceImpl implements RoomDetailsService{

	@Autowired
	RoomDetailsRespository roomDetailsRepository;
	
	@Override
	public ConferenceRoom saveRoomDetails(ConferenceRoom roomdetails) {
		
		return roomDetailsRepository.save(roomdetails);
	}

	@Override
	public Iterable<ConferenceRoom> findAllRooms() {
		
		return roomDetailsRepository.findAll();
	}

	@Override
	public ConferenceRoom findByRoomId(Long roomId) {
		
		return roomDetailsRepository.findById(roomId).get();
	}

	@Override
	public void DeleteRoom(Long roomId) {
		
		roomDetailsRepository.deleteById(roomId);
	}

}
