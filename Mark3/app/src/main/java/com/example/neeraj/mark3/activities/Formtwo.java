package com.example.neeraj.mark3.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import com.example.neeraj.mark3.R;

/**
 * Created by NEERAJ on 24-May-15.
 */
public class Formtwo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formfillcontact);
        //overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
        Vibrator v5 = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        v5.vibrate(60);
    }
}
