# OrganizationApi

All URIs are relative to *https://trello.com/1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](OrganizationApi.md#create) | **POST** /organizations | addOrganizations() |
| [**deletePrefsAssociatedDomainByIdOrg**](OrganizationApi.md#deletePrefsAssociatedDomainByIdOrg) | **DELETE** /organizations/{idOrg}/prefs/associatedDomain | deleteOrganizationsPrefsAssociatedDomainByIdOrg() |
| [**getActionsByIdOrg**](OrganizationApi.md#getActionsByIdOrg) | **GET** /organizations/{idOrg}/actions | getOrganizationsActionsByIdOrg() |
| [**getBoardsByIdOrgByFilter**](OrganizationApi.md#getBoardsByIdOrgByFilter) | **GET** /organizations/{idOrg}/boards/{filter} | getOrganizationsBoardsByIdOrgByFilter() |
| [**getBoardsByOrgId**](OrganizationApi.md#getBoardsByOrgId) | **GET** /organizations/{idOrg}/boards | getOrganizationsBoardsByIdOrg() |
| [**getByIdAndField**](OrganizationApi.md#getByIdAndField) | **GET** /organizations/{idOrg}/{field} | getOrganizationsByIdOrgByField() |
| [**getByIdOrg**](OrganizationApi.md#getByIdOrg) | **GET** /organizations/{idOrg} | getOrganizationsByIdOrg() |
| [**getMembersByIdOrg**](OrganizationApi.md#getMembersByIdOrg) | **GET** /organizations/{idOrg}/members | getOrganizationsMembersByIdOrg() |
| [**getMembersInvitedByIdOrg**](OrganizationApi.md#getMembersInvitedByIdOrg) | **GET** /organizations/{idOrg}/membersInvited | getOrganizationsMembersInvitedByIdOrg() |
| [**getMembersInvitedByIdOrgByField**](OrganizationApi.md#getMembersInvitedByIdOrgByField) | **GET** /organizations/{idOrg}/membersInvited/{field} | getOrganizationsMembersInvitedByIdOrgByField() |
| [**getMembershipsByIdOrgByIdMembership**](OrganizationApi.md#getMembershipsByIdOrgByIdMembership) | **GET** /organizations/{idOrg}/memberships/{idMembership} | getOrganizationsMembershipsByIdOrgByIdMembership() |
| [**getOrganizationDeltas**](OrganizationApi.md#getOrganizationDeltas) | **GET** /organizations/{idOrg}/deltas | getOrganizationsDeltasByIdOrg() |
| [**listMembersByIdOrgByFilter**](OrganizationApi.md#listMembersByIdOrgByFilter) | **GET** /organizations/{idOrg}/members/{filter} | getOrganizationsMembersByIdOrgByFilter() |
| [**listMembersCardsByIdOrgByIdMember**](OrganizationApi.md#listMembersCardsByIdOrgByIdMember) | **GET** /organizations/{idOrg}/members/{idMember}/cards | getOrganizationsMembersCardsByIdOrgByIdMember() |
| [**listMembershipsByIdOrg**](OrganizationApi.md#listMembershipsByIdOrg) | **GET** /organizations/{idOrg}/memberships | getOrganizationsMembershipsByIdOrg() |
| [**removeByIdOrg**](OrganizationApi.md#removeByIdOrg) | **DELETE** /organizations/{idOrg} | deleteOrganizationsByIdOrg() |
| [**removeInviteRestrictByIdOrg**](OrganizationApi.md#removeInviteRestrictByIdOrg) | **DELETE** /organizations/{idOrg}/prefs/orgInviteRestrict | deleteOrganizationsPrefsOrgInviteRestrictByIdOrg() |
| [**removeLogoByIdOrg**](OrganizationApi.md#removeLogoByIdOrg) | **DELETE** /organizations/{idOrg}/logo | deleteOrganizationsLogoByIdOrg() |
| [**removeMemberAll**](OrganizationApi.md#removeMemberAll) | **DELETE** /organizations/{idOrg}/members/{idMember}/all | deleteOrganizationsMembersAllByIdOrgByIdMember() |
| [**removeMemberByIdOrgByIdMember**](OrganizationApi.md#removeMemberByIdOrgByIdMember) | **DELETE** /organizations/{idOrg}/members/{idMember} | deleteOrganizationsMembersByIdOrgByIdMember() |
| [**updateByIdOrg**](OrganizationApi.md#updateByIdOrg) | **PUT** /organizations/{idOrg} | updateOrganizationsByIdOrg() |
| [**updateDescriptionByIdOrg**](OrganizationApi.md#updateDescriptionByIdOrg) | **PUT** /organizations/{idOrg}/desc | updateOrganizationsDescByIdOrg() |
| [**updateDisplayNameByIdOrg**](OrganizationApi.md#updateDisplayNameByIdOrg) | **PUT** /organizations/{idOrg}/displayName | updateOrganizationsDisplayNameByIdOrg() |
| [**updateMembersByIdOrg**](OrganizationApi.md#updateMembersByIdOrg) | **PUT** /organizations/{idOrg}/members | updateOrganizationsMembersByIdOrg() |
| [**updateMembersByIdOrgByIdMember**](OrganizationApi.md#updateMembersByIdOrgByIdMember) | **PUT** /organizations/{idOrg}/members/{idMember} | updateOrganizationsMembersByIdOrgByIdMember() |
| [**updateMembersDeactivatedByIdOrgByIdMember**](OrganizationApi.md#updateMembersDeactivatedByIdOrgByIdMember) | **PUT** /organizations/{idOrg}/members/{idMember}/deactivated | updateOrganizationsMembersDeactivatedByIdOrgByIdMember() |
| [**updateMembershipByIdOrgByIdMembership**](OrganizationApi.md#updateMembershipByIdOrgByIdMembership) | **PUT** /organizations/{idOrg}/memberships/{idMembership} | updateOrganizationsMembershipsByIdOrgByIdMembership() |
| [**updateNameByIdOrg**](OrganizationApi.md#updateNameByIdOrg) | **PUT** /organizations/{idOrg}/name | updateOrganizationsNameByIdOrg() |
| [**updatePrefsAssociatedDomainByIdOrg**](OrganizationApi.md#updatePrefsAssociatedDomainByIdOrg) | **PUT** /organizations/{idOrg}/prefs/associatedDomain | updateOrganizationsPrefsAssociatedDomainByIdOrg() |
| [**updatePrefsBoardVisibilityRestrictByIdOrg**](OrganizationApi.md#updatePrefsBoardVisibilityRestrictByIdOrg) | **PUT** /organizations/{idOrg}/prefs/boardVisibilityRestrict/org | updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrg() |
| [**updatePrefsBoardVisibilityRestrictPublicByIdOrg**](OrganizationApi.md#updatePrefsBoardVisibilityRestrictPublicByIdOrg) | **PUT** /organizations/{idOrg}/prefs/boardVisibilityRestrict/public | updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrg() |
| [**updatePrefsExternalMembersDisabledByIdOrg**](OrganizationApi.md#updatePrefsExternalMembersDisabledByIdOrg) | **PUT** /organizations/{idOrg}/prefs/externalMembersDisabled | updateOrganizationsPrefsExternalMembersDisabledByIdOrg() |
| [**updatePrefsGoogleAppsVersionByIdOrg**](OrganizationApi.md#updatePrefsGoogleAppsVersionByIdOrg) | **PUT** /organizations/{idOrg}/prefs/googleAppsVersion | updateOrganizationsPrefsGoogleAppsVersionByIdOrg() |
| [**updatePrefsOrgInviteRestrictByIdOrg**](OrganizationApi.md#updatePrefsOrgInviteRestrictByIdOrg) | **PUT** /organizations/{idOrg}/prefs/orgInviteRestrict | updateOrganizationsPrefsOrgInviteRestrictByIdOrg() |
| [**updatePrefsPermissionLevelByIdOrg**](OrganizationApi.md#updatePrefsPermissionLevelByIdOrg) | **PUT** /organizations/{idOrg}/prefs/permissionLevel | updateOrganizationsPrefsPermissionLevelByIdOrg() |
| [**updatePrefsVisibilityByIdOrg**](OrganizationApi.md#updatePrefsVisibilityByIdOrg) | **PUT** /organizations/{idOrg}/prefs/boardVisibilityRestrict/private | updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrg() |
| [**updateWebsiteByIdOrg**](OrganizationApi.md#updateWebsiteByIdOrg) | **PUT** /organizations/{idOrg}/website | updateOrganizationsWebsiteByIdOrg() |
| [**uploadLogoByIdOrg**](OrganizationApi.md#uploadLogoByIdOrg) | **POST** /organizations/{idOrg}/logo | addOrganizationsLogoByIdOrg() |


<a name="create"></a>
# **create**
> create(organizations).execute();

addOrganizations()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String desc = "desc_example"; // a string with a length from 0 to 16384
    String displayName = "displayName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String name = "name_example"; // a string with a length from 0 to 16384
    String prefsAssociatedDomain = "prefsAssociatedDomain_example"; // The google apps domain to link this org to.
    String prefsBoardVisibilityRestrictOrg = "prefsBoardVisibilityRestrictOrg_example"; // One of: admin, none or org
    String prefsBoardVisibilityRestrictPrivate = "prefsBoardVisibilityRestrictPrivate_example"; // One of: admin, none or org
    String prefsBoardVisibilityRestrictPublic = "prefsBoardVisibilityRestrictPublic_example"; // One of: admin, none or org
    String prefsExternalMembersDisabled = "prefsExternalMembersDisabled_example"; //  true or false
    String prefsGoogleAppsVersion = "prefsGoogleAppsVersion_example"; // a number from 1 to 2
    String prefsOrgInviteRestrict = "prefsOrgInviteRestrict_example"; // An email address with optional expansion tokens
    String prefsPermissionLevel = "prefsPermissionLevel_example"; // One of: private or public
    String website = "website_example"; // A URL starting with http:// or https:// or null
    try {
      client
              .organization
              .create()
              .desc(desc)
              .displayName(displayName)
              .name(name)
              .prefsAssociatedDomain(prefsAssociatedDomain)
              .prefsBoardVisibilityRestrictOrg(prefsBoardVisibilityRestrictOrg)
              .prefsBoardVisibilityRestrictPrivate(prefsBoardVisibilityRestrictPrivate)
              .prefsBoardVisibilityRestrictPublic(prefsBoardVisibilityRestrictPublic)
              .prefsExternalMembersDisabled(prefsExternalMembersDisabled)
              .prefsGoogleAppsVersion(prefsGoogleAppsVersion)
              .prefsOrgInviteRestrict(prefsOrgInviteRestrict)
              .prefsPermissionLevel(prefsPermissionLevel)
              .website(website)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .create()
              .desc(desc)
              .displayName(displayName)
              .name(name)
              .prefsAssociatedDomain(prefsAssociatedDomain)
              .prefsBoardVisibilityRestrictOrg(prefsBoardVisibilityRestrictOrg)
              .prefsBoardVisibilityRestrictPrivate(prefsBoardVisibilityRestrictPrivate)
              .prefsBoardVisibilityRestrictPublic(prefsBoardVisibilityRestrictPublic)
              .prefsExternalMembersDisabled(prefsExternalMembersDisabled)
              .prefsGoogleAppsVersion(prefsGoogleAppsVersion)
              .prefsOrgInviteRestrict(prefsOrgInviteRestrict)
              .prefsPermissionLevel(prefsPermissionLevel)
              .website(website)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#create");
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
| **organizations** | [**Organizations**](Organizations.md)| Attributes of \&quot;Organizations\&quot; to be added. | |

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

<a name="deletePrefsAssociatedDomainByIdOrg"></a>
# **deletePrefsAssociatedDomainByIdOrg**
> deletePrefsAssociatedDomainByIdOrg(idOrg).execute();

deleteOrganizationsPrefsAssociatedDomainByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    try {
      client
              .organization
              .deletePrefsAssociatedDomainByIdOrg(idOrg)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#deletePrefsAssociatedDomainByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .deletePrefsAssociatedDomainByIdOrg(idOrg)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#deletePrefsAssociatedDomainByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |

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

<a name="getActionsByIdOrg"></a>
# **getActionsByIdOrg**
> getActionsByIdOrg(idOrg).entities(entities).display(display).filter(filter).fields(fields).limit(limit).format(format).since(since).before(before).page(page).idModels(idModels).member(member).memberFields(memberFields).memberCreator(memberCreator).memberCreatorFields(memberCreatorFields).execute();

getOrganizationsActionsByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
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
              .organization
              .getActionsByIdOrg(idOrg)
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
      System.err.println("Exception when calling OrganizationApi#getActionsByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getActionsByIdOrg(idOrg)
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
      System.err.println("Exception when calling OrganizationApi#getActionsByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getBoardsByIdOrgByFilter"></a>
# **getBoardsByIdOrgByFilter**
> getBoardsByIdOrgByFilter(idOrg, filter).execute();

getOrganizationsBoardsByIdOrgByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String filter = "filter_example"; // filter
    try {
      client
              .organization
              .getBoardsByIdOrgByFilter(idOrg, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getBoardsByIdOrgByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getBoardsByIdOrgByFilter(idOrg, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getBoardsByIdOrgByFilter");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getBoardsByOrgId"></a>
# **getBoardsByOrgId**
> getBoardsByOrgId(idOrg).filter(filter).fields(fields).actions(actions).actionsEntities(actionsEntities).actionsLimit(actionsLimit).actionsFormat(actionsFormat).actionsSince(actionsSince).actionFields(actionFields).memberships(memberships).organization(organization).organizationFields(organizationFields).lists(lists).execute();

getOrganizationsBoardsByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
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
              .organization
              .getBoardsByOrgId(idOrg)
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
      System.err.println("Exception when calling OrganizationApi#getBoardsByOrgId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getBoardsByOrgId(idOrg)
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
      System.err.println("Exception when calling OrganizationApi#getBoardsByOrgId");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getByIdAndField"></a>
# **getByIdAndField**
> getByIdAndField(idOrg, field).execute();

getOrganizationsByIdOrgByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String field = "field_example"; // field
    try {
      client
              .organization
              .getByIdAndField(idOrg, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getByIdAndField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getByIdAndField(idOrg, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getByIdAndField");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getByIdOrg"></a>
# **getByIdOrg**
> getByIdOrg(idOrg).actions(actions).actionsEntities(actionsEntities).actionsDisplay(actionsDisplay).actionsLimit(actionsLimit).actionFields(actionFields).memberships(memberships).membershipsMember(membershipsMember).membershipsMemberFields(membershipsMemberFields).members(members).memberFields(memberFields).memberActivity(memberActivity).membersInvited(membersInvited).membersInvitedFields(membersInvitedFields).boards(boards).boardFields(boardFields).boardActions(boardActions).boardActionsEntities(boardActionsEntities).boardActionsDisplay(boardActionsDisplay).boardActionsFormat(boardActionsFormat).boardActionsSince(boardActionsSince).boardActionsLimit(boardActionsLimit).boardActionFields(boardActionFields).boardLists(boardLists).paidAccount(paidAccount).fields(fields).execute();

getOrganizationsByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String actions = "actions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String actionsEntities = "actionsEntities_example"; //  true or false
    String actionsDisplay = "actionsDisplay_example"; //  true or false
    String actionsLimit = "50"; // a number from 0 to 1000
    String actionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String memberships = "none"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String membershipsMember = "membershipsMember_example"; //  true or false
    String membershipsMemberFields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String members = "none"; // One of: admins, all, none, normal or owners
    String memberFields = "avatarHash, fullName, initials, username and confirmed"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String memberActivity = "memberActivity_example"; // true or false ; works for premium organizations only.
    String membersInvited = "none"; // One of: admins, all, none, normal or owners
    String membersInvitedFields = "avatarHash, initials, fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String boards = "none"; // all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned
    String boardFields = "all"; // all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url
    String boardActions = "boardActions_example"; // all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization
    String boardActionsEntities = "boardActionsEntities_example"; //  true or false
    String boardActionsDisplay = "boardActionsDisplay_example"; //  true or false
    String boardActionsFormat = "list"; // One of: count, list or minimal
    String boardActionsSince = "boardActionsSince_example"; // A date, null or lastView
    String boardActionsLimit = "50"; // a number from 0 to 1000
    String boardActionFields = "all"; // all or a comma-separated list of: data, date, idMemberCreator or type
    String boardLists = "none"; // One of: all, closed, none or open
    String paidAccount = "paidAccount_example"; //  true or false
    String fields = "name, displayName, desc, descData, url, website, logoHash, products and powerUps"; // all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website
    try {
      client
              .organization
              .getByIdOrg(idOrg)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .memberships(memberships)
              .membershipsMember(membershipsMember)
              .membershipsMemberFields(membershipsMemberFields)
              .members(members)
              .memberFields(memberFields)
              .memberActivity(memberActivity)
              .membersInvited(membersInvited)
              .membersInvitedFields(membersInvitedFields)
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
              .paidAccount(paidAccount)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getByIdOrg(idOrg)
              .actions(actions)
              .actionsEntities(actionsEntities)
              .actionsDisplay(actionsDisplay)
              .actionsLimit(actionsLimit)
              .actionFields(actionFields)
              .memberships(memberships)
              .membershipsMember(membershipsMember)
              .membershipsMemberFields(membershipsMemberFields)
              .members(members)
              .memberFields(memberFields)
              .memberActivity(memberActivity)
              .membersInvited(membersInvited)
              .membersInvitedFields(membersInvitedFields)
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
              .paidAccount(paidAccount)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **actions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **actionsEntities** | **String**|  true or false | [optional] |
| **actionsDisplay** | **String**|  true or false | [optional] |
| **actionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **actionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **memberships** | **String**| all or a comma-separated list of: active, admin, deactivated, me or normal | [optional] [default to none] |
| **membershipsMember** | **String**|  true or false | [optional] |
| **membershipsMemberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to fullName and username] |
| **members** | **String**| One of: admins, all, none, normal or owners | [optional] [default to none] |
| **memberFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, fullName, initials, username and confirmed] |
| **memberActivity** | **String**| true or false ; works for premium organizations only. | [optional] |
| **membersInvited** | **String**| One of: admins, all, none, normal or owners | [optional] [default to none] |
| **membersInvitedFields** | **String**| all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username | [optional] [default to avatarHash, initials, fullName and username] |
| **boards** | **String**| all or a comma-separated list of: closed, members, open, organization, pinned, public, starred or unpinned | [optional] [default to none] |
| **boardFields** | **String**| all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url | [optional] [default to all] |
| **boardActions** | **String**| all or a comma-separated list of: addAttachmentToCard, addChecklistToCard, addMemberToBoard, addMemberToCard, addMemberToOrganization, addToOrganizationBoard, commentCard, convertToCardFromCheckItem, copyBoard, copyCard, copyCommentCard, createBoard, createCard, createList, createOrganization, deleteAttachmentFromCard, deleteBoardInvitation, deleteCard, deleteOrganizationInvitation, disablePowerUp, emailCard, enablePowerUp, makeAdminOfBoard, makeNormalMemberOfBoard, makeNormalMemberOfOrganization, makeObserverOfBoard, memberJoinedTrello, moveCardFromBoard, moveCardToBoard, moveListFromBoard, moveListToBoard, removeChecklistFromCard, removeFromOrganizationBoard, removeMemberFromCard, unconfirmedBoardInvitation, unconfirmedOrganizationInvitation, updateBoard, updateCard, updateCard:closed, updateCard:desc, updateCard:idList, updateCard:name, updateCheckItemStateOnCard, updateChecklist, updateList, updateList:closed, updateList:name, updateMember or updateOrganization | [optional] |
| **boardActionsEntities** | **String**|  true or false | [optional] |
| **boardActionsDisplay** | **String**|  true or false | [optional] |
| **boardActionsFormat** | **String**| One of: count, list or minimal | [optional] [default to list] |
| **boardActionsSince** | **String**| A date, null or lastView | [optional] |
| **boardActionsLimit** | **String**| a number from 0 to 1000 | [optional] [default to 50] |
| **boardActionFields** | **String**| all or a comma-separated list of: data, date, idMemberCreator or type | [optional] [default to all] |
| **boardLists** | **String**| One of: all, closed, none or open | [optional] [default to none] |
| **paidAccount** | **String**|  true or false | [optional] |
| **fields** | **String**| all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website | [optional] [default to name, displayName, desc, descData, url, website, logoHash, products and powerUps] |

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

<a name="getMembersByIdOrg"></a>
# **getMembersByIdOrg**
> getMembersByIdOrg(idOrg).filter(filter).fields(fields).activity(activity).execute();

getOrganizationsMembersByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String filter = "all"; // One of: admins, all, none, normal or owners
    String fields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String activity = "activity_example"; // true or false ; works for premium organizations only.
    try {
      client
              .organization
              .getMembersByIdOrg(idOrg)
              .filter(filter)
              .fields(fields)
              .activity(activity)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembersByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getMembersByIdOrg(idOrg)
              .filter(filter)
              .fields(fields)
              .activity(activity)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembersByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getMembersInvitedByIdOrg"></a>
# **getMembersInvitedByIdOrg**
> getMembersInvitedByIdOrg(idOrg).fields(fields).execute();

getOrganizationsMembersInvitedByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String fields = "all"; // all or a comma-separated list of: avatarHash, avatarSource, bio, bioData, confirmed, email, fullName, gravatarHash, idBoards, idBoardsPinned, idOrganizations, idPremOrgsAdmin, initials, loginTypes, memberType, oneTimeMessagesDismissed, prefs, premiumFeatures, products, status, status, trophies, uploadedAvatarHash, url or username
    try {
      client
              .organization
              .getMembersInvitedByIdOrg(idOrg)
              .fields(fields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembersInvitedByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getMembersInvitedByIdOrg(idOrg)
              .fields(fields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembersInvitedByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getMembersInvitedByIdOrgByField"></a>
# **getMembersInvitedByIdOrgByField**
> getMembersInvitedByIdOrgByField(idOrg, field).execute();

getOrganizationsMembersInvitedByIdOrgByField()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String field = "field_example"; // field
    try {
      client
              .organization
              .getMembersInvitedByIdOrgByField(idOrg, field)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembersInvitedByIdOrgByField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getMembersInvitedByIdOrgByField(idOrg, field)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembersInvitedByIdOrgByField");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getMembershipsByIdOrgByIdMembership"></a>
# **getMembershipsByIdOrgByIdMembership**
> getMembershipsByIdOrgByIdMembership(idOrg, idMembership).member(member).memberFields(memberFields).execute();

getOrganizationsMembershipsByIdOrgByIdMembership()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String idMembership = "idMembership_example"; // idMembership
    String member = "member_example"; //  true or false
    String memberFields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .organization
              .getMembershipsByIdOrgByIdMembership(idOrg, idMembership)
              .member(member)
              .memberFields(memberFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembershipsByIdOrgByIdMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getMembershipsByIdOrgByIdMembership(idOrg, idMembership)
              .member(member)
              .memberFields(memberFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getMembershipsByIdOrgByIdMembership");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="getOrganizationDeltas"></a>
# **getOrganizationDeltas**
> getOrganizationDeltas(idOrg, tags, ixLastUpdate).execute();

getOrganizationsDeltasByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String tags = "tags_example"; // A valid tag for subscribing
    String ixLastUpdate = "ixLastUpdate_example"; // a number from -1 to Infinity
    try {
      client
              .organization
              .getOrganizationDeltas(idOrg, tags, ixLastUpdate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationDeltas");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .getOrganizationDeltas(idOrg, tags, ixLastUpdate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationDeltas");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="listMembersByIdOrgByFilter"></a>
# **listMembersByIdOrgByFilter**
> listMembersByIdOrgByFilter(idOrg, filter).execute();

getOrganizationsMembersByIdOrgByFilter()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String filter = "filter_example"; // filter
    try {
      client
              .organization
              .listMembersByIdOrgByFilter(idOrg, filter)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#listMembersByIdOrgByFilter");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .listMembersByIdOrgByFilter(idOrg, filter)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#listMembersByIdOrgByFilter");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="listMembersCardsByIdOrgByIdMember"></a>
# **listMembersCardsByIdOrgByIdMember**
> listMembersCardsByIdOrgByIdMember(idOrg, idMember).actions(actions).attachments(attachments).attachmentFields(attachmentFields).members(members).memberFields(memberFields).checkItemStates(checkItemStates).checklists(checklists).board(board).boardFields(boardFields).list(list).listFields(listFields).filter(filter).fields(fields).execute();

getOrganizationsMembersCardsByIdOrgByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
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
              .organization
              .listMembersCardsByIdOrgByIdMember(idOrg, idMember)
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
      System.err.println("Exception when calling OrganizationApi#listMembersCardsByIdOrgByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .listMembersCardsByIdOrgByIdMember(idOrg, idMember)
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
      System.err.println("Exception when calling OrganizationApi#listMembersCardsByIdOrgByIdMember");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="listMembershipsByIdOrg"></a>
# **listMembershipsByIdOrg**
> listMembershipsByIdOrg(idOrg).filter(filter).member(member).memberFields(memberFields).execute();

getOrganizationsMembershipsByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String filter = "all"; // all or a comma-separated list of: active, admin, deactivated, me or normal
    String member = "member_example"; //  true or false
    String memberFields = "fullName and username"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    try {
      client
              .organization
              .listMembershipsByIdOrg(idOrg)
              .filter(filter)
              .member(member)
              .memberFields(memberFields)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#listMembershipsByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .listMembershipsByIdOrg(idOrg)
              .filter(filter)
              .member(member)
              .memberFields(memberFields)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#listMembershipsByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="removeByIdOrg"></a>
# **removeByIdOrg**
> removeByIdOrg(idOrg).execute();

deleteOrganizationsByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    try {
      client
              .organization
              .removeByIdOrg(idOrg)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .removeByIdOrg(idOrg)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |

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

<a name="removeInviteRestrictByIdOrg"></a>
# **removeInviteRestrictByIdOrg**
> removeInviteRestrictByIdOrg(idOrg, value).execute();

deleteOrganizationsPrefsOrgInviteRestrictByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // An email address with optional expansion tokens
    try {
      client
              .organization
              .removeInviteRestrictByIdOrg(idOrg, value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeInviteRestrictByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .removeInviteRestrictByIdOrg(idOrg, value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeInviteRestrictByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **value** | **String**| An email address with optional expansion tokens | |

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

<a name="removeLogoByIdOrg"></a>
# **removeLogoByIdOrg**
> removeLogoByIdOrg(idOrg).execute();

deleteOrganizationsLogoByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    try {
      client
              .organization
              .removeLogoByIdOrg(idOrg)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeLogoByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .removeLogoByIdOrg(idOrg)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeLogoByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |

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

<a name="removeMemberAll"></a>
# **removeMemberAll**
> removeMemberAll(idOrg, idMember).execute();

deleteOrganizationsMembersAllByIdOrgByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String idMember = "idMember_example"; // idMember
    try {
      client
              .organization
              .removeMemberAll(idOrg, idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeMemberAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .removeMemberAll(idOrg, idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeMemberAll");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="removeMemberByIdOrgByIdMember"></a>
# **removeMemberByIdOrgByIdMember**
> removeMemberByIdOrgByIdMember(idOrg, idMember).execute();

deleteOrganizationsMembersByIdOrgByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String idMember = "idMember_example"; // idMember
    try {
      client
              .organization
              .removeMemberByIdOrgByIdMember(idOrg, idMember)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeMemberByIdOrgByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .removeMemberByIdOrgByIdMember(idOrg, idMember)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#removeMemberByIdOrgByIdMember");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="updateByIdOrg"></a>
# **updateByIdOrg**
> updateByIdOrg(idOrg, organizations).execute();

updateOrganizationsByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String desc = "desc_example"; // a string with a length from 0 to 16384
    String displayName = "displayName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String name = "name_example"; // a string with a length from 0 to 16384
    String prefsAssociatedDomain = "prefsAssociatedDomain_example"; // The google apps domain to link this org to.
    String prefsBoardVisibilityRestrictOrg = "prefsBoardVisibilityRestrictOrg_example"; // One of: admin, none or org
    String prefsBoardVisibilityRestrictPrivate = "prefsBoardVisibilityRestrictPrivate_example"; // One of: admin, none or org
    String prefsBoardVisibilityRestrictPublic = "prefsBoardVisibilityRestrictPublic_example"; // One of: admin, none or org
    String prefsExternalMembersDisabled = "prefsExternalMembersDisabled_example"; //  true or false
    String prefsGoogleAppsVersion = "prefsGoogleAppsVersion_example"; // a number from 1 to 2
    String prefsOrgInviteRestrict = "prefsOrgInviteRestrict_example"; // An email address with optional expansion tokens
    String prefsPermissionLevel = "prefsPermissionLevel_example"; // One of: private or public
    String website = "website_example"; // A URL starting with http:// or https:// or null
    try {
      client
              .organization
              .updateByIdOrg(idOrg)
              .desc(desc)
              .displayName(displayName)
              .name(name)
              .prefsAssociatedDomain(prefsAssociatedDomain)
              .prefsBoardVisibilityRestrictOrg(prefsBoardVisibilityRestrictOrg)
              .prefsBoardVisibilityRestrictPrivate(prefsBoardVisibilityRestrictPrivate)
              .prefsBoardVisibilityRestrictPublic(prefsBoardVisibilityRestrictPublic)
              .prefsExternalMembersDisabled(prefsExternalMembersDisabled)
              .prefsGoogleAppsVersion(prefsGoogleAppsVersion)
              .prefsOrgInviteRestrict(prefsOrgInviteRestrict)
              .prefsPermissionLevel(prefsPermissionLevel)
              .website(website)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateByIdOrg(idOrg)
              .desc(desc)
              .displayName(displayName)
              .name(name)
              .prefsAssociatedDomain(prefsAssociatedDomain)
              .prefsBoardVisibilityRestrictOrg(prefsBoardVisibilityRestrictOrg)
              .prefsBoardVisibilityRestrictPrivate(prefsBoardVisibilityRestrictPrivate)
              .prefsBoardVisibilityRestrictPublic(prefsBoardVisibilityRestrictPublic)
              .prefsExternalMembersDisabled(prefsExternalMembersDisabled)
              .prefsGoogleAppsVersion(prefsGoogleAppsVersion)
              .prefsOrgInviteRestrict(prefsOrgInviteRestrict)
              .prefsPermissionLevel(prefsPermissionLevel)
              .website(website)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizations** | [**Organizations**](Organizations.md)| Attributes of \&quot;Organizations\&quot; to be updated. | |

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

<a name="updateDescriptionByIdOrg"></a>
# **updateDescriptionByIdOrg**
> updateDescriptionByIdOrg(idOrg, organizationsDesc).execute();

updateOrganizationsDescByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // a string with a length from 0 to 16384
    try {
      client
              .organization
              .updateDescriptionByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateDescriptionByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateDescriptionByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateDescriptionByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizationsDesc** | [**OrganizationsDesc**](OrganizationsDesc.md)| Attributes of \&quot;Organizations Desc\&quot; to be updated. | |

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

<a name="updateDisplayNameByIdOrg"></a>
# **updateDisplayNameByIdOrg**
> updateDisplayNameByIdOrg(idOrg, organizationsDisplayName).execute();

updateOrganizationsDisplayNameByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    try {
      client
              .organization
              .updateDisplayNameByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateDisplayNameByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateDisplayNameByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateDisplayNameByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizationsDisplayName** | [**OrganizationsDisplayName**](OrganizationsDisplayName.md)| Attributes of \&quot;Organizations Display Name\&quot; to be updated. | |

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

<a name="updateMembersByIdOrg"></a>
# **updateMembersByIdOrg**
> updateMembersByIdOrg(idOrg, organizationsMembers).execute();

updateOrganizationsMembersByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String email = "email_example"; // An email address
    String fullName = "fullName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String type = "type_example"; // One of: admin, normal or observer
    try {
      client
              .organization
              .updateMembersByIdOrg(idOrg)
              .email(email)
              .fullName(fullName)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembersByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateMembersByIdOrg(idOrg)
              .email(email)
              .fullName(fullName)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembersByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizationsMembers** | [**OrganizationsMembers**](OrganizationsMembers.md)| Attributes of \&quot;Organizations Members\&quot; to be updated. | |

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

<a name="updateMembersByIdOrgByIdMember"></a>
# **updateMembersByIdOrgByIdMember**
> updateMembersByIdOrgByIdMember(idOrg, idMember, organizationsMembers).execute();

updateOrganizationsMembersByIdOrgByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String idMember = "idMember_example"; // idMember
    String email = "email_example"; // An email address
    String fullName = "fullName_example"; // A string with a length of at least 1.  Cannot begin or end with a space.
    String type = "type_example"; // One of: admin, normal or observer
    try {
      client
              .organization
              .updateMembersByIdOrgByIdMember(idOrg, idMember)
              .email(email)
              .fullName(fullName)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembersByIdOrgByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateMembersByIdOrgByIdMember(idOrg, idMember)
              .email(email)
              .fullName(fullName)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembersByIdOrgByIdMember");
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
| **idOrg** | **String**| idOrg or name | |
| **idMember** | **String**| idMember | |
| **organizationsMembers** | [**OrganizationsMembers**](OrganizationsMembers.md)| Attributes of \&quot;Organizations Members\&quot; to be updated. | |

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

<a name="updateMembersDeactivatedByIdOrgByIdMember"></a>
# **updateMembersDeactivatedByIdOrgByIdMember**
> updateMembersDeactivatedByIdOrgByIdMember(idOrg, idMember, organizationsMembersDeactivated).execute();

updateOrganizationsMembersDeactivatedByIdOrgByIdMember()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String idMember = "idMember_example"; // idMember
    String value = "value_example"; //  true or false
    try {
      client
              .organization
              .updateMembersDeactivatedByIdOrgByIdMember(idOrg, idMember)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembersDeactivatedByIdOrgByIdMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateMembersDeactivatedByIdOrgByIdMember(idOrg, idMember)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembersDeactivatedByIdOrgByIdMember");
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
| **idOrg** | **String**| idOrg or name | |
| **idMember** | **String**| idMember | |
| **organizationsMembersDeactivated** | [**OrganizationsMembersDeactivated**](OrganizationsMembersDeactivated.md)| Attributes of \&quot;Organizations Members Deactivated\&quot; to be updated. | |

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

<a name="updateMembershipByIdOrgByIdMembership"></a>
# **updateMembershipByIdOrgByIdMembership**
> updateMembershipByIdOrgByIdMembership(idOrg, idMembership, organizationsMemberships).execute();

updateOrganizationsMembershipsByIdOrgByIdMembership()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String idMembership = "idMembership_example"; // idMembership
    String memberFields = "memberFields_example"; // all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username
    String type = "type_example"; // One of: admin, normal or observer
    try {
      client
              .organization
              .updateMembershipByIdOrgByIdMembership(idOrg, idMembership)
              .memberFields(memberFields)
              .type(type)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembershipByIdOrgByIdMembership");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateMembershipByIdOrgByIdMembership(idOrg, idMembership)
              .memberFields(memberFields)
              .type(type)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateMembershipByIdOrgByIdMembership");
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
| **idOrg** | **String**| idOrg or name | |
| **idMembership** | **String**| idMembership | |
| **organizationsMemberships** | [**OrganizationsMemberships**](OrganizationsMemberships.md)| Attributes of \&quot;Organizations Memberships\&quot; to be updated. | |

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

<a name="updateNameByIdOrg"></a>
# **updateNameByIdOrg**
> updateNameByIdOrg(idOrg, organizationsName).execute();

updateOrganizationsNameByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // A string with a length of at least 3.  Only lowercase letters, underscores, and numbers are allowed.  Must be unique.
    try {
      client
              .organization
              .updateNameByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateNameByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateNameByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateNameByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizationsName** | [**OrganizationsName**](OrganizationsName.md)| Attributes of \&quot;Organizations Name\&quot; to be updated. | |

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

<a name="updatePrefsAssociatedDomainByIdOrg"></a>
# **updatePrefsAssociatedDomainByIdOrg**
> updatePrefsAssociatedDomainByIdOrg(idOrg, prefsAssociatedDomain).execute();

updateOrganizationsPrefsAssociatedDomainByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // The google apps domain to link this org to.
    try {
      client
              .organization
              .updatePrefsAssociatedDomainByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsAssociatedDomainByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsAssociatedDomainByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsAssociatedDomainByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsAssociatedDomain** | [**PrefsAssociatedDomain**](PrefsAssociatedDomain.md)| Attributes of \&quot;Prefs Associated Domain\&quot; to be updated. | |

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

<a name="updatePrefsBoardVisibilityRestrictByIdOrg"></a>
# **updatePrefsBoardVisibilityRestrictByIdOrg**
> updatePrefsBoardVisibilityRestrictByIdOrg(idOrg, prefsBoardVisibilityRestrict).execute();

updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // One of: admin, none or org
    try {
      client
              .organization
              .updatePrefsBoardVisibilityRestrictByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsBoardVisibilityRestrictByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsBoardVisibilityRestrictByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsBoardVisibilityRestrictByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsBoardVisibilityRestrict** | [**PrefsBoardVisibilityRestrict**](PrefsBoardVisibilityRestrict.md)| Attributes of \&quot;Prefs Board Visibility Restrict\&quot; to be updated. | |

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

<a name="updatePrefsBoardVisibilityRestrictPublicByIdOrg"></a>
# **updatePrefsBoardVisibilityRestrictPublicByIdOrg**
> updatePrefsBoardVisibilityRestrictPublicByIdOrg(idOrg, prefsBoardVisibilityRestrict).execute();

updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // One of: admin, none or org
    try {
      client
              .organization
              .updatePrefsBoardVisibilityRestrictPublicByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsBoardVisibilityRestrictPublicByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsBoardVisibilityRestrictPublicByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsBoardVisibilityRestrictPublicByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsBoardVisibilityRestrict** | [**PrefsBoardVisibilityRestrict**](PrefsBoardVisibilityRestrict.md)| Attributes of \&quot;Prefs Board Visibility Restrict\&quot; to be updated. | |

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

<a name="updatePrefsExternalMembersDisabledByIdOrg"></a>
# **updatePrefsExternalMembersDisabledByIdOrg**
> updatePrefsExternalMembersDisabledByIdOrg(idOrg, prefsExternalMembersDisabled).execute();

updateOrganizationsPrefsExternalMembersDisabledByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; //  true or false
    try {
      client
              .organization
              .updatePrefsExternalMembersDisabledByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsExternalMembersDisabledByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsExternalMembersDisabledByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsExternalMembersDisabledByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsExternalMembersDisabled** | [**PrefsExternalMembersDisabled**](PrefsExternalMembersDisabled.md)| Attributes of \&quot;Prefs External Members Disabled\&quot; to be updated. | |

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

<a name="updatePrefsGoogleAppsVersionByIdOrg"></a>
# **updatePrefsGoogleAppsVersionByIdOrg**
> updatePrefsGoogleAppsVersionByIdOrg(idOrg, prefsGoogleAppsVersion).execute();

updateOrganizationsPrefsGoogleAppsVersionByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // a number from 1 to 2
    try {
      client
              .organization
              .updatePrefsGoogleAppsVersionByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsGoogleAppsVersionByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsGoogleAppsVersionByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsGoogleAppsVersionByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsGoogleAppsVersion** | [**PrefsGoogleAppsVersion**](PrefsGoogleAppsVersion.md)| Attributes of \&quot;Prefs Google Apps Version\&quot; to be updated. | |

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

<a name="updatePrefsOrgInviteRestrictByIdOrg"></a>
# **updatePrefsOrgInviteRestrictByIdOrg**
> updatePrefsOrgInviteRestrictByIdOrg(idOrg, prefsOrgInviteRestrict).execute();

updateOrganizationsPrefsOrgInviteRestrictByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // An email address with optional expansion tokens
    try {
      client
              .organization
              .updatePrefsOrgInviteRestrictByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsOrgInviteRestrictByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsOrgInviteRestrictByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsOrgInviteRestrictByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsOrgInviteRestrict** | [**PrefsOrgInviteRestrict**](PrefsOrgInviteRestrict.md)| Attributes of \&quot;Prefs Org Invite Restrict\&quot; to be updated. | |

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

<a name="updatePrefsPermissionLevelByIdOrg"></a>
# **updatePrefsPermissionLevelByIdOrg**
> updatePrefsPermissionLevelByIdOrg(idOrg, prefsPermissionLevel).execute();

updateOrganizationsPrefsPermissionLevelByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // One of: private or public
    try {
      client
              .organization
              .updatePrefsPermissionLevelByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsPermissionLevelByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsPermissionLevelByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsPermissionLevelByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
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

<a name="updatePrefsVisibilityByIdOrg"></a>
# **updatePrefsVisibilityByIdOrg**
> updatePrefsVisibilityByIdOrg(idOrg, prefsBoardVisibilityRestrict).execute();

updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // One of: admin, none or org
    try {
      client
              .organization
              .updatePrefsVisibilityByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsVisibilityByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updatePrefsVisibilityByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updatePrefsVisibilityByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **prefsBoardVisibilityRestrict** | [**PrefsBoardVisibilityRestrict**](PrefsBoardVisibilityRestrict.md)| Attributes of \&quot;Prefs Board Visibility Restrict\&quot; to be updated. | |

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

<a name="updateWebsiteByIdOrg"></a>
# **updateWebsiteByIdOrg**
> updateWebsiteByIdOrg(idOrg, organizationsWebsite).execute();

updateOrganizationsWebsiteByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String value = "value_example"; // A URL starting with http:// or https:// or null
    try {
      client
              .organization
              .updateWebsiteByIdOrg(idOrg)
              .value(value)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateWebsiteByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .updateWebsiteByIdOrg(idOrg)
              .value(value)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateWebsiteByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizationsWebsite** | [**OrganizationsWebsite**](OrganizationsWebsite.md)| Attributes of \&quot;Organizations Website\&quot; to be updated. | |

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

<a name="uploadLogoByIdOrg"></a>
# **uploadLogoByIdOrg**
> uploadLogoByIdOrg(idOrg, organizationsLogo).execute();

addOrganizationsLogoByIdOrg()

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Trello;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrganizationApi;
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
    String idOrg = "idOrg_example"; // idOrg or name
    String _file = "_file_example"; // A file
    try {
      client
              .organization
              .uploadLogoByIdOrg(idOrg)
              ._file(_file)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#uploadLogoByIdOrg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .organization
              .uploadLogoByIdOrg(idOrg)
              ._file(_file)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#uploadLogoByIdOrg");
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
| **idOrg** | **String**| idOrg or name | |
| **organizationsLogo** | [**OrganizationsLogo**](OrganizationsLogo.md)| Attributes of \&quot;Organizations Logo\&quot; to be added. | |

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

