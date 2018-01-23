package kukiat.krirk.ac.th.kucalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kukiat.krirk.ac.th.kucalculate.fragment.MainFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }


    }   // Main Method

    @Override
    public void onClick(View view) {

    }
}   // Main Class
