package net.simplifiedcoding.ui.Contacts

import android.provider.ContactsContract.Contacts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel

@Composable
fun ContactsScreen(viewModel: AuthViewModel?, navController: NavHostController) {
  Column (
      modifier = Modifier
          .background(Color.Gray)
          .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom ,
      horizontalAlignment = Alignment.Start ,


  ){
      Button(onClick = { /*TODO*/ },
          modifier = Modifier.fillMaxWidth()
      ) {
          Text(text = "Contact Us")
      }


  }

}