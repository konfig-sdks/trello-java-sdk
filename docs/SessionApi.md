# SessionApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAndUpdate**](SessionApi.md#createAndUpdate) | **POST** /sessions | addSessions() |
| [**getSocketSessions**](SessionApi.md#getSocketSessions) | **GET** /sessions/socket | getSessionsSocket() |
| [**updateStatusByIdSession**](SessionApi.md#updateStatusByIdSession) | **PUT** /sessions/{idSession} | updateSessionsByIdSession() |
| [**updateStatusByIdSession_0**](SessionApi.md#updateStatusByIdSession_0) | **PUT** /sessions/{idSession}/status | updateSessionsStatusByIdSession() |


<a name="createAndUpdate"></a>
# **createAndUpdate**
> createAndUpdate(sessions).execute();

addSessions()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://trello.com/1";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiToken  = "YOUR API KEY";
    Trello client = new Trello(configuration);
    String idBoard = "idBoard_example"; // The id of the board you&#39;re viewing.  Boards with no viewers will not get updates about members&#39; statuses.
    String status = "status_example"; // One of: active, disconnected or idle
    try {
      client
              .session
              .createAndUpdate()
              .idBoard(idBoard)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#createAndUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .session
              .createAndUpdate()
              .idBoard(idBoard)
              .status(status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#createAndUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessions** | [**Sessions**](Sessions.md)| Attributes of \&quot;Sessions\&quot; to be added. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Server rejection |  -  |

<a name="getSocketSessions"></a>
# **getSocketSessions**
> getSocketSessions().execute();

getSessionsSocket()

This is the route for WebSocket requests.  See the socket API reference for a description of WebSocket usage.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://trello.com/1";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiToken  = "YOUR API KEY";
    Trello client = new Trello(configuration);
    try {
      client
              .session
              .getSocketSessions()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getSocketSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .session
              .getSocketSessions()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#getSocketSessions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Server rejection |  -  |

<a name="updateStatusByIdSession"></a>
# **updateStatusByIdSession**
> updateStatusByIdSession(idSession, sessions).execute();

updateSessionsByIdSession()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://trello.com/1";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiToken  = "YOUR API KEY";
    Trello client = new Trello(configuration);
    String idSession = "idSession_example"; // idSession
    String idBoard = "idBoard_example"; // The id of the board you&#39;re viewing.  Boards with no viewers will not get updates about members&#39; statuses.
    String status = "status_example"; // One of: active, disconnected or idle
    try {
      client
              .session
              .updateStatusByIdSession(idSession)
              .idBoard(idBoard)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#updateStatusByIdSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .session
              .updateStatusByIdSession(idSession)
              .idBoard(idBoard)
              .status(status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#updateStatusByIdSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idSession** | **String**| idSession | |
| **sessions** | [**Sessions**](Sessions.md)| Attributes of \&quot;Sessions\&quot; to be updated. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Server rejection |  -  |

<a name="updateStatusByIdSession_0"></a>
# **updateStatusByIdSession_0**
> updateStatusByIdSession_0(idSession, sessionsStatus).execute();

updateSessionsStatusByIdSession()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SessionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://trello.com/1";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiToken  = "YOUR API KEY";
    Trello client = new Trello(configuration);
    String idSession = "idSession_example"; // idSession
    String value = "value_example"; // One of: active, disconnected or idle
    try {
      client
              .session
              .updateStatusByIdSession_0(idSession)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#updateStatusByIdSession_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .session
              .updateStatusByIdSession_0(idSession)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SessionApi#updateStatusByIdSession_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idSession** | **String**| idSession | |
| **sessionsStatus** | [**SessionsStatus**](SessionsStatus.md)| Attributes of \&quot;Sessions Status\&quot; to be updated. | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key), [api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Server rejection |  -  |

