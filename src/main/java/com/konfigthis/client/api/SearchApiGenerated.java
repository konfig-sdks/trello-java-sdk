/*
 * Trello
 * This document describes the REST API of Trello as published by Trello.com.  - <a href='https://trello.com/docs/index.html' target='_blank'>Official Documentation</a>  - <a href='https://trello.com/docs/api' target='_blank'>The HTML pages that were scraped in order to generate this specification.</a>
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SearchApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call findMembersCall(String query, String limit, String idBoard, String idOrganization, String onlyOrgMembers, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/search/members";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (idBoard != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("idBoard", idBoard));
        }

        if (idOrganization != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("idOrganization", idOrganization));
        }

        if (onlyOrgMembers != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("onlyOrgMembers", onlyOrgMembers));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findMembersValidateBeforeCall(String query, String limit, String idBoard, String idOrganization, String onlyOrgMembers, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling findMembers(Async)");
        }

        return findMembersCall(query, limit, idBoard, idOrganization, onlyOrgMembers, _callback);

    }


    private ApiResponse<Void> findMembersWithHttpInfo(String query, String limit, String idBoard, String idOrganization, String onlyOrgMembers) throws ApiException {
        okhttp3.Call localVarCall = findMembersValidateBeforeCall(query, limit, idBoard, idOrganization, onlyOrgMembers, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call findMembersAsync(String query, String limit, String idBoard, String idOrganization, String onlyOrgMembers, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = findMembersValidateBeforeCall(query, limit, idBoard, idOrganization, onlyOrgMembers, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class FindMembersRequestBuilder {
        private final String query;
        private String limit;
        private String idBoard;
        private String idOrganization;
        private String onlyOrgMembers;

        private FindMembersRequestBuilder(String query) {
            this.query = query;
        }

        /**
         * Set limit
         * @param limit a number from 1 to 20 (optional, default to 8)
         * @return FindMembersRequestBuilder
         */
        public FindMembersRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set idBoard
         * @param idBoard An id, or null (optional)
         * @return FindMembersRequestBuilder
         */
        public FindMembersRequestBuilder idBoard(String idBoard) {
            this.idBoard = idBoard;
            return this;
        }
        
        /**
         * Set idOrganization
         * @param idOrganization An id, or null (optional)
         * @return FindMembersRequestBuilder
         */
        public FindMembersRequestBuilder idOrganization(String idOrganization) {
            this.idOrganization = idOrganization;
            return this;
        }
        
        /**
         * Set onlyOrgMembers
         * @param onlyOrgMembers A boolean (optional)
         * @return FindMembersRequestBuilder
         */
        public FindMembersRequestBuilder onlyOrgMembers(String onlyOrgMembers) {
            this.onlyOrgMembers = onlyOrgMembers;
            return this;
        }
        
        /**
         * Build call for findMembers
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return findMembersCall(query, limit, idBoard, idOrganization, onlyOrgMembers, _callback);
        }


        /**
         * Execute findMembers request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            findMembersWithHttpInfo(query, limit, idBoard, idOrganization, onlyOrgMembers);
        }

        /**
         * Execute findMembers request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return findMembersWithHttpInfo(query, limit, idBoard, idOrganization, onlyOrgMembers);
        }

        /**
         * Execute findMembers request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return findMembersAsync(query, limit, idBoard, idOrganization, onlyOrgMembers, _callback);
        }
    }

    /**
     * getSearchMembers()
     * 
     * @param query a string with a length from 1 to 16384 (required)
     * @return FindMembersRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
     </table>
     */
    public FindMembersRequestBuilder findMembers(String query) throws IllegalArgumentException {
        if (query == null) throw new IllegalArgumentException("\"query\" is required but got null");
            

        return new FindMembersRequestBuilder(query);
    }
    private okhttp3.Call getResultsCall(String query, String idOrganizations, String idBoards, String idCards, String modelTypes, String boardFields, String boardsLimit, String cardFields, String cardsLimit, String cardsPage, String cardBoard, String cardList, String cardMembers, String cardStickers, String cardAttachments, String organizationFields, String organizationsLimit, String memberFields, String membersLimit, String partial, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (idBoards != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("idBoards", idBoards));
        }

        if (idOrganizations != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("idOrganizations", idOrganizations));
        }

        if (idCards != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("idCards", idCards));
        }

        if (modelTypes != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modelTypes", modelTypes));
        }

        if (boardFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("board_fields", boardFields));
        }

        if (boardsLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("boards_limit", boardsLimit));
        }

        if (cardFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_fields", cardFields));
        }

        if (cardsLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cards_limit", cardsLimit));
        }

        if (cardsPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cards_page", cardsPage));
        }

        if (cardBoard != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_board", cardBoard));
        }

        if (cardList != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_list", cardList));
        }

        if (cardMembers != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_members", cardMembers));
        }

        if (cardStickers != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_stickers", cardStickers));
        }

        if (cardAttachments != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("card_attachments", cardAttachments));
        }

        if (organizationFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("organization_fields", organizationFields));
        }

        if (organizationsLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("organizations_limit", organizationsLimit));
        }

        if (memberFields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("member_fields", memberFields));
        }

        if (membersLimit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("members_limit", membersLimit));
        }

        if (partial != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("partial", partial));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key", "api_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getResultsValidateBeforeCall(String query, String idOrganizations, String idBoards, String idCards, String modelTypes, String boardFields, String boardsLimit, String cardFields, String cardsLimit, String cardsPage, String cardBoard, String cardList, String cardMembers, String cardStickers, String cardAttachments, String organizationFields, String organizationsLimit, String memberFields, String membersLimit, String partial, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling getResults(Async)");
        }

        // verify the required parameter 'idOrganizations' is set
        if (idOrganizations == null) {
            throw new ApiException("Missing the required parameter 'idOrganizations' when calling getResults(Async)");
        }

        return getResultsCall(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial, _callback);

    }


    private ApiResponse<Void> getResultsWithHttpInfo(String query, String idOrganizations, String idBoards, String idCards, String modelTypes, String boardFields, String boardsLimit, String cardFields, String cardsLimit, String cardsPage, String cardBoard, String cardList, String cardMembers, String cardStickers, String cardAttachments, String organizationFields, String organizationsLimit, String memberFields, String membersLimit, String partial) throws ApiException {
        okhttp3.Call localVarCall = getResultsValidateBeforeCall(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getResultsAsync(String query, String idOrganizations, String idBoards, String idCards, String modelTypes, String boardFields, String boardsLimit, String cardFields, String cardsLimit, String cardsPage, String cardBoard, String cardList, String cardMembers, String cardStickers, String cardAttachments, String organizationFields, String organizationsLimit, String memberFields, String membersLimit, String partial, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResultsValidateBeforeCall(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetResultsRequestBuilder {
        private final String query;
        private final String idOrganizations;
        private String idBoards;
        private String idCards;
        private String modelTypes;
        private String boardFields;
        private String boardsLimit;
        private String cardFields;
        private String cardsLimit;
        private String cardsPage;
        private String cardBoard;
        private String cardList;
        private String cardMembers;
        private String cardStickers;
        private String cardAttachments;
        private String organizationFields;
        private String organizationsLimit;
        private String memberFields;
        private String membersLimit;
        private String partial;

        private GetResultsRequestBuilder(String query, String idOrganizations) {
            this.query = query;
            this.idOrganizations = idOrganizations;
        }

        /**
         * Set idBoards
         * @param idBoards A comma-separated list of objectIds, 24-character hex strings (optional, default to mine)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder idBoards(String idBoards) {
            this.idBoards = idBoards;
            return this;
        }
        
        /**
         * Set idCards
         * @param idCards A comma-separated list of objectIds, 24-character hex strings (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder idCards(String idCards) {
            this.idCards = idCards;
            return this;
        }
        
        /**
         * Set modelTypes
         * @param modelTypes all or a comma-separated list of: actions, boards, cards, members or organizations (optional, default to all)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder modelTypes(String modelTypes) {
            this.modelTypes = modelTypes;
            return this;
        }
        
        /**
         * Set boardFields
         * @param boardFields all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs, shortLink, shortUrl, starred, subscribed or url (optional, default to name and idOrganization)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder boardFields(String boardFields) {
            this.boardFields = boardFields;
            return this;
        }
        
        /**
         * Set boardsLimit
         * @param boardsLimit a number from 1 to 1000 (optional, default to 10)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder boardsLimit(String boardsLimit) {
            this.boardsLimit = boardsLimit;
            return this;
        }
        
        /**
         * Set cardFields
         * @param cardFields all or a comma-separated list of: badges, checkItemStates, closed, dateLastActivity, desc, descData, due, email, idAttachmentCover, idBoard, idChecklists, idLabels, idList, idMembers, idMembersVoted, idShort, labels, manualCoverAttachment, name, pos, shortLink, shortUrl, subscribed or url (optional, default to all)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardFields(String cardFields) {
            this.cardFields = cardFields;
            return this;
        }
        
        /**
         * Set cardsLimit
         * @param cardsLimit a number from 1 to 1000 (optional, default to 10)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardsLimit(String cardsLimit) {
            this.cardsLimit = cardsLimit;
            return this;
        }
        
        /**
         * Set cardsPage
         * @param cardsPage a number from 0 to 100 (optional, default to 0)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardsPage(String cardsPage) {
            this.cardsPage = cardsPage;
            return this;
        }
        
        /**
         * Set cardBoard
         * @param cardBoard  true or false (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardBoard(String cardBoard) {
            this.cardBoard = cardBoard;
            return this;
        }
        
        /**
         * Set cardList
         * @param cardList  true or false (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardList(String cardList) {
            this.cardList = cardList;
            return this;
        }
        
        /**
         * Set cardMembers
         * @param cardMembers  true or false (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardMembers(String cardMembers) {
            this.cardMembers = cardMembers;
            return this;
        }
        
        /**
         * Set cardStickers
         * @param cardStickers  true or false (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardStickers(String cardStickers) {
            this.cardStickers = cardStickers;
            return this;
        }
        
        /**
         * Set cardAttachments
         * @param cardAttachments A boolean value or &amp;quot;cover&amp;quot; for only card cover attachments (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder cardAttachments(String cardAttachments) {
            this.cardAttachments = cardAttachments;
            return this;
        }
        
        /**
         * Set organizationFields
         * @param organizationFields all or a comma-separated list of: billableMemberCount, desc, descData, displayName, idBoards, invitations, invited, logoHash, memberships, name, powerUps, prefs, premiumFeatures, products, url or website (optional, default to name and displayName)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder organizationFields(String organizationFields) {
            this.organizationFields = organizationFields;
            return this;
        }
        
        /**
         * Set organizationsLimit
         * @param organizationsLimit a number from 1 to 1000 (optional, default to 10)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder organizationsLimit(String organizationsLimit) {
            this.organizationsLimit = organizationsLimit;
            return this;
        }
        
        /**
         * Set memberFields
         * @param memberFields all or a comma-separated list of: avatarHash, bio, bioData, confirmed, fullName, idPremOrgsAdmin, initials, memberType, products, status, url or username (optional, default to avatarHash, fullName, initials, username and confirmed)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder memberFields(String memberFields) {
            this.memberFields = memberFields;
            return this;
        }
        
        /**
         * Set membersLimit
         * @param membersLimit a number from 1 to 1000 (optional, default to 10)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder membersLimit(String membersLimit) {
            this.membersLimit = membersLimit;
            return this;
        }
        
        /**
         * Set partial
         * @param partial  true or false (optional)
         * @return GetResultsRequestBuilder
         */
        public GetResultsRequestBuilder partial(String partial) {
            this.partial = partial;
            return this;
        }
        
        /**
         * Build call for getResults
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getResultsCall(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial, _callback);
        }


        /**
         * Execute getResults request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getResultsWithHttpInfo(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial);
        }

        /**
         * Execute getResults request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getResultsWithHttpInfo(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial);
        }

        /**
         * Execute getResults request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getResultsAsync(query, idOrganizations, idBoards, idCards, modelTypes, boardFields, boardsLimit, cardFields, cardsLimit, cardsPage, cardBoard, cardList, cardMembers, cardStickers, cardAttachments, organizationFields, organizationsLimit, memberFields, membersLimit, partial, _callback);
        }
    }

    /**
     * getSearch()
     * 
     * @param query a string with a length from 1 to 16384 (required)
     * @param idOrganizations A comma-separated list of objectIds, 24-character hex strings (required)
     * @return GetResultsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Server rejection </td><td>  -  </td></tr>
     </table>
     */
    public GetResultsRequestBuilder getResults(String query, String idOrganizations) throws IllegalArgumentException {
        if (query == null) throw new IllegalArgumentException("\"query\" is required but got null");
            

        if (idOrganizations == null) throw new IllegalArgumentException("\"idOrganizations\" is required but got null");
            

        return new GetResultsRequestBuilder(query, idOrganizations);
    }
}
