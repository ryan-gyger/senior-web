package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.ClassBonus;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class ClassBonusSerializer extends JsonSerializer<ClassBonus> {

	@Override
	public void serialize(ClassBonus value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub

	}

}
