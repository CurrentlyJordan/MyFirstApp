package nyc.c4q.jordansmith.runbuddies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ConfirmationScreen extends AppCompatActivity {
    private TextView nameConfirmationText;
    private TextView emailConfirmationText;
    private TextView milesConfirmationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_screen);

        nameConfirmationText = (TextView) findViewById(R.id.name_view1);
        emailConfirmationText = (TextView) findViewById(R.id.email_view1);
        milesConfirmationText = (TextView) findViewById(R.id.milesAWeek_view1);

        Bundle extras = getIntent().getExtras();

        String confirmUsername = "";
        String confirmEmail = "";
        String confirmMiles = "";
        if (extras != null) {
            confirmUsername = extras.getString("USER_NAME");
            confirmEmail = extras.getString("USER_EMAIL");
            confirmMiles = extras.getString("USER_MILES");
        }

        nameConfirmationText.setText(confirmUsername);
        emailConfirmationText.setText(confirmEmail);
        milesConfirmationText.setText(confirmMiles);


//        TextView textView = new TextView(this);
//        textView.setTextSize(20);
//        textView.setText(confirmUsername);
//
//        TextView textView2 = new TextView(this);
//        textView2.setTextSize(20);
//        textView2.setText(confirmEmail);
//
//        TextView textView3 = new TextView(this);
//        textView3.setTextSize(20);
//        textView3.setText(confirmMiles);



//        ViewGroup layout = (ViewGroup)findViewById(R.id.activity_confirmation_screen);
//        layout.addView(textView);
    }


}

