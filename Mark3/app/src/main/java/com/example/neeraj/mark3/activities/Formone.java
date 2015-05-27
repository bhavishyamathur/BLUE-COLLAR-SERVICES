package com.example.neeraj.mark3.activities;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Vibrator;
        import android.view.View;
        import android.widget.Button;
        import com.example.neeraj.mark3.R;

/**
 * Created by NEERAJ on 24-May-15.
 */
public class Formone extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formfilltask);

        Button b = (Button) findViewById(R.id.bnext);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator v7 = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                v7.vibrate(60);

                startActivity(new Intent(Formone.this,Formtwo.class));
            }
        });
    }
}
