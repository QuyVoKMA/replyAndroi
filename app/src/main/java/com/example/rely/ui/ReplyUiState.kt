package com.example.rely.ui

import com.example.rely.data.Email
import com.example.rely.data.MailBoxType
import com.example.rely.data.local.LocalEmailsDataProvider

data class ReplyUiState(
    val mailboxes: Map<MailBoxType, List<Email>> = emptyMap(),
    val currentMailbox: MailBoxType = MailBoxType.Inbox,
    val currentSelectedEmail: Email = LocalEmailsDataProvider.defaultEmail,
    val isShowingHomepage: Boolean = true
){
    val currentMailBoxEmail: List<Email> by lazy { mailboxes[currentMailbox]!! }
}