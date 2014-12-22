package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.Person;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class PersonDeserializer extends JsonDeserializer<Person> {

	@Override
	public Person deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Item deserialize(JsonParser jp, DeserializationContext
	 * ctxt) throws IOException, JsonProcessingException { JsonNode node =
	 * jp.getCodec().readTree(jp); int id = (Integer) ((IntNode)
	 * node.get("id")).numberValue(); String itemName =
	 * node.get("itemName").asText(); int userId = (Integer) ((IntNode)
	 * node.get("createdBy")).numberValue();
	 * 
	 * return new Item(id, itemName, new User(userId, null)); }
	 */
}
