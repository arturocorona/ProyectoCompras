package com.compras.proyecto;
import static spark.Spark.*;
/**
 *
 * @author arturo
 */
public class SparkTest {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Prueba de spark");
    }
}
