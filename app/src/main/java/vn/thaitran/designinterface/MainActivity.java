package vn.thaitran.designinterface;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    DrawerLayout  drawerLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        drawerLayout =findViewById(R.id.drawer_layout);
        toolbar=findViewById(R.id.toolbar);

       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               int id=menuItem.getItemId();
               if(id==R.id.nav_manage){
                   Toast.makeText(MainActivity.this,"demo tho",Toast.LENGTH_LONG).show();
               }
               drawerLayout.closeDrawers();
               return false;
           }
       });
    }
}
