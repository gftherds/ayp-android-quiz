package com.augmentis.ayp.aypquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {


    boolean answer;

    TextView answerText;
    Button confirmButton;
    boolean isCheated;

    private static final String CHEATED_EXTRA_KEY = "CHEATED";
    //    private static final String ANSWER_EXTRA_KEY = "ANSWER";
//    public static Intent CreatIntent(){
//        Intent intent = new Intent(context, CheatActivity.class);
//        intent.putExtra(ANSWER_EXTRA_KEY, answer);
//        return intent;
//    }
    public static  boolean wasCheated(Intent intent){
        return intent.getExtras().getBoolean("CHEATED");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);


//        Intent intent = getIntent();
//        Bundle extra = intent.getExtras();
//        answer = extra.getBoolean(ANSWER_EXTRA_KEY);


        answer = getIntent().getExtras().getBoolean("NAME");
        isCheated = false;
        confirmButton = (Button) findViewById(R.id.confirm_button);
        answerText = (TextView) findViewById(R.id.text_answer);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                if (answer) {
                    answerText.setText(R.string.answer_is_true);
                } else {
                    answerText.setText(R.string.answer_is_false);
                }


                isCheated = true;
                returnResult();
            }


        });
    }
    private void returnResult(){

        Intent newIntent = new Intent();
        newIntent.putExtra(CHEATED_EXTRA_KEY, isCheated);
        setResult(RESULT_OK, newIntent);

    }

//    public static Intent createIntent(QuizActivity quizActivity, View currentFocus) {
//        Intent intent = new Intent(context, cheatActivity.class);
//        intent.putExtra(Answer_ExTRA_KEY , answer);
//        return intent;
//    }
}

