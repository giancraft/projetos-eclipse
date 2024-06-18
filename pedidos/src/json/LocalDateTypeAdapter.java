package json;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LocalDateTypeAdapter implements JsonSerializer<LocalDate>, JsonDeserializer<LocalDate>{

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	@Override
	public LocalDate deserialize(JsonElement json, Type arg1, JsonDeserializationContext arg2)
		throws JsonParseException {
		return LocalDate.parse(json.getAsString(), formatter);
	}

	@Override
	public JsonElement serialize(LocalDate date, Type arg1, JsonSerializationContext arg2) {
		return new JsonPrimitive(date.format(formatter));
	}
	
}
