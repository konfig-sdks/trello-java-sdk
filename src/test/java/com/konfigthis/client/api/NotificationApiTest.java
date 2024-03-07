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
import com.konfigthis.client.model.Notifications;
import com.konfigthis.client.model.NotificationsUnread;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
@Disabled
public class NotificationApiTest {

    private static NotificationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new NotificationApi(apiClient);
    }

    /**
     * getNotificationsBoardByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardByFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getBoardByField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsBoardByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardByIdTest() throws ApiException {
        String idNotification = null;
        String fields = null;
        api.getBoardById(idNotification)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String idNotification = null;
        String display = null;
        String entities = null;
        String fields = null;
        String memberCreator = null;
        String memberCreatorFields = null;
        String board = null;
        String boardFields = null;
        String list = null;
        String card = null;
        String cardFields = null;
        String organization = null;
        String organizationFields = null;
        String member = null;
        String memberFields = null;
        api.getById(idNotification)
                .display(display)
                .entities(entities)
                .fields(fields)
                .memberCreator(memberCreator)
                .memberCreatorFields(memberCreatorFields)
                .board(board)
                .boardFields(boardFields)
                .list(list)
                .card(card)
                .cardFields(cardFields)
                .organization(organization)
                .organizationFields(organizationFields)
                .member(member)
                .memberFields(memberFields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getByIdField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsCardByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardByIdTest() throws ApiException {
        String idNotification = null;
        String fields = null;
        api.getCardById(idNotification)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsCardByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardByIdNotificationByFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getCardByIdNotificationByField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsDisplayByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDisplayByIdNotificationTest() throws ApiException {
        String idNotification = null;
        api.getDisplayByIdNotification(idNotification)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsEntitiesByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEntitiesByIdNotificationTest() throws ApiException {
        String idNotification = null;
        api.getEntitiesByIdNotification(idNotification)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsListByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListByIdNotificationTest() throws ApiException {
        String idNotification = null;
        String fields = null;
        api.getListByIdNotification(idNotification)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsListByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListByIdNotificationByFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getListByIdNotificationByField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsMemberByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMemberByIdFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getMemberByIdField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsMemberCreatorByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMemberByIdNotificationByFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getMemberByIdNotificationByField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsMemberByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMemberByNotificationTest() throws ApiException {
        String idNotification = null;
        String fields = null;
        api.getMemberByNotification(idNotification)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsMemberCreatorByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMemberCreatorByIdTest() throws ApiException {
        String idNotification = null;
        String fields = null;
        api.getMemberCreatorById(idNotification)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsOrganizationByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrganizationByIdNotificationTest() throws ApiException {
        String idNotification = null;
        String fields = null;
        api.getOrganizationByIdNotification(idNotification)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getNotificationsOrganizationByIdNotificationByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrganizationByIdNotificationByFieldTest() throws ApiException {
        String idNotification = null;
        String field = null;
        api.getOrganizationByIdNotificationByField(idNotification, field)
                .execute();
        // TODO: test validations
    }

    /**
     * addNotificationsAllRead()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void markAllAsReadTest() throws ApiException {
        api.markAllAsRead()
                .execute();
        // TODO: test validations
    }

    /**
     * updateNotificationsByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdNotificationTest() throws ApiException {
        String idNotification = null;
        String unread = null;
        api.updateByIdNotification(idNotification)
                .unread(unread)
                .execute();
        // TODO: test validations
    }

    /**
     * updateNotificationsUnreadByIdNotification()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUnreadByIdNotificationTest() throws ApiException {
        String idNotification = null;
        String value = null;
        api.updateUnreadByIdNotification(idNotification)
                .value(value)
                .execute();
        // TODO: test validations
    }

}