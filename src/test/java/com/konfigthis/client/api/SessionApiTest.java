/*
 * Trello
 * This document describes the REST API of Trello as published by Trello.com.  - <a href='https://trello.com/docs/index.html' target='_blank'>Official Documentation</a>  - <a href='https://trello.com/docs/api' target='_blank'>The HTML pages that were scraped in order to generate this specification.</a>
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Sessions;
import com.konfigthis.client.model.SessionsStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SessionApi
 */
@Disabled
public class SessionApiTest {

    private static SessionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SessionApi(apiClient);
    }

    /**
     * addSessions()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAndUpdateTest() throws ApiException {
        String idBoard = null;
        String status = null;
        api.createAndUpdate()
                .idBoard(idBoard)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * getSessionsSocket()
     *
     * This is the route for WebSocket requests.  See the socket API reference for a description of WebSocket usage.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSocketSessionsTest() throws ApiException {
        api.getSocketSessions()
                .execute();
        // TODO: test validations
    }

    /**
     * updateSessionsByIdSession()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStatusByIdSessionTest() throws ApiException {
        String idSession = null;
        String idBoard = null;
        String status = null;
        api.updateStatusByIdSession(idSession)
                .idBoard(idBoard)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * updateSessionsStatusByIdSession()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateStatusByIdSession_0Test() throws ApiException {
        String idSession = null;
        String value = null;
        api.updateStatusByIdSession_0(idSession)
                .value(value)
                .execute();
        // TODO: test validations
    }

}
