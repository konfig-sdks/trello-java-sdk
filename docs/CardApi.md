# CardApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addActionsCommentsByIdCard**](CardApi.md#addActionsCommentsByIdCard) | **POST** /cards/{idCard}/actions/comments | addCardsActionsCommentsByIdCard() |
| [**addAttachmentsByIdCard**](CardApi.md#addAttachmentsByIdCard) | **POST** /cards/{idCard}/attachments | addCardsAttachmentsByIdCard() |
| [**addChecklistCheckItem**](CardApi.md#addChecklistCheckItem) | **POST** /cards/{idCard}/checklist/{idChecklist}/checkItem | addCardsChecklistCheckItemByIdCardByIdChecklist() |
| [**addChecklists**](CardApi.md#addChecklists) | **POST** /cards/{idCard}/checklists | addCardsChecklistsByIdCard() |
| [**addIdLabelsToCard**](CardApi.md#addIdLabelsToCard) | **POST** /cards/{idCard}/idLabels | addCardsIdLabelsByIdCard() |
| [**addLabels**](CardApi.md#addLabels) | **POST** /cards/{idCard}/labels | addCardsLabelsByIdCard() |
| [**addMembers**](CardApi.md#addMembers) | **POST** /cards/{idCard}/idMembers | addCardsIdMembersByIdCard() |
| [**addMembersVoted**](CardApi.md#addMembersVoted) | **POST** /cards/{idCard}/membersVoted | addCardsMembersVotedByIdCard() |
| [**addStickersByIdCard**](CardApi.md#addStickersByIdCard) | **POST** /cards/{idCard}/stickers | addCardsStickersByIdCard() |
| [**convertCheckItemToCard**](CardApi.md#convertCheckItemToCard) | **POST** /cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/convertToCard | addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem() |
| [**createAndUpdate**](CardApi.md#createAndUpdate) | **POST** /cards | addCards() |
| [**deleteAttachmentsByIdCardByIdAttachment**](CardApi.md#deleteAttachmentsByIdCardByIdAttachment) | **DELETE** /cards/{idCard}/attachments/{idAttachment} | deleteCardsAttachmentsByIdCardByIdAttachment() |
| [**deleteChecklistByIdCardByIdChecklist**](CardApi.md#deleteChecklistByIdCardByIdChecklist) | **DELETE** /cards/{idCard}/checklists/{idChecklist} | deleteCardsChecklistsByIdCardByIdChecklist() |
| [**getAttachmentsByIdCard**](CardApi.md#getAttachmentsByIdCard) | **GET** /cards/{idCard}/attachments | getCardsAttachmentsByIdCard() |
| [**getAttachmentsByIds**](CardApi.md#getAttachmentsByIds) | **GET** /cards/{idCard}/attachments/{idAttachment} | getCardsAttachmentsByIdCardByIdAttachment() |
| [**getBoardById**](CardApi.md#getBoardById) | **GET** /cards/{idCard}/board | getCardsBoardByIdCard() |
| [**getBoardByIdCardByField**](CardApi.md#getBoardByIdCardByField) | **GET** /cards/{idCard}/board/{field} | getCardsBoardByIdCardByField() |
| [**getById**](CardApi.md#getById) | **GET** /cards/{idCard} | getCardsByIdCard() |
| [**getByIdField**](CardApi.md#getByIdField) | **GET** /cards/{idCard}/{field} | getCardsByIdCardByField() |
| [**getCardsListByIdCardByField**](CardApi.md#getCardsListByIdCardByField) | **GET** /cards/{idCard}/list/{field} | getCardsListByIdCardByField() |
| [**getCheckItemStatesById**](CardApi.md#getCheckItemStatesById) | **GET** /cards/{idCard}/checkItemStates | getCardsCheckItemStatesByIdCard() |
| [**getChecklistsById**](CardApi.md#getChecklistsById) | **GET** /cards/{idCard}/checklists | getCardsChecklistsByIdCard() |
| [**getListById**](CardApi.md#getListById) | **GET** /cards/{idCard}/list | getCardsListByIdCard() |
| [**getMembersVotedByIdCard**](CardApi.md#getMembersVotedByIdCard) | **GET** /cards/{idCard}/membersVoted | getCardsMembersVotedByIdCard() |
| [**getStickerByIds**](CardApi.md#getStickerByIds) | **GET** /cards/{idCard}/stickers/{idSticker} | getCardsStickersByIdCardByIdSticker() |
| [**getStickersByIdCard**](CardApi.md#getStickersByIdCard) | **GET** /cards/{idCard}/stickers | getCardsStickersByIdCard() |
| [**listCardActionsById**](CardApi.md#listCardActionsById) | **GET** /cards/{idCard}/actions | getCardsActionsByIdCard() |
| [**listMembersByIdCard**](CardApi.md#listMembersByIdCard) | **GET** /cards/{idCard}/members | getCardsMembersByIdCard() |
| [**markAssociatedNotificationsRead**](CardApi.md#markAssociatedNotificationsRead) | **POST** /cards/{idCard}/markAssociatedNotificationsRead | addCardsMarkAssociatedNotificationsReadByIdCard() |
| [**removeActionCommentByIdCardByIdAction**](CardApi.md#removeActionCommentByIdCardByIdAction) | **DELETE** /cards/{idCard}/actions/{idAction}/comments | deleteCardsActionsCommentsByIdCardByIdAction() |
| [**removeByIdCard**](CardApi.md#removeByIdCard) | **DELETE** /cards/{idCard} | deleteCardsByIdCard() |
| [**removeChecklistCheckItem**](CardApi.md#removeChecklistCheckItem) | **DELETE** /cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem} | deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem() |
| [**removeLabelByIdCardByIdLabel**](CardApi.md#removeLabelByIdCardByIdLabel) | **DELETE** /cards/{idCard}/idLabels/{idLabel} | deleteCardsIdLabelsByIdCardByIdLabel() |
| [**removeLabelsByIdCardByColor**](CardApi.md#removeLabelsByIdCardByColor) | **DELETE** /cards/{idCard}/labels/{color} | deleteCardsLabelsByIdCardByColor() |
| [**removeMemberByIdMember**](CardApi.md#removeMemberByIdMember) | **DELETE** /cards/{idCard}/idMembers/{idMember} | deleteCardsIdMembersByIdCardByIdMember() |
| [**removeMembersVotedByIdCardByIdMember**](CardApi.md#removeMembersVotedByIdCardByIdMember) | **DELETE** /cards/{idCard}/membersVoted/{idMember} | deleteCardsMembersVotedByIdCardByIdMember() |
| [**removeStickerByIds**](CardApi.md#removeStickerByIds) | **DELETE** /cards/{idCard}/stickers/{idSticker} | deleteCardsStickersByIdCardByIdSticker() |
| [**updateActionCommentByIdCardByIdAction**](CardApi.md#updateActionCommentByIdCardByIdAction) | **PUT** /cards/{idCard}/actions/{idAction}/comments | updateCardsActionsCommentsByIdCardByIdAction() |
| [**updateAttachmentCoverByIdCard**](CardApi.md#updateAttachmentCoverByIdCard) | **PUT** /cards/{idCard}/idAttachmentCover | updateCardsIdAttachmentCoverByIdCard() |
| [**updateBoardByIdCard**](CardApi.md#updateBoardByIdCard) | **PUT** /cards/{idCard}/idBoard | updateCardsIdBoardByIdCard() |
| [**updateByIdCard**](CardApi.md#updateByIdCard) | **PUT** /cards/{idCard} | updateCardsByIdCard() |
| [**updateCheckItemPosById**](CardApi.md#updateCheckItemPosById) | **PUT** /cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/pos | updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem() |
| [**updateChecklistCheckItem**](CardApi.md#updateChecklistCheckItem) | **PUT** /cards/{idCard}/checklist/{idChecklistCurrent}/checkItem/{idCheckItem} | updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem() |
| [**updateChecklistCheckItemNameById**](CardApi.md#updateChecklistCheckItemNameById) | **PUT** /cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/name | updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem() |
| [**updateChecklistCheckItemState**](CardApi.md#updateChecklistCheckItemState) | **PUT** /cards/{idCard}/checklist/{idChecklist}/checkItem/{idCheckItem}/state | updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem() |
| [**updateClosedById**](CardApi.md#updateClosedById) | **PUT** /cards/{idCard}/closed | updateCardsClosedByIdCard() |
| [**updateDescriptionByIdCard**](CardApi.md#updateDescriptionByIdCard) | **PUT** /cards/{idCard}/desc | updateCardsDescByIdCard() |
| [**updateDueById**](CardApi.md#updateDueById) | **PUT** /cards/{idCard}/due | updateCardsDueByIdCard() |
| [**updateIdListByIdCard**](CardApi.md#updateIdListByIdCard) | **PUT** /cards/{idCard}/idList | updateCardsIdListByIdCard() |
| [**updateIdMembers**](CardApi.md#updateIdMembers) | **PUT** /cards/{idCard}/idMembers | updateCardsIdMembersByIdCard() |
| [**updateLabels**](CardApi.md#updateLabels) | **PUT** /cards/{idCard}/labels | updateCardsLabelsByIdCard() |
| [**updateNameById**](CardApi.md#updateNameById) | **PUT** /cards/{idCard}/name | updateCardsNameByIdCard() |
| [**updatePosByIdCard**](CardApi.md#updatePosByIdCard) | **PUT** /cards/{idCard}/pos | updateCardsPosByIdCard() |
| [**updateStickersByIdCardByIdSticker**](CardApi.md#updateStickersByIdCardByIdSticker) | **PUT** /cards/{idCard}/stickers/{idSticker} | updateCardsStickersByIdCardByIdSticker() |
| [**updateSubscribedByIdCard**](CardApi.md#updateSubscribedByIdCard) | **PUT** /cards/{idCard}/subscribed | updateCardsSubscribedByIdCard() |


<a name="addActionsCommentsByIdCard"></a>
# **addActionsCommentsByIdCard**
> addActionsCommentsByIdCard(idCard, actionsComments).execute();

addCardsActionsCommentsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String text = "text_example"; // a string with a length from 1 to 16384
    try {
      client
              .card
              .addActionsCommentsByIdCard(idCard)
              .text(text)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addActionsCommentsByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addActionsCommentsByIdCard(idCard)
              .text(text)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addActionsCommentsByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **actionsComments** | [**ActionsComments**](ActionsComments.md)| Attributes of \&quot;Actions Comments\&quot; to be added. | |

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

<a name="addAttachmentsByIdCard"></a>
# **addAttachmentsByIdCard**
> addAttachmentsByIdCard(idCard, cardsAttachments).execute();

addCardsAttachmentsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String _file = "_file_example"; // A file
    String mimeType = "mimeType_example"; // a string with a length from 0 to 256
    String name = "name_example"; // a string with a length from 0 to 256
    String url = "url_example"; // A URL starting with http:// or https:// or null
    try {
      client
              .card
              .addAttachmentsByIdCard(idCard)
              ._file(_file)
              .mimeType(mimeType)
              .name(name)
              .url(url)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addAttachmentsByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addAttachmentsByIdCard(idCard)
              ._file(_file)
              .mimeType(mimeType)
              .name(name)
              .url(url)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addAttachmentsByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsAttachments** | [**CardsAttachments**](CardsAttachments.md)| Attributes of \&quot;Cards Attachments\&quot; to be added. | |

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

<a name="addChecklistCheckItem"></a>
# **addChecklistCheckItem**
> addChecklistCheckItem(idCard, idChecklist, cardsChecklistCheckItem).execute();

addCardsChecklistCheckItemByIdCardByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    String name = "name_example"; // a string with a length from 1 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .card
              .addChecklistCheckItem(idCard, idChecklist)
              .name(name)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addChecklistCheckItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addChecklistCheckItem(idCard, idChecklist)
              .name(name)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addChecklistCheckItem");
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
| **idCard** | **String**| card id or shortlink | |
| **idChecklist** | **String**| idChecklist | |
| **cardsChecklistCheckItem** | [**CardsChecklistCheckItem**](CardsChecklistCheckItem.md)| Attributes of \&quot;Cards Checklist Check Item\&quot; to be added. | |

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

<a name="addChecklists"></a>
# **addChecklists**
> addChecklists(idCard, cardsChecklists).execute();

addCardsChecklistsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklistSource = "idChecklistSource_example"; // The id of the source checklist to copy into a new checklist.
    String name = "name_example"; // a string with a length from 0 to 16384
    String value = "value_example"; // The id of the checklist to add to the card, or null to create a new one.
    try {
      client
              .card
              .addChecklists(idCard)
              .idChecklistSource(idChecklistSource)
              .name(name)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addChecklists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addChecklists(idCard)
              .idChecklistSource(idChecklistSource)
              .name(name)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addChecklists");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsChecklists** | [**CardsChecklists**](CardsChecklists.md)| Attributes of \&quot;Cards Checklists\&quot; to be added. | |

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

<a name="addIdLabelsToCard"></a>
# **addIdLabelsToCard**
> addIdLabelsToCard(idCard, cardsIdLabels).execute();

addCardsIdLabelsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // The id of the label to add
    try {
      client
              .card
              .addIdLabelsToCard(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addIdLabelsToCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addIdLabelsToCard(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addIdLabelsToCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsIdLabels** | [**CardsIdLabels**](CardsIdLabels.md)| Attributes of \&quot;Cards Id Labels\&quot; to be added. | |

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

<a name="addLabels"></a>
# **addLabels**
> addLabels(idCard, cardsLabels).execute();

addCardsLabelsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String color = "color_example"; // A valid label color or null
    String name = "name_example"; // a string with a length from 0 to 16384
    String value = "value_example"; // all or a comma-separated list of: blue, green, orange, purple, red or yellow
    try {
      client
              .card
              .addLabels(idCard)
              .color(color)
              .name(name)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addLabels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addLabels(idCard)
              .color(color)
              .name(name)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addLabels");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsLabels** | [**CardsLabels**](CardsLabels.md)| Attributes of \&quot;Cards Labels\&quot; to be added. | |

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

<a name="addMembers"></a>
# **addMembers**
> addMembers(idCard, cardsIdMembers).execute();

addCardsIdMembersByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // The id of the member to add to the card
    try {
      client
              .card
              .addMembers(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addMembers(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addMembers");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsIdMembers** | [**CardsIdMembers**](CardsIdMembers.md)| Attributes of \&quot;Cards Id Members\&quot; to be added. | |

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

<a name="addMembersVoted"></a>
# **addMembersVoted**
> addMembersVoted(idCard, cardsMembersVoted).execute();

addCardsMembersVotedByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // The id of the member to vote &#39;yes&#39; on the card
    try {
      client
              .card
              .addMembersVoted(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addMembersVoted");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addMembersVoted(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addMembersVoted");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsMembersVoted** | [**CardsMembersVoted**](CardsMembersVoted.md)| Attributes of \&quot;Cards Members Voted\&quot; to be added. | |

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

<a name="addStickersByIdCard"></a>
# **addStickersByIdCard**
> addStickersByIdCard(idCard, cardsStickers).execute();

addCardsStickersByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String image = "image_example"; // a string with a length from 0 to 16384
    String left = "left_example"; // undefined
    String rotate = "rotate_example"; // undefined
    String top = "top_example"; // undefined
    String zIndex = "zIndex_example"; // Valid Z values for stickers, must be an integer
    try {
      client
              .card
              .addStickersByIdCard(idCard)
              .image(image)
              .left(left)
              .rotate(rotate)
              .top(top)
              .zIndex(zIndex)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addStickersByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .addStickersByIdCard(idCard)
              .image(image)
              .left(left)
              .rotate(rotate)
              .top(top)
              .zIndex(zIndex)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#addStickersByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsStickers** | [**CardsStickers**](CardsStickers.md)| Attributes of \&quot;Cards Stickers\&quot; to be added. | |

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

<a name="convertCheckItemToCard"></a>
# **convertCheckItemToCard**
> convertCheckItemToCard(idCard, idChecklist, idCheckItem).execute();

addCardsChecklistCheckItemConvertToCardByIdCardByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    try {
      client
              .card
              .convertCheckItemToCard(idCard, idChecklist, idCheckItem)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#convertCheckItemToCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .convertCheckItemToCard(idCard, idChecklist, idCheckItem)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#convertCheckItemToCard");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="createAndUpdate"></a>
# **createAndUpdate**
> createAndUpdate(cards).execute();

addCards()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String desc = "desc_example"; // a string with a length from 0 to 16384
    String due = "due_example"; // A date, or null
    String fileSource = "fileSource_example"; // A file
    String idAttachmentCover = "idAttachmentCover_example"; // Id of the image attachment of this card to use as its cover, or null for no cover
    String idBoard = "idBoard_example"; // id of the board the card should be moved to
    String idCardSource = "idCardSource_example"; // The id of the card to copy into a new card.
    String idLabels = "idLabels_example"; // A comma-separated list of objectIds, 24-character hex strings
    String idList = "idList_example"; // id of the list that the card should be added to
    String idMembers = "idMembers_example"; // A comma-separated list of objectIds, 24-character hex strings
    String keepFromSource = "keepFromSource_example"; // Properties of the card to copy over from the source.
    String labels = "labels_example"; // all or a comma-separated list of: blue, green, orange, purple, red or yellow
    String name = "name_example"; // The name of the new card.  It isn&#39;t required if the name is being copied from provided by a URL, file or card that is being copied.
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String subscribed = "subscribed_example"; //  true or false
    String urlSource = "urlSource_example"; // A URL starting with http:// or https:// or null
    try {
      client
              .card
              .createAndUpdate()
              .closed(closed)
              .desc(desc)
              .due(due)
              .fileSource(fileSource)
              .idAttachmentCover(idAttachmentCover)
              .idBoard(idBoard)
              .idCardSource(idCardSource)
              .idLabels(idLabels)
              .idList(idList)
              .idMembers(idMembers)
              .keepFromSource(keepFromSource)
              .labels(labels)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .urlSource(urlSource)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#createAndUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .createAndUpdate()
              .closed(closed)
              .desc(desc)
              .due(due)
              .fileSource(fileSource)
              .idAttachmentCover(idAttachmentCover)
              .idBoard(idBoard)
              .idCardSource(idCardSource)
              .idLabels(idLabels)
              .idList(idList)
              .idMembers(idMembers)
              .keepFromSource(keepFromSource)
              .labels(labels)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .urlSource(urlSource)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#createAndUpdate");
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
| **cards** | [**Cards**](Cards.md)| Attributes of \&quot;Cards\&quot; to be added. | |

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

<a name="deleteAttachmentsByIdCardByIdAttachment"></a>
# **deleteAttachmentsByIdCardByIdAttachment**
> deleteAttachmentsByIdCardByIdAttachment(idCard, idAttachment).execute();

deleteCardsAttachmentsByIdCardByIdAttachment()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idAttachment = "idAttachment_example"; // idAttachment
    try {
      client
              .card
              .deleteAttachmentsByIdCardByIdAttachment(idCard, idAttachment)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#deleteAttachmentsByIdCardByIdAttachment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .deleteAttachmentsByIdCardByIdAttachment(idCard, idAttachment)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#deleteAttachmentsByIdCardByIdAttachment");
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
| **idCard** | **String**| card id or shortlink | |
| **idAttachment** | **String**| idAttachment | |

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

<a name="deleteChecklistByIdCardByIdChecklist"></a>
# **deleteChecklistByIdCardByIdChecklist**
> deleteChecklistByIdCardByIdChecklist(idCard, idChecklist).execute();

deleteCardsChecklistsByIdCardByIdChecklist()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    try {
      client
              .card
              .deleteChecklistByIdCardByIdChecklist(idCard, idChecklist)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#deleteChecklistByIdCardByIdChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .deleteChecklistByIdCardByIdChecklist(idCard, idChecklist)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#deleteChecklistByIdCardByIdChecklist");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="getAttachmentsByIdCard"></a>
# **getAttachmentsByIdCard**
> getAttachmentsByIdCard(idCard).fields(fields).filter(filter).execute();

getCardsAttachmentsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String filter = "filter_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    try {
      client
              .card
              .getAttachmentsByIdCard(idCard)
              .fields(fields)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getAttachmentsByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getAttachmentsByIdCard(idCard)
              .fields(fields)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getAttachmentsByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **fields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |
| **filter** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |

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

<a name="getAttachmentsByIds"></a>
# **getAttachmentsByIds**
> getAttachmentsByIds(idCard, idAttachment).fields(fields).execute();

getCardsAttachmentsByIdCardByIdAttachment()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idAttachment = "idAttachment_example"; // idAttachment
    String fields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    try {
      client
              .card
              .getAttachmentsByIds(idCard, idAttachment)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getAttachmentsByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getAttachmentsByIds(idCard, idAttachment)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getAttachmentsByIds");
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
| **idCard** | **String**| card id or shortlink | |
| **idAttachment** | **String**| idAttachment | |
| **fields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |

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

<a name="getBoardById"></a>
# **getBoardById**
> getBoardById(idCard).fields(fields).execute();

getCardsBoardByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    try {
      client
              .card
              .getBoardById(idCard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getBoardById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getBoardById(idCard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getBoardById");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="getBoardByIdCardByField"></a>
# **getBoardByIdCardByField**
> getBoardByIdCardByField(idCard, field).execute();

getCardsBoardByIdCardByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String field = "field_example"; // field
    try {
      client
              .card
              .getBoardByIdCardByField(idCard, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getBoardByIdCardByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getBoardByIdCardByField(idCard, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getBoardByIdCardByField");
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
| **idCard** | **String**| card id or shortlink | |
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
> getById(idCard).actions(actions).actionsEntities(actionsEntities).actionsDisplay(actionsDisplay).actionsLimit(actionsLimit).actionFields(actionFields).actionMemberCreatorFields(actionMemberCreatorFields).attachments(attachments).attachmentFields(attachmentFields).members(members).memberFields(memberFields).membersVoted(membersVoted).memberVotedFields(memberVotedFields).checkItemStates(checkItemStates).checkItemStateFields(checkItemStateFields).checklists(checklists).checklistFields(checklistFields).board(board).boardFields(boardFields).list(list).listFields(listFields).stickers(stickers).stickerFields(stickerFields).fields(fields).execute();

getCardsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String actionsEntities = "actionsEntities_example"; //  true or false
    String actionsDisplay = "actionsDisplay_example"; //  true or false
    String actionsLimit = "50"; // a number from 0 to 1000
    String actionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String actionMemberCreatorFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String attachments = "attachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String attachmentFields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String members = "members_example"; //  true or false
    String memberFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String membersVoted = "membersVoted_example"; //  true or false
    String memberVotedFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String checkItemStates = "checkItemStates_example"; //  true or false
    String checkItemStateFields = "all"; // all or a comma-separated list of: idCheckItem or state
    String checklists = "none"; // One of: all or none
    String checklistFields = "all"; // all or a comma-separated list of: idBoard, idCard, name or pos
    String board = "board_example"; //  true or false
    String boardFields = "name, desc, descData, closed, idOrganization, pinned, url and prefs"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String list = "list_example"; //  true or false
    String listFields = "all"; // all or a comma-separated list of: closed, idBoard, name, pos or subscribed
    String stickers = "stickers_example"; //  true or false
    String stickerFields = "all"; // all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex
    String fields = "badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idBoard, idChecklists, idLabels, idList, idMembers, idShort, idAttachmentCover, manualCoverAttachment, labels, name, pos, shortUrl and url"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    try {
      client
              .card
              .getById(idCard)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionMemberCreatorFields(actionMemberCreatorFields)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .members(members)
              .memberFields(memberFields)
              .membersVoted(membersVoted)
              .memberVotedFields(memberVotedFields)
              .checkItemStates(checkItemStates)
              .checkItemStateFields(checkItemStateFields)
              .checklists(checklists)
              .checklistFields(checklistFields)
              .board(board)
              .boardFields(boardFields)
              .list(list)
              .listFields(listFields)
              .stickers(stickers)
              .stickerFields(stickerFields)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getById(idCard)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionMemberCreatorFields(actionMemberCreatorFields)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .members(members)
              .memberFields(memberFields)
              .membersVoted(membersVoted)
              .memberVotedFields(memberVotedFields)
              .checkItemStates(checkItemStates)
              .checkItemStateFields(checkItemStateFields)
              .checklists(checklists)
              .checklistFields(checklistFields)
              .board(board)
              .boardFields(boardFields)
              .list(list)
              .listFields(listFields)
              .stickers(stickers)
              .stickerFields(stickerFields)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getById");
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
| **idCard** | **String**| card id or shortlink | |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **actionsEntities** | **String**|  true or false | [optional] |
| **actionsDisplay** | **String**|  true or false | [optional] |
| **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **actionMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |
| **members** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **membersVoted** | **String**|  true or false | [optional] |
| **memberVotedFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **checkItemStates** | **String**|  true or false | [optional] |
| **checkItemStateFields** | **String**| all or a comma-separated list of: idCheckItem or state | [optional] [default to all] |
| **checklists** | **String**| One of: all or none | [optional] [default to none] |
| **checklistFields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all] |
| **board** | **String**|  true or false | [optional] |
| **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, descData, closed, idOrganization, pinned, url and prefs] |
| **list** | **String**|  true or false | [optional] |
| **listFields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all] |
| **stickers** | **String**|  true or false | [optional] |
| **stickerFields** | **String**| all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idBoard, idChecklists, idLabels, idList, idMembers, idShort, idAttachmentCover, manualCoverAttachment, labels, name, pos, shortUrl and url] |

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
> getByIdField(idCard, field).execute();

getCardsByIdCardByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String field = "field_example"; // field
    try {
      client
              .card
              .getByIdField(idCard, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getByIdField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getByIdField(idCard, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getByIdField");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="getCardsListByIdCardByField"></a>
# **getCardsListByIdCardByField**
> getCardsListByIdCardByField(idCard, field).execute();

getCardsListByIdCardByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String field = "field_example"; // field
    try {
      client
              .card
              .getCardsListByIdCardByField(idCard, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getCardsListByIdCardByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getCardsListByIdCardByField(idCard, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getCardsListByIdCardByField");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="getCheckItemStatesById"></a>
# **getCheckItemStatesById**
> getCheckItemStatesById(idCard).fields(fields).execute();

getCardsCheckItemStatesByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "all"; // all or a comma-separated list of: idCheckItem or state
    try {
      client
              .card
              .getCheckItemStatesById(idCard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getCheckItemStatesById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getCheckItemStatesById(idCard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getCheckItemStatesById");
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
| **idCard** | **String**| card id or shortlink | |
| **fields** | **String**| all or a comma-separated list of: idCheckItem or state | [optional] [default to all] |

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

<a name="getChecklistsById"></a>
# **getChecklistsById**
> getChecklistsById(idCard).cards(cards).cardFields(cardFields).checkItems(checkItems).checkItemFields(checkItemFields).filter(filter).fields(fields).execute();

getCardsChecklistsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String cards = "none"; // One of: all, closed, none, open or visible
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String checkItems = "all"; // One of: all or none
    String checkItemFields = "name, nameData, pos and state"; // all or a comma-separated list of: name, nameData, pos, state or type
    String filter = "all"; // One of: all or none
    String fields = "all"; // all or a comma-separated list of: idBoard, idCard, name or pos
    try {
      client
              .card
              .getChecklistsById(idCard)
              .cards(cards)
              .cardFields(cardFields)
              .checkItems(checkItems)
              .checkItemFields(checkItemFields)
              .filter(filter)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getChecklistsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getChecklistsById(idCard)
              .cards(cards)
              .cardFields(cardFields)
              .checkItems(checkItems)
              .checkItemFields(checkItemFields)
              .filter(filter)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getChecklistsById");
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
| **idCard** | **String**| card id or shortlink | |
| **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **checkItems** | **String**| One of: all or none | [optional] [default to all] |
| **checkItemFields** | **String**| all or a comma-separated list of: name, nameData, pos, state or type | [optional] [default to name, nameData, pos and state] |
| **filter** | **String**| One of: all or none | [optional] [default to all] |
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

<a name="getListById"></a>
# **getListById**
> getListById(idCard).fields(fields).execute();

getCardsListByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "all"; // all or a comma-separated list of: closed, idBoard, name, pos or subscribed
    try {
      client
              .card
              .getListById(idCard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getListById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getListById(idCard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getListById");
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
| **idCard** | **String**| card id or shortlink | |
| **fields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all] |

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

<a name="getMembersVotedByIdCard"></a>
# **getMembersVotedByIdCard**
> getMembersVotedByIdCard(idCard).fields(fields).execute();

getCardsMembersVotedByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .card
              .getMembersVotedByIdCard(idCard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getMembersVotedByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getMembersVotedByIdCard(idCard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getMembersVotedByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **fields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |

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

<a name="getStickerByIds"></a>
# **getStickerByIds**
> getStickerByIds(idCard, idSticker).fields(fields).execute();

getCardsStickersByIdCardByIdSticker()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idSticker = "idSticker_example"; // idSticker
    String fields = "all"; // all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex
    try {
      client
              .card
              .getStickerByIds(idCard, idSticker)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getStickerByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getStickerByIds(idCard, idSticker)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getStickerByIds");
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
| **idCard** | **String**| card id or shortlink | |
| **idSticker** | **String**| idSticker | |
| **fields** | **String**| all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex | [optional] [default to all] |

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

<a name="getStickersByIdCard"></a>
# **getStickersByIdCard**
> getStickersByIdCard(idCard).fields(fields).execute();

getCardsStickersByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "all"; // all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex
    try {
      client
              .card
              .getStickersByIdCard(idCard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getStickersByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .getStickersByIdCard(idCard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#getStickersByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **fields** | **String**| all or a comma-separated list of: image, imageScaled, imageUrl, left, rotate, top or zIndex | [optional] [default to all] |

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

<a name="listCardActionsById"></a>
# **listCardActionsById**
> listCardActionsById(idCard).entities(entities).display(display).filter(filter).fields(fields).limit(limit).format(format).since(since).before(before).page(page).idModels(idModels).member(member).memberFields(memberFields).memberCreator(memberCreator).memberCreatorFields(memberCreatorFields).execute();

getCardsActionsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String entities = "entities_example"; //  true or false
    String display = "display_example"; //  true or false
    String filter = "commentCard and updateCard:idList"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
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
              .card
              .listCardActionsById(idCard)
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
      System.err.println("Exception when calling CardApi#listCardActionsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .listCardActionsById(idCard)
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
      System.err.println("Exception when calling CardApi#listCardActionsById");
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
| **idCard** | **String**| card id or shortlink | |
| **entities** | **String**|  true or false | [optional] |
| **display** | **String**|  true or false | [optional] |
| **filter** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] [default to commentCard and updateCard:idList] |
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

<a name="listMembersByIdCard"></a>
# **listMembersByIdCard**
> listMembersByIdCard(idCard).fields(fields).execute();

getCardsMembersByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String fields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .card
              .listMembersByIdCard(idCard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#listMembersByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .listMembersByIdCard(idCard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#listMembersByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **fields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |

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

<a name="markAssociatedNotificationsRead"></a>
# **markAssociatedNotificationsRead**
> markAssociatedNotificationsRead(idCard).execute();

addCardsMarkAssociatedNotificationsReadByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    try {
      client
              .card
              .markAssociatedNotificationsRead(idCard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#markAssociatedNotificationsRead");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .markAssociatedNotificationsRead(idCard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#markAssociatedNotificationsRead");
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
| **idCard** | **String**| card id or shortlink | |

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

<a name="removeActionCommentByIdCardByIdAction"></a>
# **removeActionCommentByIdCardByIdAction**
> removeActionCommentByIdCardByIdAction(idCard, idAction).execute();

deleteCardsActionsCommentsByIdCardByIdAction()

This can only be done by the original author of the comment, or someone with higher permissions than the original author.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idAction = "idAction_example"; // idAction
    try {
      client
              .card
              .removeActionCommentByIdCardByIdAction(idCard, idAction)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeActionCommentByIdCardByIdAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeActionCommentByIdCardByIdAction(idCard, idAction)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeActionCommentByIdCardByIdAction");
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
| **idCard** | **String**| card id or shortlink | |
| **idAction** | **String**| idAction | |

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

<a name="removeByIdCard"></a>
# **removeByIdCard**
> removeByIdCard(idCard).execute();

deleteCardsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    try {
      client
              .card
              .removeByIdCard(idCard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeByIdCard(idCard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeByIdCard");
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
| **idCard** | **String**| card id or shortlink | |

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

<a name="removeChecklistCheckItem"></a>
# **removeChecklistCheckItem**
> removeChecklistCheckItem(idCard, idChecklist, idCheckItem).execute();

deleteCardsChecklistCheckItemByIdCardByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    try {
      client
              .card
              .removeChecklistCheckItem(idCard, idChecklist, idCheckItem)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeChecklistCheckItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeChecklistCheckItem(idCard, idChecklist, idCheckItem)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeChecklistCheckItem");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="removeLabelByIdCardByIdLabel"></a>
# **removeLabelByIdCardByIdLabel**
> removeLabelByIdCardByIdLabel(idCard, idLabel).execute();

deleteCardsIdLabelsByIdCardByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idLabel = "idLabel_example"; // idLabel
    try {
      client
              .card
              .removeLabelByIdCardByIdLabel(idCard, idLabel)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeLabelByIdCardByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeLabelByIdCardByIdLabel(idCard, idLabel)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeLabelByIdCardByIdLabel");
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
| **idCard** | **String**| card id or shortlink | |
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

<a name="removeLabelsByIdCardByColor"></a>
# **removeLabelsByIdCardByColor**
> removeLabelsByIdCardByColor(idCard, color).execute();

deleteCardsLabelsByIdCardByColor()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String color = "color_example"; // color
    try {
      client
              .card
              .removeLabelsByIdCardByColor(idCard, color)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeLabelsByIdCardByColor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeLabelsByIdCardByColor(idCard, color)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeLabelsByIdCardByColor");
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
| **idCard** | **String**| card id or shortlink | |
| **color** | **String**| color | |

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

<a name="removeMemberByIdMember"></a>
# **removeMemberByIdMember**
> removeMemberByIdMember(idCard, idMember).execute();

deleteCardsIdMembersByIdCardByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idMember = "idMember_example"; // idMember
    try {
      client
              .card
              .removeMemberByIdMember(idCard, idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeMemberByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeMemberByIdMember(idCard, idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeMemberByIdMember");
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
| **idCard** | **String**| card id or shortlink | |
| **idMember** | **String**| idMember | |

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

<a name="removeMembersVotedByIdCardByIdMember"></a>
# **removeMembersVotedByIdCardByIdMember**
> removeMembersVotedByIdCardByIdMember(idCard, idMember).execute();

deleteCardsMembersVotedByIdCardByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idMember = "idMember_example"; // idMember
    try {
      client
              .card
              .removeMembersVotedByIdCardByIdMember(idCard, idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeMembersVotedByIdCardByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeMembersVotedByIdCardByIdMember(idCard, idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeMembersVotedByIdCardByIdMember");
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
| **idCard** | **String**| card id or shortlink | |
| **idMember** | **String**| idMember | |

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

<a name="removeStickerByIds"></a>
# **removeStickerByIds**
> removeStickerByIds(idCard, idSticker).execute();

deleteCardsStickersByIdCardByIdSticker()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idSticker = "idSticker_example"; // idSticker
    try {
      client
              .card
              .removeStickerByIds(idCard, idSticker)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeStickerByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .removeStickerByIds(idCard, idSticker)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#removeStickerByIds");
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
| **idCard** | **String**| card id or shortlink | |
| **idSticker** | **String**| idSticker | |

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

<a name="updateActionCommentByIdCardByIdAction"></a>
# **updateActionCommentByIdCardByIdAction**
> updateActionCommentByIdCardByIdAction(idCard, idAction, cardsActionsComments).execute();

updateCardsActionsCommentsByIdCardByIdAction()

This can only be done by the original author of the comment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idAction = "idAction_example"; // idAction
    String text = "text_example"; // a string with a length from 1 to 16384
    try {
      client
              .card
              .updateActionCommentByIdCardByIdAction(idCard, idAction)
              .text(text)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateActionCommentByIdCardByIdAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateActionCommentByIdCardByIdAction(idCard, idAction)
              .text(text)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateActionCommentByIdCardByIdAction");
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
| **idCard** | **String**| card id or shortlink | |
| **idAction** | **String**| idAction | |
| **cardsActionsComments** | [**CardsActionsComments**](CardsActionsComments.md)| Attributes of \&quot;Cards Actions Comments\&quot; to be updated. | |

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

<a name="updateAttachmentCoverByIdCard"></a>
# **updateAttachmentCoverByIdCard**
> updateAttachmentCoverByIdCard(idCard, cardsIdAttachmentCover).execute();

updateCardsIdAttachmentCoverByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // Id of the image attachment of this card to use as its cover, or null for no cover
    try {
      client
              .card
              .updateAttachmentCoverByIdCard(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateAttachmentCoverByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateAttachmentCoverByIdCard(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateAttachmentCoverByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsIdAttachmentCover** | [**CardsIdAttachmentCover**](CardsIdAttachmentCover.md)| Attributes of \&quot;Cards Id Attachment Cover\&quot; to be updated. | |

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

<a name="updateBoardByIdCard"></a>
# **updateBoardByIdCard**
> updateBoardByIdCard(idCard, cardsIdBoard).execute();

updateCardsIdBoardByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idList = "idList_example"; // id of the list that the card should be moved to on the new board
    String value = "value_example"; // id of the board the card should be moved to
    try {
      client
              .card
              .updateBoardByIdCard(idCard)
              .idList(idList)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateBoardByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateBoardByIdCard(idCard)
              .idList(idList)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateBoardByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsIdBoard** | [**CardsIdBoard**](CardsIdBoard.md)| Attributes of \&quot;Cards Id Board\&quot; to be updated. | |

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

<a name="updateByIdCard"></a>
# **updateByIdCard**
> updateByIdCard(idCard, cards).execute();

updateCardsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String closed = "closed_example"; //  true or false
    String desc = "desc_example"; // a string with a length from 0 to 16384
    String due = "due_example"; // A date, or null
    String fileSource = "fileSource_example"; // A file
    String idAttachmentCover = "idAttachmentCover_example"; // Id of the image attachment of this card to use as its cover, or null for no cover
    String idBoard = "idBoard_example"; // id of the board the card should be moved to
    String idCardSource = "idCardSource_example"; // The id of the card to copy into a new card.
    String idLabels = "idLabels_example"; // A comma-separated list of objectIds, 24-character hex strings
    String idList = "idList_example"; // id of the list that the card should be added to
    String idMembers = "idMembers_example"; // A comma-separated list of objectIds, 24-character hex strings
    String keepFromSource = "keepFromSource_example"; // Properties of the card to copy over from the source.
    String labels = "labels_example"; // all or a comma-separated list of: blue, green, orange, purple, red or yellow
    String name = "name_example"; // The name of the new card.  It isn&#39;t required if the name is being copied from provided by a URL, file or card that is being copied.
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String subscribed = "subscribed_example"; //  true or false
    String urlSource = "urlSource_example"; // A URL starting with http:// or https:// or null
    try {
      client
              .card
              .updateByIdCard(idCard)
              .closed(closed)
              .desc(desc)
              .due(due)
              .fileSource(fileSource)
              .idAttachmentCover(idAttachmentCover)
              .idBoard(idBoard)
              .idCardSource(idCardSource)
              .idLabels(idLabels)
              .idList(idList)
              .idMembers(idMembers)
              .keepFromSource(keepFromSource)
              .labels(labels)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .urlSource(urlSource)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateByIdCard(idCard)
              .closed(closed)
              .desc(desc)
              .due(due)
              .fileSource(fileSource)
              .idAttachmentCover(idAttachmentCover)
              .idBoard(idBoard)
              .idCardSource(idCardSource)
              .idLabels(idLabels)
              .idList(idList)
              .idMembers(idMembers)
              .keepFromSource(keepFromSource)
              .labels(labels)
              .name(name)
              .pos(pos)
              .subscribed(subscribed)
              .urlSource(urlSource)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cards** | [**Cards**](Cards.md)| Attributes of \&quot;Cards\&quot; to be updated. | |

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

<a name="updateCheckItemPosById"></a>
# **updateCheckItemPosById**
> updateCheckItemPosById(idCard, idChecklist, idCheckItem, cardsChecklistCheckItemPos).execute();

updateCardsChecklistCheckItemPosByIdCardByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    String value = "value_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .card
              .updateCheckItemPosById(idCard, idChecklist, idCheckItem)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateCheckItemPosById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateCheckItemPosById(idCard, idChecklist, idCheckItem)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateCheckItemPosById");
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
| **idCard** | **String**| card id or shortlink | |
| **idChecklist** | **String**| idChecklist | |
| **idCheckItem** | **String**| idCheckItem | |
| **cardsChecklistCheckItemPos** | [**CardsChecklistCheckItemPos**](CardsChecklistCheckItemPos.md)| Attributes of \&quot;Cards Checklist Check Item Pos\&quot; to be updated. | |

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

<a name="updateChecklistCheckItem"></a>
# **updateChecklistCheckItem**
> updateChecklistCheckItem(idCard, idChecklistCurrent, idCheckItem, cardsChecklistIdChecklistCurrentCheckItem).execute();

updateCardsChecklistCheckItemByIdCardByIdChecklistCurrentByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklistCurrent = "idChecklistCurrent_example"; // idChecklistCurrent
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    String idChecklist = "idChecklist_example"; // An id, or null
    String name = "name_example"; // a string with a length from 1 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String state = "state_example"; // One of: complete, false, incomplete or true
    try {
      client
              .card
              .updateChecklistCheckItem(idCard, idChecklistCurrent, idCheckItem)
              .idChecklist(idChecklist)
              .name(name)
              .pos(pos)
              .state(state)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateChecklistCheckItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateChecklistCheckItem(idCard, idChecklistCurrent, idCheckItem)
              .idChecklist(idChecklist)
              .name(name)
              .pos(pos)
              .state(state)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateChecklistCheckItem");
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
| **idCard** | **String**| card id or shortlink | |
| **idChecklistCurrent** | **String**| idChecklistCurrent | |
| **idCheckItem** | **String**| idCheckItem | |
| **cardsChecklistIdChecklistCurrentCheckItem** | [**CardsChecklistIdChecklistCurrentCheckItem**](CardsChecklistIdChecklistCurrentCheckItem.md)| Attributes of \&quot;Cards Checklist Id Checklist Current Check Item\&quot; to be updated. | |

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

<a name="updateChecklistCheckItemNameById"></a>
# **updateChecklistCheckItemNameById**
> updateChecklistCheckItemNameById(idCard, idChecklist, idCheckItem, cardsChecklistCheckItemName).execute();

updateCardsChecklistCheckItemNameByIdCardByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    String value = "value_example"; // a string with a length from 1 to 16384
    try {
      client
              .card
              .updateChecklistCheckItemNameById(idCard, idChecklist, idCheckItem)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateChecklistCheckItemNameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateChecklistCheckItemNameById(idCard, idChecklist, idCheckItem)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateChecklistCheckItemNameById");
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
| **idCard** | **String**| card id or shortlink | |
| **idChecklist** | **String**| idChecklist | |
| **idCheckItem** | **String**| idCheckItem | |
| **cardsChecklistCheckItemName** | [**CardsChecklistCheckItemName**](CardsChecklistCheckItemName.md)| Attributes of \&quot;Cards Checklist Check Item Name\&quot; to be updated. | |

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

<a name="updateChecklistCheckItemState"></a>
# **updateChecklistCheckItemState**
> updateChecklistCheckItemState(idCard, idChecklist, idCheckItem, cardsChecklistCheckItemState).execute();

updateCardsChecklistCheckItemStateByIdCardByIdChecklistByIdCheckItem()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idChecklist = "idChecklist_example"; // idChecklist
    String idCheckItem = "idCheckItem_example"; // idCheckItem
    String value = "value_example"; // One of: complete, false, incomplete or true
    try {
      client
              .card
              .updateChecklistCheckItemState(idCard, idChecklist, idCheckItem)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateChecklistCheckItemState");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateChecklistCheckItemState(idCard, idChecklist, idCheckItem)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateChecklistCheckItemState");
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
| **idCard** | **String**| card id or shortlink | |
| **idChecklist** | **String**| idChecklist | |
| **idCheckItem** | **String**| idCheckItem | |
| **cardsChecklistCheckItemState** | [**CardsChecklistCheckItemState**](CardsChecklistCheckItemState.md)| Attributes of \&quot;Cards Checklist Check Item State\&quot; to be updated. | |

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

<a name="updateClosedById"></a>
# **updateClosedById**
> updateClosedById(idCard, cardsClosed).execute();

updateCardsClosedByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; //  true or false
    try {
      client
              .card
              .updateClosedById(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateClosedById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateClosedById(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateClosedById");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsClosed** | [**CardsClosed**](CardsClosed.md)| Attributes of \&quot;Cards Closed\&quot; to be updated. | |

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

<a name="updateDescriptionByIdCard"></a>
# **updateDescriptionByIdCard**
> updateDescriptionByIdCard(idCard, cardsDesc).execute();

updateCardsDescByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .card
              .updateDescriptionByIdCard(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateDescriptionByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateDescriptionByIdCard(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateDescriptionByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsDesc** | [**CardsDesc**](CardsDesc.md)| Attributes of \&quot;Cards Desc\&quot; to be updated. | |

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

<a name="updateDueById"></a>
# **updateDueById**
> updateDueById(idCard, cardsDue).execute();

updateCardsDueByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // A date, or null
    try {
      client
              .card
              .updateDueById(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateDueById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateDueById(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateDueById");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsDue** | [**CardsDue**](CardsDue.md)| Attributes of \&quot;Cards Due\&quot; to be updated. | |

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

<a name="updateIdListByIdCard"></a>
# **updateIdListByIdCard**
> updateIdListByIdCard(idCard, cardsIdList).execute();

updateCardsIdListByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // id of the list the card should be moved to
    try {
      client
              .card
              .updateIdListByIdCard(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateIdListByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateIdListByIdCard(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateIdListByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsIdList** | [**CardsIdList**](CardsIdList.md)| Attributes of \&quot;Cards Id List\&quot; to be updated. | |

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

<a name="updateIdMembers"></a>
# **updateIdMembers**
> updateIdMembers(idCard, cardsIdMembers).execute();

updateCardsIdMembersByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // The id of the member to add to the card
    try {
      client
              .card
              .updateIdMembers(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateIdMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateIdMembers(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateIdMembers");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsIdMembers** | [**CardsIdMembers**](CardsIdMembers.md)| Attributes of \&quot;Cards Id Members\&quot; to be updated. | |

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

<a name="updateLabels"></a>
# **updateLabels**
> updateLabels(idCard, cardsLabels).execute();

updateCardsLabelsByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String color = "color_example"; // A valid label color or null
    String name = "name_example"; // a string with a length from 0 to 16384
    String value = "value_example"; // all or a comma-separated list of: blue, green, orange, purple, red or yellow
    try {
      client
              .card
              .updateLabels(idCard)
              .color(color)
              .name(name)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateLabels");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateLabels(idCard)
              .color(color)
              .name(name)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateLabels");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsLabels** | [**CardsLabels**](CardsLabels.md)| Attributes of \&quot;Cards Labels\&quot; to be updated. | |

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

<a name="updateNameById"></a>
# **updateNameById**
> updateNameById(idCard, cardsName).execute();

updateCardsNameByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // a string with a length from 1 to 16384
    try {
      client
              .card
              .updateNameById(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateNameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateNameById(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateNameById");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsName** | [**CardsName**](CardsName.md)| Attributes of \&quot;Cards Name\&quot; to be updated. | |

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

<a name="updatePosByIdCard"></a>
# **updatePosByIdCard**
> updatePosByIdCard(idCard, cardsPos).execute();

updateCardsPosByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .card
              .updatePosByIdCard(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updatePosByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updatePosByIdCard(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updatePosByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsPos** | [**CardsPos**](CardsPos.md)| Attributes of \&quot;Cards Pos\&quot; to be updated. | |

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

<a name="updateStickersByIdCardByIdSticker"></a>
# **updateStickersByIdCardByIdSticker**
> updateStickersByIdCardByIdSticker(idCard, idSticker, cardsStickers).execute();

updateCardsStickersByIdCardByIdSticker()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String idSticker = "idSticker_example"; // idSticker
    String image = "image_example"; // a string with a length from 0 to 16384
    String left = "left_example"; // undefined
    String rotate = "rotate_example"; // undefined
    String top = "top_example"; // undefined
    String zIndex = "zIndex_example"; // Valid Z values for stickers, must be an integer
    try {
      client
              .card
              .updateStickersByIdCardByIdSticker(idCard, idSticker)
              .image(image)
              .left(left)
              .rotate(rotate)
              .top(top)
              .zIndex(zIndex)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateStickersByIdCardByIdSticker");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateStickersByIdCardByIdSticker(idCard, idSticker)
              .image(image)
              .left(left)
              .rotate(rotate)
              .top(top)
              .zIndex(zIndex)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateStickersByIdCardByIdSticker");
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
| **idCard** | **String**| card id or shortlink | |
| **idSticker** | **String**| idSticker | |
| **cardsStickers** | [**CardsStickers**](CardsStickers.md)| Attributes of \&quot;Cards Stickers\&quot; to be updated. | |

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

<a name="updateSubscribedByIdCard"></a>
# **updateSubscribedByIdCard**
> updateSubscribedByIdCard(idCard, cardsSubscribed).execute();

updateCardsSubscribedByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardApi;
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
    String idCard = "idCard_example"; // card id or shortlink
    String value = "value_example"; //  true or false
    try {
      client
              .card
              .updateSubscribedByIdCard(idCard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateSubscribedByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .card
              .updateSubscribedByIdCard(idCard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardApi#updateSubscribedByIdCard");
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
| **idCard** | **String**| card id or shortlink | |
| **cardsSubscribed** | [**CardsSubscribed**](CardsSubscribed.md)| Attributes of \&quot;Cards Subscribed\&quot; to be updated. | |

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

