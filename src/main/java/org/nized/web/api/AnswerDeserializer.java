package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.Answer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class AnswerDeserializer extends JsonDeserializer<Answer> {

	@Override
	public Answer deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

}
