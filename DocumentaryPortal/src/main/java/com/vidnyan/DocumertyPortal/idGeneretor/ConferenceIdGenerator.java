package com.vidnyan.DocumertyPortal.idGeneretor;

import com.vidnyan.DocumertyPortal.doa.ConferenceDoa;

public class ConferenceIdGenerator {
    
	private	static String cid= null;
    
	public static String idGenerator()
	{
		cid=ConferenceDoa.getID();
		
		return cid;
	}
    
    
	public ConferenceIdGenerator() {
		// TODO Auto-generated constructor stub
	}

}
