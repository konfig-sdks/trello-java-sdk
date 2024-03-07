# LabelApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLabels**](LabelApi.md#createLabels) | **POST** /labels | addLabels() |
| [**getBoardByIdLabel**](LabelApi.md#getBoardByIdLabel) | **GET** /labels/{idLabel}/board | getLabelsBoardByIdLabel() |
| [**getBoardByIdLabelByField**](LabelApi.md#getBoardByIdLabelByField) | **GET** /labels/{idLabel}/board/{field} | getLabelsBoardByIdLabelByField() |
| [**getByIdLabel**](LabelApi.md#getByIdLabel) | **GET** /labels/{idLabel} | getLabelsByIdLabel() |
| [**removeByIdLabel**](LabelApi.md#removeByIdLabel) | **DELETE** /labels/{idLabel} | deleteLabelsByIdLabel() |
| [**updateByIdLabel**](LabelApi.md#updateByIdLabel) | **PUT** /labels/{idLabel} | updateLabelsByIdLabel() |
| [**updateColorByIdLabel**](LabelApi.md#updateColorByIdLabel) | **PUT** /labels/{idLabel}/color | updateLabelsColorByIdLabel() |
| [**updateNameByIdLabel**](LabelApi.md#updateNameByIdLabel) | **PUT** /labels/{idLabel}/name | updateLabelsNameByIdLabel() |


<a name="createLabels"></a>
# **createLabels**
> createLabels(labels).execute();

addLabels()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String color = "color_example"; // A valid label color or null
    String idBoard = "idBoard_example"; // An id
    String name = "name_example"; // a string with a length from 0 to 16384
    try {
      client
              .label
              .createLabels()
              .color(color)
              .idBoard(idBoard)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#createLabels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .createLabels()
              .color(color)
              .idBoard(idBoard)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#createLabels");
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
| **labels** | [**Labels**](Labels.md)| Attributes of \&quot;Labels\&quot; to be added. | |

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

<a name="getBoardByIdLabel"></a>
# **getBoardByIdLabel**
> getBoardByIdLabel(idLabel).fields(fields).execute();

getLabelsBoardByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    String fields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    try {
      client
              .label
              .getBoardByIdLabel(idLabel)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getBoardByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .getBoardByIdLabel(idLabel)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getBoardByIdLabel");
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
| **idLabel** | **String**| idLabel | |
| **fields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to all] |

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

<a name="getBoardByIdLabelByField"></a>
# **getBoardByIdLabelByField**
> getBoardByIdLabelByField(idLabel, field).execute();

getLabelsBoardByIdLabelByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    String field = "field_example"; // field
    try {
      client
              .label
              .getBoardByIdLabelByField(idLabel, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getBoardByIdLabelByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .getBoardByIdLabelByField(idLabel, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getBoardByIdLabelByField");
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
| **idLabel** | **String**| idLabel | |
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

<a name="getByIdLabel"></a>
# **getByIdLabel**
> getByIdLabel(idLabel).fields(fields).execute();

getLabelsByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    String fields = "all"; // all or a comma-separated list of: color, idBoard, name or uses
    try {
      client
              .label
              .getByIdLabel(idLabel)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .getByIdLabel(idLabel)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#getByIdLabel");
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
| **idLabel** | **String**| idLabel | |
| **fields** | **String**| all or a comma-separated list of: color, idBoard, name or uses | [optional] [default to all] |

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

<a name="removeByIdLabel"></a>
# **removeByIdLabel**
> removeByIdLabel(idLabel).execute();

deleteLabelsByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    try {
      client
              .label
              .removeByIdLabel(idLabel)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#removeByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .removeByIdLabel(idLabel)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#removeByIdLabel");
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
| **idLabel** | **String**| idLabel | |

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

<a name="updateByIdLabel"></a>
# **updateByIdLabel**
> updateByIdLabel(idLabel, labels).execute();

updateLabelsByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    String color = "color_example"; // A valid label color or null
    String idBoard = "idBoard_example"; // An id
    String name = "name_example"; // a string with a length from 0 to 16384
    try {
      client
              .label
              .updateByIdLabel(idLabel)
              .color(color)
              .idBoard(idBoard)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .updateByIdLabel(idLabel)
              .color(color)
              .idBoard(idBoard)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateByIdLabel");
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
| **idLabel** | **String**| idLabel | |
| **labels** | [**Labels**](Labels.md)| Attributes of \&quot;Labels\&quot; to be updated. | |

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

<a name="updateColorByIdLabel"></a>
# **updateColorByIdLabel**
> updateColorByIdLabel(idLabel, labelsColor).execute();

updateLabelsColorByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    String value = "value_example"; // A valid label color or null
    try {
      client
              .label
              .updateColorByIdLabel(idLabel)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateColorByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .updateColorByIdLabel(idLabel)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateColorByIdLabel");
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
| **idLabel** | **String**| idLabel | |
| **labelsColor** | [**LabelsColor**](LabelsColor.md)| Attributes of \&quot;Labels Color\&quot; to be updated. | |

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

<a name="updateNameByIdLabel"></a>
# **updateNameByIdLabel**
> updateNameByIdLabel(idLabel, labelsName).execute();

updateLabelsNameByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LabelApi;
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
    String idLabel = "idLabel_example"; // idLabel
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .label
              .updateNameByIdLabel(idLabel)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateNameByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .label
              .updateNameByIdLabel(idLabel)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LabelApi#updateNameByIdLabel");
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
| **idLabel** | **String**| idLabel | |
| **labelsName** | [**LabelsName**](LabelsName.md)| Attributes of \&quot;Labels Name\&quot; to be updated. | |

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

