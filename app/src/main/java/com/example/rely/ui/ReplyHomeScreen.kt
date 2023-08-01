package com.example.rely.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.rely.R
import com.example.rely.data.Email
import com.example.rely.data.MailBoxType
import com.example.rely.ui.ultils.WindowStateUtils

@Composable
fun ReplyHomeScreen(
    navigationType: WindowStateUtils,
    replyUiState: ReplyUiState,
    onTabPressed: (MailBoxType) -> Unit,
    onEmailCardPressed: (Email) -> Unit,
    onDetailScreenBackPressed: () -> Unit,
    modifier: Modifier = Modifier
){

}

@Composable
fun ReplyAppContent(
    navigationType: WindowStateUtils,
    replyUiState: ReplyUiState,
    onTabPressed: (MailBoxType) -> Unit,
    onEmailCardPressed: (Email) -> Unit,
    navigationItemContentList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier){
        Row(modifier = Modifier.fillMaxSize()) {
            AnimatedVisibility(visible = navigationType == WindowStateUtils.NAVIGATION_RAIL) {
                val navigationRailContentDescription = stringResource(id = R.string.navigation_rail)
                
            }
        }
    }
}

@Composable
private fun ReplyNavigationRail(
    currentTab: MailBoxType,
    onTabPressed: (MailBoxType) -> Unit,
    navigationItemContentList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
){
    NavigationRail(modifier = modifier) {
        for (navItem in navigationItemContentList){
            NavigationRailItem(
                selected = currentTab == navItem.mailBoxType,
                onClick = { onTabPressed(navItem.mailBoxType) },
                icon = {
                    Icon(
                        imageVector = navItem.icon,
                        contentDescription = navItem.text)
                }
            )
        }

    }
}

@Composable
private fun ReplyButtonNavigationBar(
    currentTab: MailBoxType,
    onTabPressed: (MailBoxType) -> Unit,
    navigationItemContentList: List<NavigationItemContent>,
    modifier: Modifier = Modifier
){
    NavigationBar() {
        
    }
}

data class NavigationItemContent(
    val mailBoxType: MailBoxType,
    val icon: ImageVector,
    val text: String
)

@Preview
@Composable
fun ReplyHomePreview(){

}