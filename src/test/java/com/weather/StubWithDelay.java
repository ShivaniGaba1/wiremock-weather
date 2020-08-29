package com.weather;
import org.junit.Test;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class StubWithDelay extends BaseSetup{
	
	@Test
	public void stubWithFixedDelayedResponse() {

		/** Stub for fixed delayed response  **/

		stubFor(get(urlEqualTo("/weather?q=Hamburg" + constURL))
				.willReturn(aResponse()
						.withStatus(200)
						.withFixedDelay(8000)
						.withBodyFile("current_weather.json")));

	}

}