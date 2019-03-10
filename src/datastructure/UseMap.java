package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> citiesInUK = new ArrayList<String>();
		citiesInUK.add("London");
		citiesInUK.add("Birmingham");
		citiesInUK.add("Liverpool");

		List<String> citiesInUS = new ArrayList<String>();
		citiesInUS.add("New York");
		citiesInUS.add("Boston");
		citiesInUS.add("Chicago");

		List<String> citiesInCanada = new ArrayList<String>();
		citiesInCanada.add("Toronto");
		citiesInCanada.add("Vancouver");
		citiesInCanada.add("Montreal");

		Map<String, List<String>> countries = new LinkedHashMap<String, List<String>>();
		countries.put("United Kingdom", citiesInUK);
		countries.put("United States", citiesInUS);
		countries.put("Canada", citiesInCanada);


		for (Map.Entry<String, List<String>> cities : countries.entrySet())
			System.out.println("Country: " + cities.getKey() + " | city: " + cities.getValue());

	}

}
