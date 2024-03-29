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
import com.konfigthis.client.model.Checklists;
import com.konfigthis.client.model.ChecklistsCheckItems;
import com.konfigthis.client.model.ChecklistsIdCard;
import com.konfigthis.client.model.ChecklistsName;
import com.konfigthis.client.model.ChecklistsPos;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChecklistApi
 */
@Disabled
public class ChecklistApiTest {

    private static ChecklistApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ChecklistApi(apiClient);
    }

    /**
     * addChecklistsCheckItemsByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCheckItemsByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String checked = null;
        String name = null;
        String pos = null;
        api.addCheckItemsByIdChecklist(idChecklist)
                .checked(checked)
                .name(name)
                .pos(pos)
                .execute();
        // TODO: test validations
    }

    /**
     * addChecklists()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String idBoard = null;
        String idCard = null;
        String idChecklistSource = null;
        String name = null;
        String pos = null;
        api.create()
                .idBoard(idBoard)
                .idCard(idCard)
                .idChecklistSource(idChecklistSource)
                .name(name)
                .pos(pos)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsBoardByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String fields = null;
        api.getBoardByIdChecklist(idChecklist)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsBoardByIdChecklistByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardByIdChecklistByFieldTest() throws ApiException {
        String idChecklist = null;
        String field = null;
        api.getBoardByIdChecklistByField(idChecklist, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String idChecklist = null;
        String cards = null;
        String cardFields = null;
        String checkItems = null;
        String checkItemFields = null;
        String fields = null;
        api.getById(idChecklist)
                .cards(cards)
                .cardFields(cardFields)
                .checkItems(checkItems)
                .checkItemFields(checkItemFields)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsByIdChecklistByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdFieldTest() throws ApiException {
        String idChecklist = null;
        String field = null;
        api.getByIdField(idChecklist, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsCardsByIdChecklistByFilter()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardsByFilterTest() throws ApiException {
        String idChecklist = null;
        String filter = null;
        api.getCardsByFilter(idChecklist, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsCheckItemsByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCheckItemsByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String filter = null;
        String fields = null;
        api.getCheckItemsByIdChecklist(idChecklist)
                .filter(filter)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsCheckItemsByIdChecklistByIdCheckItem()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCheckItemsByIdChecklistByIdCheckItemTest() throws ApiException {
        String idChecklist = null;
        String idCheckItem = null;
        String fields = null;
        api.getCheckItemsByIdChecklistByIdCheckItem(idChecklist, idCheckItem)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getChecklistsCardsByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCardsByIdChecklistTest() throws ApiException {
        String idChecklist = null;
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
        api.listCardsByIdChecklist(idChecklist)
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
     * deleteChecklistsByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String idChecklist = null;
        api.removeById(idChecklist)
                .execute();
        // TODO: test validations
    }

    /**
     * deleteChecklistsCheckItemsByIdChecklistByIdCheckItem()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdCheckItemTest() throws ApiException {
        String idChecklist = null;
        String idCheckItem = null;
        api.removeByIdCheckItem(idChecklist, idCheckItem)
                .execute();
        // TODO: test validations
    }

    /**
     * updateChecklistsByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String idBoard = null;
        String idCard = null;
        String idChecklistSource = null;
        String name = null;
        String pos = null;
        api.updateByIdChecklist(idChecklist)
                .idBoard(idBoard)
                .idCard(idCard)
                .idChecklistSource(idChecklistSource)
                .name(name)
                .pos(pos)
                .execute();
        // TODO: test validations
    }

    /**
     * updateChecklistsIdCardByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIdCardByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String value = null;
        api.updateIdCardByIdChecklist(idChecklist)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateChecklistsNameByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateNameByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String value = null;
        api.updateNameByIdChecklist(idChecklist)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateChecklistsPosByIdChecklist()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePosByIdChecklistTest() throws ApiException {
        String idChecklist = null;
        String value = null;
        api.updatePosByIdChecklist(idChecklist)
                .value(value)
                .execute();
        // TODO: test validations
    }

}
