# WebhookApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](WebhookApi.md#getById) | **GET** /webhooks/{idWebhook} | getWebhooksByIdWebhook() |
| [**getByIdField**](WebhookApi.md#getByIdField) | **GET** /webhooks/{idWebhook}/{field} | getWebhooksByIdWebhookByField() |
| [**removeById**](WebhookApi.md#removeById) | **DELETE** /webhooks/{idWebhook} | deleteWebhooksByIdWebhook() |
| [**update**](WebhookApi.md#update) | **PUT** /webhooks | updateWebhooks() |
| [**updateActiveById**](WebhookApi.md#updateActiveById) | **PUT** /webhooks/{idWebhook}/active | updateWebhooksActiveByIdWebhook() |
| [**updateByIdWebhook**](WebhookApi.md#updateByIdWebhook) | **PUT** /webhooks/{idWebhook} | updateWebhooksByIdWebhook() |
| [**updateCallbackUrlById**](WebhookApi.md#updateCallbackUrlById) | **PUT** /webhooks/{idWebhook}/callbackURL | updateWebhooksCallbackURLByIdWebhook() |
| [**updateDescriptionByIdWebhook**](WebhookApi.md#updateDescriptionByIdWebhook) | **PUT** /webhooks/{idWebhook}/description | updateWebhooksDescriptionByIdWebhook() |
| [**updateModelById**](WebhookApi.md#updateModelById) | **PUT** /webhooks/{idWebhook}/idModel | updateWebhooksIdModelByIdWebhook() |


<a name="getById"></a>
# **getById**
> getById(idWebhook).execute();

getWebhooksByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    try {
      client
              .webhook
              .getById(idWebhook)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .getById(idWebhook)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getById");
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
| **idWebhook** | **String**| idWebhook | |

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

<a name="getByIdField"></a>
# **getByIdField**
> getByIdField(idWebhook, field).execute();

getWebhooksByIdWebhookByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    String field = "field_example"; // field
    try {
      client
              .webhook
              .getByIdField(idWebhook, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getByIdField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .getByIdField(idWebhook, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getByIdField");
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
| **idWebhook** | **String**| idWebhook | |
| **field** | **String**| field | |

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

<a name="removeById"></a>
# **removeById**
> removeById(idWebhook).execute();

deleteWebhooksByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    try {
      client
              .webhook
              .removeById(idWebhook)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .removeById(idWebhook)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#removeById");
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
| **idWebhook** | **String**| idWebhook | |

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

<a name="update"></a>
# **update**
> update(webhooks).execute();

updateWebhooks()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String description = "description_example"; // a string with a length from 0 to 16384
    String active = "active_example"; //  true or false
    String callbackURL = "callbackURL_example"; // A valid URL that is reachable with a HEAD request
    String idModel = "idModel_example"; // id of the model that should be hooked
    try {
      client
              .webhook
              .update()
              .description(description)
              .active(active)
              .callbackURL(callbackURL)
              .idModel(idModel)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .update()
              .description(description)
              .active(active)
              .callbackURL(callbackURL)
              .idModel(idModel)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#update");
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
| **webhooks** | [**Webhooks**](Webhooks.md)| Attributes of \&quot;Webhooks\&quot; to be updated. | |

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

<a name="updateActiveById"></a>
# **updateActiveById**
> updateActiveById(idWebhook, webhooksActive).execute();

updateWebhooksActiveByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    String value = "value_example"; //  true or false
    try {
      client
              .webhook
              .updateActiveById(idWebhook)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateActiveById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .updateActiveById(idWebhook)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateActiveById");
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
| **idWebhook** | **String**| idWebhook | |
| **webhooksActive** | [**WebhooksActive**](WebhooksActive.md)| Attributes of \&quot;Webhooks Active\&quot; to be updated. | |

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

<a name="updateByIdWebhook"></a>
# **updateByIdWebhook**
> updateByIdWebhook(idWebhook, webhooks).execute();

updateWebhooksByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    String description = "description_example"; // a string with a length from 0 to 16384
    String active = "active_example"; //  true or false
    String callbackURL = "callbackURL_example"; // A valid URL that is reachable with a HEAD request
    String idModel = "idModel_example"; // id of the model that should be hooked
    try {
      client
              .webhook
              .updateByIdWebhook(idWebhook)
              .description(description)
              .active(active)
              .callbackURL(callbackURL)
              .idModel(idModel)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateByIdWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .updateByIdWebhook(idWebhook)
              .description(description)
              .active(active)
              .callbackURL(callbackURL)
              .idModel(idModel)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateByIdWebhook");
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
| **idWebhook** | **String**| idWebhook | |
| **webhooks** | [**Webhooks**](Webhooks.md)| Attributes of \&quot;Webhooks\&quot; to be updated. | |

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

<a name="updateCallbackUrlById"></a>
# **updateCallbackUrlById**
> updateCallbackUrlById(idWebhook, webhooksCallbackURL).execute();

updateWebhooksCallbackURLByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    String value = "value_example"; // A valid URL that is reachable with a HEAD request
    try {
      client
              .webhook
              .updateCallbackUrlById(idWebhook)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateCallbackUrlById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .updateCallbackUrlById(idWebhook)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateCallbackUrlById");
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
| **idWebhook** | **String**| idWebhook | |
| **webhooksCallbackURL** | [**WebhooksCallbackURL**](WebhooksCallbackURL.md)| Attributes of \&quot;Webhooks Callback Url\&quot; to be updated. | |

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

<a name="updateDescriptionByIdWebhook"></a>
# **updateDescriptionByIdWebhook**
> updateDescriptionByIdWebhook(idWebhook, webhooksDescription).execute();

updateWebhooksDescriptionByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .webhook
              .updateDescriptionByIdWebhook(idWebhook)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateDescriptionByIdWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .updateDescriptionByIdWebhook(idWebhook)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateDescriptionByIdWebhook");
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
| **idWebhook** | **String**| idWebhook | |
| **webhooksDescription** | [**WebhooksDescription**](WebhooksDescription.md)| Attributes of \&quot;Webhooks Description\&quot; to be updated. | |

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

<a name="updateModelById"></a>
# **updateModelById**
> updateModelById(idWebhook, webhooksIdModel).execute();

updateWebhooksIdModelByIdWebhook()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String idWebhook = "idWebhook_example"; // idWebhook
    String value = "value_example"; // id of the model to be monitored
    try {
      client
              .webhook
              .updateModelById(idWebhook)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateModelById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .webhook
              .updateModelById(idWebhook)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#updateModelById");
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
| **idWebhook** | **String**| idWebhook | |
| **webhooksIdModel** | [**WebhooksIdModel**](WebhooksIdModel.md)| Attributes of \&quot;Webhooks Id Model\&quot; to be updated. | |

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

