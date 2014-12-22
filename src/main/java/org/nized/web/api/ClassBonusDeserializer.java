package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.ClassBonus;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class ClassBonusDeserializer extends JsonDeserializer<ClassBonus> {

	@Override
	public ClassBonus deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

}
