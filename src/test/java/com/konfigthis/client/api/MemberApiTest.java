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
import com.konfigthis.client.model.Members;
import com.konfigthis.client.model.MembersAvatar;
import com.konfigthis.client.model.MembersAvatarSource;
import com.konfigthis.client.model.MembersBio;
import com.konfigthis.client.model.MembersBoardBackgrounds;
import com.konfigthis.client.model.MembersBoardStars;
import com.konfigthis.client.model.MembersBoardStarsIdBoard;
import com.konfigthis.client.model.MembersBoardStarsPos;
import com.konfigthis.client.model.MembersCustomBoardBackgrounds;
import com.konfigthis.client.model.MembersCustomEmoji;
import com.konfigthis.client.model.MembersCustomStickers;
import com.konfigthis.client.model.MembersFullName;
import com.konfigthis.client.model.MembersInitials;
import com.konfigthis.client.model.MembersOneTimeMessagesDismissed;
import com.konfigthis.client.model.MembersSavedSearches;
import com.konfigthis.client.model.MembersSavedSearchesName;
import com.konfigthis.client.model.MembersSavedSearchesPos;
import com.konfigthis.client.model.MembersSavedSearchesQuery;
import com.konfigthis.client.model.MembersUsername;
import com.konfigthis.client.model.PrefsColorBlind;
import com.konfigthis.client.model.PrefsLocale;
import com.konfigthis.client.model.PrefsMinutesBetweenSummaries;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MemberApi
 */
@Disabled
public class MemberApiTest {

