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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Lists;
import com.konfigthis.client.model.ListsCards;
import com.konfigthis.client.model.ListsClosed;
import com.konfigthis.client.model.ListsIdBoard;
import com.konfigthis.client.model.ListsMoveAllCards;
import com.konfigthis.client.model.ListsName;
import com.konfigthis.client.model.ListsPos;
import com.konfigthis.client.model.ListsSubscribed;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListApi
 */
@Disabled
public class ListApiTest {

    private static ListApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ListApi(apiClient);
    }

    /**
     * addListsArchiveAllCardsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveAllCardsByIdListTest() throws ApiException {
        String idList = null;
        api.archiveAllCardsByIdList(idList)
                .execute();
        // TODO: test validations
    }

    /**
     * addListsCardsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCardsByIdListTest() throws ApiException {
        String idList = null;
        String desc = null;
        String due = null;
        String idMembers = null;
        String labels = null;
        String name = null;
        api.createCardsByIdList(idList)
                .desc(desc)
                .due(due)
                .idMembers(idMembers)
                .labels(labels)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * addLists()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createListTest() throws ApiException {
        String closed = null;
        String idBoard = null;
        String idListSource = null;
        String name = null;
        String pos = null;
        String subscribed = null;
        api.createList()
                .closed(closed)
                .idBoard(idBoard)
                .idListSource(idListSource)
                .name(name)
                .pos(pos)
                .subscribed(subscribed)
                .execute();
        // TODO: test validations
    }

    /**
     * getListsActionsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getActionsByIdListTest() throws ApiException {
        String idList = null;
        String entities = null;
        String display = null;
        String filter = null;
        String fields = null;
        String limit = null;
        String format = null;
        String since = null;
        String before = null;
        String page = null;
        String idModels = null;
        String member = null;
        String memberFields = null;
        String memberCreator = null;
        String memberCreatorFields = null;
        api.getActionsByIdList(idList)
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
        // TODO: test validations
    }

    /**
     * getListsBoardByIdListByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardByIdListByFieldTest() throws ApiException {
        String idList = null;
        String field = null;
        api.getBoardByIdListByField(idList, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getListsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdListTest() throws ApiException {
        String idList = null;
        String cards = null;
        String cardFields = null;
        String board = null;
        String boardFields = null;
        String fields = null;
        api.getByIdList(idList)
                .cards(cards)
                .cardFields(cardFields)
                .board(board)
                .boardFields(boardFields)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getListsByIdListByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdListByFieldTest() throws ApiException {
        String idList = null;
        String field = null;
        api.getByIdListByField(idList, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getListsCardsByIdListByFilter()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardsByFilterTest() throws ApiException {
        String idList = null;
        String filter = null;
        api.getCardsByFilter(idList, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getListsCardsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardsByIdListTest() throws ApiException {
        String idList = null;
        String actions = null;
        String attachments = null;
        String attachmentFields = null;
        String stickers = null;
        String members = null;
        String memberFields = null;
        String checkItemStates = null;
        String checklists = null;
        String limit = null;
        String since = null;
        String before = null;
        String filter = null;
        String fields = null;
        api.getCardsByIdList(idList)
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
        // TODO: test validations
    }

    /**
     * getListsBoardByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void idBoardGetTest() throws ApiException {
        String idList = null;
        String fields = null;
        api.idBoardGet(idList)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * addListsMoveAllCardsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveAllCardsByIdListTest() throws ApiException {
        String idList = null;
        String idBoard = null;
        api.moveAllCardsByIdList(idList)
                .idBoard(idBoard)
                .execute();
        // TODO: test validations
    }

    /**
     * updateListsByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdListTest() throws ApiException {
        String idList = null;
        String closed = null;
        String idBoard = null;
        String idListSource = null;
        String name = null;
        String pos = null;
        String subscribed = null;
        api.updateByIdList(idList)
                .closed(closed)
                .idBoard(idBoard)
                .idListSource(idListSource)
                .name(name)
                .pos(pos)
                .subscribed(subscribed)
                .execute();
        // TODO: test validations
    }

    /**
     * updateListsClosedByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateClosedByIdListTest() throws ApiException {
        String idList = null;
        String value = null;
        api.updateClosedByIdList(idList)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateListsIdBoardByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIdBoardByIdListTest() throws ApiException {
        String idList = null;
        String pos = null;
        String value = null;
        api.updateIdBoardByIdList(idList)
                .pos(pos)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateListsNameByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateNameByIdListTest() throws ApiException {
        String idList = null;
        String value = null;
        api.updateNameByIdList(idList)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateListsPosByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePosByIdListTest() throws ApiException {
        String idList = null;
        String value = null;
        api.updatePosByIdList(idList)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateListsSubscribedByIdList()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSubscribedByIdListTest() throws ApiException {
        String idList = null;
        String value = null;
        api.updateSubscribedByIdList(idList)
                .value(value)
                .execute();
        // TODO: test validations
    }

}
