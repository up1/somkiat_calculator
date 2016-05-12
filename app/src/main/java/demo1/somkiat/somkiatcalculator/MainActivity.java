package demo1.somkiat.somkiatcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
        extends AppCompatActivity
    implements CalculatorListener
{

    private EditText firstOperandEditText;
    private EditText secondOperandEditText;
    private TextView resultTextView;

    MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstOperandEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        secondOperandEditText = (EditText) findViewById(R.id.operand_two_edit_text);
        resultTextView = (TextView) findViewById(R.id.operation_result_text_view);


        mainController = new MainController();
        mainController.setListener(this);

    }


    public void onAdd(View view) {
        double first = Double.parseDouble(firstOperandEditText.getText().toString());
        double second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.add(first, second);
    }

    public void onSub(View view) {
        double first = Double.parseDouble(firstOperandEditText.getText().toString());
        double second = Double.parseDouble(secondOperandEditText.getText().toString());
        mainController.sub(first, second);
    }

    @Override
    public void onSuccess(String result) {
        resultTextView.setText(String.valueOf(result));
    }
}
