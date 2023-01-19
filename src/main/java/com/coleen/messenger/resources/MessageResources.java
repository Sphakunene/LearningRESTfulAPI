package com.coleen.messenger.resources;

import java.util.List;

import com.coleen.messenger.model.Messages;
import com.coleen.messenger.service.MessageService;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/messages")

public class MessageResources {
	
	MessageService service = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getMessage() {
		
		return service.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	
	public Messages getMessageById(@PathParam("id") Long id) {
		return service.getMessage(id);
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Messages addMessage(Messages msg) {
		return service.addMessage(msg);
	}
	
	
}
