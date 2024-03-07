# SearchApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findMembers**](SearchApi.md#findMembers) | **GET** /search/members | getSearchMembers() |
| [**getResults**](SearchApi.md#getResults) | **GET** /search | getSearch() |


<a name="findMembers"></a>
# **findMembers**
> findMembers(query).limit(limit).idBoard(idBoard).idOrganization(idOrganization).onlyOrgMembers(onlyOrgMembers).execute();

getSearchMembers()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String query = "query_example"; // a string with a length from 1 to 16384
    String limit = "8"; // a number from 1 to 20
    String idBoard = "idBoard_example"; // An id, or null
    String idOrganization = "idOrganization_example"; // An id, or null
    String onlyOrgMembers = "onlyOrgMembers_example"; // A boolean
    try {
      client
              .search
              .findMembers(query)
              .limit(limit)
              .idBoard(idBoard)
              .idOrganization(idOrganization)
              .onlyOrgMembers(onlyOrgMembers)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#findMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .search
              .findMembers(query)
              .limit(limit)
              .idBoard(idBoard)
              .idOrganization(idOrganization)
              .onlyOrgMembers(onlyOrgMembers)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#findMembers");
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
| **query** | **String**| a string with a length from 1 to 16384 | |
| **limit** | **String**| a number from 1 to 20 | [optional] [default to 8] |
| **idBoard** | **String**| An id, or null | [optional] |
| **idOrganization** | **String**| An id, or null | [optional] |
| **onlyOrgMembers** | **String**| A boolean | [optional] |

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

<a name="getResults"></a>
# **getResults**
> getResults(query, idOrganizations).idBoards(idBoards).idCards(idCards).modelTypes(modelTypes).boardFields(boardFields).boardsLimit(boardsLimit).cardFields(cardFields).cardsLimit(cardsLimit).cardsPage(cardsPage).cardBoard(cardBoard).cardList(cardList).cardMembers(cardMembers).cardStickers(cardStickers).cardAttachments(cardAttachments).organizationFields(organizationFields).organizationsLimit(organizationsLimit).memberFields(memberFields).membersLimit(membersLimit).partial(partial).execute();

getSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SearchApi;
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
    String query = "query_example"; // a string with a length from 1 to 16384
    String idOrganizations = "idOrganizations_example"; // A comma-separated list of objectIds, 24-character hex strings
    String idBoards = "mine"; // A comma-separated list of objectIds, 24-character hex strings
    String idCards = "idCards_example"; // A comma-separated list of objectIds, 24-character hex strings
    String modelTypes = "all"; // all or a comma-separated list of: actions, boards, cards, members or organizations
    String boardFields = "name and idOrganization"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String boardsLimit = "10"; // a number from 1 to 1000
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String cardsLimit = "10"; // a number from 1 to 1000
    String cardsPage = "0"; // a number from 0 to 100
    String cardBoard = "cardBoard_example"; //  true or false
    String cardList = "cardList_example"; //  true or false
    String cardMembers = "cardMembers_example"; //  true or false
    String cardStickers = "cardStickers_example"; //  true or false
    String cardAttachments = "cardAttachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String organizationFields = "name and displayName"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String organizationsLimit = "10"; // a number from 1 to 1000
    String memberFields = "avatarHash, fullName, initials, username and confirmed"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String membersLimit = "10"; // a number from 1 to 1000
    String partial = "partial_example"; //  true or false
    try {
      client
              .search
              .getResults(query, idOrganizations)
              .idBoards(idBoards)
              .idCards(idCards)
              .modelTypes(modelTypes)
              .boardFields(boardFields)
              .boardsLimit(boardsLimit)
              .cardFields(cardFields)
              .cardsLimit(cardsLimit)
              .cardsPage(cardsPage)
              .cardBoard(cardBoard)
              .cardList(cardList)
              .cardMembers(cardMembers)
              .cardStickers(cardStickers)
              .cardAttachments(cardAttachments)
              .organizationFields(organizationFields)
              .organizationsLimit(organizationsLimit)
              .memberFields(memberFields)
              .membersLimit(membersLimit)
              .partial(partial)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .search
              .getResults(query, idOrganizations)
              .idBoards(idBoards)
              .idCards(idCards)
              .modelTypes(modelTypes)
              .boardFields(boardFields)
              .boardsLimit(boardsLimit)
              .cardFields(cardFields)
              .cardsLimit(cardsLimit)
              .cardsPage(cardsPage)
              .cardBoard(cardBoard)
              .cardList(cardList)
              .cardMembers(cardMembers)
              .cardStickers(cardStickers)
              .cardAttachments(cardAttachments)
              .organizationFields(organizationFields)
              .organizationsLimit(organizationsLimit)
              .memberFields(memberFields)
              .membersLimit(membersLimit)
              .partial(partial)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getResults");
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
| **query** | **String**| a string with a length from 1 to 16384 | |
| **idOrganizations** | **String**| A comma-separated list of objectIds, 24-character hex strings | |
| **idBoards** | **String**| A comma-separated list of objectIds, 24-character hex strings | [optional] [default to mine] |
| **idCards** | **String**| A comma-separated list of objectIds, 24-character hex strings | [optional] |
| **modelTypes** | **String**| all or a comma-separated list of: actions, boards, cards, members or organizations | [optional] [default to all] |
| **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name and idOrganization] |
| **boardsLimit** | **String**| a number from 1 to 1000 | [optional] [default to 10] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **cardsLimit** | **String**| a number from 1 to 1000 | [optional] [default to 10] |
| **cardsPage** | **String**| a number from 0 to 100 | [optional] [default to 0] |
| **cardBoard** | **String**|  true or false | [optional] |
| **cardList** | **String**|  true or false | [optional] |
| **cardMembers** | **String**|  true or false | [optional] |
| **cardStickers** | **String**|  true or false | [optional] |
| **cardAttachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **organizationFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to name and displayName] |
| **organizationsLimit** | **String**| a number from 1 to 1000 | [optional] [default to 10] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials, username and confirmed] |
| **membersLimit** | **String**| a number from 1 to 1000 | [optional] [default to 10] |
| **partial** | **String**|  true or false | [optional] |

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