    private static MemberApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MemberApi(apiClient);
    }

    /**
     * addMembersBoardBackgroundsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBoardBackgroundsTest() throws ApiException {
        String idMember = null;
        String brightness = null;
        String _file = null;
        String tile = null;
        api.addBoardBackgrounds(idMember)
                .brightness(brightness)
                ._file(_file)
                .tile(tile)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersBoardStarsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addBoardStarsByIdMemberTest() throws ApiException {
        String idMember = null;
        String idBoard = null;
        String pos = null;
        api.addBoardStarsByIdMember(idMember)
                .idBoard(idBoard)
                .pos(pos)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersCustomBoardBackgroundsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomBoardBackgroundsTest() throws ApiException {
        String idMember = null;
        String brightness = null;
        String _file = null;
        String tile = null;
        api.addCustomBoardBackgrounds(idMember)
                .brightness(brightness)
                ._file(_file)
                .tile(tile)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersCustomEmojiByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomEmojiByIdMemberTest() throws ApiException {
        String idMember = null;
        String _file = null;
        String name = null;
        api.addCustomEmojiByIdMember(idMember)
                ._file(_file)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersCustomStickersByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCustomStickersTest() throws ApiException {
        String idMember = null;
        String _file = null;
        api.addCustomStickers(idMember)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersOneTimeMessagesDismissedByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOneTimeMessagesDismissedByIdMemberTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.addOneTimeMessagesDismissedByIdMember(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersSavedSearchesByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSavedSearchTest() throws ApiException {
        String idMember = null;
        String name = null;
        String pos = null;
        String query = null;
        api.createSavedSearch(idMember)
                .name(name)
                .pos(pos)
                .query(query)
                .execute();
        // TODO: test validations
    }

    /**
     * deleteMembersBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBoardBackgroundTest() throws ApiException {
        String idMember = null;
        String idBoardBackground = null;
        api.deleteBoardBackground(idMember, idBoardBackground)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardBackgroundByIdsTest() throws ApiException {
        String idMember = null;
        String idBoardBackground = null;
        String fields = null;
        api.getBoardBackgroundByIds(idMember, idBoardBackground)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardBackgroundsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardBackgroundsByIdTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getBoardBackgroundsById(idMember)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardStarsByIdMemberByIdBoardStar()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardStarByIdMemberTest() throws ApiException {
        String idMember = null;
        String idBoardStar = null;
        api.getBoardStarByIdMember(idMember, idBoardStar)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardStarsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardStarsByIdTest() throws ApiException {
        String idMember = null;
        api.getBoardStarsById(idMember)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardsByIdMemberByFilter()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardsTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getBoards(idMember, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardsByIdMemberTest() throws ApiException {
        String idMember = null;
        String filter = null;
        String fields = null;
        String actions = null;
        String actionsEntities = null;
        String actionsLimit = null;
        String actionsFormat = null;
        String actionsSince = null;
        String actionFields = null;
        String memberships = null;
        String organization = null;
        String organizationFields = null;
        String lists = null;
        api.getBoardsByIdMember(idMember)
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
        // TODO: test validations
    }

    /**
     * getMembersBoardsInvitedByIdMemberByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBoardsInvitedByIdMemberByFieldTest() throws ApiException {
        String idMember = null;
        String field = null;
        api.getBoardsInvitedByIdMemberByField(idMember, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersByIdMemberByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByFieldTest() throws ApiException {
        String idMember = null;
        String field = null;
        api.getByField(idMember, field)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersByIdMember()
     *
     * If you specify &#39;me&#39; as the username, this call will respond as if you had supplied the username associated with the supplied token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String idMember = null;
        String actions = null;
        String actionsEntities = null;
        String actionsDisplay = null;
        String actionsLimit = null;
        String actionFields = null;
        String actionSince = null;
        String actionBefore = null;
        String cards = null;
        String cardFields = null;
        String cardMembers = null;
        String cardMemberFields = null;
        String cardAttachments = null;
        String cardAttachmentFields = null;
        String cardStickers = null;
        String boards = null;
        String boardFields = null;
        String boardActions = null;
        String boardActionsEntities = null;
        String boardActionsDisplay = null;
        String boardActionsFormat = null;
        String boardActionsSince = null;
        String boardActionsLimit = null;
        String boardActionFields = null;
        String boardLists = null;
        String boardMemberships = null;
        String boardOrganization = null;
        String boardOrganizationFields = null;
        String boardsInvited = null;
        String boardsInvitedFields = null;
        String boardStars = null;
        String savedSearches = null;
        String organizations = null;
        String organizationFields = null;
        String organizationPaidAccount = null;
        String organizationsInvited = null;
        String organizationsInvitedFields = null;
        String notifications = null;
        String notificationsEntities = null;
        String notificationsDisplay = null;
        String notificationsLimit = null;
        String notificationFields = null;
        String notificationMemberCreator = null;
        String notificationMemberCreatorFields = null;
        String notificationBefore = null;
        String notificationSince = null;
        String tokens = null;
        String paidAccount = null;
        String boardBackgrounds = null;
        String customBoardBackgrounds = null;
        String customStickers = null;
        String customEmoji = null;
        String fields = null;
        api.getById(idMember)
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
        // TODO: test validations
    }

    /**
     * getMembersCardsByIdMemberByFilter()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardsByFilterTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getCardsByFilter(idMember, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersCardsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardsByIdMemberTest() throws ApiException {
        String idMember = null;
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
        api.getCardsByIdMember(idMember)
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
     * getMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomBoardBackgroundByIdsTest() throws ApiException {
        String idMember = null;
        String idBoardBackground = null;
        String fields = null;
        api.getCustomBoardBackgroundByIds(idMember, idBoardBackground)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersCustomBoardBackgroundsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomBoardBackgroundsByIdTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getCustomBoardBackgroundsById(idMember)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersCustomEmojiByIdMemberByIdCustomEmoji()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomEmojiByIdsTest() throws ApiException {
        String idMember = null;
        String idCustomEmoji = null;
        String fields = null;
        api.getCustomEmojiByIds(idMember, idCustomEmoji)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersCustomStickersByIdMemberByIdCustomSticker()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomStickerByIdsTest() throws ApiException {
        String idMember = null;
        String idCustomSticker = null;
        String fields = null;
        api.getCustomStickerByIds(idMember, idCustomSticker)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersCustomStickersByIdMember()
     *
     * This gets a list of all of the user’s uploaded stickers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomStickersByIdMemberTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getCustomStickersByIdMember(idMember)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersDeltasByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeltasByIdMemberTest() throws ApiException {
        String idMember = null;
        String tags = null;
        String ixLastUpdate = null;
        api.getDeltasByIdMember(idMember, tags, ixLastUpdate)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersBoardsInvitedByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvitedBoardsTest() throws ApiException {
        String idMember = null;
        String fields = null;
        api.getInvitedBoards(idMember)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersNotificationsByIdMember()
     *
     * You can only read the notifications for the member associated with the supplied token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNotificationsByIdMemberTest() throws ApiException {
        String idMember = null;
        String entities = null;
        String display = null;
        String filter = null;
        String readFilter = null;
        String fields = null;
        String limit = null;
        String page = null;
        String before = null;
        String since = null;
        String memberCreator = null;
        String memberCreatorFields = null;
        api.getNotificationsByIdMember(idMember)
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
        // TODO: test validations
    }

    /**
     * getMembersNotificationsByIdMemberByFilter()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNotificationsByIdMemberByFilterTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getNotificationsByIdMemberByFilter(idMember, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersOrganizationsByIdMemberByFilter()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrganizationsTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getOrganizations(idMember, filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersSavedSearchesByIdMemberByIdSavedSearch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSavedSearchByIdsTest() throws ApiException {
        String idMember = null;
        String idSavedSearch = null;
        api.getSavedSearchByIds(idMember, idSavedSearch)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersSavedSearchesByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSavedSearchesByIdMemberTest() throws ApiException {
        String idMember = null;
        api.getSavedSearchesByIdMember(idMember)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersTokensByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokensByIdMemberTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.getTokensByIdMember(idMember)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersActionsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listActionsByIdMemberTest() throws ApiException {
        String idMember = null;
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
        api.listActionsByIdMember(idMember)
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
     * getMembersCustomEmojiByIdMember()
     *
     * This gets the list of all of the user’s uploaded emoji
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCustomEmojiByIdMemberTest() throws ApiException {
        String idMember = null;
        String filter = null;
        api.listCustomEmojiByIdMember(idMember)
                .filter(filter)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersOrganizationsInvitedByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInvitedOrganizationsByIdTest() throws ApiException {
        String idMember = null;
        String fields = null;
        api.listInvitedOrganizationsById(idMember)
                .fields(fields)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersOrganizationsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listOrganizationsByIdTest() throws ApiException {
        String idMember = null;
        String filter = null;
        String fields = null;
        String paidAccount = null;
        api.listOrganizationsById(idMember)
                .filter(filter)
                .fields(fields)
                .paidAccount(paidAccount)
                .execute();
        // TODO: test validations
    }

    /**
     * getMembersOrganizationsInvitedByIdMemberByField()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listOrganizationsInvitedByIdMemberByFieldTest() throws ApiException {
        String idMember = null;
        String field = null;
        api.listOrganizationsInvitedByIdMemberByField(idMember, field)
                .execute();
        // TODO: test validations
    }

    /**
     * deleteMembersBoardStarsByIdMemberByIdBoardStar()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeBoardStarByIdMemberByIdBoardStarTest() throws ApiException {
        String idMember = null;
        String idBoardStar = null;
        api.removeBoardStarByIdMemberByIdBoardStar(idMember, idBoardStar)
                .execute();
        // TODO: test validations
    }

    /**
     * deleteMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCustomBoardBackgroundByIdTest() throws ApiException {
        String idMember = null;
        String idBoardBackground = null;
        api.removeCustomBoardBackgroundById(idMember, idBoardBackground)
                .execute();
        // TODO: test validations
    }

    /**
     * deleteMembersCustomStickersByIdMemberByIdCustomSticker()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeCustomStickerByIdsTest() throws ApiException {
        String idMember = null;
        String idCustomSticker = null;
        api.removeCustomStickerByIds(idMember, idCustomSticker)
                .execute();
        // TODO: test validations
    }

    /**
     * deleteMembersSavedSearchesByIdMemberByIdSavedSearch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSavedSearchByIdsTest() throws ApiException {
        String idMember = null;
        String idSavedSearch = null;
        api.removeSavedSearchByIds(idMember, idSavedSearch)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersAvatarSourceByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAvatarSourceTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updateAvatarSource(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersBioByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBioByIdTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updateBioById(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBoardBackgroundsByIdTest() throws ApiException {
        String idMember = null;
        String idBoardBackground = null;
        String brightness = null;
        String _file = null;
        String tile = null;
        api.updateBoardBackgroundsById(idMember, idBoardBackground)
                .brightness(brightness)
                ._file(_file)
                .tile(tile)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersBoardStarsByIdMemberByIdBoardStar()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBoardStarTest() throws ApiException {
        String idMember = null;
        String idBoardStar = null;
        String idBoard = null;
        String pos = null;
        api.updateBoardStar(idMember, idBoardStar)
                .idBoard(idBoard)
                .pos(pos)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersBoardStarsPosByIdMemberByIdBoardStar()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBoardStarPosByIdMemberByIdBoardStarTest() throws ApiException {
        String idMember = null;
        String idBoardStar = null;
        String value = null;
        api.updateBoardStarPosByIdMemberByIdBoardStar(idMember, idBoardStar)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersBoardStarsIdBoardByIdMemberByIdBoardStar()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBoardStarsIdBoardTest() throws ApiException {
        String idMember = null;
        String idBoardStar = null;
        String value = null;
        api.updateBoardStarsIdBoard(idMember, idBoardStar)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdMemberTest() throws ApiException {
        String idMember = null;
        String avatarSource = null;
        String bio = null;
        String fullName = null;
        String initials = null;
        String prefsColorBlind = null;
        String prefsLocale = null;
        String prefsMinutesBetweenSummaries = null;
        String username = null;
        api.updateByIdMember(idMember)
                .avatarSource(avatarSource)
                .bio(bio)
                .fullName(fullName)
                .initials(initials)
                .prefsColorBlind(prefsColorBlind)
                .prefsLocale(prefsLocale)
                .prefsMinutesBetweenSummaries(prefsMinutesBetweenSummaries)
                .username(username)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersCustomBoardBackgroundsByIdMemberByIdBoardBackground()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomBoardBackgroundsTest() throws ApiException {
        String idMember = null;
        String idBoardBackground = null;
        String brightness = null;
        String _file = null;
        String tile = null;
        api.updateCustomBoardBackgrounds(idMember, idBoardBackground)
                .brightness(brightness)
                ._file(_file)
                .tile(tile)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersFullNameByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFullNameTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updateFullName(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersInitialsByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInitialsByIdMemberTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updateInitialsByIdMember(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersPrefsColorBlindByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePrefsColorBlindByIdMemberTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updatePrefsColorBlindByIdMember(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersPrefsLocaleByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePrefsLocaleByIdMemberTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updatePrefsLocaleByIdMember(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersPrefsMinutesBetweenSummariesByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePrefsMinutesBetweenSummariesByIdTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updatePrefsMinutesBetweenSummariesById(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesQueryByIdMemberByIdSavedSearch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSavedSearchQueryByIdMemberByIdSavedSearchTest() throws ApiException {
        String idMember = null;
        String idSavedSearch = null;
        String value = null;
        api.updateSavedSearchQueryByIdMemberByIdSavedSearch(idMember, idSavedSearch)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesByIdMemberByIdSavedSearch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSavedSearchesByIdMemberByIdSavedSearchTest() throws ApiException {
        String idMember = null;
        String idSavedSearch = null;
        String name = null;
        String pos = null;
        String query = null;
        api.updateSavedSearchesByIdMemberByIdSavedSearch(idMember, idSavedSearch)
                .name(name)
                .pos(pos)
                .query(query)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesNameByIdMemberByIdSavedSearch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSavedSearchesNameByIdMemberByIdSavedSearchTest() throws ApiException {
        String idMember = null;
        String idSavedSearch = null;
        String value = null;
        api.updateSavedSearchesNameByIdMemberByIdSavedSearch(idMember, idSavedSearch)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersSavedSearchesPosByIdMemberByIdSavedSearch()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSavedSearchesPosByIdMemberByIdSavedSearchTest() throws ApiException {
        String idMember = null;
        String idSavedSearch = null;
        String value = null;
        api.updateSavedSearchesPosByIdMemberByIdSavedSearch(idMember, idSavedSearch)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * updateMembersUsernameByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUsernameByIdTest() throws ApiException {
        String idMember = null;
        String value = null;
        api.updateUsernameById(idMember)
                .value(value)
                .execute();
        // TODO: test validations
    }

    /**
     * addMembersAvatarByIdMember()
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadAvatarByIdTest() throws ApiException {
        String idMember = null;
        String _file = null;
        api.uploadAvatarById(idMember)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

}