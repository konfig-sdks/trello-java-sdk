# ChecklistApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCheckItemsByIdChecklist**](ChecklistApi.md#addCheckItemsByIdChecklist) | **POST** /checklists/{idChecklist}/checkItems | addChecklistsCheckItemsByIdChecklist() |
| [**create**](ChecklistApi.md#create) | **POST** /checklists | addChecklists() |
| [**getBoardByIdChecklist**](ChecklistApi.md#getBoardByIdChecklist) | **GET** /checklists/{idChecklist}/board | getChecklistsBoardByIdChecklist() |
| [**getBoardByIdChecklistByField**](ChecklistApi.md#getBoardByIdChecklistByField) | **GET** /checklists/{idChecklist}/board/{field} | getChecklistsBoardByIdChecklistByField() |
| [**getById**](ChecklistApi.md#getById) | **GET** /checklists/{idChecklist} | getChecklistsByIdChecklist() |
| [**getByIdField**](ChecklistApi.md#getByIdField) | **GET** /checklists/{idChecklist}/{field} | getChecklistsByIdChecklistByField() |
| [**getCardsByFilter**](ChecklistApi.md#getCardsByFilter) | **GET** /checklists/{idChecklist}/cards/{filter} | getChecklistsCardsByIdChecklistByFilter() |
| [**getCheckItemsByIdChecklist**](ChecklistApi.md#getCheckItemsByIdChecklist) | **GET** /checklists/{idChecklist}/checkItems | getChecklistsCheckItemsByIdChecklist() |
| [**getCheckItemsByIdChecklistByIdCheckItem**](ChecklistApi.md#getCheckItemsByIdChecklistByIdCheckItem) | **GET** /checklists/{idChecklist}/checkItems/{idCheckItem} | getChecklistsCheckItemsByIdChecklistByIdCheckItem() |
| [**listCardsByIdChecklist**](ChecklistApi.md#listCardsByIdChecklist) | **GET** /checklists/{idChecklist}/cards | getChecklistsCardsByIdChecklist() |
| [**removeById**](ChecklistApi.md#removeById) | **DELETE** /checklists/{idChecklist} | deleteChecklistsByIdChecklist() |
| [**removeByIdCheckItem**](ChecklistApi.md#removeByIdCheckItem) | **DELETE** /checklists/{idChecklist}/checkItems/{idCheckItem} | deleteChecklistsCheckItemsByIdChecklistByIdCheckItem() |
| [**updateByIdChecklist**](ChecklistApi.md#updateByIdChecklist) | **PUT** /checklists/{idChecklist} | updateChecklistsByIdChecklist() |
| [**updateIdCardByIdChecklist**](ChecklistApi.md#updateIdCardByIdChecklist) | **PUT** /checklists/{idChecklist}/idCard | updateChecklistsIdCardByIdChecklist() |
| [**updateNameByIdChecklist**](ChecklistApi.md#updateNameByIdChecklist) | **PUT** /checklists/{idChecklist}/name | updateChecklistsNameByIdChecklist() |
| [**updatePosByIdChecklist**](ChecklistApi.md#updatePosByIdChecklist) | **PUT** /checklists/{idChecklist}/pos | updateChecklistsPosByIdChecklist() |


<a name="addCheckItemsByIdChecklist"></a>
# **addCheckItemsByIdChecklist**
> addCheckItemsByIdChecklist(idChecklist, checklistsCheckItems).execute();

addChecklistsCheckItemsByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String checked = "checked_example"; //  true or false
    String name = "name_example"; // a string with a length from 1 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .checklist
              .addCheckItemsByIdChecklist(idChecklist)
              .checked(checked)
              .name(name)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#addCheckItemsByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .addCheckItemsByIdChecklist(idChecklist)
              .checked(checked)
              .name(name)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#addCheckItemsByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **checklistsCheckItems** | [**ChecklistsCheckItems**](ChecklistsCheckItems.md)| Attributes of \&quot;Checklists Check Items\&quot; to be added. | |

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

<a name="create"></a>
# **create**
> create(checklists).execute();

addChecklists()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idBoard = "idBoard_example"; // id of the board that the checklist should be added to
    String idCard = "idCard_example"; // id of the card that the checklist should be added to
    String idChecklistSource = "idChecklistSource_example"; // The id of the source checklist to copy into a new checklist.
    String name = "name_example"; // a string with a length from 0 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .checklist
              .create()
              .idBoard(idBoard)
              .idCard(idCard)
              .idChecklistSource(idChecklistSource)
              .name(name)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .create()
              .idBoard(idBoard)
              .idCard(idCard)
              .idChecklistSource(idChecklistSource)
              .name(name)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#create");
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
| **checklists** | [**Checklists**](Checklists.md)| Attributes of \&quot;Checklists\&quot; to be added. | |

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

<a name="getBoardByIdChecklist"></a>
# **getBoardByIdChecklist**
> getBoardByIdChecklist(idChecklist).fields(fields).execute();

getChecklistsBoardByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String fields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    try {
      client
              .checklist
              .getBoardByIdChecklist(idChecklist)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getBoardByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getBoardByIdChecklist(idChecklist)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getBoardByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
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

<a name="getBoardByIdChecklistByField"></a>
# **getBoardByIdChecklistByField**
> getBoardByIdChecklistByField(idChecklist, field).execute();

getChecklistsBoardByIdChecklistByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String field = "field_example"; // field
    try {
      client
              .checklist
              .getBoardByIdChecklistByField(idChecklist, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getBoardByIdChecklistByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getBoardByIdChecklistByField(idChecklist, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getBoardByIdChecklistByField");
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
| **idChecklist** | **String**| idChecklist | |
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

<a name="getById"></a>
# **getById**
> getById(idChecklist).cards(cards).cardFields(cardFields).checkItems(checkItems).checkItemFields(checkItemFields).fields(fields).execute();

getChecklistsByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String cards = "none"; // One of: all, closed, none, open or visible
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String checkItems = "all"; // One of: all or none
    String checkItemFields = "name, nameData, pos and state"; // all or a comma-separated list of: name, nameData, pos, state or type
    String fields = "all"; // all or a comma-separated list of: idBoard, idCard, name or pos
    try {
      client
              .checklist
              .getById(idChecklist)
              .cards(cards)
              .cardFields(cardFields)
              .checkItems(checkItems)
              .checkItemFields(checkItemFields)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getById(idChecklist)
              .cards(cards)
              .cardFields(cardFields)
              .checkItems(checkItems)
              .checkItemFields(checkItemFields)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getById");
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
| **idChecklist** | **String**| idChecklist | |
| **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **checkItems** | **String**| One of: all or none | [optional] [default to all] |
| **checkItemFields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state] |
| **fields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all] |

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
> getByIdField(idChecklist, field).execute();

getChecklistsByIdChecklistByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String field = "field_example"; // field
    try {
      client
              .checklist
              .getByIdField(idChecklist, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getByIdField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getByIdField(idChecklist, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getByIdField");
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
| **idChecklist** | **String**| idChecklist | |
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

<a name="getCardsByFilter"></a>
# **getCardsByFilter**
> getCardsByFilter(idChecklist, filter).execute();

getChecklistsCardsByIdChecklistByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String filter = "filter_example"; // filter
    try {
      client
              .checklist
              .getCardsByFilter(idChecklist, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getCardsByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getCardsByFilter(idChecklist, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getCardsByFilter");
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
| **idChecklist** | **String**| idChecklist | |
| **filter** | **String**| filter | |

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

<a name="getCheckItemsByIdChecklist"></a>
# **getCheckItemsByIdChecklist**
> getCheckItemsByIdChecklist(idChecklist).filter(filter).fields(fields).execute();

getChecklistsCheckItemsByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String filter = "all"; // One of: all or none
    String fields = "name, nameData, pos and state"; // all or a comma-separated list of: name, nameData, pos, state or type
    try {
      client
              .checklist
              .getCheckItemsByIdChecklist(idChecklist)
              .filter(filter)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getCheckItemsByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getCheckItemsByIdChecklist(idChecklist)
              .filter(filter)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getCheckItemsByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **filter** | **String**| One of: all or none | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state] |

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

<a name="getCheckItemsByIdChecklistByIdCheckItem"></a>
# **getCheckItemsByIdChecklistByIdCheckItem**
> getCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem).fields(fields).execute();

getChecklistsCheckItemsByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    String fields = "name, nameData, pos and state"; // all or a comma-separated list of: name, nameData, pos, state or type
    try {
      client
              .checklist
              .getCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getCheckItemsByIdChecklistByIdCheckItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .getCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#getCheckItemsByIdChecklistByIdCheckItem");
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
| **idChecklist** | **String**| idChecklist | |
| **idCheckItem** | **String**| idCheckItem | |
| **fields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state] |

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

<a name="listCardsByIdChecklist"></a>
# **listCardsByIdChecklist**
> listCardsByIdChecklist(idChecklist).actions(actions).attachments(attachments).attachmentFields(attachmentFields).stickers(stickers).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checklists(checklists).limit(limit).since(since).before(before).filter(filter).fields(fields).execute();

getChecklistsCardsByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String attachments = "attachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String attachmentFields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String stickers = "stickers_example"; //  true or false
    String members = "members_example"; //  true or false
    String memberFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String checkItemStates = "checkItemStates_example"; //  true or false
    String checklists = "none"; // One of: all or none
    String limit = "limit_example"; // a number from 1 to 1000
    String since = "since_example"; // A date, or null
    String before = "before_example"; // A date, or null
    String filter = "open"; // One of: all, closed, none or open
    String fields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    try {
      client
              .checklist
              .listCardsByIdChecklist(idChecklist)
              .actions(actions)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .stickers(stickers)
              .members(members)
              .memberFields(memberFields)
              .checkItemStates(checkItemStates)
              .checklists(checklists)
              .limit(limit)
              .since(since)
              .before(before)
              .filter(filter)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#listCardsByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .listCardsByIdChecklist(idChecklist)
              .actions(actions)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .stickers(stickers)
              .members(members)
              .memberFields(memberFields)
              .checkItemStates(checkItemStates)
              .checklists(checklists)
              .limit(limit)
              .since(since)
              .before(before)
              .filter(filter)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#listCardsByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |
| **stickers** | **String**|  true or false | [optional] |
| **members** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **checkItemStates** | **String**|  true or false | [optional] |
| **checklists** | **String**| One of: all or none | [optional] [default to none] |
| **limit** | **String**| a number from 1 to 1000 | [optional] |
| **since** | **String**| A date, or null | [optional] |
| **before** | **String**| A date, or null | [optional] |
| **filter** | **String**| One of: all, closed, none or open | [optional] [default to open] |
| **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |

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
> removeById(idChecklist).execute();

deleteChecklistsByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    try {
      client
              .checklist
              .removeById(idChecklist)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .removeById(idChecklist)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#removeById");
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
| **idChecklist** | **String**| idChecklist | |

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

<a name="removeByIdCheckItem"></a>
# **removeByIdCheckItem**
> removeByIdCheckItem(idChecklist, idCheckItem).execute();

deleteChecklistsCheckItemsByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    try {
      client
              .checklist
              .removeByIdCheckItem(idChecklist, idCheckItem)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#removeByIdCheckItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .removeByIdCheckItem(idChecklist, idCheckItem)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#removeByIdCheckItem");
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
| **idChecklist** | **String**| idChecklist | |
| **idCheckItem** | **String**| idCheckItem | |

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

<a name="updateByIdChecklist"></a>
# **updateByIdChecklist**
> updateByIdChecklist(idChecklist, checklists).execute();

updateChecklistsByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String idBoard = "idBoard_example"; // id of the board that the checklist should be added to
    String idCard = "idCard_example"; // id of the card that the checklist should be added to
    String idChecklistSource = "idChecklistSource_example"; // The id of the source checklist to copy into a new checklist.
    String name = "name_example"; // a string with a length from 0 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .checklist
              .updateByIdChecklist(idChecklist)
              .idBoard(idBoard)
              .idCard(idCard)
              .idChecklistSource(idChecklistSource)
              .name(name)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updateByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .updateByIdChecklist(idChecklist)
              .idBoard(idBoard)
              .idCard(idCard)
              .idChecklistSource(idChecklistSource)
              .name(name)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updateByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **checklists** | [**Checklists**](Checklists.md)| Attributes of \&quot;Checklists\&quot; to be updated. | |

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

<a name="updateIdCardByIdChecklist"></a>
# **updateIdCardByIdChecklist**
> updateIdCardByIdChecklist(idChecklist, checklistsIdCard).execute();

updateChecklistsIdCardByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String value = "value_example"; // The id of the card that the checklist is on
    try {
      client
              .checklist
              .updateIdCardByIdChecklist(idChecklist)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updateIdCardByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .updateIdCardByIdChecklist(idChecklist)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updateIdCardByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **checklistsIdCard** | [**ChecklistsIdCard**](ChecklistsIdCard.md)| Attributes of \&quot;Checklists Id Card\&quot; to be updated. | |

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

<a name="updateNameByIdChecklist"></a>
# **updateNameByIdChecklist**
> updateNameByIdChecklist(idChecklist, checklistsName).execute();

updateChecklistsNameByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String value = "value_example"; // a string with a length from 1 to 16384
    try {
      client
              .checklist
              .updateNameByIdChecklist(idChecklist)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updateNameByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .updateNameByIdChecklist(idChecklist)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updateNameByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **checklistsName** | [**ChecklistsName**](ChecklistsName.md)| Attributes of \&quot;Checklists Name\&quot; to be updated. | |

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

<a name="updatePosByIdChecklist"></a>
# **updatePosByIdChecklist**
> updatePosByIdChecklist(idChecklist, checklistsPos).execute();

updateChecklistsPosByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecklistApi;
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
    String idChecklist = "idChecklist_example"; // idChecklist
    String value = "value_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .checklist
              .updatePosByIdChecklist(idChecklist)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updatePosByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .checklist
              .updatePosByIdChecklist(idChecklist)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecklistApi#updatePosByIdChecklist");
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
| **idChecklist** | **String**| idChecklist | |
| **checklistsPos** | [**ChecklistsPos**](ChecklistsPos.md)| Attributes of \&quot;Checklists Pos\&quot; to be updated. | |

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

