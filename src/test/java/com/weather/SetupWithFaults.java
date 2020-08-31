package com.weather;

import com.github.tomakehurst.wiremock.http.Fault;
import org.junit.Test;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class SetupWithFaults extends BaseSetup {
    
    //Scenario 4
    @Test
    public void stubWithFault() {

        /** Stub for fault in connection reset **/

        stubFor(get(urlEqualTo("/weather?q=Hamburg" + constURL))
                .willReturn(aResponse()
                        .withFault(Fault.CONNECTION_RESET_BY_PEER)));
    }
}
