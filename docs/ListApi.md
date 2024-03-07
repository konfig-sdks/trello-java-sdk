# ListApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveAllCardsByIdList**](ListApi.md#archiveAllCardsByIdList) | **POST** /lists/{idList}/archiveAllCards | addListsArchiveAllCardsByIdList() |
| [**createCardsByIdList**](ListApi.md#createCardsByIdList) | **POST** /lists/{idList}/cards | addListsCardsByIdList() |
| [**createList**](ListApi.md#createList) | **POST** /lists | addLists() |
| [**getActionsByIdList**](ListApi.md#getActionsByIdList) | **GET** /lists/{idList}/actions | getListsActionsByIdList() |
| [**getBoardByIdListByField**](ListApi.md#getBoardByIdListByField) | **GET** /lists/{idList}/board/{field} | getListsBoardByIdListByField() |
| [**getByIdList**](ListApi.md#getByIdList) | **GET** /lists/{idList} | getListsByIdList() |
| [**getByIdListByField**](ListApi.md#getByIdListByField) | **GET** /lists/{idList}/{field} | getListsByIdListByField() |
| [**getCardsByFilter**](ListApi.md#getCardsByFilter) | **GET** /lists/{idList}/cards/{filter} | getListsCardsByIdListByFilter() |
| [**getCardsByIdList**](ListApi.md#getCardsByIdList) | **GET** /lists/{idList}/cards | getListsCardsByIdList() |
| [**idBoardGet**](ListApi.md#idBoardGet) | **GET** /lists/{idList}/board | getListsBoardByIdList() |
| [**moveAllCardsByIdList**](ListApi.md#moveAllCardsByIdList) | **POST** /lists/{idList}/moveAllCards | addListsMoveAllCardsByIdList() |
| [**updateByIdList**](ListApi.md#updateByIdList) | **PUT** /lists/{idList} | updateListsByIdList() |
| [**updateClosedByIdList**](ListApi.md#updateClosedByIdList) | **PUT** /lists/{idList}/closed | updateListsClosedByIdList() |
| [**updateIdBoardByIdList**](ListApi.md#updateIdBoardByIdList) | **PUT** /lists/{idList}/idBoard | updateListsIdBoardByIdList() |
| [**updateNameByIdList**](ListApi.md#updateNameByIdList) | **PUT** /lists/{idList}/name | updateListsNameByIdList() |
| [**updatePosByIdList**](ListApi.md#updatePosByIdList) | **PUT** /lists/{idList}/pos | updateListsPosByIdList() |
| [**updateSubscribedByIdList**](ListApi.md#updateSubscribedByIdList) | **PUT** /lists/{idList}/subscribed | updateListsSubscribedByIdList() |


<a name="archiveAllCardsByIdList"></a>
# **archiveAllCardsByIdList**
> archiveAllCardsByIdList(idList).execute();

addListsArchiveAllCardsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    try {
      client
              .list
              .archiveAllCardsByIdList(idList)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#archiveAllCardsByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .archiveAllCardsByIdList(idList)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#archiveAllCardsByIdList");
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
| **idList** | **String**| idList | |

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

<a name="createCardsByIdList"></a>
# **createCardsByIdList**
> createCardsByIdList(idList, listsCards).execute();

addListsCardsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String desc = "desc_example"; // a string with a length from 0 to 16384
    String due = "due_example"; // A date, or null
    String idMembers = "idMembers_example"; // A comma-separated list of objectIds, 24-character hex strings
    String labels = "labels_example"; // all or a comma-separated list of: blue, green, orange, purple, red or yellow
    String name = "name_example"; // a string with a length from 1 to 16384
    try {
      client
              .list
              .createCardsByIdList(idList)
              .desc(desc)
              .due(due)
              .idMembers(idMembers)
              .labels(labels)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#createCardsByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .createCardsByIdList(idList)
              .desc(desc)
              .due(due)
              .idMembers(idMembers)
              .labels(labels)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#createCardsByIdList");
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
| **idList** | **String**| idList | |
| **listsCards** | [**ListsCards**](ListsCards.md)| Attributes of \&quot;Lists Cards\&quot; to be added. | |

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

<a name="createList"></a>
# **createList**
> createList(lists).execute();

addLists()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String closed = "closed_example"; //  true or false
    String idBoard = "idBoard_example"; // id of the board that the list should be added to
    String idListSource = "idListSource_example"; // The id of the list to copy into a new list.
    String name = "name_example"; // a string with a length from 1 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String subscribed = "subscribed_example"; //  true or false
    try {
      client
              .list
              .createList()
              .closed(closed)
              .idBoard(idBoard)
              .idListSource(idListSource)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#createList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .createList()
              .closed(closed)
              .idBoard(idBoard)
              .idListSource(idListSource)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#createList");
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
| **lists** | [**Lists**](Lists.md)| Attributes of \&quot;Lists\&quot; to be added. | |

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

<a name="getActionsByIdList"></a>
# **getActionsByIdList**
> getActionsByIdList(idList).entities(entities).display(display).filter(filter).fields(fields).limit(limit).format(format).since(since).before(before).page(page).idModels(idModels).member(member).memberFields(memberFields).memberCreator(memberCreator).memberCreatorFields(memberCreatorFields).execute();

getListsActionsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String entities = "entities_example"; //  true or false
    String display = "display_example"; //  true or false
    String filter = "all"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String fields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String limit = "50"; // a number from 0 to 1000
    String format = "list"; // One of: count, list or minimal
    String since = "since_example"; // A date, null or lastView
    String before = "before_example"; // A date, or null
    String page = "0"; // Page * limit must be less than 1000
    String idModels = "idModels_example"; // Only return actions related to these model ids
    String member = "member_example"; //  true or false
    String memberFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String memberCreator = "memberCreator_example"; //  true or false
    String memberCreatorFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .list
              .getActionsByIdList(idList)
              .entities(entities)
              .display(display)
              .filter(filter)
              .fields(fields)
              .limit(limit)
              .format(format)
              .since(since)
              .before(before)
              .page(page)
              .idModels(idModels)
              .member(member)
              .memberFields(memberFields)
              .memberCreator(memberCreator)
              .memberCreatorFields(memberCreatorFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getActionsByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .getActionsByIdList(idList)
              .entities(entities)
              .display(display)
              .filter(filter)
              .fields(fields)
              .limit(limit)
              .format(format)
              .since(since)
              .before(before)
              .page(page)
              .idModels(idModels)
              .member(member)
              .memberFields(memberFields)
              .memberCreator(memberCreator)
              .memberCreatorFields(memberCreatorFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getActionsByIdList");
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
| **idList** | **String**| idList | |
| **entities** | **String**|  true or false | [optional] |
| **display** | **String**|  true or false | [optional] |
| **filter** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **limit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **format** | **String**| One of: count, list or minimal | [optional] [default to list] |
| **since** | **String**| A date, null or lastView | [optional] |
| **before** | **String**| A date, or null | [optional] |
| **page** | **String**| Page * limit must be less than 1000 | [optional] [default to 0] |
| **idModels** | **String**| Only return actions related to these model ids | [optional] |
| **member** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **memberCreator** | **String**|  true or false | [optional] |
| **memberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |

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

<a name="getBoardByIdListByField"></a>
# **getBoardByIdListByField**
> getBoardByIdListByField(idList, field).execute();

getListsBoardByIdListByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String field = "field_example"; // field
    try {
      client
              .list
              .getBoardByIdListByField(idList, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getBoardByIdListByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .getBoardByIdListByField(idList, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getBoardByIdListByField");
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
| **idList** | **String**| idList | |
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

<a name="getByIdList"></a>
# **getByIdList**
> getByIdList(idList).cards(cards).cardFields(cardFields).board(board).boardFields(boardFields).fields(fields).execute();

getListsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String cards = "none"; // One of: all, closed, none or open
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String board = "board_example"; //  true or false
    String boardFields = "name, desc, descData, closed, idOrganization, pinned, url and prefs"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String fields = "name, closed, idBoard and pos"; // all or a comma-separated list of: closed, idBoard, name, pos or subscribed
    try {
      client
              .list
              .getByIdList(idList)
              .cards(cards)
              .cardFields(cardFields)
              .board(board)
              .boardFields(boardFields)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .getByIdList(idList)
              .cards(cards)
              .cardFields(cardFields)
              .board(board)
              .boardFields(boardFields)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getByIdList");
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
| **idList** | **String**| idList | |
| **cards** | **String**| One of: all, closed, none or open | [optional] [default to none] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **board** | **String**|  true or false | [optional] |
| **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, descData, closed, idOrganization, pinned, url and prefs] |
| **fields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to name, closed, idBoard and pos] |

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

<a name="getByIdListByField"></a>
# **getByIdListByField**
> getByIdListByField(idList, field).execute();

getListsByIdListByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String field = "field_example"; // field
    try {
      client
              .list
              .getByIdListByField(idList, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getByIdListByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .getByIdListByField(idList, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getByIdListByField");
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
| **idList** | **String**| idList | |
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
> getCardsByFilter(idList, filter).execute();

getListsCardsByIdListByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String filter = "filter_example"; // filter
    try {
      client
              .list
              .getCardsByFilter(idList, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getCardsByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .getCardsByFilter(idList, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getCardsByFilter");
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
| **idList** | **String**| idList | |
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

<a name="getCardsByIdList"></a>
# **getCardsByIdList**
> getCardsByIdList(idList).actions(actions).attachments(attachments).attachmentFields(attachmentFields).stickers(stickers).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checklists(checklists).limit(limit).since(since).before(before).filter(filter).fields(fields).execute();

getListsCardsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
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
              .list
              .getCardsByIdList(idList)
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
      System.err.println("Exception when calling ListApi#getCardsByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .getCardsByIdList(idList)
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
      System.err.println("Exception when calling ListApi#getCardsByIdList");
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
| **idList** | **String**| idList | |
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

<a name="idBoardGet"></a>
# **idBoardGet**
> idBoardGet(idList).fields(fields).execute();

getListsBoardByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String fields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    try {
      client
              .list
              .idBoardGet(idList)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#idBoardGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .idBoardGet(idList)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#idBoardGet");
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
| **idList** | **String**| idList | |
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

<a name="moveAllCardsByIdList"></a>
# **moveAllCardsByIdList**
> moveAllCardsByIdList(idList, listsMoveAllCards).execute();

addListsMoveAllCardsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String idBoard = "idBoard_example"; // id of the board that the cards should be moved to
    try {
      client
              .list
              .moveAllCardsByIdList(idList)
              .idBoard(idBoard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#moveAllCardsByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .moveAllCardsByIdList(idList)
              .idBoard(idBoard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#moveAllCardsByIdList");
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
| **idList** | **String**| idList | |
| **listsMoveAllCards** | [**ListsMoveAllCards**](ListsMoveAllCards.md)| Attributes of \&quot;Lists Move All Cards\&quot; to be added. | |

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

<a name="updateByIdList"></a>
# **updateByIdList**
> updateByIdList(idList, lists).execute();

updateListsByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String closed = "closed_example"; //  true or false
    String idBoard = "idBoard_example"; // id of the board that the list should be added to
    String idListSource = "idListSource_example"; // The id of the list to copy into a new list.
    String name = "name_example"; // a string with a length from 1 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String subscribed = "subscribed_example"; //  true or false
    try {
      client
              .list
              .updateByIdList(idList)
              .closed(closed)
              .idBoard(idBoard)
              .idListSource(idListSource)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .updateByIdList(idList)
              .closed(closed)
              .idBoard(idBoard)
              .idListSource(idListSource)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateByIdList");
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
| **idList** | **String**| idList | |
| **lists** | [**Lists**](Lists.md)| Attributes of \&quot;Lists\&quot; to be updated. | |

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

<a name="updateClosedByIdList"></a>
# **updateClosedByIdList**
> updateClosedByIdList(idList, listsClosed).execute();

updateListsClosedByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String value = "value_example"; //  true or false
    try {
      client
              .list
              .updateClosedByIdList(idList)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateClosedByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .updateClosedByIdList(idList)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateClosedByIdList");
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
| **idList** | **String**| idList | |
| **listsClosed** | [**ListsClosed**](ListsClosed.md)| Attributes of \&quot;Lists Closed\&quot; to be updated. | |

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

<a name="updateIdBoardByIdList"></a>
# **updateIdBoardByIdList**
> updateIdBoardByIdList(idList, listsIdBoard).execute();

updateListsIdBoardByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String pos = "pos_example"; // position of the list on the new board
    String value = "value_example"; // id of the board the list should be moved to
    try {
      client
              .list
              .updateIdBoardByIdList(idList)
              .pos(pos)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateIdBoardByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .updateIdBoardByIdList(idList)
              .pos(pos)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateIdBoardByIdList");
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
| **idList** | **String**| idList | |
| **listsIdBoard** | [**ListsIdBoard**](ListsIdBoard.md)| Attributes of \&quot;Lists Id Board\&quot; to be updated. | |

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

<a name="updateNameByIdList"></a>
# **updateNameByIdList**
> updateNameByIdList(idList, listsName).execute();

updateListsNameByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String value = "value_example"; // a string with a length from 1 to 16384
    try {
      client
              .list
              .updateNameByIdList(idList)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateNameByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .updateNameByIdList(idList)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateNameByIdList");
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
| **idList** | **String**| idList | |
| **listsName** | [**ListsName**](ListsName.md)| Attributes of \&quot;Lists Name\&quot; to be updated. | |

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

<a name="updatePosByIdList"></a>
# **updatePosByIdList**
> updatePosByIdList(idList, listsPos).execute();

updateListsPosByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String value = "value_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .list
              .updatePosByIdList(idList)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updatePosByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .updatePosByIdList(idList)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updatePosByIdList");
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
| **idList** | **String**| idList | |
| **listsPos** | [**ListsPos**](ListsPos.md)| Attributes of \&quot;Lists Pos\&quot; to be updated. | |

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

<a name="updateSubscribedByIdList"></a>
# **updateSubscribedByIdList**
> updateSubscribedByIdList(idList, listsSubscribed).execute();

updateListsSubscribedByIdList()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListApi;
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
    String idList = "idList_example"; // idList
    String value = "value_example"; //  true or false
    try {
      client
              .list
              .updateSubscribedByIdList(idList)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateSubscribedByIdList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .list
              .updateSubscribedByIdList(idList)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateSubscribedByIdList");
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
| **idList** | **String**| idList | |
| **listsSubscribed** | [**ListsSubscribed**](ListsSubscribed.md)| Attributes of \&quot;Lists Subscribed\&quot; to be updated. | |

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

