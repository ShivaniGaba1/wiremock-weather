package com.weather;

import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class StubWithInvalidResponse extends BaseSetup {
	
	//Scenario 2
	@Test
	public void stubWithInvalidResponse() {

		/** Stub for success response with invalid json file  **/

		stubFor(get(urlEqualTo("/weather?q=Hamburg" + constURL))
				.willReturn(aResponse()
						.withStatus(200)
						.withBodyFile("invalid_body.json")));
	}

}
