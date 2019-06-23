package afniramadania.tech.jenisabkapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvCategory;
    private ArrayList<Abk> list = new ArrayList<>();
    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;
    private Bundle outState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(AbkData.getListData());
        showRecyclerCardView();
    }


    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListAbkAdapter listAbkAdapter = new ListAbkAdapter(this);
        listAbkAdapter.setListAbk(list);
        rvCategory.setAdapter(listAbkAdapter);

    }

    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridAbkAdapter gridAbkAdapter = new GridAbkAdapter(this);
        gridAbkAdapter.setListAbk(list);
        rvCategory.setAdapter(gridAbkAdapter);

    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewAbkAdapter cardViewAbkAdapter = new CardViewAbkAdapter(this);
        cardViewAbkAdapter.setListAbk(list);
        rvCategory.setAdapter(cardViewAbkAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        setMode(item.getItemId());

        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        String title = null;
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }





}

