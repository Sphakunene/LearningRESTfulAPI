package com.coleen.messenger.database;

import java.util.*;
import com.coleen.messenger.model.*;

public class Database {

	private static Map<Long, Messages> messages = new HashMap();
	private static Map<Long, Profile> profiles = new HashMap();
	
	public static Map<Long, Messages> getMessages(){
		return messages;
	}
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
