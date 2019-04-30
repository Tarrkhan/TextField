package com.tarakhan.textfield;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText password;
    RelativeLayout relativeLayout;
    TextInputLayout userLayout;
    TextInputLayout passTextLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user =findViewById(R.id.username);
        password = findViewById(R.id.Password);
        userLayout = findViewById(R.id.usernameTextInputLayout);
        passTextLayout = findViewById(R.id.passwordTextInputLayout);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (user.getText().toString().isEmpty()){
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username");
                }else {
                    userLayout.setErrorEnabled(false);
                }
            }
        });



       user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (user.getText().toString().isEmpty()){
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("please enter your username");
                }else {
                    userLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
      passTextLayout.setCounterEnabled(true);
      passTextLayout.setCounterMaxLength(8);
    }
}
