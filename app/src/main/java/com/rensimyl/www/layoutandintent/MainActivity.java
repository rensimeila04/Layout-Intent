package com.rensimyl.www.layoutandintent;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new LinearFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void show(View view) {
        PopupMenu pop = new PopupMenu(this, view);
        pop.inflate(R.menu.ganti);
        pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Fragment fr = null;
                switch (item.getItemId()) {
                    case R.id.linearLayout:
                        fr = new LinearFragment();
                        break;
                    case R.id.relativeLayout:
                        fr = new RelativeFragment();
                        break;
                    case R.id.intent:
                        fr = new IntentFragment();
                        break;
                }
                return loadFragment(fr);
            }
        });
        pop.show();
    }

    public void showPopupMenu(View view) {
        /* Memunculkan menu saat tombol di klik */
        show(view);
    }
}
