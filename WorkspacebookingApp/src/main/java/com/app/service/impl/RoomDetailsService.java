package com.app.service.impl;

import com.app.entities.ConferenceRoom;

public interface RoomDetailsService {
	
	public ConferenceRoom saveRoomDetails(ConferenceRoom roomdetails);
	
	public Iterable<ConferenceRoom> findAllRooms();
	
	public ConferenceRoom findByRoomId(Long roomId);
	
	public void DeleteRoom(Long roomId);

}
