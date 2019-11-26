package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.OnNoteListener {
    public static FragmentManager fragmentManager;
    public static MyAppDatabase myAppDatabase;
    public List<Verb> verbList;
    public static RecyclerAdapter adapter;
    private boolean hideMenu;

    public void setHideMenu(boolean hideMenu) {
        this.hideMenu = hideMenu;
        invalidateOptionsMenu();

    }

    //    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        myAppDatabase = Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"verbdb").allowMainThreadQueries().build();

        verbList = MainActivity.myAppDatabase.myDao().getVerbs();
        if(verbList.isEmpty())
        {
            prepareDatabase();
            verbList = MainActivity.myAppDatabase.myDao().getVerbs();
        }

        adapter = new RecyclerAdapter(verbList,this);

        fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();


    }

    public void prepareDatabase(){
        myAppDatabase.myDao().insertAllVerbs(Verb.preloadVerbs());
    }

    @Override
    public void onBackPressed(){
        verbList = MainActivity.myAppDatabase.myDao().getVerbs();
        adapter = new RecyclerAdapter(verbList,this);

        fragmentManager.popBackStack();
        if (fragmentManager.findFragmentById(R.id.fragment_container) == null) {

            fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

        }
    }

    @Override
    public void onNoteClick(int position) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        MenuItem item = menu.findItem(R.id.settings);

        if(hideMenu)
        {
            item.setVisible(false);
        }
        else
        {
            item.setVisible(true);
        }

        return true;
    }

}
