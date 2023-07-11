package com.example.finalproject;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;

//import com.google.android.material.snackbar.Snackbar;
//import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.home){
            Toast.makeText(this, "you have clicked on home", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.mystay){
            Toast.makeText(this, "You moved to myStay ", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.orderService){

            Toast.makeText(this, "You clicked on order service", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.payment){
            Toast.makeText(this, "you clicked on payment", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.logut){
            Toast.makeText(this, "You clicked on logout", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.profile){
            Toast.makeText(this, "YOu clicked on profile", Toast.LENGTH_SHORT).show();
        }
            return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}