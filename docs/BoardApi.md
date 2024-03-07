# BoardApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addChecklists**](BoardApi.md#addChecklists) | **POST** /boards/{idBoard}/checklists | addBoardsChecklistsByIdBoard() |
| [**addLabelsByIdBoard**](BoardApi.md#addLabelsByIdBoard) | **POST** /boards/{idBoard}/labels | addBoardsLabelsByIdBoard() |
| [**addPowerUpsByIdBoard**](BoardApi.md#addPowerUpsByIdBoard) | **POST** /boards/{idBoard}/powerUps | addBoardsPowerUpsByIdBoard() |
| [**createBoard**](BoardApi.md#createBoard) | **POST** /boards | addBoards() |
| [**createListsByIdBoard**](BoardApi.md#createListsByIdBoard) | **POST** /boards/{idBoard}/lists | addBoardsListsByIdBoard() |
| [**filterCardsByIdBoard**](BoardApi.md#filterCardsByIdBoard) | **GET** /boards/{idBoard}/cards/{filter} | getBoardsCardsByIdBoardByFilter() |
| [**generateCalendarKeyById**](BoardApi.md#generateCalendarKeyById) | **POST** /boards/{idBoard}/calendarKey/generate | addBoardsCalendarKeyGenerateByIdBoard() |
| [**generateEmailKey**](BoardApi.md#generateEmailKey) | **POST** /boards/{idBoard}/emailKey/generate | addBoardsEmailKeyGenerateByIdBoard() |
| [**getBoardStarsById**](BoardApi.md#getBoardStarsById) | **GET** /boards/{idBoard}/boardStars | getBoardsBoardStarsByIdBoard() |
| [**getById**](BoardApi.md#getById) | **GET** /boards/{idBoard} | getBoardsByIdBoard() |
| [**getByIdField**](BoardApi.md#getByIdField) | **GET** /boards/{idBoard}/{field} | getBoardsByIdBoardByField() |
| [**getCardsByIdBoard**](BoardApi.md#getCardsByIdBoard) | **GET** /boards/{idBoard}/cards | getBoardsCardsByIdBoard() |
| [**getCardsByIdBoardByIdCard**](BoardApi.md#getCardsByIdBoardByIdCard) | **GET** /boards/{idBoard}/cards/{idCard} | getBoardsCardsByIdBoardByIdCard() |
| [**getChecklistsById**](BoardApi.md#getChecklistsById) | **GET** /boards/{idBoard}/checklists | getBoardsChecklistsByIdBoard() |
| [**getDeltasByIdBoard**](BoardApi.md#getDeltasByIdBoard) | **GET** /boards/{idBoard}/deltas | getBoardsDeltasByIdBoard() |
| [**getLabelsByIdBoardByIdLabel**](BoardApi.md#getLabelsByIdBoardByIdLabel) | **GET** /boards/{idBoard}/labels/{idLabel} | getBoardsLabelsByIdBoardByIdLabel() |
| [**getListsByFilter**](BoardApi.md#getListsByFilter) | **GET** /boards/{idBoard}/lists/{filter} | getBoardsListsByIdBoardByFilter() |
| [**getListsByIdBoard**](BoardApi.md#getListsByIdBoard) | **GET** /boards/{idBoard}/lists | getBoardsListsByIdBoard() |
| [**getMembersByFilter**](BoardApi.md#getMembersByFilter) | **GET** /boards/{idBoard}/members/{filter} | getBoardsMembersByIdBoardByFilter() |
| [**getMembersByIdBoard**](BoardApi.md#getMembersByIdBoard) | **GET** /boards/{idBoard}/members | getBoardsMembersByIdBoard() |
| [**getMembersCardsByIdBoardByIdMember**](BoardApi.md#getMembersCardsByIdBoardByIdMember) | **GET** /boards/{idBoard}/members/{idMember}/cards | getBoardsMembersCardsByIdBoardByIdMember() |
| [**getMembersInvitedByField**](BoardApi.md#getMembersInvitedByField) | **GET** /boards/{idBoard}/membersInvited/{field} | getBoardsMembersInvitedByIdBoardByField() |
| [**getMembersInvitedByIdBoard**](BoardApi.md#getMembersInvitedByIdBoard) | **GET** /boards/{idBoard}/membersInvited | getBoardsMembersInvitedByIdBoard() |
| [**getMembershipsByIdBoard**](BoardApi.md#getMembershipsByIdBoard) | **GET** /boards/{idBoard}/memberships | getBoardsMembershipsByIdBoard() |
| [**getMembershipsByIdBoardByIdMembership**](BoardApi.md#getMembershipsByIdBoardByIdMembership) | **GET** /boards/{idBoard}/memberships/{idMembership} | getBoardsMembershipsByIdBoardByIdMembership() |
| [**getMyPrefsById**](BoardApi.md#getMyPrefsById) | **GET** /boards/{idBoard}/myPrefs | getBoardsMyPrefsByIdBoard() |
| [**getOrganizationById**](BoardApi.md#getOrganizationById) | **GET** /boards/{idBoard}/organization | getBoardsOrganizationByIdBoard() |
| [**getOrganizationByIdBoardByField**](BoardApi.md#getOrganizationByIdBoardByField) | **GET** /boards/{idBoard}/organization/{field} | getBoardsOrganizationByIdBoardByField() |
| [**listActionsByIdBoard**](BoardApi.md#listActionsByIdBoard) | **GET** /boards/{idBoard}/actions | getBoardsActionsByIdBoard() |
| [**listLabelsByIdBoard**](BoardApi.md#listLabelsByIdBoard) | **GET** /boards/{idBoard}/labels | getBoardsLabelsByIdBoard() |
| [**markAsViewedByIdBoard**](BoardApi.md#markAsViewedByIdBoard) | **POST** /boards/{idBoard}/markAsViewed | addBoardsMarkAsViewedByIdBoard() |
| [**removeMember**](BoardApi.md#removeMember) | **DELETE** /boards/{idBoard}/members/{idMember} | deleteBoardsMembersByIdBoardByIdMember() |
| [**removePowerUp**](BoardApi.md#removePowerUp) | **DELETE** /boards/{idBoard}/powerUps/{powerUp} | deleteBoardsPowerUpsByIdBoardByPowerUp() |
| [**updateById**](BoardApi.md#updateById) | **PUT** /boards/{idBoard} | updateBoardsByIdBoard() |
| [**updateClosedById**](BoardApi.md#updateClosedById) | **PUT** /boards/{idBoard}/closed | updateBoardsClosedByIdBoard() |
| [**updateDescriptionByIdBoard**](BoardApi.md#updateDescriptionByIdBoard) | **PUT** /boards/{idBoard}/desc | updateBoardsDescByIdBoard() |
| [**updateLabelNamesBlueById**](BoardApi.md#updateLabelNamesBlueById) | **PUT** /boards/{idBoard}/labelNames/blue | updateBoardsLabelNamesBlueByIdBoard() |
| [**updateLabelNamesGreenByIdBoardPut**](BoardApi.md#updateLabelNamesGreenByIdBoardPut) | **PUT** /boards/{idBoard}/labelNames/green | updateBoardsLabelNamesGreenByIdBoard() |
| [**updateLabelNamesOrangeByIdBoard**](BoardApi.md#updateLabelNamesOrangeByIdBoard) | **PUT** /boards/{idBoard}/labelNames/orange | updateBoardsLabelNamesOrangeByIdBoard() |
| [**updateLabelNamesPurpleByIdBoard**](BoardApi.md#updateLabelNamesPurpleByIdBoard) | **PUT** /boards/{idBoard}/labelNames/purple | updateBoardsLabelNamesPurpleByIdBoard() |
| [**updateLabelNamesRed**](BoardApi.md#updateLabelNamesRed) | **PUT** /boards/{idBoard}/labelNames/red | updateBoardsLabelNamesRedByIdBoard() |
| [**updateLabelNamesYellowByIdBoard**](BoardApi.md#updateLabelNamesYellowByIdBoard) | **PUT** /boards/{idBoard}/labelNames/yellow | updateBoardsLabelNamesYellowByIdBoard() |
| [**updateMembersByIdBoard**](BoardApi.md#updateMembersByIdBoard) | **PUT** /boards/{idBoard}/members | updateBoardsMembersByIdBoard() |
| [**updateMembersByIdBoardByIdMember**](BoardApi.md#updateMembersByIdBoardByIdMember) | **PUT** /boards/{idBoard}/members/{idMember} | updateBoardsMembersByIdBoardByIdMember() |
| [**updateMembershipsByIdBoardByIdMembership**](BoardApi.md#updateMembershipsByIdBoardByIdMembership) | **PUT** /boards/{idBoard}/memberships/{idMembership} | updateBoardsMembershipsByIdBoardByIdMembership() |
| [**updateMyPrefsEmailListByIdBoard**](BoardApi.md#updateMyPrefsEmailListByIdBoard) | **PUT** /boards/{idBoard}/myPrefs/idEmailList | updateBoardsMyPrefsIdEmailListByIdBoard() |
| [**updateMyPrefsEmailPositionByIdBoard**](BoardApi.md#updateMyPrefsEmailPositionByIdBoard) | **PUT** /boards/{idBoard}/myPrefs/emailPosition | updateBoardsMyPrefsEmailPositionByIdBoard() |
| [**updateMyPrefsShowListGuideByIdBoard**](BoardApi.md#updateMyPrefsShowListGuideByIdBoard) | **PUT** /boards/{idBoard}/myPrefs/showListGuide | updateBoardsMyPrefsShowListGuideByIdBoard() |
| [**updateMyPrefsShowSidebar**](BoardApi.md#updateMyPrefsShowSidebar) | **PUT** /boards/{idBoard}/myPrefs/showSidebar | updateBoardsMyPrefsShowSidebarByIdBoard() |
| [**updateMyPrefsShowSidebarActionsByIdBoard**](BoardApi.md#updateMyPrefsShowSidebarActionsByIdBoard) | **PUT** /boards/{idBoard}/myPrefs/showSidebarBoardActions | updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard() |
| [**updateMyPrefsShowSidebarActivityByIdBoard**](BoardApi.md#updateMyPrefsShowSidebarActivityByIdBoard) | **PUT** /boards/{idBoard}/myPrefs/showSidebarActivity | updateBoardsMyPrefsShowSidebarActivityByIdBoard() |
| [**updateNameById**](BoardApi.md#updateNameById) | **PUT** /boards/{idBoard}/name | updateBoardsNameByIdBoard() |
| [**updateOrganizationByIdBoard**](BoardApi.md#updateOrganizationByIdBoard) | **PUT** /boards/{idBoard}/idOrganization | updateBoardsIdOrganizationByIdBoard() |
| [**updatePrefsBackgroundByIdBoard**](BoardApi.md#updatePrefsBackgroundByIdBoard) | **PUT** /boards/{idBoard}/prefs/background | updateBoardsPrefsBackgroundByIdBoard() |
| [**updatePrefsCalendarFeedEnabledById**](BoardApi.md#updatePrefsCalendarFeedEnabledById) | **PUT** /boards/{idBoard}/prefs/calendarFeedEnabled | updateBoardsPrefsCalendarFeedEnabledByIdBoard() |
| [**updatePrefsCardAgingByIdBoard**](BoardApi.md#updatePrefsCardAgingByIdBoard) | **PUT** /boards/{idBoard}/prefs/cardAging | updateBoardsPrefsCardAgingByIdBoard() |
| [**updatePrefsCardCoversByIdBoard**](BoardApi.md#updatePrefsCardCoversByIdBoard) | **PUT** /boards/{idBoard}/prefs/cardCovers | updateBoardsPrefsCardCoversByIdBoard() |
| [**updatePrefsCommentsByIdBoard**](BoardApi.md#updatePrefsCommentsByIdBoard) | **PUT** /boards/{idBoard}/prefs/comments | updateBoardsPrefsCommentsByIdBoard() |
| [**updatePrefsInvitationsByIdBoard**](BoardApi.md#updatePrefsInvitationsByIdBoard) | **PUT** /boards/{idBoard}/prefs/invitations | updateBoardsPrefsInvitationsByIdBoard() |
| [**updatePrefsPermissionLevelById**](BoardApi.md#updatePrefsPermissionLevelById) | **PUT** /boards/{idBoard}/prefs/permissionLevel | updateBoardsPrefsPermissionLevelByIdBoard() |
| [**updatePrefsSelfJoinByIdBoard**](BoardApi.md#updatePrefsSelfJoinByIdBoard) | **PUT** /boards/{idBoard}/prefs/selfJoin | updateBoardsPrefsSelfJoinByIdBoard() |
| [**updatePrefsShowSidebarMembersById**](BoardApi.md#updatePrefsShowSidebarMembersById) | **PUT** /boards/{idBoard}/myPrefs/showSidebarMembers | updateBoardsMyPrefsShowSidebarMembersByIdBoard() |
| [**updateSubscribedById**](BoardApi.md#updateSubscribedById) | **PUT** /boards/{idBoard}/subscribed | updateBoardsSubscribedByIdBoard() |
| [**updateVotingPrefsById**](BoardApi.md#updateVotingPrefsById) | **PUT** /boards/{idBoard}/prefs/voting | updateBoardsPrefsVotingByIdBoard() |


<a name="addChecklists"></a>
# **addChecklists**
> addChecklists(idBoard, boardsChecklists).execute();

addBoardsChecklistsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String name = "name_example"; // a string with a length from 1 to 16384
    try {
      client
              .board
              .addChecklists(idBoard)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#addChecklists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .addChecklists(idBoard)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#addChecklists");
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
| **idBoard** | **String**| board_id | |
| **boardsChecklists** | [**BoardsChecklists**](BoardsChecklists.md)| Attributes of \&quot;Boards Checklists\&quot; to be added. | |

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

<a name="addLabelsByIdBoard"></a>
# **addLabelsByIdBoard**
> addLabelsByIdBoard(idBoard, boardsLabels).execute();

addBoardsLabelsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String color = "color_example"; // A valid label color or null
    String name = "name_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .addLabelsByIdBoard(idBoard)
              .color(color)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#addLabelsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .addLabelsByIdBoard(idBoard)
              .color(color)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#addLabelsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **boardsLabels** | [**BoardsLabels**](BoardsLabels.md)| Attributes of \&quot;Boards Labels\&quot; to be added. | |

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

<a name="addPowerUpsByIdBoard"></a>
# **addPowerUpsByIdBoard**
> addPowerUpsByIdBoard(idBoard, boardsPowerUps).execute();

addBoardsPowerUpsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: calendar, cardAging, recap or voting
    try {
      client
              .board
              .addPowerUpsByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#addPowerUpsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .addPowerUpsByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#addPowerUpsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **boardsPowerUps** | [**BoardsPowerUps**](BoardsPowerUps.md)| Attributes of \&quot;Boards Power Ups\&quot; to be added. | |

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

<a name="createBoard"></a>
# **createBoard**
> createBoard(boards).execute();

addBoards()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoardSource = "idBoardSource_example"; // The id of the board to copy into the new board
    String idOrganization = "idOrganization_example"; // The id or name of the organization to add the board to.
    String keepFromSource = "keepFromSource_example"; // Components of the source board to copy.
    String labelNamesBlue = "labelNamesBlue_example"; // a string with a length from 0 to 16384
    String labelNamesGreen = "labelNamesGreen_example"; // a string with a length from 0 to 16384
    String labelNamesOrange = "labelNamesOrange_example"; // a string with a length from 0 to 16384
    String labelNamesPurple = "labelNamesPurple_example"; // a string with a length from 0 to 16384
    String labelNamesRed = "labelNamesRed_example"; // a string with a length from 0 to 16384
    String labelNamesYellow = "labelNamesYellow_example"; // a string with a length from 0 to 16384
    String name = "name_example"; // a string with a length from 1 to 16384
    String powerUps = "powerUps_example"; // all or a comma-separated list of: calendar, cardAging, recap or voting
    String prefsBackground = "prefsBackground_example"; // A standard background name, or the id of a custom background
    String prefsCalendarFeedEnabled = "prefsCalendarFeedEnabled_example"; //  true or false
    String prefsCardAging = "prefsCardAging_example"; // One of: pirate or regular
    String prefsCardCovers = "prefsCardCovers_example"; //  true or false
    String prefsComments = "prefsComments_example"; // One of: disabled, members, observers, org or public
    String prefsInvitations = "prefsInvitations_example"; // One of: admins or members
    String prefsPermissionLevel = "prefsPermissionLevel_example"; // One of: org, private or public
    String prefsSelfJoin = "prefsSelfJoin_example"; //  true or false
    String prefsVoting = "prefsVoting_example"; // One of: disabled, members, observers, org or public
    String prefsBackground = "prefsBackground_example"; // a string with a length from 0 to 16384
    String prefsCardAging = "prefsCardAging_example"; // One of: pirate or regular
    String prefsCardCovers = "prefsCardCovers_example"; //  true or false
    String prefsComments = "prefsComments_example"; // One of: disabled, members, observers, org or public
    String prefsInvitations = "prefsInvitations_example"; // One of: admins or members
    String prefsPermissionLevel = "prefsPermissionLevel_example"; // One of: org, private or public
    String prefsSelfJoin = "prefsSelfJoin_example"; //  true or false
    String prefsVoting = "prefsVoting_example"; // One of: disabled, members, observers, org or public
    String subscribed = "subscribed_example"; //  true or false
    try {
      client
              .board
              .createBoard()
              .closed(closed)
              .desc(desc)
              .idBoardSource(idBoardSource)
              .idOrganization(idOrganization)
              .keepFromSource(keepFromSource)
              .labelNamesBlue(labelNamesBlue)
              .labelNamesGreen(labelNamesGreen)
              .labelNamesOrange(labelNamesOrange)
              .labelNamesPurple(labelNamesPurple)
              .labelNamesRed(labelNamesRed)
              .labelNamesYellow(labelNamesYellow)
              .name(name)
              .powerUps(powerUps)
              .prefsBackground(prefsBackground)
              .prefsCalendarFeedEnabled(prefsCalendarFeedEnabled)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .prefsBackground(prefsBackground)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .subscribed(subscribed)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#createBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .createBoard()
              .closed(closed)
              .desc(desc)
              .idBoardSource(idBoardSource)
              .idOrganization(idOrganization)
              .keepFromSource(keepFromSource)
              .labelNamesBlue(labelNamesBlue)
              .labelNamesGreen(labelNamesGreen)
              .labelNamesOrange(labelNamesOrange)
              .labelNamesPurple(labelNamesPurple)
              .labelNamesRed(labelNamesRed)
              .labelNamesYellow(labelNamesYellow)
              .name(name)
              .powerUps(powerUps)
              .prefsBackground(prefsBackground)
              .prefsCalendarFeedEnabled(prefsCalendarFeedEnabled)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .prefsBackground(prefsBackground)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .subscribed(subscribed)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#createBoard");
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
| **boards** | [**Boards**](Boards.md)| Attributes of \&quot;Boards\&quot; to be added. | |

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

<a name="createListsByIdBoard"></a>
# **createListsByIdBoard**
> createListsByIdBoard(idBoard, boardsLists).execute();

addBoardsListsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String name = "name_example"; // a string with a length from 1 to 16384
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .board
              .createListsByIdBoard(idBoard)
              .name(name)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#createListsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .createListsByIdBoard(idBoard)
              .name(name)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#createListsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **boardsLists** | [**BoardsLists**](BoardsLists.md)| Attributes of \&quot;Boards Lists\&quot; to be added. | |

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

<a name="filterCardsByIdBoard"></a>
# **filterCardsByIdBoard**
> filterCardsByIdBoard(idBoard, filter).execute();

getBoardsCardsByIdBoardByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String filter = "filter_example"; // filter
    try {
      client
              .board
              .filterCardsByIdBoard(idBoard, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#filterCardsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .filterCardsByIdBoard(idBoard, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#filterCardsByIdBoard");
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
| **idBoard** | **String**| board_id | |
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

<a name="generateCalendarKeyById"></a>
# **generateCalendarKeyById**
> generateCalendarKeyById(idBoard).execute();

addBoardsCalendarKeyGenerateByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    try {
      client
              .board
              .generateCalendarKeyById(idBoard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#generateCalendarKeyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .generateCalendarKeyById(idBoard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#generateCalendarKeyById");
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
| **idBoard** | **String**| board_id | |

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

<a name="generateEmailKey"></a>
# **generateEmailKey**
> generateEmailKey(idBoard).execute();

addBoardsEmailKeyGenerateByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    try {
      client
              .board
              .generateEmailKey(idBoard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#generateEmailKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .generateEmailKey(idBoard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#generateEmailKey");
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
| **idBoard** | **String**| board_id | |

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

<a name="getBoardStarsById"></a>
# **getBoardStarsById**
> getBoardStarsById(idBoard).filter(filter).execute();

getBoardsBoardStarsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String filter = "mine"; // One of: mine or none
    try {
      client
              .board
              .getBoardStarsById(idBoard)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardStarsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getBoardStarsById(idBoard)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getBoardStarsById");
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
| **idBoard** | **String**| board_id | |
| **filter** | **String**| One of: mine or none | [optional] [default to mine] |

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
> getById(idBoard).actions(actions).actionsEntities(actionsEntities).actionsDisplay(actionsDisplay).actionsFormat(actionsFormat).actionsSince(actionsSince).actionsLimit(actionsLimit).actionFields(actionFields).actionMember(actionMember).actionMemberFields(actionMemberFields).actionMemberCreator(actionMemberCreator).actionMemberCreatorFields(actionMemberCreatorFields).cards(cards).cardFields(cardFields).cardAttachments(cardAttachments).cardAttachmentFields(cardAttachmentFields).cardChecklists(cardChecklists).cardStickers(cardStickers).boardStars(boardStars).labels(labels).labelFields(labelFields).labelsLimit(labelsLimit).lists(lists).listFields(listFields).memberships(memberships).membershipsMember(membershipsMember).membershipsMemberFields(membershipsMemberFields).members(members).memberFields(memberFields).membersInvited(membersInvited).membersInvitedFields(membersInvitedFields).checklists(checklists).checklistFields(checklistFields).organization(organization).organizationFields(organizationFields).organizationMemberships(organizationMemberships).myPrefs(myPrefs).fields(fields).execute();

getBoardsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String actionsEntities = "actionsEntities_example"; //  true or false
    String actionsDisplay = "actionsDisplay_example"; //  true or false
    String actionsFormat = "list"; // One of: count, list or minimal
    String actionsSince = "actionsSince_example"; // A date, null or lastView
    String actionsLimit = "50"; // a number from 0 to 1000
    String actionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String actionMember = "actionMember_example"; //  true or false
    String actionMemberFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String actionMemberCreator = "actionMemberCreator_example"; //  true or false
    String actionMemberCreatorFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String cards = "none"; // One of: all, closed, none, open or visible
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String cardAttachments = "cardAttachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String cardAttachmentFields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String cardChecklists = "none"; // One of: all or none
    String cardStickers = "cardStickers_example"; //  true or false
    String boardStars = "none"; // One of: mine or none
    String labels = "none"; // One of: all or none
    String labelFields = "all"; // all or a comma-separated list of: color, idBoard, name or uses
    String labelsLimit = "50"; // a number from 0 to 1000
    String lists = "none"; // One of: all, closed, none or open
    String listFields = "all"; // all or a comma-separated list of: closed, idBoard, name, pos or subscribed
    String memberships = "none"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String membershipsMember = "membershipsMember_example"; //  true or false
    String membershipsMemberFields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String members = "none"; // One of: admins, all, none, normal or owners
    String memberFields = "avatarHash, initials, fullName, username and confirmed"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String membersInvited = "none"; // One of: admins, all, none, normal or owners
    String membersInvitedFields = "avatarHash, initials, fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String checklists = "none"; // One of: all or none
    String checklistFields = "all"; // all or a comma-separated list of: idBoard, idCard, name or pos
    String organization = "organization_example"; //  true or false
    String organizationFields = "name and displayName"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String organizationMemberships = "none"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String myPrefs = "myPrefs_example"; //  true or false
    String fields = "name, desc, descData, closed, idOrganization, pinned, url, shortUrl, prefs and labelNames"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    try {
      client
              .board
              .getById(idBoard)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsFormat(actionsFormat)
              .actionsSince(actionsSince)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionMember(actionMember)
              .actionMemberFields(actionMemberFields)
              .actionMemberCreator(actionMemberCreator)
              .actionMemberCreatorFields(actionMemberCreatorFields)
              .cards(cards)
              .cardFields(cardFields)
              .cardAttachments(cardAttachments)
              .cardAttachmentFields(cardAttachmentFields)
              .cardChecklists(cardChecklists)
              .cardStickers(cardStickers)
              .boardStars(boardStars)
              .labels(labels)
              .labelFields(labelFields)
              .labelsLimit(labelsLimit)
              .lists(lists)
              .listFields(listFields)
              .memberships(memberships)
              .membershipsMember(membershipsMember)
              .membershipsMemberFields(membershipsMemberFields)
              .members(members)
              .memberFields(memberFields)
              .membersInvited(membersInvited)
              .membersInvitedFields(membersInvitedFields)
              .checklists(checklists)
              .checklistFields(checklistFields)
              .organization(organization)
              .organizationFields(organizationFields)
              .organizationMemberships(organizationMemberships)
              .myPrefs(myPrefs)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getById(idBoard)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsFormat(actionsFormat)
              .actionsSince(actionsSince)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionMember(actionMember)
              .actionMemberFields(actionMemberFields)
              .actionMemberCreator(actionMemberCreator)
              .actionMemberCreatorFields(actionMemberCreatorFields)
              .cards(cards)
              .cardFields(cardFields)
              .cardAttachments(cardAttachments)
              .cardAttachmentFields(cardAttachmentFields)
              .cardChecklists(cardChecklists)
              .cardStickers(cardStickers)
              .boardStars(boardStars)
              .labels(labels)
              .labelFields(labelFields)
              .labelsLimit(labelsLimit)
              .lists(lists)
              .listFields(listFields)
              .memberships(memberships)
              .membershipsMember(membershipsMember)
              .membershipsMemberFields(membershipsMemberFields)
              .members(members)
              .memberFields(memberFields)
              .membersInvited(membersInvited)
              .membersInvitedFields(membersInvitedFields)
              .checklists(checklists)
              .checklistFields(checklistFields)
              .organization(organization)
              .organizationFields(organizationFields)
              .organizationMemberships(organizationMemberships)
              .myPrefs(myPrefs)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getById");
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
| **idBoard** | **String**| board_id | |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **actionsEntities** | **String**|  true or false | [optional] |
| **actionsDisplay** | **String**|  true or false | [optional] |
| **actionsFormat** | **String**| One of: count, list or minimal | [optional] [default to list] |
| **actionsSince** | **String**| A date, null or lastView | [optional] |
| **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **actionMember** | **String**|  true or false | [optional] |
| **actionMemberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **actionMemberCreator** | **String**|  true or false | [optional] |
| **actionMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **cardAttachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **cardAttachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |
| **cardChecklists** | **String**| One of: all or none | [optional] [default to none] |
| **cardStickers** | **String**|  true or false | [optional] |
| **boardStars** | **String**| One of: mine or none | [optional] [default to none] |
| **labels** | **String**| One of: all or none | [optional] [default to none] |
| **labelFields** | **String**| all or a comma-separated list of: color, idBoard, name or uses | [optional] [default to all] |
| **labelsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **lists** | **String**| One of: all, closed, none or open | [optional] [default to none] |
| **listFields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all] |
| **memberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none] |
| **membershipsMember** | **String**|  true or false | [optional] |
| **membershipsMemberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username] |
| **members** | **String**| One of: admins, all, none, normal or owners | [optional] [default to none] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName, username and confirmed] |
| **membersInvited** | **String**| One of: admins, all, none, normal or owners | [optional] [default to none] |
| **membersInvitedFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName and username] |
| **checklists** | **String**| One of: all or none | [optional] [default to none] |
| **checklistFields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all] |
| **organization** | **String**|  true or false | [optional] |
| **organizationFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to name and displayName] |
| **organizationMemberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none] |
| **myPrefs** | **String**|  true or false | [optional] |
| **fields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, descData, closed, idOrganization, pinned, url, shortUrl, prefs and labelNames] |

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
> getByIdField(idBoard, field).execute();

getBoardsByIdBoardByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String field = "field_example"; // field
    try {
      client
              .board
              .getByIdField(idBoard, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getByIdField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getByIdField(idBoard, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getByIdField");
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
| **idBoard** | **String**| board_id | |
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

<a name="getCardsByIdBoard"></a>
# **getCardsByIdBoard**
> getCardsByIdBoard(idBoard).actions(actions).attachments(attachments).attachmentFields(attachmentFields).stickers(stickers).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checklists(checklists).limit(limit).since(since).before(before).filter(filter).fields(fields).execute();

getBoardsCardsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
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
    String filter = "visible"; // One of: all, closed, none, open or visible
    String fields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    try {
      client
              .board
              .getCardsByIdBoard(idBoard)
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
      System.err.println("Exception when calling BoardApi#getCardsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getCardsByIdBoard(idBoard)
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
      System.err.println("Exception when calling BoardApi#getCardsByIdBoard");
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
| **idBoard** | **String**| board_id | |
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
| **filter** | **String**| One of: all, closed, none, open or visible | [optional] [default to visible] |
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

<a name="getCardsByIdBoardByIdCard"></a>
# **getCardsByIdBoardByIdCard**
> getCardsByIdBoardByIdCard(idBoard, idCard).attachments(attachments).attachmentFields(attachmentFields).actions(actions).actionsEntities(actionsEntities).actionsDisplay(actionsDisplay).actionsLimit(actionsLimit).actionFields(actionFields).actionMemberCreatorFields(actionMemberCreatorFields).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checkItemStateFields(checkItemStateFields).labels(labels).checklists(checklists).checklistFields(checklistFields).fields(fields).execute();

getBoardsCardsByIdBoardByIdCard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idCard = "idCard_example"; // idCard
    String attachments = "attachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String attachmentFields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String actionsEntities = "actionsEntities_example"; //  true or false
    String actionsDisplay = "actionsDisplay_example"; //  true or false
    String actionsLimit = "50"; // a number from 0 to 1000
    String actionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String actionMemberCreatorFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String members = "members_example"; //  true or false
    String memberFields = "avatarHash, initials, fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String checkItemStates = "checkItemStates_example"; //  true or false
    String checkItemStateFields = "all"; // all or a comma-separated list of: idCheckItem or state
    String labels = "labels_example"; //  true or false
    String checklists = "none"; // One of: all or none
    String checklistFields = "all"; // all or a comma-separated list of: idBoard, idCard, name or pos
    String fields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    try {
      client
              .board
              .getCardsByIdBoardByIdCard(idBoard, idCard)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionMemberCreatorFields(actionMemberCreatorFields)
              .members(members)
              .memberFields(memberFields)
              .checkItemStates(checkItemStates)
              .checkItemStateFields(checkItemStateFields)
              .labels(labels)
              .checklists(checklists)
              .checklistFields(checklistFields)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getCardsByIdBoardByIdCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getCardsByIdBoardByIdCard(idBoard, idCard)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionMemberCreatorFields(actionMemberCreatorFields)
              .members(members)
              .memberFields(memberFields)
              .checkItemStates(checkItemStates)
              .checkItemStateFields(checkItemStateFields)
              .labels(labels)
              .checklists(checklists)
              .checklistFields(checklistFields)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getCardsByIdBoardByIdCard");
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
| **idBoard** | **String**| board_id | |
| **idCard** | **String**| idCard | |
| **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **actionsEntities** | **String**|  true or false | [optional] |
| **actionsDisplay** | **String**|  true or false | [optional] |
| **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **actionMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **members** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName and username] |
| **checkItemStates** | **String**|  true or false | [optional] |
| **checkItemStateFields** | **String**| all or a comma-separated list of: idCheckItem or state | [optional] [default to all] |
| **labels** | **String**|  true or false | [optional] |
| **checklists** | **String**| One of: all or none | [optional] [default to none] |
| **checklistFields** | **String**| all or a comma-separated list of: idBoard, idCard, name or pos | [optional] [default to all] |
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

<a name="getChecklistsById"></a>
# **getChecklistsById**
> getChecklistsById(idBoard).cards(cards).cardFields(cardFields).checkItems(checkItems).checkItemFields(checkItemFields).filter(filter).fields(fields).execute();

getBoardsChecklistsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String cards = "none"; // One of: all, closed, none, open or visible
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String checkItems = "all"; // One of: all or none
    String checkItemFields = "name, nameData, pos and state"; // all or a comma-separated list of: name, nameData, pos, state or type
    String filter = "all"; // One of: all or none
    String fields = "all"; // all or a comma-separated list of: idBoard, idCard, name or pos
    try {
      client
              .board
              .getChecklistsById(idBoard)
              .cards(cards)
              .cardFields(cardFields)
              .checkItems(checkItems)
              .checkItemFields(checkItemFields)
              .filter(filter)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getChecklistsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getChecklistsById(idBoard)
              .cards(cards)
              .cardFields(cardFields)
              .checkItems(checkItems)
              .checkItemFields(checkItemFields)
              .filter(filter)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getChecklistsById");
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
| **idBoard** | **String**| board_id | |
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

<a name="getDeltasByIdBoard"></a>
# **getDeltasByIdBoard**
> getDeltasByIdBoard(idBoard, tags, ixLastUpdate).execute();

getBoardsDeltasByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String tags = "tags_example"; // A valid tag for subscribing
    String ixLastUpdate = "ixLastUpdate_example"; // a number from -1 to Infinity
    try {
      client
              .board
              .getDeltasByIdBoard(idBoard, tags, ixLastUpdate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getDeltasByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getDeltasByIdBoard(idBoard, tags, ixLastUpdate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getDeltasByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **tags** | **String**| A valid tag for subscribing | |
| **ixLastUpdate** | **String**| a number from -1 to Infinity | |

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

<a name="getLabelsByIdBoardByIdLabel"></a>
# **getLabelsByIdBoardByIdLabel**
> getLabelsByIdBoardByIdLabel(idBoard, idLabel).fields(fields).execute();

getBoardsLabelsByIdBoardByIdLabel()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idLabel = "idLabel_example"; // idLabel
    String fields = "all"; // all or a comma-separated list of: color, idBoard, name or uses
    try {
      client
              .board
              .getLabelsByIdBoardByIdLabel(idBoard, idLabel)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getLabelsByIdBoardByIdLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getLabelsByIdBoardByIdLabel(idBoard, idLabel)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getLabelsByIdBoardByIdLabel");
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
| **idBoard** | **String**| board_id | |
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

<a name="getListsByFilter"></a>
# **getListsByFilter**
> getListsByFilter(idBoard, filter).execute();

getBoardsListsByIdBoardByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String filter = "filter_example"; // filter
    try {
      client
              .board
              .getListsByFilter(idBoard, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getListsByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getListsByFilter(idBoard, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getListsByFilter");
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
| **idBoard** | **String**| board_id | |
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

<a name="getListsByIdBoard"></a>
# **getListsByIdBoard**
> getListsByIdBoard(idBoard).cards(cards).cardFields(cardFields).filter(filter).fields(fields).execute();

getBoardsListsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String cards = "none"; // One of: all, closed, none, open or visible
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String filter = "open"; // One of: all, closed, none or open
    String fields = "all"; // all or a comma-separated list of: closed, idBoard, name, pos or subscribed
    try {
      client
              .board
              .getListsByIdBoard(idBoard)
              .cards(cards)
              .cardFields(cardFields)
              .filter(filter)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getListsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getListsByIdBoard(idBoard)
              .cards(cards)
              .cardFields(cardFields)
              .filter(filter)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getListsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **filter** | **String**| One of: all, closed, none or open | [optional] [default to open] |
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

<a name="getMembersByFilter"></a>
# **getMembersByFilter**
> getMembersByFilter(idBoard, filter).execute();

getBoardsMembersByIdBoardByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String filter = "filter_example"; // filter
    try {
      client
              .board
              .getMembersByFilter(idBoard, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembersByFilter(idBoard, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersByFilter");
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
| **idBoard** | **String**| board_id | |
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

<a name="getMembersByIdBoard"></a>
# **getMembersByIdBoard**
> getMembersByIdBoard(idBoard).filter(filter).fields(fields).activity(activity).execute();

getBoardsMembersByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String filter = "all"; // One of: admins, all, none, normal or owners
    String fields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String activity = "activity_example"; // true or false ; works for premium organizations only.
    try {
      client
              .board
              .getMembersByIdBoard(idBoard)
              .filter(filter)
              .fields(fields)
              .activity(activity)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembersByIdBoard(idBoard)
              .filter(filter)
              .fields(fields)
              .activity(activity)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **filter** | **String**| One of: admins, all, none, normal or owners | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username] |
| **activity** | **String**| true or false ; works for premium organizations only. | [optional] |

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

<a name="getMembersCardsByIdBoardByIdMember"></a>
# **getMembersCardsByIdBoardByIdMember**
> getMembersCardsByIdBoardByIdMember(idBoard, idMember).actions(actions).attachments(attachments).attachmentFields(attachmentFields).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checklists(checklists).board(board).boardFields(boardFields).list(list).listFields(listFields).filter(filter).fields(fields).execute();

getBoardsMembersCardsByIdBoardByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idMember = "idMember_example"; // idMember
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String attachments = "attachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String attachmentFields = "all"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String members = "members_example"; //  true or false
    String memberFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String checkItemStates = "checkItemStates_example"; //  true or false
    String checklists = "none"; // One of: all or none
    String board = "board_example"; //  true or false
    String boardFields = "name, desc, closed, idOrganization, pinned, url and prefs"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String list = "list_example"; //  true or false
    String listFields = "all"; // all or a comma-separated list of: closed, idBoard, name, pos or subscribed
    String filter = "visible"; // One of: all, closed, none, open or visible
    String fields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    try {
      client
              .board
              .getMembersCardsByIdBoardByIdMember(idBoard, idMember)
              .actions(actions)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .members(members)
              .memberFields(memberFields)
              .checkItemStates(checkItemStates)
              .checklists(checklists)
              .board(board)
              .boardFields(boardFields)
              .list(list)
              .listFields(listFields)
              .filter(filter)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersCardsByIdBoardByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembersCardsByIdBoardByIdMember(idBoard, idMember)
              .actions(actions)
              .attachments(attachments)
              .attachmentFields(attachmentFields)
              .members(members)
              .memberFields(memberFields)
              .checkItemStates(checkItemStates)
              .checklists(checklists)
              .board(board)
              .boardFields(boardFields)
              .list(list)
              .listFields(listFields)
              .filter(filter)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersCardsByIdBoardByIdMember");
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
| **idBoard** | **String**| board_id | |
| **idMember** | **String**| idMember | |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **attachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **attachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to all] |
| **members** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **checkItemStates** | **String**|  true or false | [optional] |
| **checklists** | **String**| One of: all or none | [optional] [default to none] |
| **board** | **String**|  true or false | [optional] |
| **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, desc, closed, idOrganization, pinned, url and prefs] |
| **list** | **String**|  true or false | [optional] |
| **listFields** | **String**| all or a comma-separated list of: closed, idBoard, name, pos or subscribed | [optional] [default to all] |
| **filter** | **String**| One of: all, closed, none, open or visible | [optional] [default to visible] |
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

<a name="getMembersInvitedByField"></a>
# **getMembersInvitedByField**
> getMembersInvitedByField(idBoard, field).execute();

getBoardsMembersInvitedByIdBoardByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String field = "field_example"; // field
    try {
      client
              .board
              .getMembersInvitedByField(idBoard, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersInvitedByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembersInvitedByField(idBoard, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersInvitedByField");
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
| **idBoard** | **String**| board_id | |
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

<a name="getMembersInvitedByIdBoard"></a>
# **getMembersInvitedByIdBoard**
> getMembersInvitedByIdBoard(idBoard).fields(fields).execute();

getBoardsMembersInvitedByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String fields = "all"; // all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username
    try {
      client
              .board
              .getMembersInvitedByIdBoard(idBoard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersInvitedByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembersInvitedByIdBoard(idBoard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembersInvitedByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **fields** | **String**| all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username | [optional] [default to all] |

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

<a name="getMembershipsByIdBoard"></a>
# **getMembershipsByIdBoard**
> getMembershipsByIdBoard(idBoard).filter(filter).member(member).memberFields(memberFields).execute();

getBoardsMembershipsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String filter = "all"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String member = "member_example"; //  true or false
    String memberFields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .board
              .getMembershipsByIdBoard(idBoard)
              .filter(filter)
              .member(member)
              .memberFields(memberFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembershipsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembershipsByIdBoard(idBoard)
              .filter(filter)
              .member(member)
              .memberFields(memberFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembershipsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **filter** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to all] |
| **member** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username] |

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

<a name="getMembershipsByIdBoardByIdMembership"></a>
# **getMembershipsByIdBoardByIdMembership**
> getMembershipsByIdBoardByIdMembership(idBoard, idMembership).member(member).memberFields(memberFields).execute();

getBoardsMembershipsByIdBoardByIdMembership()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idMembership = "idMembership_example"; // idMembership
    String member = "member_example"; //  true or false
    String memberFields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .board
              .getMembershipsByIdBoardByIdMembership(idBoard, idMembership)
              .member(member)
              .memberFields(memberFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembershipsByIdBoardByIdMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMembershipsByIdBoardByIdMembership(idBoard, idMembership)
              .member(member)
              .memberFields(memberFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMembershipsByIdBoardByIdMembership");
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
| **idBoard** | **String**| board_id | |
| **idMembership** | **String**| idMembership | |
| **member** | **String**|  true or false | [optional] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username] |

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

<a name="getMyPrefsById"></a>
# **getMyPrefsById**
> getMyPrefsById(idBoard).execute();

getBoardsMyPrefsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    try {
      client
              .board
              .getMyPrefsById(idBoard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMyPrefsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getMyPrefsById(idBoard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getMyPrefsById");
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
| **idBoard** | **String**| board_id | |

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

<a name="getOrganizationById"></a>
# **getOrganizationById**
> getOrganizationById(idBoard).fields(fields).execute();

getBoardsOrganizationByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String fields = "all"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    try {
      client
              .board
              .getOrganizationById(idBoard)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getOrganizationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getOrganizationById(idBoard)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getOrganizationById");
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
| **idBoard** | **String**| board_id | |
| **fields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to all] |

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

<a name="getOrganizationByIdBoardByField"></a>
# **getOrganizationByIdBoardByField**
> getOrganizationByIdBoardByField(idBoard, field).execute();

getBoardsOrganizationByIdBoardByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String field = "field_example"; // field
    try {
      client
              .board
              .getOrganizationByIdBoardByField(idBoard, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getOrganizationByIdBoardByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .getOrganizationByIdBoardByField(idBoard, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#getOrganizationByIdBoardByField");
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
| **idBoard** | **String**| board_id | |
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

<a name="listActionsByIdBoard"></a>
# **listActionsByIdBoard**
> listActionsByIdBoard(idBoard).entities(entities).display(display).filter(filter).fields(fields).limit(limit).format(format).since(since).before(before).page(page).idModels(idModels).member(member).memberFields(memberFields).memberCreator(memberCreator).memberCreatorFields(memberCreatorFields).execute();

getBoardsActionsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
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
              .board
              .listActionsByIdBoard(idBoard)
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
      System.err.println("Exception when calling BoardApi#listActionsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .listActionsByIdBoard(idBoard)
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
      System.err.println("Exception when calling BoardApi#listActionsByIdBoard");
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
| **idBoard** | **String**| board_id | |
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

<a name="listLabelsByIdBoard"></a>
# **listLabelsByIdBoard**
> listLabelsByIdBoard(idBoard).fields(fields).limit(limit).execute();

getBoardsLabelsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String fields = "all"; // all or a comma-separated list of: color, idBoard, name or uses
    String limit = "50"; // a number from 0 to 1000
    try {
      client
              .board
              .listLabelsByIdBoard(idBoard)
              .fields(fields)
              .limit(limit)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#listLabelsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .listLabelsByIdBoard(idBoard)
              .fields(fields)
              .limit(limit)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#listLabelsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **fields** | **String**| all or a comma-separated list of: color, idBoard, name or uses | [optional] [default to all] |
| **limit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |

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

<a name="markAsViewedByIdBoard"></a>
# **markAsViewedByIdBoard**
> markAsViewedByIdBoard(idBoard).execute();

addBoardsMarkAsViewedByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    try {
      client
              .board
              .markAsViewedByIdBoard(idBoard)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#markAsViewedByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .markAsViewedByIdBoard(idBoard)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#markAsViewedByIdBoard");
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
| **idBoard** | **String**| board_id | |

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

<a name="removeMember"></a>
# **removeMember**
> removeMember(idBoard, idMember).execute();

deleteBoardsMembersByIdBoardByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idMember = "idMember_example"; // idMember
    try {
      client
              .board
              .removeMember(idBoard, idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#removeMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .removeMember(idBoard, idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#removeMember");
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
| **idBoard** | **String**| board_id | |
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

<a name="removePowerUp"></a>
# **removePowerUp**
> removePowerUp(idBoard, powerUp).execute();

deleteBoardsPowerUpsByIdBoardByPowerUp()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String powerUp = "powerUp_example"; // powerUp
    try {
      client
              .board
              .removePowerUp(idBoard, powerUp)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#removePowerUp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .removePowerUp(idBoard, powerUp)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#removePowerUp");
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
| **idBoard** | **String**| board_id | |
| **powerUp** | **String**| powerUp | |

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

<a name="updateById"></a>
# **updateById**
> updateById(idBoard, boards).execute();

updateBoardsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String closed = "closed_example"; //  true or false
    String desc = "desc_example"; // a string with a length from 0 to 16384
    String idBoardSource = "idBoardSource_example"; // The id of the board to copy into the new board
    String idOrganization = "idOrganization_example"; // The id or name of the organization to add the board to.
    String keepFromSource = "keepFromSource_example"; // Components of the source board to copy.
    String labelNamesBlue = "labelNamesBlue_example"; // a string with a length from 0 to 16384
    String labelNamesGreen = "labelNamesGreen_example"; // a string with a length from 0 to 16384
    String labelNamesOrange = "labelNamesOrange_example"; // a string with a length from 0 to 16384
    String labelNamesPurple = "labelNamesPurple_example"; // a string with a length from 0 to 16384
    String labelNamesRed = "labelNamesRed_example"; // a string with a length from 0 to 16384
    String labelNamesYellow = "labelNamesYellow_example"; // a string with a length from 0 to 16384
    String name = "name_example"; // a string with a length from 1 to 16384
    String powerUps = "powerUps_example"; // all or a comma-separated list of: calendar, cardAging, recap or voting
    String prefsBackground = "prefsBackground_example"; // A standard background name, or the id of a custom background
    String prefsCalendarFeedEnabled = "prefsCalendarFeedEnabled_example"; //  true or false
    String prefsCardAging = "prefsCardAging_example"; // One of: pirate or regular
    String prefsCardCovers = "prefsCardCovers_example"; //  true or false
    String prefsComments = "prefsComments_example"; // One of: disabled, members, observers, org or public
    String prefsInvitations = "prefsInvitations_example"; // One of: admins or members
    String prefsPermissionLevel = "prefsPermissionLevel_example"; // One of: org, private or public
    String prefsSelfJoin = "prefsSelfJoin_example"; //  true or false
    String prefsVoting = "prefsVoting_example"; // One of: disabled, members, observers, org or public
    String prefsBackground = "prefsBackground_example"; // a string with a length from 0 to 16384
    String prefsCardAging = "prefsCardAging_example"; // One of: pirate or regular
    String prefsCardCovers = "prefsCardCovers_example"; //  true or false
    String prefsComments = "prefsComments_example"; // One of: disabled, members, observers, org or public
    String prefsInvitations = "prefsInvitations_example"; // One of: admins or members
    String prefsPermissionLevel = "prefsPermissionLevel_example"; // One of: org, private or public
    String prefsSelfJoin = "prefsSelfJoin_example"; //  true or false
    String prefsVoting = "prefsVoting_example"; // One of: disabled, members, observers, org or public
    String subscribed = "subscribed_example"; //  true or false
    try {
      client
              .board
              .updateById(idBoard)
              .closed(closed)
              .desc(desc)
              .idBoardSource(idBoardSource)
              .idOrganization(idOrganization)
              .keepFromSource(keepFromSource)
              .labelNamesBlue(labelNamesBlue)
              .labelNamesGreen(labelNamesGreen)
              .labelNamesOrange(labelNamesOrange)
              .labelNamesPurple(labelNamesPurple)
              .labelNamesRed(labelNamesRed)
              .labelNamesYellow(labelNamesYellow)
              .name(name)
              .powerUps(powerUps)
              .prefsBackground(prefsBackground)
              .prefsCalendarFeedEnabled(prefsCalendarFeedEnabled)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .prefsBackground(prefsBackground)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .subscribed(subscribed)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateById(idBoard)
              .closed(closed)
              .desc(desc)
              .idBoardSource(idBoardSource)
              .idOrganization(idOrganization)
              .keepFromSource(keepFromSource)
              .labelNamesBlue(labelNamesBlue)
              .labelNamesGreen(labelNamesGreen)
              .labelNamesOrange(labelNamesOrange)
              .labelNamesPurple(labelNamesPurple)
              .labelNamesRed(labelNamesRed)
              .labelNamesYellow(labelNamesYellow)
              .name(name)
              .powerUps(powerUps)
              .prefsBackground(prefsBackground)
              .prefsCalendarFeedEnabled(prefsCalendarFeedEnabled)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .prefsBackground(prefsBackground)
              .prefsCardAging(prefsCardAging)
              .prefsCardCovers(prefsCardCovers)
              .prefsComments(prefsComments)
              .prefsInvitations(prefsInvitations)
              .prefsPermissionLevel(prefsPermissionLevel)
              .prefsSelfJoin(prefsSelfJoin)
              .prefsVoting(prefsVoting)
              .subscribed(subscribed)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateById");
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
| **idBoard** | **String**| board_id | |
| **boards** | [**Boards**](Boards.md)| Attributes of \&quot;Boards\&quot; to be updated. | |

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
> updateClosedById(idBoard, boardsClosed).execute();

updateBoardsClosedByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updateClosedById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateClosedById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateClosedById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateClosedById");
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
| **idBoard** | **String**| board_id | |
| **boardsClosed** | [**BoardsClosed**](BoardsClosed.md)| Attributes of \&quot;Boards Closed\&quot; to be updated. | |

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

<a name="updateDescriptionByIdBoard"></a>
# **updateDescriptionByIdBoard**
> updateDescriptionByIdBoard(idBoard, boardsDesc).execute();

updateBoardsDescByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateDescriptionByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateDescriptionByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateDescriptionByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateDescriptionByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **boardsDesc** | [**BoardsDesc**](BoardsDesc.md)| Attributes of \&quot;Boards Desc\&quot; to be updated. | |

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

<a name="updateLabelNamesBlueById"></a>
# **updateLabelNamesBlueById**
> updateLabelNamesBlueById(idBoard, labelNamesBlue).execute();

updateBoardsLabelNamesBlueByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateLabelNamesBlueById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesBlueById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateLabelNamesBlueById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesBlueById");
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
| **idBoard** | **String**| board_id | |
| **labelNamesBlue** | [**LabelNamesBlue**](LabelNamesBlue.md)| Attributes of \&quot;Label Names Blue\&quot; to be updated. | |

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

<a name="updateLabelNamesGreenByIdBoardPut"></a>
# **updateLabelNamesGreenByIdBoardPut**
> updateLabelNamesGreenByIdBoardPut(idBoard, labelNamesGreen).execute();

updateBoardsLabelNamesGreenByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateLabelNamesGreenByIdBoardPut(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesGreenByIdBoardPut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateLabelNamesGreenByIdBoardPut(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesGreenByIdBoardPut");
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
| **idBoard** | **String**| board_id | |
| **labelNamesGreen** | [**LabelNamesGreen**](LabelNamesGreen.md)| Attributes of \&quot;Label Names Green\&quot; to be updated. | |

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

<a name="updateLabelNamesOrangeByIdBoard"></a>
# **updateLabelNamesOrangeByIdBoard**
> updateLabelNamesOrangeByIdBoard(idBoard, labelNamesOrange).execute();

updateBoardsLabelNamesOrangeByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateLabelNamesOrangeByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesOrangeByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateLabelNamesOrangeByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesOrangeByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **labelNamesOrange** | [**LabelNamesOrange**](LabelNamesOrange.md)| Attributes of \&quot;Label Names Orange\&quot; to be updated. | |

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

<a name="updateLabelNamesPurpleByIdBoard"></a>
# **updateLabelNamesPurpleByIdBoard**
> updateLabelNamesPurpleByIdBoard(idBoard, labelNamesPurple).execute();

updateBoardsLabelNamesPurpleByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateLabelNamesPurpleByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesPurpleByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateLabelNamesPurpleByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesPurpleByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **labelNamesPurple** | [**LabelNamesPurple**](LabelNamesPurple.md)| Attributes of \&quot;Label Names Purple\&quot; to be updated. | |

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

<a name="updateLabelNamesRed"></a>
# **updateLabelNamesRed**
> updateLabelNamesRed(idBoard, labelNamesRed).execute();

updateBoardsLabelNamesRedByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateLabelNamesRed(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesRed");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateLabelNamesRed(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesRed");
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
| **idBoard** | **String**| board_id | |
| **labelNamesRed** | [**LabelNamesRed**](LabelNamesRed.md)| Attributes of \&quot;Label Names Red\&quot; to be updated. | |

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

<a name="updateLabelNamesYellowByIdBoard"></a>
# **updateLabelNamesYellowByIdBoard**
> updateLabelNamesYellowByIdBoard(idBoard, labelNamesYellow).execute();

updateBoardsLabelNamesYellowByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateLabelNamesYellowByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesYellowByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateLabelNamesYellowByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateLabelNamesYellowByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **labelNamesYellow** | [**LabelNamesYellow**](LabelNamesYellow.md)| Attributes of \&quot;Label Names Yellow\&quot; to be updated. | |

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

<a name="updateMembersByIdBoard"></a>
# **updateMembersByIdBoard**
> updateMembersByIdBoard(idBoard, boardsMembers).execute();

updateBoardsMembersByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String email = "email_example"; // An email address
    String fullName = "fullName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String type = "type_example"; // One of: admin, normal or observer
    try {
      client
              .board
              .updateMembersByIdBoard(idBoard)
              .email(email)
              .fullName(fullName)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMembersByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMembersByIdBoard(idBoard)
              .email(email)
              .fullName(fullName)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMembersByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **boardsMembers** | [**BoardsMembers**](BoardsMembers.md)| Attributes of \&quot;Boards Members\&quot; to be updated. | |

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

<a name="updateMembersByIdBoardByIdMember"></a>
# **updateMembersByIdBoardByIdMember**
> updateMembersByIdBoardByIdMember(idBoard, idMember, boardsMembers).execute();

updateBoardsMembersByIdBoardByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idMember = "idMember_example"; // idMember
    String email = "email_example"; // An email address
    String fullName = "fullName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String type = "type_example"; // One of: admin, normal or observer
    try {
      client
              .board
              .updateMembersByIdBoardByIdMember(idBoard, idMember)
              .email(email)
              .fullName(fullName)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMembersByIdBoardByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMembersByIdBoardByIdMember(idBoard, idMember)
              .email(email)
              .fullName(fullName)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMembersByIdBoardByIdMember");
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
| **idBoard** | **String**| board_id | |
| **idMember** | **String**| idMember | |
| **boardsMembers** | [**BoardsMembers**](BoardsMembers.md)| Attributes of \&quot;Boards Members\&quot; to be updated. | |

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

<a name="updateMembershipsByIdBoardByIdMembership"></a>
# **updateMembershipsByIdBoardByIdMembership**
> updateMembershipsByIdBoardByIdMembership(idBoard, idMembership, boardsMemberships).execute();

updateBoardsMembershipsByIdBoardByIdMembership()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String idMembership = "idMembership_example"; // idMembership
    String memberFields = "memberFields_example"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String type = "type_example"; // One of: admin, normal or observer
    try {
      client
              .board
              .updateMembershipsByIdBoardByIdMembership(idBoard, idMembership)
              .memberFields(memberFields)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMembershipsByIdBoardByIdMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMembershipsByIdBoardByIdMembership(idBoard, idMembership)
              .memberFields(memberFields)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMembershipsByIdBoardByIdMembership");
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
| **idBoard** | **String**| board_id | |
| **idMembership** | **String**| idMembership | |
| **boardsMemberships** | [**BoardsMemberships**](BoardsMemberships.md)| Attributes of \&quot;Boards Memberships\&quot; to be updated. | |

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

<a name="updateMyPrefsEmailListByIdBoard"></a>
# **updateMyPrefsEmailListByIdBoard**
> updateMyPrefsEmailListByIdBoard(idBoard, myPrefsIdEmailList).execute();

updateBoardsMyPrefsIdEmailListByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // An id
    try {
      client
              .board
              .updateMyPrefsEmailListByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsEmailListByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMyPrefsEmailListByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsEmailListByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **myPrefsIdEmailList** | [**MyPrefsIdEmailList**](MyPrefsIdEmailList.md)| Attributes of \&quot;My Prefs Id Email List\&quot; to be updated. | |

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

<a name="updateMyPrefsEmailPositionByIdBoard"></a>
# **updateMyPrefsEmailPositionByIdBoard**
> updateMyPrefsEmailPositionByIdBoard(idBoard, myPrefsEmailPosition).execute();

updateBoardsMyPrefsEmailPositionByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: bottom or top
    try {
      client
              .board
              .updateMyPrefsEmailPositionByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsEmailPositionByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMyPrefsEmailPositionByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsEmailPositionByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **myPrefsEmailPosition** | [**MyPrefsEmailPosition**](MyPrefsEmailPosition.md)| Attributes of \&quot;My Prefs Email Position\&quot; to be updated. | |

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

<a name="updateMyPrefsShowListGuideByIdBoard"></a>
# **updateMyPrefsShowListGuideByIdBoard**
> updateMyPrefsShowListGuideByIdBoard(idBoard, myPrefsShowListGuide).execute();

updateBoardsMyPrefsShowListGuideByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updateMyPrefsShowListGuideByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowListGuideByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMyPrefsShowListGuideByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowListGuideByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **myPrefsShowListGuide** | [**MyPrefsShowListGuide**](MyPrefsShowListGuide.md)| Attributes of \&quot;My Prefs Show List Guide\&quot; to be updated. | |

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

<a name="updateMyPrefsShowSidebar"></a>
# **updateMyPrefsShowSidebar**
> updateMyPrefsShowSidebar(idBoard, myPrefsShowSidebar).execute();

updateBoardsMyPrefsShowSidebarByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updateMyPrefsShowSidebar(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowSidebar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMyPrefsShowSidebar(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowSidebar");
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
| **idBoard** | **String**| board_id | |
| **myPrefsShowSidebar** | [**MyPrefsShowSidebar**](MyPrefsShowSidebar.md)| Attributes of \&quot;My Prefs Show Sidebar\&quot; to be updated. | |

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

<a name="updateMyPrefsShowSidebarActionsByIdBoard"></a>
# **updateMyPrefsShowSidebarActionsByIdBoard**
> updateMyPrefsShowSidebarActionsByIdBoard(idBoard, myPrefsShowSidebarBoardActions).execute();

updateBoardsMyPrefsShowSidebarBoardActionsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updateMyPrefsShowSidebarActionsByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowSidebarActionsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMyPrefsShowSidebarActionsByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowSidebarActionsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **myPrefsShowSidebarBoardActions** | [**MyPrefsShowSidebarBoardActions**](MyPrefsShowSidebarBoardActions.md)| Attributes of \&quot;My Prefs Show Sidebar Board Actions\&quot; to be updated. | |

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

<a name="updateMyPrefsShowSidebarActivityByIdBoard"></a>
# **updateMyPrefsShowSidebarActivityByIdBoard**
> updateMyPrefsShowSidebarActivityByIdBoard(idBoard, myPrefsShowSidebarActivity).execute();

updateBoardsMyPrefsShowSidebarActivityByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updateMyPrefsShowSidebarActivityByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowSidebarActivityByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateMyPrefsShowSidebarActivityByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateMyPrefsShowSidebarActivityByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **myPrefsShowSidebarActivity** | [**MyPrefsShowSidebarActivity**](MyPrefsShowSidebarActivity.md)| Attributes of \&quot;My Prefs Show Sidebar Activity\&quot; to be updated. | |

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
> updateNameById(idBoard, boardsName).execute();

updateBoardsNameByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 1 to 16384
    try {
      client
              .board
              .updateNameById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateNameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateNameById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateNameById");
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
| **idBoard** | **String**| board_id | |
| **boardsName** | [**BoardsName**](BoardsName.md)| Attributes of \&quot;Boards Name\&quot; to be updated. | |

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

<a name="updateOrganizationByIdBoard"></a>
# **updateOrganizationByIdBoard**
> updateOrganizationByIdBoard(idBoard, boardsIdOrganization).execute();

updateBoardsIdOrganizationByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .board
              .updateOrganizationByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateOrganizationByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateOrganizationByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateOrganizationByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **boardsIdOrganization** | [**BoardsIdOrganization**](BoardsIdOrganization.md)| Attributes of \&quot;Boards Id Organization\&quot; to be updated. | |

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

<a name="updatePrefsBackgroundByIdBoard"></a>
# **updatePrefsBackgroundByIdBoard**
> updatePrefsBackgroundByIdBoard(idBoard, prefsBackground).execute();

updateBoardsPrefsBackgroundByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // A standard background name, or the id of a custom background
    try {
      client
              .board
              .updatePrefsBackgroundByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsBackgroundByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsBackgroundByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsBackgroundByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **prefsBackground** | [**PrefsBackground**](PrefsBackground.md)| Attributes of \&quot;Prefs Background\&quot; to be updated. | |

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

<a name="updatePrefsCalendarFeedEnabledById"></a>
# **updatePrefsCalendarFeedEnabledById**
> updatePrefsCalendarFeedEnabledById(idBoard, prefsCalendarFeedEnabled).execute();

updateBoardsPrefsCalendarFeedEnabledByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updatePrefsCalendarFeedEnabledById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCalendarFeedEnabledById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsCalendarFeedEnabledById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCalendarFeedEnabledById");
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
| **idBoard** | **String**| board_id | |
| **prefsCalendarFeedEnabled** | [**PrefsCalendarFeedEnabled**](PrefsCalendarFeedEnabled.md)| Attributes of \&quot;Prefs Calendar Feed Enabled\&quot; to be updated. | |

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

<a name="updatePrefsCardAgingByIdBoard"></a>
# **updatePrefsCardAgingByIdBoard**
> updatePrefsCardAgingByIdBoard(idBoard, prefsCardAging).execute();

updateBoardsPrefsCardAgingByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: pirate or regular
    try {
      client
              .board
              .updatePrefsCardAgingByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCardAgingByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsCardAgingByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCardAgingByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **prefsCardAging** | [**PrefsCardAging**](PrefsCardAging.md)| Attributes of \&quot;Prefs Card Aging\&quot; to be updated. | |

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

<a name="updatePrefsCardCoversByIdBoard"></a>
# **updatePrefsCardCoversByIdBoard**
> updatePrefsCardCoversByIdBoard(idBoard, prefsCardCovers).execute();

updateBoardsPrefsCardCoversByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updatePrefsCardCoversByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCardCoversByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsCardCoversByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCardCoversByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **prefsCardCovers** | [**PrefsCardCovers**](PrefsCardCovers.md)| Attributes of \&quot;Prefs Card Covers\&quot; to be updated. | |

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

<a name="updatePrefsCommentsByIdBoard"></a>
# **updatePrefsCommentsByIdBoard**
> updatePrefsCommentsByIdBoard(idBoard, prefsComments).execute();

updateBoardsPrefsCommentsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: disabled, members, observers, org or public
    try {
      client
              .board
              .updatePrefsCommentsByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCommentsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsCommentsByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsCommentsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **prefsComments** | [**PrefsComments**](PrefsComments.md)| Attributes of \&quot;Prefs Comments\&quot; to be updated. | |

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

<a name="updatePrefsInvitationsByIdBoard"></a>
# **updatePrefsInvitationsByIdBoard**
> updatePrefsInvitationsByIdBoard(idBoard, prefsInvitations).execute();

updateBoardsPrefsInvitationsByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: admins or members
    try {
      client
              .board
              .updatePrefsInvitationsByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsInvitationsByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsInvitationsByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsInvitationsByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **prefsInvitations** | [**PrefsInvitations**](PrefsInvitations.md)| Attributes of \&quot;Prefs Invitations\&quot; to be updated. | |

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

<a name="updatePrefsPermissionLevelById"></a>
# **updatePrefsPermissionLevelById**
> updatePrefsPermissionLevelById(idBoard, prefsPermissionLevel).execute();

updateBoardsPrefsPermissionLevelByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: private or public
    try {
      client
              .board
              .updatePrefsPermissionLevelById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsPermissionLevelById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsPermissionLevelById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsPermissionLevelById");
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
| **idBoard** | **String**| board_id | |
| **prefsPermissionLevel** | [**PrefsPermissionLevel**](PrefsPermissionLevel.md)| Attributes of \&quot;Prefs Permission Level\&quot; to be updated. | |

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

<a name="updatePrefsSelfJoinByIdBoard"></a>
# **updatePrefsSelfJoinByIdBoard**
> updatePrefsSelfJoinByIdBoard(idBoard, prefsSelfJoin).execute();

updateBoardsPrefsSelfJoinByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updatePrefsSelfJoinByIdBoard(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsSelfJoinByIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsSelfJoinByIdBoard(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsSelfJoinByIdBoard");
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
| **idBoard** | **String**| board_id | |
| **prefsSelfJoin** | [**PrefsSelfJoin**](PrefsSelfJoin.md)| Attributes of \&quot;Prefs Self Join\&quot; to be updated. | |

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

<a name="updatePrefsShowSidebarMembersById"></a>
# **updatePrefsShowSidebarMembersById**
> updatePrefsShowSidebarMembersById(idBoard, myPrefsShowSidebarMembers).execute();

updateBoardsMyPrefsShowSidebarMembersByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updatePrefsShowSidebarMembersById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsShowSidebarMembersById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updatePrefsShowSidebarMembersById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updatePrefsShowSidebarMembersById");
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
| **idBoard** | **String**| board_id | |
| **myPrefsShowSidebarMembers** | [**MyPrefsShowSidebarMembers**](MyPrefsShowSidebarMembers.md)| Attributes of \&quot;My Prefs Show Sidebar Members\&quot; to be updated. | |

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

<a name="updateSubscribedById"></a>
# **updateSubscribedById**
> updateSubscribedById(idBoard, boardsSubscribed).execute();

updateBoardsSubscribedByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; //  true or false
    try {
      client
              .board
              .updateSubscribedById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateSubscribedById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateSubscribedById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateSubscribedById");
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
| **idBoard** | **String**| board_id | |
| **boardsSubscribed** | [**BoardsSubscribed**](BoardsSubscribed.md)| Attributes of \&quot;Boards Subscribed\&quot; to be updated. | |

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

<a name="updateVotingPrefsById"></a>
# **updateVotingPrefsById**
> updateVotingPrefsById(idBoard, prefsVoting).execute();

updateBoardsPrefsVotingByIdBoard()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BoardApi;
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
    String idBoard = "idBoard_example"; // board_id
    String value = "value_example"; // One of: disabled, members, observers, org or public
    try {
      client
              .board
              .updateVotingPrefsById(idBoard)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateVotingPrefsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .board
              .updateVotingPrefsById(idBoard)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BoardApi#updateVotingPrefsById");
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
| **idBoard** | **String**| board_id | |
| **prefsVoting** | [**PrefsVoting**](PrefsVoting.md)| Attributes of \&quot;Prefs Voting\&quot; to be updated. | |

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

