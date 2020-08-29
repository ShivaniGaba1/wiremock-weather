package com.weather;

import com.github.tomakehurst.wiremock.http.Fault;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class StubWithServerErrors extends BaseSetup{

	@Test

	public void stubWithServerError() {

		/** Stub with 500 error from API  **/

		stubFor(get(urlEqualTo("/weather?q=Hamburg" + constURL))
				.willReturn(aResponse()
						.withStatus(500)));

	}

}