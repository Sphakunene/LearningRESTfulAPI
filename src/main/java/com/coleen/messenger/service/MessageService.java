package com.coleen.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.coleen.messenger.database.Database;
import com.coleen.messenger.model.Messages;

public class MessageService {
	
	private Map<Long, Messages> messages = Database.getMessages();
	
	public List<Messages> getAllMessages(){
		
		return new ArrayList<Messages>(messages.values());
		
	}
	public MessageService() {
		messages.put(1L, new Messages(1,"hello spha","coleen"));
		messages.put(2L, new Messages(2,"hello coleen","coleen"));
		messages.put(3L, new Messages(3,"hello world","coleen"));
		}
	public Messages getMessage(Long id) {
		return messages.get(id);
	}
	
	public Messages addMessage(Messages message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		
		return message;
	}
	
	public Messages updateMessage(Messages message) {
		
		if(message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public Messages removeMessage(Long id) {
		return messages.remove(id);
	}
}
