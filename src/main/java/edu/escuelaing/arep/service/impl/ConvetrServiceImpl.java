package edu.escuelaing.arep.service.impl;

import com.google.gson.JsonObject;
import edu.escuelaing.arep.service.ConvertService;

public class ConvetrServiceImpl implements ConvertService {
    @Override
    public JsonObject celsiusFahrenheit(float temp) {
        float result = (temp * (9/5)) + 32;
        JsonObject json = new JsonObject();
        json.addProperty("celsius", temp);
        json.addProperty("fahrenheit", result);
        json.addProperty("unit","F");
        json.addProperty("status", 200);

        return json;
    }

    @Override
    public JsonObject fahrenheitCelsius(float temp) {
        float result = (temp - 32 )* (5*9);
        JsonObject json = new JsonObject();
        json.addProperty("fahrenheit", temp);
        json.addProperty("celsius", result);
        json.addProperty("unit","°C");
        json.addProperty("status", 200);
        return json;
    }
}
