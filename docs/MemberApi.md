# MemberApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBoardBackgrounds**](MemberApi.md#addBoardBackgrounds) | **POST** /members/{idMember}/boardBackgrounds | addMembersBoardBackgroundsByIdMember() |
| [**addBoardStarsByIdMember**](MemberApi.md#addBoardStarsByIdMember) | **POST** /members/{idMember}/boardStars | addMembersBoardStarsByIdMember() |
| [**addCustomBoardBackgrounds**](MemberApi.md#addCustomBoardBackgrounds) | **POST** /members/{idMember}/customBoardBackgrounds | addMembersCustomBoardBackgroundsByIdMember() |
| [**addCustomEmojiByIdMember**](MemberApi.md#addCustomEmojiByIdMember) | **POST** /members/{idMember}/customEmoji | addMembersCustomEmojiByIdMember() |
| [**addCustomStickers**](MemberApi.md#addCustomStickers) | **POST** /members/{idMember}/customStickers | addMembersCustomStickersByIdMember() |
| [**addOneTimeMessagesDismissedByIdMember**](MemberApi.md#addOneTimeMessagesDismissedByIdMember) | **POST** /members/{idMember}/oneTimeMessagesDismissed | addMembersOneTimeMessagesDismissedByIdMember() |
| [**createSavedSearch**](MemberApi.md#createSavedSearch) | **POST** /members/{idMember}/savedSearches | addMembersSavedSearchesByIdMember() |
| [**deleteBoardBackground**](MemberApi.md#deleteBoardBackground) | **DELETE** /members/{idMember}/boardBackgrounds/{idBoardBackground} | deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground() |
| [**getBoardBackgroundByIds**](MemberApi.md#getBoardBackgroundByIds) | **GET** /members/{idMember}/boardBackgrounds/{idBoardBackground} | getMembersBoardBackgroundsByIdMemberByIdBoardBackground() |
| [**getBoardBackgroundsById**](MemberApi.md#getBoardBackgroundsById) | **GET** /members/{idMember}/boardBackgrounds | getMembersBoardBackgroundsByIdMember() |
| [**getBoardStarByIdMember**](MemberApi.md#getBoardStarByIdMember) | **GET** /members/{idMember}/boardStars/{idBoardStar} | getMembersBoardStarsByIdMemberByIdBoardStar() |
| [**getBoardStarsById**](MemberApi.md#getBoardStarsById) | **GET** /members/{idMember}/boardStars | getMembersBoardStarsByIdMember() |
| [**getBoards**](MemberApi.md#getBoards) | **GET** /members/{idMember}/boards/{filter} | getMembersBoardsByIdMemberByFilter() |
| [**getBoardsByIdMember**](MemberApi.md#getBoardsByIdMember) | **GET** /members/{idMember}/boards | getMembersBoardsByIdMember() |
| [**getBoardsInvitedByIdMemberByField**](MemberApi.md#getBoardsInvitedByIdMemberByField) | **GET** /members/{idMember}/boardsInvited/{field} | getMembersBoardsInvitedByIdMemberByField() |
| [**getByField**](MemberApi.md#getByField) | **GET** /members/{idMember}/{field} | getMembersByIdMemberByField() |
| [**getById**](MemberApi.md#getById) | **GET** /members/{idMember} | getMembersByIdMember() |
| [**getCardsByFilter**](MemberApi.md#getCardsByFilter) | **GET** /members/{idMember}/cards/{filter} | getMembersCardsByIdMemberByFilter() |
| [**getCardsByIdMember**](MemberApi.md#getCardsByIdMember) | **GET** /members/{idMember}/cards | getMembersCardsByIdMember() |
| [**getCustomBoardBackgroundByIds**](MemberApi.md#getCustomBoardBackgroundByIds) | **GET** /members/{idMember}/customBoardBackgrounds/{idBoardBackground} | getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground() |
| [**getCustomBoardBackgroundsById**](MemberApi.md#getCustomBoardBackgroundsById) | **GET** /members/{idMember}/customBoardBackgrounds | getMembersCustomBoardBackgroundsByIdMember() |
| [**getCustomEmojiByIds**](MemberApi.md#getCustomEmojiByIds) | **GET** /members/{idMember}/customEmoji/{idCustomEmoji} | getMembersCustomEmojiByIdMemberByIdCustomEmoji() |
| [**getCustomStickerByIds**](MemberApi.md#getCustomStickerByIds) | **GET** /members/{idMember}/customStickers/{idCustomSticker} | getMembersCustomStickersByIdMemberByIdCustomSticker() |
| [**getCustomStickersByIdMember**](MemberApi.md#getCustomStickersByIdMember) | **GET** /members/{idMember}/customStickers | getMembersCustomStickersByIdMember() |
| [**getDeltasByIdMember**](MemberApi.md#getDeltasByIdMember) | **GET** /members/{idMember}/deltas | getMembersDeltasByIdMember() |
| [**getInvitedBoards**](MemberApi.md#getInvitedBoards) | **GET** /members/{idMember}/boardsInvited | getMembersBoardsInvitedByIdMember() |
| [**getNotificationsByIdMember**](MemberApi.md#getNotificationsByIdMember) | **GET** /members/{idMember}/notifications | getMembersNotificationsByIdMember() |
| [**getNotificationsByIdMemberByFilter**](MemberApi.md#getNotificationsByIdMemberByFilter) | **GET** /members/{idMember}/notifications/{filter} | getMembersNotificationsByIdMemberByFilter() |
| [**getOrganizations**](MemberApi.md#getOrganizations) | **GET** /members/{idMember}/organizations/{filter} | getMembersOrganizationsByIdMemberByFilter() |
| [**getSavedSearchByIds**](MemberApi.md#getSavedSearchByIds) | **GET** /members/{idMember}/savedSearches/{idSavedSearch} | getMembersSavedSearchesByIdMemberByIdSavedSearch() |
| [**getSavedSearchesByIdMember**](MemberApi.md#getSavedSearchesByIdMember) | **GET** /members/{idMember}/savedSearches | getMembersSavedSearchesByIdMember() |
| [**getTokensByIdMember**](MemberApi.md#getTokensByIdMember) | **GET** /members/{idMember}/tokens | getMembersTokensByIdMember() |
| [**listActionsByIdMember**](MemberApi.md#listActionsByIdMember) | **GET** /members/{idMember}/actions | getMembersActionsByIdMember() |
| [**listCustomEmojiByIdMember**](MemberApi.md#listCustomEmojiByIdMember) | **GET** /members/{idMember}/customEmoji | getMembersCustomEmojiByIdMember() |
| [**listInvitedOrganizationsById**](MemberApi.md#listInvitedOrganizationsById) | **GET** /members/{idMember}/organizationsInvited | getMembersOrganizationsInvitedByIdMember() |
| [**listOrganizationsById**](MemberApi.md#listOrganizationsById) | **GET** /members/{idMember}/organizations | getMembersOrganizationsByIdMember() |
| [**listOrganizationsInvitedByIdMemberByField**](MemberApi.md#listOrganizationsInvitedByIdMemberByField) | **GET** /members/{idMember}/organizationsInvited/{field} | getMembersOrganizationsInvitedByIdMemberByField() |
| [**removeBoardStarByIdMemberByIdBoardStar**](MemberApi.md#removeBoardStarByIdMemberByIdBoardStar) | **DELETE** /members/{idMember}/boardStars/{idBoardStar} | deleteMembersBoardStarsByIdMemberByIdBoardStar() |
| [**removeCustomBoardBackgroundById**](MemberApi.md#removeCustomBoardBackgroundById) | **DELETE** /members/{idMember}/customBoardBackgrounds/{idBoardBackground} | deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground() |
| [**removeCustomStickerByIds**](MemberApi.md#removeCustomStickerByIds) | **DELETE** /members/{idMember}/customStickers/{idCustomSticker} | deleteMembersCustomStickersByIdMemberByIdCustomSticker() |
| [**removeSavedSearchByIds**](MemberApi.md#removeSavedSearchByIds) | **DELETE** /members/{idMember}/savedSearches/{idSavedSearch} | deleteMembersSavedSearchesByIdMemberByIdSavedSearch() |
| [**updateAvatarSource**](MemberApi.md#updateAvatarSource) | **PUT** /members/{idMember}/avatarSource | updateMembersAvatarSourceByIdMember() |
| [**updateBioById**](MemberApi.md#updateBioById) | **PUT** /members/{idMember}/bio | updateMembersBioByIdMember() |
| [**updateBoardBackgroundsById**](MemberApi.md#updateBoardBackgroundsById) | **PUT** /members/{idMember}/boardBackgrounds/{idBoardBackground} | updateMembersBoardBackgroundsByIdMemberByIdBoardBackground() |
| [**updateBoardStar**](MemberApi.md#updateBoardStar) | **PUT** /members/{idMember}/boardStars/{idBoardStar} | updateMembersBoardStarsByIdMemberByIdBoardStar() |
| [**updateBoardStarPosByIdMemberByIdBoardStar**](MemberApi.md#updateBoardStarPosByIdMemberByIdBoardStar) | **PUT** /members/{idMember}/boardStars/{idBoardStar}/pos | updateMembersBoardStarsPosByIdMemberByIdBoardStar() |
| [**updateBoardStarsIdBoard**](MemberApi.md#updateBoardStarsIdBoard) | **PUT** /members/{idMember}/boardStars/{idBoardStar}/idBoard | updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar() |
| [**updateByIdMember**](MemberApi.md#updateByIdMember) | **PUT** /members/{idMember} | updateMembersByIdMember() |
| [**updateCustomBoardBackgrounds**](MemberApi.md#updateCustomBoardBackgrounds) | **PUT** /members/{idMember}/customBoardBackgrounds/{idBoardBackground} | updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground() |
| [**updateFullName**](MemberApi.md#updateFullName) | **PUT** /members/{idMember}/fullName | updateMembersFullNameByIdMember() |
| [**updateInitialsByIdMember**](MemberApi.md#updateInitialsByIdMember) | **PUT** /members/{idMember}/initials | updateMembersInitialsByIdMember() |
| [**updatePrefsColorBlindByIdMember**](MemberApi.md#updatePrefsColorBlindByIdMember) | **PUT** /members/{idMember}/prefs/colorBlind | updateMembersPrefsColorBlindByIdMember() |
| [**updatePrefsLocaleByIdMember**](MemberApi.md#updatePrefsLocaleByIdMember) | **PUT** /members/{idMember}/prefs/locale | updateMembersPrefsLocaleByIdMember() |
| [**updatePrefsMinutesBetweenSummariesById**](MemberApi.md#updatePrefsMinutesBetweenSummariesById) | **PUT** /members/{idMember}/prefs/minutesBetweenSummaries | updateMembersPrefsMinutesBetweenSummariesByIdMember() |
| [**updateSavedSearchQueryByIdMemberByIdSavedSearch**](MemberApi.md#updateSavedSearchQueryByIdMemberByIdSavedSearch) | **PUT** /members/{idMember}/savedSearches/{idSavedSearch}/query | updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch() |
| [**updateSavedSearchesByIdMemberByIdSavedSearch**](MemberApi.md#updateSavedSearchesByIdMemberByIdSavedSearch) | **PUT** /members/{idMember}/savedSearches/{idSavedSearch} | updateMembersSavedSearchesByIdMemberByIdSavedSearch() |
| [**updateSavedSearchesNameByIdMemberByIdSavedSearch**](MemberApi.md#updateSavedSearchesNameByIdMemberByIdSavedSearch) | **PUT** /members/{idMember}/savedSearches/{idSavedSearch}/name | updateMembersSavedSearchesNameByIdMemberByIdSavedSearch() |
| [**updateSavedSearchesPosByIdMemberByIdSavedSearch**](MemberApi.md#updateSavedSearchesPosByIdMemberByIdSavedSearch) | **PUT** /members/{idMember}/savedSearches/{idSavedSearch}/pos | updateMembersSavedSearchesPosByIdMemberByIdSavedSearch() |
| [**updateUsernameById**](MemberApi.md#updateUsernameById) | **PUT** /members/{idMember}/username | updateMembersUsernameByIdMember() |
| [**uploadAvatarById**](MemberApi.md#uploadAvatarById) | **POST** /members/{idMember}/avatar | addMembersAvatarByIdMember() |


<a name="addBoardBackgrounds"></a>
# **addBoardBackgrounds**
> addBoardBackgrounds(idMember, membersBoardBackgrounds).execute();

addMembersBoardBackgroundsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String brightness = "brightness_example"; // One of: dark, light or unknown
    String _file = "_file_example"; // A file
    String tile = "tile_example"; //  true or false
    try {
      client
              .member
              .addBoardBackgrounds(idMember)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addBoardBackgrounds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .addBoardBackgrounds(idMember)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addBoardBackgrounds");
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
| **idMember** | **String**| idMember or username | |
| **membersBoardBackgrounds** | [**MembersBoardBackgrounds**](MembersBoardBackgrounds.md)| Attributes of \&quot;Members Board Backgrounds\&quot; to be added. | |

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

<a name="addBoardStarsByIdMember"></a>
# **addBoardStarsByIdMember**
> addBoardStarsByIdMember(idMember, membersBoardStars).execute();

addMembersBoardStarsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoard = "idBoard_example"; // The id of the board to star
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .member
              .addBoardStarsByIdMember(idMember)
              .idBoard(idBoard)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addBoardStarsByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .addBoardStarsByIdMember(idMember)
              .idBoard(idBoard)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addBoardStarsByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **membersBoardStars** | [**MembersBoardStars**](MembersBoardStars.md)| Attributes of \&quot;Members Board Stars\&quot; to be added. | |

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

<a name="addCustomBoardBackgrounds"></a>
# **addCustomBoardBackgrounds**
> addCustomBoardBackgrounds(idMember, membersCustomBoardBackgrounds).execute();

addMembersCustomBoardBackgroundsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String brightness = "brightness_example"; // One of: dark, light or unknown
    String _file = "_file_example"; // A file
    String tile = "tile_example"; //  true or false
    try {
      client
              .member
              .addCustomBoardBackgrounds(idMember)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addCustomBoardBackgrounds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .addCustomBoardBackgrounds(idMember)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addCustomBoardBackgrounds");
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
| **idMember** | **String**| idMember or username | |
| **membersCustomBoardBackgrounds** | [**MembersCustomBoardBackgrounds**](MembersCustomBoardBackgrounds.md)| Attributes of \&quot;Members Custom Board Backgrounds\&quot; to be added. | |

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

<a name="addCustomEmojiByIdMember"></a>
# **addCustomEmojiByIdMember**
> addCustomEmojiByIdMember(idMember, membersCustomEmoji).execute();

addMembersCustomEmojiByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String _file = "_file_example"; // A file
    String name = "name_example"; // a string with a length from 2 to 64
    try {
      client
              .member
              .addCustomEmojiByIdMember(idMember)
              ._file(_file)
              .name(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addCustomEmojiByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .addCustomEmojiByIdMember(idMember)
              ._file(_file)
              .name(name)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addCustomEmojiByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **membersCustomEmoji** | [**MembersCustomEmoji**](MembersCustomEmoji.md)| Attributes of \&quot;Members Custom Emoji\&quot; to be added. | |

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

<a name="addCustomStickers"></a>
# **addCustomStickers**
> addCustomStickers(idMember, membersCustomStickers).execute();

addMembersCustomStickersByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String _file = "_file_example"; // A file
    try {
      client
              .member
              .addCustomStickers(idMember)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addCustomStickers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .addCustomStickers(idMember)
              ._file(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addCustomStickers");
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
| **idMember** | **String**| idMember or username | |
| **membersCustomStickers** | [**MembersCustomStickers**](MembersCustomStickers.md)| Attributes of \&quot;Members Custom Stickers\&quot; to be added. | |

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

<a name="addOneTimeMessagesDismissedByIdMember"></a>
# **addOneTimeMessagesDismissedByIdMember**
> addOneTimeMessagesDismissedByIdMember(idMember, membersOneTimeMessagesDismissed).execute();

addMembersOneTimeMessagesDismissedByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // Type of message dismissed
    try {
      client
              .member
              .addOneTimeMessagesDismissedByIdMember(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addOneTimeMessagesDismissedByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .addOneTimeMessagesDismissedByIdMember(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#addOneTimeMessagesDismissedByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **membersOneTimeMessagesDismissed** | [**MembersOneTimeMessagesDismissed**](MembersOneTimeMessagesDismissed.md)| Attributes of \&quot;Members One Time Messages Dismissed\&quot; to be added. | |

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

<a name="createSavedSearch"></a>
# **createSavedSearch**
> createSavedSearch(idMember, membersSavedSearches).execute();

addMembersSavedSearchesByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String name = "name_example"; // A non-empty string with at least one non-space character
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String query = "query_example"; // a string with a length from 1 to 16384
    try {
      client
              .member
              .createSavedSearch(idMember)
              .name(name)
              .pos(pos)
              .query(query)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#createSavedSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .createSavedSearch(idMember)
              .name(name)
              .pos(pos)
              .query(query)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#createSavedSearch");
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
| **idMember** | **String**| idMember or username | |
| **membersSavedSearches** | [**MembersSavedSearches**](MembersSavedSearches.md)| Attributes of \&quot;Members Saved Searches\&quot; to be added. | |

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

<a name="deleteBoardBackground"></a>
# **deleteBoardBackground**
> deleteBoardBackground(idMember, idBoardBackground).execute();

deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardBackground = "idBoardBackground_example"; // idBoardBackground
    try {
      client
              .member
              .deleteBoardBackground(idMember, idBoardBackground)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#deleteBoardBackground");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .deleteBoardBackground(idMember, idBoardBackground)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#deleteBoardBackground");
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
| **idMember** | **String**| idMember or username | |
| **idBoardBackground** | **String**| idBoardBackground | |

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

<a name="getBoardBackgroundByIds"></a>
# **getBoardBackgroundByIds**
> getBoardBackgroundByIds(idMember, idBoardBackground).fields(fields).execute();

getMembersBoardBackgroundsByIdMemberByIdBoardBackground()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardBackground = "idBoardBackground_example"; // idBoardBackground
    String fields = "all"; // all or a comma-separated list of: brightness, fullSizeUrl, scaled or tile
    try {
      client
              .member
              .getBoardBackgroundByIds(idMember, idBoardBackground)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardBackgroundByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoardBackgroundByIds(idMember, idBoardBackground)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardBackgroundByIds");
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
| **idMember** | **String**| idMember or username | |
| **idBoardBackground** | **String**| idBoardBackground | |
| **fields** | **String**| all or a comma-separated list of: brightness, fullSizeUrl, scaled or tile | [optional] [default to all] |

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

<a name="getBoardBackgroundsById"></a>
# **getBoardBackgroundsById**
> getBoardBackgroundsById(idMember).filter(filter).execute();

getMembersBoardBackgroundsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // One of: all, custom, default, none or premium
    try {
      client
              .member
              .getBoardBackgroundsById(idMember)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardBackgroundsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoardBackgroundsById(idMember)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardBackgroundsById");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| One of: all, custom, default, none or premium | [optional] [default to all] |

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

<a name="getBoardStarByIdMember"></a>
# **getBoardStarByIdMember**
> getBoardStarByIdMember(idMember, idBoardStar).execute();

getMembersBoardStarsByIdMemberByIdBoardStar()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardStar = "idBoardStar_example"; // idBoardStar
    try {
      client
              .member
              .getBoardStarByIdMember(idMember, idBoardStar)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardStarByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoardStarByIdMember(idMember, idBoardStar)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardStarByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **idBoardStar** | **String**| idBoardStar | |

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
> getBoardStarsById(idMember).execute();

getMembersBoardStarsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    try {
      client
              .member
              .getBoardStarsById(idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardStarsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoardStarsById(idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardStarsById");
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
| **idMember** | **String**| idMember or username | |

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

<a name="getBoards"></a>
# **getBoards**
> getBoards(idMember, filter).execute();

getMembersBoardsByIdMemberByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "filter_example"; // filter
    try {
      client
              .member
              .getBoards(idMember, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoards(idMember, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoards");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getBoardsByIdMember"></a>
# **getBoardsByIdMember**
> getBoardsByIdMember(idMember).filter(filter).fields(fields).actions(actions).actionsEntities(actionsEntities).actionsLimit(actionsLimit).actionsFormat(actionsFormat).actionsSince(actionsSince).actionFields(actionFields).memberships(memberships).organization(organization).organizationFields(organizationFields).lists(lists).execute();

getMembersBoardsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned
    String fields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String actionsEntities = "actionsEntities_example"; //  true or false
    String actionsLimit = "50"; // a number from 0 to 1000
    String actionsFormat = "list"; // One of: count, list or minimal
    String actionsSince = "actionsSince_example"; // A date, null or lastView
    String actionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String memberships = "none"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String organization = "organization_example"; //  true or false
    String organizationFields = "name and displayName"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String lists = "none"; // One of: all, closed, none or open
    try {
      client
              .member
              .getBoardsByIdMember(idMember)
              .filter(filter)
              .fields(fields)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsLimit(actionsLimit)
              .actionsFormat(actionsFormat)
              .actionsSince(actionsSince)
              .actionFields(actionFields)
              .memberships(memberships)
              .organization(organization)
              .organizationFields(organizationFields)
              .lists(lists)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardsByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoardsByIdMember(idMember)
              .filter(filter)
              .fields(fields)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsLimit(actionsLimit)
              .actionsFormat(actionsFormat)
              .actionsSince(actionsSince)
              .actionFields(actionFields)
              .memberships(memberships)
              .organization(organization)
              .organizationFields(organizationFields)
              .lists(lists)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardsByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to all] |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **actionsEntities** | **String**|  true or false | [optional] |
| **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **actionsFormat** | **String**| One of: count, list or minimal | [optional] [default to list] |
| **actionsSince** | **String**| A date, null or lastView | [optional] |
| **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **memberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none] |
| **organization** | **String**|  true or false | [optional] |
| **organizationFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to name and displayName] |
| **lists** | **String**| One of: all, closed, none or open | [optional] [default to none] |

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

<a name="getBoardsInvitedByIdMemberByField"></a>
# **getBoardsInvitedByIdMemberByField**
> getBoardsInvitedByIdMemberByField(idMember, field).execute();

getMembersBoardsInvitedByIdMemberByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String field = "field_example"; // field
    try {
      client
              .member
              .getBoardsInvitedByIdMemberByField(idMember, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardsInvitedByIdMemberByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getBoardsInvitedByIdMemberByField(idMember, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getBoardsInvitedByIdMemberByField");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getByField"></a>
# **getByField**
> getByField(idMember, field).execute();

getMembersByIdMemberByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String field = "field_example"; // field
    try {
      client
              .member
              .getByField(idMember, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getByField(idMember, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getByField");
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
| **idMember** | **String**| idMember or username | |
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
> getById(idMember).actions(actions).actionsEntities(actionsEntities).actionsDisplay(actionsDisplay).actionsLimit(actionsLimit).actionFields(actionFields).actionSince(actionSince).actionBefore(actionBefore).cards(cards).cardFields(cardFields).cardMembers(cardMembers).cardMemberFields(cardMemberFields).cardAttachments(cardAttachments).cardAttachmentFields(cardAttachmentFields).cardStickers(cardStickers).boards(boards).boardFields(boardFields).boardActions(boardActions).boardActionsEntities(boardActionsEntities).boardActionsDisplay(boardActionsDisplay).boardActionsFormat(boardActionsFormat).boardActionsSince(boardActionsSince).boardActionsLimit(boardActionsLimit).boardActionFields(boardActionFields).boardLists(boardLists).boardMemberships(boardMemberships).boardOrganization(boardOrganization).boardOrganizationFields(boardOrganizationFields).boardsInvited(boardsInvited).boardsInvitedFields(boardsInvitedFields).boardStars(boardStars).savedSearches(savedSearches).organizations(organizations).organizationFields(organizationFields).organizationPaidAccount(organizationPaidAccount).organizationsInvited(organizationsInvited).organizationsInvitedFields(organizationsInvitedFields).notifications(notifications).notificationsEntities(notificationsEntities).notificationsDisplay(notificationsDisplay).notificationsLimit(notificationsLimit).notificationFields(notificationFields).notificationMemberCreator(notificationMemberCreator).notificationMemberCreatorFields(notificationMemberCreatorFields).notificationBefore(notificationBefore).notificationSince(notificationSince).tokens(tokens).paidAccount(paidAccount).boardBackgrounds(boardBackgrounds).customBoardBackgrounds(customBoardBackgrounds).customStickers(customStickers).customEmoji(customEmoji).fields(fields).execute();

getMembersByIdMember()

If you specify &#39;me&#39; as the username, this call will respond as if you had supplied the username associated with the supplied token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String actionsEntities = "actionsEntities_example"; //  true or false
    String actionsDisplay = "actionsDisplay_example"; //  true or false
    String actionsLimit = "50"; // a number from 0 to 1000
    String actionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String actionSince = "actionSince_example"; // A date, null or lastView
    String actionBefore = "actionBefore_example"; // A date, or null
    String cards = "none"; // One of: all, closed, none, open or visible
    String cardFields = "all"; // all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url
    String cardMembers = "cardMembers_example"; //  true or false
    String cardMemberFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String cardAttachments = "cardAttachments_example"; // A boolean value or &quot;cover&quot; for only card cover attachments
    String cardAttachmentFields = "url and previews"; // all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url
    String cardStickers = "cardStickers_example"; //  true or false
    String boards = "boards_example"; // all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned
    String boardFields = "name, closed, idOrganization and pinned"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String boardActions = "boardActions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String boardActionsEntities = "boardActionsEntities_example"; //  true or false
    String boardActionsDisplay = "boardActionsDisplay_example"; //  true or false
    String boardActionsFormat = "list"; // One of: count, list or minimal
    String boardActionsSince = "boardActionsSince_example"; // A date, null or lastView
    String boardActionsLimit = "50"; // a number from 0 to 1000
    String boardActionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String boardLists = "none"; // One of: all, closed, none or open
    String boardMemberships = "none"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String boardOrganization = "boardOrganization_example"; //  true or false
    String boardOrganizationFields = "name and displayName"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String boardsInvited = "boardsInvited_example"; // all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned
    String boardsInvitedFields = "name, closed, idOrganization and pinned"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String boardStars = "boardStars_example"; //  true or false
    String savedSearches = "savedSearches_example"; //  true or false
    String organizations = "none"; // One of: all, members, none or public
    String organizationFields = "all"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String organizationPaidAccount = "organizationPaidAccount_example"; //  true or false
    String organizationsInvited = "none"; // One of: all, members, none or public
    String organizationsInvitedFields = "all"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String notifications = "notifications_example"; // all or a comma-separated list of: addAdminToBoard, addAdminToOrganization, addedAttachmentToCard, addedMemberToCard, addedToBoard, addedToCard, addedToOrganization, cardDueSoon, changeCard, closeBoard, commentCard, createdCard, declinedInvitationToBoard, declinedInvitationToOrganization, invitedToBoard, invitedToOrganization, makeAdminOfBoard, makeAdminOfOrganization, memberJoinedTrello, mentionedOnCard, removedFromBoard, removedFromCard, removedFromOrganization, removedMemberFromCard, unconfirmedInvitedToBoard, unconfirmedInvitedToOrganization or updateCheckItemStateOnCard
    String notificationsEntities = "notificationsEntities_example"; //  true or false
    String notificationsDisplay = "notificationsDisplay_example"; //  true or false
    String notificationsLimit = "50"; // a number from 1 to 1000
    String notificationFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator, type or unread
    String notificationMemberCreator = "notificationMemberCreator_example"; //  true or false
    String notificationMemberCreatorFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String notificationBefore = "notificationBefore_example"; // An id, or null
    String notificationSince = "notificationSince_example"; // An id, or null
    String tokens = "none"; // One of: all or none
    String paidAccount = "paidAccount_example"; //  true or false
    String boardBackgrounds = "none"; // One of: all, custom, default, none or premium
    String customBoardBackgrounds = "none"; // One of: all or none
    String customStickers = "none"; // One of: all or none
    String customEmoji = "none"; // One of: all or none
    String fields = "all"; // all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username
    try {
      client
              .member
              .getById(idMember)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionSince(actionSince)
              .actionBefore(actionBefore)
              .cards(cards)
              .cardFields(cardFields)
              .cardMembers(cardMembers)
              .cardMemberFields(cardMemberFields)
              .cardAttachments(cardAttachments)
              .cardAttachmentFields(cardAttachmentFields)
              .cardStickers(cardStickers)
              .boards(boards)
              .boardFields(boardFields)
              .boardActions(boardActions)
              .boardActionsEntities(boardActionsEntities)
              .boardActionsDisplay(boardActionsDisplay)
              .boardActionsFormat(boardActionsFormat)
              .boardActionsSince(boardActionsSince)
              .boardActionsLimit(boardActionsLimit)
              .boardActionFields(boardActionFields)
              .boardLists(boardLists)
              .boardMemberships(boardMemberships)
              .boardOrganization(boardOrganization)
              .boardOrganizationFields(boardOrganizationFields)
              .boardsInvited(boardsInvited)
              .boardsInvitedFields(boardsInvitedFields)
              .boardStars(boardStars)
              .savedSearches(savedSearches)
              .organizations(organizations)
              .organizationFields(organizationFields)
              .organizationPaidAccount(organizationPaidAccount)
              .organizationsInvited(organizationsInvited)
              .organizationsInvitedFields(organizationsInvitedFields)
              .notifications(notifications)
              .notificationsEntities(notificationsEntities)
              .notificationsDisplay(notificationsDisplay)
              .notificationsLimit(notificationsLimit)
              .notificationFields(notificationFields)
              .notificationMemberCreator(notificationMemberCreator)
              .notificationMemberCreatorFields(notificationMemberCreatorFields)
              .notificationBefore(notificationBefore)
              .notificationSince(notificationSince)
              .tokens(tokens)
              .paidAccount(paidAccount)
              .boardBackgrounds(boardBackgrounds)
              .customBoardBackgrounds(customBoardBackgrounds)
              .customStickers(customStickers)
              .customEmoji(customEmoji)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getById(idMember)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .actionSince(actionSince)
              .actionBefore(actionBefore)
              .cards(cards)
              .cardFields(cardFields)
              .cardMembers(cardMembers)
              .cardMemberFields(cardMemberFields)
              .cardAttachments(cardAttachments)
              .cardAttachmentFields(cardAttachmentFields)
              .cardStickers(cardStickers)
              .boards(boards)
              .boardFields(boardFields)
              .boardActions(boardActions)
              .boardActionsEntities(boardActionsEntities)
              .boardActionsDisplay(boardActionsDisplay)
              .boardActionsFormat(boardActionsFormat)
              .boardActionsSince(boardActionsSince)
              .boardActionsLimit(boardActionsLimit)
              .boardActionFields(boardActionFields)
              .boardLists(boardLists)
              .boardMemberships(boardMemberships)
              .boardOrganization(boardOrganization)
              .boardOrganizationFields(boardOrganizationFields)
              .boardsInvited(boardsInvited)
              .boardsInvitedFields(boardsInvitedFields)
              .boardStars(boardStars)
              .savedSearches(savedSearches)
              .organizations(organizations)
              .organizationFields(organizationFields)
              .organizationPaidAccount(organizationPaidAccount)
              .organizationsInvited(organizationsInvited)
              .organizationsInvitedFields(organizationsInvitedFields)
              .notifications(notifications)
              .notificationsEntities(notificationsEntities)
              .notificationsDisplay(notificationsDisplay)
              .notificationsLimit(notificationsLimit)
              .notificationFields(notificationFields)
              .notificationMemberCreator(notificationMemberCreator)
              .notificationMemberCreatorFields(notificationMemberCreatorFields)
              .notificationBefore(notificationBefore)
              .notificationSince(notificationSince)
              .tokens(tokens)
              .paidAccount(paidAccount)
              .boardBackgrounds(boardBackgrounds)
              .customBoardBackgrounds(customBoardBackgrounds)
              .customStickers(customStickers)
              .customEmoji(customEmoji)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getById");
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
| **idMember** | **String**| idMember or username | |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **actionsEntities** | **String**|  true or false | [optional] |
| **actionsDisplay** | **String**|  true or false | [optional] |
| **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **actionSince** | **String**| A date, null or lastView | [optional] |
| **actionBefore** | **String**| A date, or null | [optional] |
| **cards** | **String**| One of: all, closed, none, open or visible | [optional] [default to none] |
| **cardFields** | **String**| all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url | [optional] [default to all] |
| **cardMembers** | **String**|  true or false | [optional] |
| **cardMemberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **cardAttachments** | **String**| A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments | [optional] |
| **cardAttachmentFields** | **String**| all or a comma-separated list of: bytes, date, edgeColor, idMember, isUpload, mimeType, name, previews or url | [optional] [default to url and previews] |
| **cardStickers** | **String**|  true or false | [optional] |
| **boards** | **String**| all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned | [optional] |
| **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, closed, idOrganization and pinned] |
| **boardActions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **boardActionsEntities** | **String**|  true or false | [optional] |
| **boardActionsDisplay** | **String**|  true or false | [optional] |
| **boardActionsFormat** | **String**| One of: count, list or minimal | [optional] [default to list] |
| **boardActionsSince** | **String**| A date, null or lastView | [optional] |
| **boardActionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **boardActionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **boardLists** | **String**| One of: all, closed, none or open | [optional] [default to none] |
| **boardMemberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none] |
| **boardOrganization** | **String**|  true or false | [optional] |
| **boardOrganizationFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to name and displayName] |
| **boardsInvited** | **String**| all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned | [optional] |
| **boardsInvitedFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to name, closed, idOrganization and pinned] |
| **boardStars** | **String**|  true or false | [optional] |
| **savedSearches** | **String**|  true or false | [optional] |
| **organizations** | **String**| One of: all, members, none or public | [optional] [default to none] |
| **organizationFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to all] |
| **organizationPaidAccount** | **String**|  true or false | [optional] |
| **organizationsInvited** | **String**| One of: all, members, none or public | [optional] [default to none] |
| **organizationsInvitedFields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to all] |
| **notifications** | **String**| all or a comma-separated list of: addAdminToBoard, addAdminToOrganization, addedAttachmentToCard, addedMemberToCard, addedToBoard, addedToCard, addedToOrganization, cardDueSoon, changeCard, closeBoard, commentCard, createdCard, declinedInvitationToBoard, declinedInvitationToOrganization, invitedToBoard, invitedToOrganization, makeAdminOfBoard, makeAdminOfOrganization, memberJoinedTrello, mentionedOnCard, removedFromBoard, removedFromCard, removedFromOrganization, removedMemberFromCard, unconfirmedInvitedToBoard, unconfirmedInvitedToOrganization or updateCheckItemStateOnCard | [optional] |
| **notificationsEntities** | **String**|  true or false | [optional] |
| **notificationsDisplay** | **String**|  true or false | [optional] |
| **notificationsLimit** | **String**| a number from 1 to 1000 | [optional] [default to 50] |
| **notificationFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator, type or unread | [optional] [default to all] |
| **notificationMemberCreator** | **String**|  true or false | [optional] |
| **notificationMemberCreatorFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials and username] |
| **notificationBefore** | **String**| An id, or null | [optional] |
| **notificationSince** | **String**| An id, or null | [optional] |
| **tokens** | **String**| One of: all or none | [optional] [default to none] |
| **paidAccount** | **String**|  true or false | [optional] |
| **boardBackgrounds** | **String**| One of: all, custom, default, none or premium | [optional] [default to none] |
| **customBoardBackgrounds** | **String**| One of: all or none | [optional] [default to none] |
| **customStickers** | **String**| One of: all or none | [optional] [default to none] |
| **customEmoji** | **String**| One of: all or none | [optional] [default to none] |
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

<a name="getCardsByFilter"></a>
# **getCardsByFilter**
> getCardsByFilter(idMember, filter).execute();

getMembersCardsByIdMemberByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "filter_example"; // filter
    try {
      client
              .member
              .getCardsByFilter(idMember, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCardsByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCardsByFilter(idMember, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCardsByFilter");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getCardsByIdMember"></a>
# **getCardsByIdMember**
> getCardsByIdMember(idMember).actions(actions).attachments(attachments).attachmentFields(attachmentFields).stickers(stickers).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checklists(checklists).limit(limit).since(since).before(before).filter(filter).fields(fields).execute();

getMembersCardsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
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
              .member
              .getCardsByIdMember(idMember)
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
      System.err.println("Exception when calling MemberApi#getCardsByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCardsByIdMember(idMember)
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
      System.err.println("Exception when calling MemberApi#getCardsByIdMember");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getCustomBoardBackgroundByIds"></a>
# **getCustomBoardBackgroundByIds**
> getCustomBoardBackgroundByIds(idMember, idBoardBackground).fields(fields).execute();

getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardBackground = "idBoardBackground_example"; // idBoardBackground
    String fields = "all"; // all or a comma-separated list of: brightness, fullSizeUrl, scaled or tile
    try {
      client
              .member
              .getCustomBoardBackgroundByIds(idMember, idBoardBackground)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomBoardBackgroundByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCustomBoardBackgroundByIds(idMember, idBoardBackground)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomBoardBackgroundByIds");
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
| **idMember** | **String**| idMember or username | |
| **idBoardBackground** | **String**| idBoardBackground | |
| **fields** | **String**| all or a comma-separated list of: brightness, fullSizeUrl, scaled or tile | [optional] [default to all] |

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

<a name="getCustomBoardBackgroundsById"></a>
# **getCustomBoardBackgroundsById**
> getCustomBoardBackgroundsById(idMember).filter(filter).execute();

getMembersCustomBoardBackgroundsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // One of: all or none
    try {
      client
              .member
              .getCustomBoardBackgroundsById(idMember)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomBoardBackgroundsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCustomBoardBackgroundsById(idMember)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomBoardBackgroundsById");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| One of: all or none | [optional] [default to all] |

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

<a name="getCustomEmojiByIds"></a>
# **getCustomEmojiByIds**
> getCustomEmojiByIds(idMember, idCustomEmoji).fields(fields).execute();

getMembersCustomEmojiByIdMemberByIdCustomEmoji()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idCustomEmoji = "idCustomEmoji_example"; // idCustomEmoji
    String fields = "all"; // all or a comma-separated list of: name or url
    try {
      client
              .member
              .getCustomEmojiByIds(idMember, idCustomEmoji)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomEmojiByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCustomEmojiByIds(idMember, idCustomEmoji)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomEmojiByIds");
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
| **idMember** | **String**| idMember or username | |
| **idCustomEmoji** | **String**| idCustomEmoji | |
| **fields** | **String**| all or a comma-separated list of: name or url | [optional] [default to all] |

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

<a name="getCustomStickerByIds"></a>
# **getCustomStickerByIds**
> getCustomStickerByIds(idMember, idCustomSticker).fields(fields).execute();

getMembersCustomStickersByIdMemberByIdCustomSticker()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idCustomSticker = "idCustomSticker_example"; // idCustomSticker
    String fields = "all"; // all or a comma-separated list of: scaled or url
    try {
      client
              .member
              .getCustomStickerByIds(idMember, idCustomSticker)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomStickerByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCustomStickerByIds(idMember, idCustomSticker)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomStickerByIds");
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
| **idMember** | **String**| idMember or username | |
| **idCustomSticker** | **String**| idCustomSticker | |
| **fields** | **String**| all or a comma-separated list of: scaled or url | [optional] [default to all] |

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

<a name="getCustomStickersByIdMember"></a>
# **getCustomStickersByIdMember**
> getCustomStickersByIdMember(idMember).filter(filter).execute();

getMembersCustomStickersByIdMember()

This gets a list of all of the user’s uploaded stickers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // One of: all or none
    try {
      client
              .member
              .getCustomStickersByIdMember(idMember)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomStickersByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getCustomStickersByIdMember(idMember)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getCustomStickersByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| One of: all or none | [optional] [default to all] |

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

<a name="getDeltasByIdMember"></a>
# **getDeltasByIdMember**
> getDeltasByIdMember(idMember, tags, ixLastUpdate).execute();

getMembersDeltasByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String tags = "tags_example"; // A valid tag for subscribing
    String ixLastUpdate = "ixLastUpdate_example"; // a number from -1 to Infinity
    try {
      client
              .member
              .getDeltasByIdMember(idMember, tags, ixLastUpdate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getDeltasByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getDeltasByIdMember(idMember, tags, ixLastUpdate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getDeltasByIdMember");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getInvitedBoards"></a>
# **getInvitedBoards**
> getInvitedBoards(idMember).fields(fields).execute();

getMembersBoardsInvitedByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String fields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    try {
      client
              .member
              .getInvitedBoards(idMember)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getInvitedBoards");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getInvitedBoards(idMember)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getInvitedBoards");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getNotificationsByIdMember"></a>
# **getNotificationsByIdMember**
> getNotificationsByIdMember(idMember).entities(entities).display(display).filter(filter).readFilter(readFilter).fields(fields).limit(limit).page(page).before(before).since(since).memberCreator(memberCreator).memberCreatorFields(memberCreatorFields).execute();

getMembersNotificationsByIdMember()

You can only read the notifications for the member associated with the supplied token

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String entities = "entities_example"; //  true or false
    String display = "display_example"; //  true or false
    String filter = "all"; // all or a comma-separated list of: addAdminToBoard, addAdminToOrganization, addedAttachmentToCard, addedMemberToCard, addedToBoard, addedToCard, addedToOrganization, cardDueSoon, changeCard, closeBoard, commentCard, createdCard, declinedInvitationToBoard, declinedInvitationToOrganization, invitedToBoard, invitedToOrganization, makeAdminOfBoard, makeAdminOfOrganization, memberJoinedTrello, mentionedOnCard, removedFromBoard, removedFromCard, removedFromOrganization, removedMemberFromCard, unconfirmedInvitedToBoard, unconfirmedInvitedToOrganization or updateCheckItemStateOnCard
    String readFilter = "all"; // One of: all, read or unread
    String fields = "all"; // all or a comma-separated list of: data, date, idMemberCreator, type or unread
    String limit = "50"; // a number from 1 to 1000
    String page = "0"; // a number from 0 to 100
    String before = "before_example"; // An id, or null
    String since = "since_example"; // An id, or null
    String memberCreator = "memberCreator_example"; //  true or false
    String memberCreatorFields = "avatarHash, fullName, initials and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .member
              .getNotificationsByIdMember(idMember)
              .entities(entities)
              .display(display)
              .filter(filter)
              .readFilter(readFilter)
              .fields(fields)
              .limit(limit)
              .page(page)
              .before(before)
              .since(since)
              .memberCreator(memberCreator)
              .memberCreatorFields(memberCreatorFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getNotificationsByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getNotificationsByIdMember(idMember)
              .entities(entities)
              .display(display)
              .filter(filter)
              .readFilter(readFilter)
              .fields(fields)
              .limit(limit)
              .page(page)
              .before(before)
              .since(since)
              .memberCreator(memberCreator)
              .memberCreatorFields(memberCreatorFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getNotificationsByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **entities** | **String**|  true or false | [optional] |
| **display** | **String**|  true or false | [optional] |
| **filter** | **String**| all or a comma-separated list of: addAdminToBoard, addAdminToOrganization, addedAttachmentToCard, addedMemberToCard, addedToBoard, addedToCard, addedToOrganization, cardDueSoon, changeCard, closeBoard, commentCard, createdCard, declinedInvitationToBoard, declinedInvitationToOrganization, invitedToBoard, invitedToOrganization, makeAdminOfBoard, makeAdminOfOrganization, memberJoinedTrello, mentionedOnCard, removedFromBoard, removedFromCard, removedFromOrganization, removedMemberFromCard, unconfirmedInvitedToBoard, unconfirmedInvitedToOrganization or updateCheckItemStateOnCard | [optional] [default to all] |
| **readFilter** | **String**| One of: all, read or unread | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: data, date, idMemberCreator, type or unread | [optional] [default to all] |
| **limit** | **String**| a number from 1 to 1000 | [optional] [default to 50] |
| **page** | **String**| a number from 0 to 100 | [optional] [default to 0] |
| **before** | **String**| An id, or null | [optional] |
| **since** | **String**| An id, or null | [optional] |
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

<a name="getNotificationsByIdMemberByFilter"></a>
# **getNotificationsByIdMemberByFilter**
> getNotificationsByIdMemberByFilter(idMember, filter).execute();

getMembersNotificationsByIdMemberByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "filter_example"; // filter
    try {
      client
              .member
              .getNotificationsByIdMemberByFilter(idMember, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getNotificationsByIdMemberByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getNotificationsByIdMemberByFilter(idMember, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getNotificationsByIdMemberByFilter");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getOrganizations"></a>
# **getOrganizations**
> getOrganizations(idMember, filter).execute();

getMembersOrganizationsByIdMemberByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "filter_example"; // filter
    try {
      client
              .member
              .getOrganizations(idMember, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getOrganizations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getOrganizations(idMember, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getOrganizations");
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
| **idMember** | **String**| idMember or username | |
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

<a name="getSavedSearchByIds"></a>
# **getSavedSearchByIds**
> getSavedSearchByIds(idMember, idSavedSearch).execute();

getMembersSavedSearchesByIdMemberByIdSavedSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idSavedSearch = "idSavedSearch_example"; // idSavedSearch
    try {
      client
              .member
              .getSavedSearchByIds(idMember, idSavedSearch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getSavedSearchByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getSavedSearchByIds(idMember, idSavedSearch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getSavedSearchByIds");
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
| **idMember** | **String**| idMember or username | |
| **idSavedSearch** | **String**| idSavedSearch | |

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

<a name="getSavedSearchesByIdMember"></a>
# **getSavedSearchesByIdMember**
> getSavedSearchesByIdMember(idMember).execute();

getMembersSavedSearchesByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    try {
      client
              .member
              .getSavedSearchesByIdMember(idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getSavedSearchesByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getSavedSearchesByIdMember(idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getSavedSearchesByIdMember");
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
| **idMember** | **String**| idMember or username | |

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

<a name="getTokensByIdMember"></a>
# **getTokensByIdMember**
> getTokensByIdMember(idMember).filter(filter).execute();

getMembersTokensByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // One of: all or none
    try {
      client
              .member
              .getTokensByIdMember(idMember)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getTokensByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .getTokensByIdMember(idMember)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#getTokensByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| One of: all or none | [optional] [default to all] |

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

<a name="listActionsByIdMember"></a>
# **listActionsByIdMember**
> listActionsByIdMember(idMember).entities(entities).display(display).filter(filter).fields(fields).limit(limit).format(format).since(since).before(before).page(page).idModels(idModels).member(member).memberFields(memberFields).memberCreator(memberCreator).memberCreatorFields(memberCreatorFields).execute();

getMembersActionsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
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
              .member
              .listActionsByIdMember(idMember)
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
      System.err.println("Exception when calling MemberApi#listActionsByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .listActionsByIdMember(idMember)
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
      System.err.println("Exception when calling MemberApi#listActionsByIdMember");
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
| **idMember** | **String**| idMember or username | |
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

<a name="listCustomEmojiByIdMember"></a>
# **listCustomEmojiByIdMember**
> listCustomEmojiByIdMember(idMember).filter(filter).execute();

getMembersCustomEmojiByIdMember()

This gets the list of all of the user’s uploaded emoji

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // One of: all or none
    try {
      client
              .member
              .listCustomEmojiByIdMember(idMember)
              .filter(filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listCustomEmojiByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .listCustomEmojiByIdMember(idMember)
              .filter(filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listCustomEmojiByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| One of: all or none | [optional] [default to all] |

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

<a name="listInvitedOrganizationsById"></a>
# **listInvitedOrganizationsById**
> listInvitedOrganizationsById(idMember).fields(fields).execute();

getMembersOrganizationsInvitedByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String fields = "all"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    try {
      client
              .member
              .listInvitedOrganizationsById(idMember)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listInvitedOrganizationsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .listInvitedOrganizationsById(idMember)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listInvitedOrganizationsById");
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
| **idMember** | **String**| idMember or username | |
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

<a name="listOrganizationsById"></a>
# **listOrganizationsById**
> listOrganizationsById(idMember).filter(filter).fields(fields).paidAccount(paidAccount).execute();

getMembersOrganizationsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String filter = "all"; // One of: all, members, none or public
    String fields = "all"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    String paidAccount = "paidAccount_example"; //  true or false
    try {
      client
              .member
              .listOrganizationsById(idMember)
              .filter(filter)
              .fields(fields)
              .paidAccount(paidAccount)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listOrganizationsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .listOrganizationsById(idMember)
              .filter(filter)
              .fields(fields)
              .paidAccount(paidAccount)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listOrganizationsById");
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
| **idMember** | **String**| idMember or username | |
| **filter** | **String**| One of: all, members, none or public | [optional] [default to all] |
| **fields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to all] |
| **paidAccount** | **String**|  true or false | [optional] |

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

<a name="listOrganizationsInvitedByIdMemberByField"></a>
# **listOrganizationsInvitedByIdMemberByField**
> listOrganizationsInvitedByIdMemberByField(idMember, field).execute();

getMembersOrganizationsInvitedByIdMemberByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String field = "field_example"; // field
    try {
      client
              .member
              .listOrganizationsInvitedByIdMemberByField(idMember, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listOrganizationsInvitedByIdMemberByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .listOrganizationsInvitedByIdMemberByField(idMember, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#listOrganizationsInvitedByIdMemberByField");
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
| **idMember** | **String**| idMember or username | |
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

<a name="removeBoardStarByIdMemberByIdBoardStar"></a>
# **removeBoardStarByIdMemberByIdBoardStar**
> removeBoardStarByIdMemberByIdBoardStar(idMember, idBoardStar).execute();

deleteMembersBoardStarsByIdMemberByIdBoardStar()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardStar = "idBoardStar_example"; // idBoardStar
    try {
      client
              .member
              .removeBoardStarByIdMemberByIdBoardStar(idMember, idBoardStar)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeBoardStarByIdMemberByIdBoardStar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .removeBoardStarByIdMemberByIdBoardStar(idMember, idBoardStar)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeBoardStarByIdMemberByIdBoardStar");
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
| **idMember** | **String**| idMember or username | |
| **idBoardStar** | **String**| idBoardStar | |

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

<a name="removeCustomBoardBackgroundById"></a>
# **removeCustomBoardBackgroundById**
> removeCustomBoardBackgroundById(idMember, idBoardBackground).execute();

deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardBackground = "idBoardBackground_example"; // idBoardBackground
    try {
      client
              .member
              .removeCustomBoardBackgroundById(idMember, idBoardBackground)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeCustomBoardBackgroundById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .removeCustomBoardBackgroundById(idMember, idBoardBackground)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeCustomBoardBackgroundById");
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
| **idMember** | **String**| idMember or username | |
| **idBoardBackground** | **String**| idBoardBackground | |

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

<a name="removeCustomStickerByIds"></a>
# **removeCustomStickerByIds**
> removeCustomStickerByIds(idMember, idCustomSticker).execute();

deleteMembersCustomStickersByIdMemberByIdCustomSticker()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idCustomSticker = "idCustomSticker_example"; // idCustomSticker
    try {
      client
              .member
              .removeCustomStickerByIds(idMember, idCustomSticker)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeCustomStickerByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .removeCustomStickerByIds(idMember, idCustomSticker)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeCustomStickerByIds");
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
| **idMember** | **String**| idMember or username | |
| **idCustomSticker** | **String**| idCustomSticker | |

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

<a name="removeSavedSearchByIds"></a>
# **removeSavedSearchByIds**
> removeSavedSearchByIds(idMember, idSavedSearch).execute();

deleteMembersSavedSearchesByIdMemberByIdSavedSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idSavedSearch = "idSavedSearch_example"; // idSavedSearch
    try {
      client
              .member
              .removeSavedSearchByIds(idMember, idSavedSearch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeSavedSearchByIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .removeSavedSearchByIds(idMember, idSavedSearch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#removeSavedSearchByIds");
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
| **idMember** | **String**| idMember or username | |
| **idSavedSearch** | **String**| idSavedSearch | |

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

<a name="updateAvatarSource"></a>
# **updateAvatarSource**
> updateAvatarSource(idMember, membersAvatarSource).execute();

updateMembersAvatarSourceByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // One of: gravatar, none or upload
    try {
      client
              .member
              .updateAvatarSource(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateAvatarSource");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateAvatarSource(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateAvatarSource");
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
| **idMember** | **String**| idMember or username | |
| **membersAvatarSource** | [**MembersAvatarSource**](MembersAvatarSource.md)| Attributes of \&quot;Members Avatar Source\&quot; to be updated. | |

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

<a name="updateBioById"></a>
# **updateBioById**
> updateBioById(idMember, membersBio).execute();

updateMembersBioByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .member
              .updateBioById(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBioById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateBioById(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBioById");
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
| **idMember** | **String**| idMember or username | |
| **membersBio** | [**MembersBio**](MembersBio.md)| Attributes of \&quot;Members Bio\&quot; to be updated. | |

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

<a name="updateBoardBackgroundsById"></a>
# **updateBoardBackgroundsById**
> updateBoardBackgroundsById(idMember, idBoardBackground, membersBoardBackgrounds).execute();

updateMembersBoardBackgroundsByIdMemberByIdBoardBackground()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardBackground = "idBoardBackground_example"; // idBoardBackground
    String brightness = "brightness_example"; // One of: dark, light or unknown
    String _file = "_file_example"; // A file
    String tile = "tile_example"; //  true or false
    try {
      client
              .member
              .updateBoardBackgroundsById(idMember, idBoardBackground)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardBackgroundsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateBoardBackgroundsById(idMember, idBoardBackground)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardBackgroundsById");
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
| **idMember** | **String**| idMember or username | |
| **idBoardBackground** | **String**| idBoardBackground | |
| **membersBoardBackgrounds** | [**MembersBoardBackgrounds**](MembersBoardBackgrounds.md)| Attributes of \&quot;Members Board Backgrounds\&quot; to be updated. | |

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

<a name="updateBoardStar"></a>
# **updateBoardStar**
> updateBoardStar(idMember, idBoardStar, membersBoardStars).execute();

updateMembersBoardStarsByIdMemberByIdBoardStar()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardStar = "idBoardStar_example"; // idBoardStar
    String idBoard = "idBoard_example"; // The id of the board to star
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .member
              .updateBoardStar(idMember, idBoardStar)
              .idBoard(idBoard)
              .pos(pos)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardStar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateBoardStar(idMember, idBoardStar)
              .idBoard(idBoard)
              .pos(pos)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardStar");
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
| **idMember** | **String**| idMember or username | |
| **idBoardStar** | **String**| idBoardStar | |
| **membersBoardStars** | [**MembersBoardStars**](MembersBoardStars.md)| Attributes of \&quot;Members Board Stars\&quot; to be updated. | |

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

<a name="updateBoardStarPosByIdMemberByIdBoardStar"></a>
# **updateBoardStarPosByIdMemberByIdBoardStar**
> updateBoardStarPosByIdMemberByIdBoardStar(idMember, idBoardStar, membersBoardStarsPos).execute();

updateMembersBoardStarsPosByIdMemberByIdBoardStar()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardStar = "idBoardStar_example"; // idBoardStar
    String value = "value_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .member
              .updateBoardStarPosByIdMemberByIdBoardStar(idMember, idBoardStar)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardStarPosByIdMemberByIdBoardStar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateBoardStarPosByIdMemberByIdBoardStar(idMember, idBoardStar)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardStarPosByIdMemberByIdBoardStar");
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
| **idMember** | **String**| idMember or username | |
| **idBoardStar** | **String**| idBoardStar | |
| **membersBoardStarsPos** | [**MembersBoardStarsPos**](MembersBoardStarsPos.md)| Attributes of \&quot;Members Board Stars Pos\&quot; to be updated. | |

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

<a name="updateBoardStarsIdBoard"></a>
# **updateBoardStarsIdBoard**
> updateBoardStarsIdBoard(idMember, idBoardStar, membersBoardStarsIdBoard).execute();

updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardStar = "idBoardStar_example"; // idBoardStar
    String value = "value_example"; // An id
    try {
      client
              .member
              .updateBoardStarsIdBoard(idMember, idBoardStar)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardStarsIdBoard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateBoardStarsIdBoard(idMember, idBoardStar)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateBoardStarsIdBoard");
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
| **idMember** | **String**| idMember or username | |
| **idBoardStar** | **String**| idBoardStar | |
| **membersBoardStarsIdBoard** | [**MembersBoardStarsIdBoard**](MembersBoardStarsIdBoard.md)| Attributes of \&quot;Members Board Stars Id Board\&quot; to be updated. | |

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

<a name="updateByIdMember"></a>
# **updateByIdMember**
> updateByIdMember(idMember, members).execute();

updateMembersByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String avatarSource = "avatarSource_example"; // One of: gravatar, none or upload
    String bio = "bio_example"; // a string with a length from 0 to 16384
    String fullName = "fullName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String initials = "initials_example"; // A string with a length from 1 to 4.  Cannot begin or end with a space
    String prefsColorBlind = "prefsColorBlind_example"; //  true or false
    String prefsLocale = "prefsLocale_example"; // a string with a length from 0 to 255
    String prefsMinutesBetweenSummaries = "prefsMinutesBetweenSummaries_example"; // -1 (disabled), 1 or 60
    String username = "username_example"; // A string with a length of at least 3.  Only lowercase letters, underscores, and numbers are allowed.  Must be unique.
    try {
      client
              .member
              .updateByIdMember(idMember)
              .avatarSource(avatarSource)
              .bio(bio)
              .fullName(fullName)
              .initials(initials)
              .prefsColorBlind(prefsColorBlind)
              .prefsLocale(prefsLocale)
              .prefsMinutesBetweenSummaries(prefsMinutesBetweenSummaries)
              .username(username)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateByIdMember(idMember)
              .avatarSource(avatarSource)
              .bio(bio)
              .fullName(fullName)
              .initials(initials)
              .prefsColorBlind(prefsColorBlind)
              .prefsLocale(prefsLocale)
              .prefsMinutesBetweenSummaries(prefsMinutesBetweenSummaries)
              .username(username)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **members** | [**Members**](Members.md)| Attributes of \&quot;Members\&quot; to be updated. | |

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

<a name="updateCustomBoardBackgrounds"></a>
# **updateCustomBoardBackgrounds**
> updateCustomBoardBackgrounds(idMember, idBoardBackground, membersCustomBoardBackgrounds).execute();

updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idBoardBackground = "idBoardBackground_example"; // idBoardBackground
    String brightness = "brightness_example"; // One of: dark, light or unknown
    String _file = "_file_example"; // A file
    String tile = "tile_example"; //  true or false
    try {
      client
              .member
              .updateCustomBoardBackgrounds(idMember, idBoardBackground)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateCustomBoardBackgrounds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateCustomBoardBackgrounds(idMember, idBoardBackground)
              .brightness(brightness)
              ._file(_file)
              .tile(tile)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateCustomBoardBackgrounds");
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
| **idMember** | **String**| idMember or username | |
| **idBoardBackground** | **String**| idBoardBackground | |
| **membersCustomBoardBackgrounds** | [**MembersCustomBoardBackgrounds**](MembersCustomBoardBackgrounds.md)| Attributes of \&quot;Members Custom Board Backgrounds\&quot; to be updated. | |

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

<a name="updateFullName"></a>
# **updateFullName**
> updateFullName(idMember, membersFullName).execute();

updateMembersFullNameByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    try {
      client
              .member
              .updateFullName(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateFullName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateFullName(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateFullName");
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
| **idMember** | **String**| idMember or username | |
| **membersFullName** | [**MembersFullName**](MembersFullName.md)| Attributes of \&quot;Members Full Name\&quot; to be updated. | |

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

<a name="updateInitialsByIdMember"></a>
# **updateInitialsByIdMember**
> updateInitialsByIdMember(idMember, membersInitials).execute();

updateMembersInitialsByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // A string with a length from 1 to 4.  Cannot begin or end with a space
    try {
      client
              .member
              .updateInitialsByIdMember(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateInitialsByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateInitialsByIdMember(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateInitialsByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **membersInitials** | [**MembersInitials**](MembersInitials.md)| Attributes of \&quot;Members Initials\&quot; to be updated. | |

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

<a name="updatePrefsColorBlindByIdMember"></a>
# **updatePrefsColorBlindByIdMember**
> updatePrefsColorBlindByIdMember(idMember, prefsColorBlind).execute();

updateMembersPrefsColorBlindByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; //  true or false
    try {
      client
              .member
              .updatePrefsColorBlindByIdMember(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updatePrefsColorBlindByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updatePrefsColorBlindByIdMember(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updatePrefsColorBlindByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **prefsColorBlind** | [**PrefsColorBlind**](PrefsColorBlind.md)| Attributes of \&quot;Prefs Color Blind\&quot; to be updated. | |

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

<a name="updatePrefsLocaleByIdMember"></a>
# **updatePrefsLocaleByIdMember**
> updatePrefsLocaleByIdMember(idMember, prefsLocale).execute();

updateMembersPrefsLocaleByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // a string with a length from 0 to 255
    try {
      client
              .member
              .updatePrefsLocaleByIdMember(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updatePrefsLocaleByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updatePrefsLocaleByIdMember(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updatePrefsLocaleByIdMember");
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
| **idMember** | **String**| idMember or username | |
| **prefsLocale** | [**PrefsLocale**](PrefsLocale.md)| Attributes of \&quot;Prefs Locale\&quot; to be updated. | |

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

<a name="updatePrefsMinutesBetweenSummariesById"></a>
# **updatePrefsMinutesBetweenSummariesById**
> updatePrefsMinutesBetweenSummariesById(idMember, prefsMinutesBetweenSummaries).execute();

updateMembersPrefsMinutesBetweenSummariesByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // -1 (disabled), 1 or 60
    try {
      client
              .member
              .updatePrefsMinutesBetweenSummariesById(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updatePrefsMinutesBetweenSummariesById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updatePrefsMinutesBetweenSummariesById(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updatePrefsMinutesBetweenSummariesById");
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
| **idMember** | **String**| idMember or username | |
| **prefsMinutesBetweenSummaries** | [**PrefsMinutesBetweenSummaries**](PrefsMinutesBetweenSummaries.md)| Attributes of \&quot;Prefs Minutes Between Summaries\&quot; to be updated. | |

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

<a name="updateSavedSearchQueryByIdMemberByIdSavedSearch"></a>
# **updateSavedSearchQueryByIdMemberByIdSavedSearch**
> updateSavedSearchQueryByIdMemberByIdSavedSearch(idMember, idSavedSearch, membersSavedSearchesQuery).execute();

updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idSavedSearch = "idSavedSearch_example"; // idSavedSearch
    String value = "value_example"; // a string with a length from 1 to 16384
    try {
      client
              .member
              .updateSavedSearchQueryByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchQueryByIdMemberByIdSavedSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateSavedSearchQueryByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchQueryByIdMemberByIdSavedSearch");
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
| **idMember** | **String**| idMember or username | |
| **idSavedSearch** | **String**| idSavedSearch | |
| **membersSavedSearchesQuery** | [**MembersSavedSearchesQuery**](MembersSavedSearchesQuery.md)| Attributes of \&quot;Members Saved Searches Query\&quot; to be updated. | |

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

<a name="updateSavedSearchesByIdMemberByIdSavedSearch"></a>
# **updateSavedSearchesByIdMemberByIdSavedSearch**
> updateSavedSearchesByIdMemberByIdSavedSearch(idMember, idSavedSearch, membersSavedSearches).execute();

updateMembersSavedSearchesByIdMemberByIdSavedSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idSavedSearch = "idSavedSearch_example"; // idSavedSearch
    String name = "name_example"; // A non-empty string with at least one non-space character
    String pos = "pos_example"; // A position. top , bottom , or a positive number.
    String query = "query_example"; // a string with a length from 1 to 16384
    try {
      client
              .member
              .updateSavedSearchesByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .name(name)
              .pos(pos)
              .query(query)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchesByIdMemberByIdSavedSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateSavedSearchesByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .name(name)
              .pos(pos)
              .query(query)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchesByIdMemberByIdSavedSearch");
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
| **idMember** | **String**| idMember or username | |
| **idSavedSearch** | **String**| idSavedSearch | |
| **membersSavedSearches** | [**MembersSavedSearches**](MembersSavedSearches.md)| Attributes of \&quot;Members Saved Searches\&quot; to be updated. | |

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

<a name="updateSavedSearchesNameByIdMemberByIdSavedSearch"></a>
# **updateSavedSearchesNameByIdMemberByIdSavedSearch**
> updateSavedSearchesNameByIdMemberByIdSavedSearch(idMember, idSavedSearch, membersSavedSearchesName).execute();

updateMembersSavedSearchesNameByIdMemberByIdSavedSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idSavedSearch = "idSavedSearch_example"; // idSavedSearch
    String value = "value_example"; // A non-empty string with at least one non-space character
    try {
      client
              .member
              .updateSavedSearchesNameByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchesNameByIdMemberByIdSavedSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateSavedSearchesNameByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchesNameByIdMemberByIdSavedSearch");
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
| **idMember** | **String**| idMember or username | |
| **idSavedSearch** | **String**| idSavedSearch | |
| **membersSavedSearchesName** | [**MembersSavedSearchesName**](MembersSavedSearchesName.md)| Attributes of \&quot;Members Saved Searches Name\&quot; to be updated. | |

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

<a name="updateSavedSearchesPosByIdMemberByIdSavedSearch"></a>
# **updateSavedSearchesPosByIdMemberByIdSavedSearch**
> updateSavedSearchesPosByIdMemberByIdSavedSearch(idMember, idSavedSearch, membersSavedSearchesPos).execute();

updateMembersSavedSearchesPosByIdMemberByIdSavedSearch()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String idSavedSearch = "idSavedSearch_example"; // idSavedSearch
    String value = "value_example"; // A position. top , bottom , or a positive number.
    try {
      client
              .member
              .updateSavedSearchesPosByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchesPosByIdMemberByIdSavedSearch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateSavedSearchesPosByIdMemberByIdSavedSearch(idMember, idSavedSearch)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateSavedSearchesPosByIdMemberByIdSavedSearch");
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
| **idMember** | **String**| idMember or username | |
| **idSavedSearch** | **String**| idSavedSearch | |
| **membersSavedSearchesPos** | [**MembersSavedSearchesPos**](MembersSavedSearchesPos.md)| Attributes of \&quot;Members Saved Searches Pos\&quot; to be updated. | |

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

<a name="updateUsernameById"></a>
# **updateUsernameById**
> updateUsernameById(idMember, membersUsername).execute();

updateMembersUsernameByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String value = "value_example"; // A string with a length of at least 3.  Only lowercase letters, underscores, and numbers are allowed.  Must be unique.
    try {
      client
              .member
              .updateUsernameById(idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateUsernameById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .updateUsernameById(idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#updateUsernameById");
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
| **idMember** | **String**| idMember or username | |
| **membersUsername** | [**MembersUsername**](MembersUsername.md)| Attributes of \&quot;Members Username\&quot; to be updated. | |

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

<a name="uploadAvatarById"></a>
# **uploadAvatarById**
> uploadAvatarById(idMember, membersAvatar).execute();

addMembersAvatarByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MemberApi;
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
    String idMember = "idMember_example"; // idMember or username
    String _file = "_file_example"; // A file
    try {
      client
              .member
              .uploadAvatarById(idMember)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#uploadAvatarById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .member
              .uploadAvatarById(idMember)
              ._file(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberApi#uploadAvatarById");
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
| **idMember** | **String**| idMember or username | |
| **membersAvatar** | [**MembersAvatar**](MembersAvatar.md)| Attributes of \&quot;Members Avatar\&quot; to be added. | |

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

