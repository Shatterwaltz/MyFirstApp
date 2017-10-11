package sawari.myfirstapp;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        intent = getIntent();

        if(findViewById(R.id.fragment_container)!=null){
            if(savedInstanceState!=null){
                return;
            }

            DisplayMessageFragment displayMessageFragment = new DisplayMessageFragment();
            displayMessageFragment.setArguments(intent.getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, displayMessageFragment).commit();
        }
    }

    public void swap(View view){
        DisplayMessageBottomFragment bottomFragment = new DisplayMessageBottomFragment();
        bottomFragment.setArguments(intent.getExtras());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, bottomFragment);
        //instance of DMF is retained when hitting back, while instance of DMBF is destroyed.
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
