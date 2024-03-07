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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchApi
 */
@Disabled
public class BatchApiTest {

    private static BatchApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BatchApi(apiClient);
    }

    /**
     * getBatch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDataTest() throws ApiException {
        String urls = null;
        api.getData(urls)
                .execute();
        // TODO: test validations
    }

}
