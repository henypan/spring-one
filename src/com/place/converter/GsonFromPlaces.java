package com.place.converter;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class GsonFromPlaces {

	public static void main(String[] args) {
		List<String> interests = new ArrayList<String>();
		interests.add("Status of Liberty");
		interests.add("Empire State Building");
		interests.add("Wall Street");
		Place place = new Place.Builder().country("United States").city("New York").placeOfInterests(interests)
				.builder();
		Gson gson = new Gson();
		// object to json
		String placeGson = gson.toJson(place);
		System.out.println(placeGson);

		try {
			FileReader fr = new FileReader("C:\\Users\\panha\\workspace\\spring-one\\resource\\json\\place.json");
			Place placeFromJSON = gson.fromJson(fr, Place.class);
			System.out.println(placeFromJSON.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
