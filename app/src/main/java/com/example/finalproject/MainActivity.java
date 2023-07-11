package com.example.finalproject;

import android.database.Cursor;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


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
            setContentView(R.layout.main_activity);
            Toast.makeText(this, "you have clicked on home", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.mystay){
            Toast.makeText(this, "You moved to myStay ", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.orderService){
            //setContentView(R.layout.services);
            Toast.makeText(this, "You clicked on order service", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.payment){
            Toast.makeText(this, "you clicked on payment", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.logut){
            //setContentView(R.layout.signin);
            Toast.makeText(this, "You clicked on logout", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id == R.id.profile){
            setContentView(R.layout.profile);
            Toast.makeText(this, "YOu clicked on profile", Toast.LENGTH_SHORT).show();
        }
            return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        roomRecycler roomRecycler = new roomRecycler(MainActivity.this);
        Cursor cursor = roomRecycler.getAll();
        RecyclerView roomsView = findViewById(R.id.my_recycler);
        if(cursor.getCount() == 0)    {

            Toast.makeText(MainActivity.this,"No data to show",Toast.LENGTH_LONG).show();

        }else{
            String[] rooms = new String[Room.rooms.length];
            String[] area = new String[Room.rooms.length];
            String[] num = new String[Room.rooms.length];
            while (cursor.moveToNext()){


                for(int i = 0; i<rooms.length;i++){
                    rooms[i] = Room.rooms[i].getRoom();
                    area[i] = Room.rooms[i].getArea();
                    num[i] = Room.rooms[i].getNum();
                }
              roomRecycler.setLayoutManager(new LinearLayoutManager(this));
                MyAdapter adapter = new MyAdapter(rooms, area, num);
                roomRecycler.setAdapter(adapter);
                //listItem.add("Reservation ID: " + cursor.getString(0)+" Area: "+cursor.getString(1) + " Number Od Rooms: ");
            }
        }


    }


}