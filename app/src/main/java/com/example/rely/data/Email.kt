package com.example.rely.data

import androidx.annotation.StringRes
import javax.security.auth.Subject

data class Email(
    val id: Long,
    val sender: Account,
    val recipients: List<Account> = emptyList(),
    @StringRes val subject: Int =  -1,
    @StringRes val body: Int = -1,
    var mailbox: MailBoxType = MailBoxType.Inbox,
    @StringRes var createdAt: Int = -1
)