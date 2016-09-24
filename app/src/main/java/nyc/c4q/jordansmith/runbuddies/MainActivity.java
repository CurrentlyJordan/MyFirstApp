package nyc.c4q.jordansmith.runbuddies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    private EditText UserNameView;
    private EditText UserEmailView;
    private EditText UserMilesView;
    private Button nextButtonView;

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("start","onStart()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("create","onCreate()");

        UserNameView = (EditText) findViewById(R.id.name_view);
        UserEmailView = (EditText) findViewById(R.id.email_view);
        UserMilesView = (EditText) findViewById(R.id.milesAWeek_view);
        nextButtonView = (Button) findViewById(R.id.next_Button);

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("resume","onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("pause","onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("stop","onStop()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("restart","onRestart()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("destroy","onDestroy()");
    }




    public void nextPageFunction(View view) {
        Intent intent = new Intent(MainActivity.this, ConfirmationScreen.class);
        String name = UserNameView.getText().toString();
        String email = UserEmailView.getText().toString();
        String milesPerWeek = UserMilesView.getText().toString();
        intent.putExtra("USER_NAME", name);
        intent.putExtra("USER_EMAIL", email);
        intent.putExtra("USER_MILES", milesPerWeek);
        startActivity(intent);
    }






//    private Runnable launch2ndActivity(){
//        return new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent)
//            }
//        }
//        }
//    }
//
//Handler handler = new Handler();
//    handler.postDelayed(launch2ndActivity(),4000)
//
//
//
//
//
//
//
//    }
}
