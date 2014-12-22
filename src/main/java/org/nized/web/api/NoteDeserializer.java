package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.Note;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class NoteDeserializer extends JsonDeserializer<Note> {

	@Override
	public Note deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

}
