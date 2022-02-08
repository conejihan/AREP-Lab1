package edu.escuelaing.arep;

import static spark.Spark.get;
import static spark.Spark.port;
import edu.escuelaing.arep.service.ConvertService;

public class App
{

    private static ConvertService convert;

    /**
     *Metodo principal de la API
     */
    public static void main(String[] args) {
        port(getPort());
        get("/celsius/:temp", "application/json",(req, res) -> convert.celsiusFahrenheit(Float.parseFloat(":temp")));
        get("/fahrenheit/:temp", "application/json",(req, res) -> convert.fahrenheitCelsius(Float.parseFloat(":temp")));
    }

    /**
     * Devuelve el puerto que usara la API
     * @return int -> número de puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
