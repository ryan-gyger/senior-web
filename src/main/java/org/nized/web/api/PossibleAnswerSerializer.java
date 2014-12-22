package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.PossibleAnswer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class PossibleAnswerSerializer extends JsonSerializer<PossibleAnswer> {

	@Override
	public void serialize(PossibleAnswer value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub

	}

}
