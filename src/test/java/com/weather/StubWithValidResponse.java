package com.weather;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class StubWithValidResponse extends BaseSetup {

	@Test
	public void stubWithCurrentWeather() {

		/** Stub with current weather of the city **/

		stubFor(get(urlEqualTo("/weather?q=Hamburg" + constURL))
				.willReturn(aResponse()
						.withStatus(200)
						.withBodyFile("current_weather.json")));

	}

	@Test
	public void stubWithSunnyWeather() {

		/** Stub with different weather **/

		stubFor(get(urlEqualTo("/weather?q=Hamburg" + constURL))
				.willReturn(aResponse()
						.withStatus(200)
						.withBodyFile("sunny_weather.json")));
	}
}