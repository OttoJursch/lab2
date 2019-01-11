package edu.ucsd.cse110.calculator;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;


/**
 * Note that these tests are far from exhaustive:
 * We're not testing for negative numbers
 * We're not testing for overflows etc.
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity mainActivity;
    private EditText num1View;
    private EditText num2View;
    private Button equalsBtn;
    private TextView answerView;

    @Before
    public void setup() {
        mainActivity = Robolectric.setupActivity(MainActivity.class);
        num1View = mainActivity.findViewById(R.id.number_1);
        num2View = mainActivity.findViewById(R.id.number_2);
        equalsBtn = mainActivity.findViewById(R.id.btn_equals);
        answerView = mainActivity.findViewById(R.id.answer);
    }

    @Test
    public void testNoInput() {
        equalsBtn.performClick();
        assertEquals("0", answerView.getText().toString());
    }

    @Test
    public void testInput1() {
        num1View.setText("123");
        equalsBtn.performClick();
        assertEquals("123", answerView.getText().toString());
    }

    @Test
    public void testInput2() {
        num2View.setText("456");
        equalsBtn.performClick();
        assertEquals("456", answerView.getText().toString());
    }

    @Test
    public void testInputBoth() {
        num1View.setText("789");
        num2View.setText("123");
        equalsBtn.performClick();
        assertEquals("912", answerView.getText().toString());
    }

}