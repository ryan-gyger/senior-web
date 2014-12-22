package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.Person;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class PersonSerializer extends JsonSerializer<Person>{

	@Override
	public void serialize(Person value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub
		
	}

}
