package com.konfigthis.client;

import com.konfigthis.client.api.ActionApi;
import com.konfigthis.client.api.BatchApi;
import com.konfigthis.client.api.BoardApi;
import com.konfigthis.client.api.CardApi;
import com.konfigthis.client.api.ChecklistApi;
import com.konfigthis.client.api.LabelApi;
import com.konfigthis.client.api.ListApi;
import com.konfigthis.client.api.MemberApi;
import com.konfigthis.client.api.NotificationApi;
import com.konfigthis.client.api.OrganizationApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.SessionApi;
import com.konfigthis.client.api.TokenApi;
import com.konfigthis.client.api.TypeApi;
import com.konfigthis.client.api.WebhookApi;

public class Trello {
    private ApiClient apiClient;
    public final ActionApi action;
    public final BatchApi batch;
    public final BoardApi board;
    public final CardApi card;
    public final ChecklistApi checklist;
    public final LabelApi label;
    public final ListApi list;
    public final MemberApi member;
    public final NotificationApi notification;
    public final OrganizationApi organization;
    public final SearchApi search;
    public final SessionApi session;
    public final TokenApi token;
    public final TypeApi type;
    public final WebhookApi webhook;

    public Trello() {
        this(null);
    }

    public Trello(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.action = new ActionApi(this.apiClient);
        this.batch = new BatchApi(this.apiClient);
        this.board = new BoardApi(this.apiClient);
        this.card = new CardApi(this.apiClient);
        this.checklist = new ChecklistApi(this.apiClient);
        this.label = new LabelApi(this.apiClient);
        this.list = new ListApi(this.apiClient);
        this.member = new MemberApi(this.apiClient);
        this.notification = new NotificationApi(this.apiClient);
        this.organization = new OrganizationApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.session = new SessionApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
        this.type = new TypeApi(this.apiClient);
        this.webhook = new WebhookApi(this.apiClient);
    }

}
