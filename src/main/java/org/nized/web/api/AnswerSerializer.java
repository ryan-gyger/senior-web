package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.Answer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class AnswerSerializer extends JsonSerializer<Answer> {

	@Override
	public void serialize(Answer value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub

	}

}
