package com.danilodughetti.sparkapp.sparkapp;
import static spark.Spark.*;

import org.apache.log4j.BasicConfigurator;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 BasicConfigurator.configure();
    	 get("/hello", (req, res) -> "<h1>Ready to build</h1>");
    }
}
