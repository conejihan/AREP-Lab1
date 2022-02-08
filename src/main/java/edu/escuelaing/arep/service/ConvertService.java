package edu.escuelaing.arep.service;
import com.google.gson.JsonObject;
public interface ConvertService {
    /**Convierte de grados celsius a Fahrenheit
     * @param temp -> valor de los °C que se convertiran a F
     * @return JsonObject -> JSON en donde estara la respuesta
    */
    JsonObject celsiusFahrenheit(float temp);

    /**Convierte de Fahrenheit a grados celsius
     * @param temp -> valor de F que se convertiran a °C
     * @return JsonObject -> JSON en donde estara la respuesta
     */
    JsonObject fahrenheitCelsius(float temp);

}
