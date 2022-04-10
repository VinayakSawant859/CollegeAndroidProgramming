package com.example.collegeandroidprograms;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class Prac28_LoginActivityWithValidation extends AppCompatActivity {

    // defining our own password pattern
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    "(?=.*[@#$%^&+=])" +     // at least 1 special character
                    "(?=\\S+$)" +            // no white spaces
                    ".{4,}" +                // at least 4 characters
                    "$");
    int attempts;
    private TextInputLayout email;
    private TextInputLayout password;
    Button validBTN;
    ImageButton letsBTN;
    TextView letsGO, attemptsTXT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac28_login_with_validation);

        // Referencing email and password
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        validBTN = findViewById(R.id.validBTN);
        letsBTN = findViewById(R.id.letsBTN);
        letsBTN.setEnabled(false);
        letsGO = findViewById(R.id.letsGO);
        attemptsTXT = findViewById(R.id.attemptsTXT);

    }
    private boolean validateEmail() {

        // Extract input from EditText
        String emailInput = email.getEditText().getText().toString().trim();

        // if the email input field is empty
        if (emailInput.isEmpty()) {
            email.setError("Field can not be empty");
            letsBTN.setEnabled(false);
            return false;
        }
        // Matching the input email to a predefined email pattern
        else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            email.setError("Please enter a valid email address");
            letsBTN.setEnabled(false);
            return false;
        } else {
            email.setError(null);
            letsBTN.setEnabled(true);
            return true;
        }
    }

    private boolean validatePassword() {
        String passwordInput = password.getEditText().getText().toString().trim();
        // if password field is empty
        // it will display error message "Field can not be empty"
        if (passwordInput.isEmpty()) {
            password.setError("Field can not be empty");
            letsBTN.setEnabled(false);
            return false;
        }

        // if password does not matches to the pattern
        // it will display an error message "Password is too weak"
        else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            password.setError("Password is too weak");
            letsBTN.setEnabled(false);
            return false;
        } else {
            password.setError(null);
            letsBTN.setEnabled(true);
            return true;
        }
    }

    public void confirmInput(View v) {
        if (!validateEmail() | !validatePassword()) {
            letsBTN.setEnabled(false);
            attempts += 1;
            attemptsTXT.setText("Unsuccessful attempts: "+attempts);
            //
            if (attempts == 5){
                //If u excceds 5 limits it will close the actvity
                AlertDialog.Builder builder = new AlertDialog.Builder(Prac28_LoginActivityWithValidation.this);
                builder.setMessage("You have exceeded your attempts limit!");
                builder.setTitle("Alert !");

                builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
            //
            return;
        }
    }

    public void letsgoConfirm(View v){
        // if the email and password matches, a toast message
        // with email and password is displayed
        String input = "Email: " + email.getEditText().getText().toString();
        input += "\n";
        input += "Password: " + password.getEditText().getText().toString();
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }
}