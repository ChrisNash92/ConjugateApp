package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity implements VerbListRecyclerAdapter.OnNoteListener {
    public static FragmentManager fragmentManager;
    public static MyAppDatabase myAppDatabase;
    public List<Verb> verbList;
    public static VerbListRecyclerAdapter adapter;
    private boolean hideMenu;
    private int mClickPosition;

    public void setHideMenu(boolean hideMenu) {
        this.hideMenu = hideMenu;
        invalidateOptionsMenu();

    }

    public void setClickPosition(int ClickPosition)
    {
        this.mClickPosition = ClickPosition;
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

        adapter = new VerbListRecyclerAdapter(verbList,this);

        fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment()).addToBackStack(null).commit();


    }

    public void prepareDatabase(){
        myAppDatabase.myDao().insertAllVerbs(Verb.preloadVerbs());
    }

    @Override
    public void onBackPressed(){

        updateRecyclerView();
        fragmentManager.popBackStack();
        if (fragmentManager.findFragmentById(R.id.fragment_container) == null) {

            fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment()).addToBackStack(null).commit();

        }
    }

    @Override
    public void onNoteClick(int position) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        if(hideMenu)
        {
            menu.setGroupVisible(R.id.settings,false);
        }
        else
        {
            menu.setGroupVisible(R.id.settings,true);
        }

        return true;
    }

    public void menu_onClick(MenuItem item)
    {
        boolean checked = ((MenuItem) item).isChecked();

        // Check which radio button was clicked
        switch (item.getItemId()) {
            case R.id.edit_menuItem:
                if(verbList.get(mClickPosition).isProtected())
                {
                    Toast.makeText(this, "Cannot edit verbs in the preloaded database.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddIrregularInfo(mClickPosition)).addToBackStack(null).commit();
                }

                    break;
            case R.id.delete_menuItem:
                if(verbList.get(mClickPosition).isProtected())
                {
                    Toast.makeText(this, "Cannot delete verbs in the preloaded database.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:

                                    Verb verb = new Verb(verbList.get(mClickPosition).getId());
                                    myAppDatabase.myDao().deleteVerb(verb);
                                    adapter.notifyDataSetChanged();
                                    updateRecyclerView();

                                    fragmentManager.beginTransaction().replace(R.id.fragment_container, new HomeFragment()).addToBackStack(null).commit();
                                    fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                                    break;

                                case DialogInterface.BUTTON_NEGATIVE:
                                    //No button clicked
                                    break;
                            }
                        }
                    };

                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("Are you sure you want to delete this verb?").setPositiveButton("Yes", dialogClickListener)
                            .setNegativeButton("No", dialogClickListener).show();
                }
                    break;
            default:
                break;
        }

    }

    public void updateRecyclerView()
    {
        verbList = MainActivity.myAppDatabase.myDao().getVerbs();
        adapter = new VerbListRecyclerAdapter(verbList,this);
    }

}
