package org.nized.web.api;

import java.io.IOException;

import org.nized.web.domain.Announcement;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class AnnouncementSerializer extends JsonSerializer<Announcement> {

	@Override
	public void serialize(Announcement value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub

	}

}
