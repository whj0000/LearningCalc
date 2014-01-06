package com.zwliew.learningcalc;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends Activity implements View.OnClickListener {

	Button zero, one, two, three, four, five, six, seven, eight, nine, equals, divide, cancel, add, subtract, multiply;
	EditText values;
	String op;
	int num0, num1, ans;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        equals = (Button) findViewById(R.id.equals);
        divide = (Button) findViewById(R.id.divide);
        cancel = (Button) findViewById(R.id.cancel);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        values = (EditText) findViewById(R.id.values);
        
        try{
        	zero.setOnClickListener(this);
            one.setOnClickListener(this);     
            two.setOnClickListener(this);             
            three.setOnClickListener(this);             
            four.setOnClickListener(this);             
            five.setOnClickListener(this);           
            six.setOnClickListener(this);            
            seven.setOnClickListener(this);            
            eight.setOnClickListener(this);            
            nine.setOnClickListener(this);            
            equals.setOnClickListener(this);
            divide.setOnClickListener(this);             
            cancel.setOnClickListener(this);             
            add.setOnClickListener(this);  
            subtract.setOnClickListener(this);           
            multiply.setOnClickListener(this);      

        }
        catch(Exception e){
             
        }
        
    }

	public void logic() {
    	if(op.equals("+")){
            num1 = Integer.parseInt(values.getText().toString());
            values.setText("");
            ans = num0 + num1;
            values.setText("Result : " + Integer.toString(ans));
        }
        else if(op.equals("-")){
            num1 = Integer.parseInt(values.getText().toString());
            values.setText("");
            ans = num0 - num1;
            values.setText("Result : " + Integer.toString(ans));
        }
        else if(op.equals("*")){
            num1 = Integer.parseInt(values.getText().toString());
            values.setText("");
            ans = num0 * num1;
            values.setText("Result : " + Integer.toString(ans));
        }
        else {
            num1 = Integer.parseInt(values.getText().toString());
            values.setText("");
            ans = num0 / num1;
            values.setText("Result : " + Integer.toString(ans));
        }
    	
    }

	@Override
	public void onClick(View arg0) {
		Editable str =  values.getText();
        switch(arg0.getId()){
            case R.id.one:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(two.getText());
                values.setText(str);
            break;
            case R.id.two:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(two.getText());
                values.setText(str);
            break;
            case R.id.three:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(three.getText());
                values.setText(str);
            break;
            case R.id.four:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(four.getText());
                values.setText(str);
            break;
            case R.id.five:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(five.getText());
                values.setText(str);
            break;
            case R.id.six:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(six.getText());
                values.setText(str);
            break;
            case R.id.seven:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(eight.getText());
                values.setText(str);
            break;
            case R.id.eight:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(nine.getText());
                values.setText(str);
         
            break;
            case R.id.nine:
                if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(zero.getText());
                values.setText(str);
         
            break;
            case R.id.cancel:
                num0 = 0;
                num1 = 0;
                values.setText("");
                values.setHint("Enter values");
         
            break;
            case R.id.add:
                op = "+";
                if(num0 == 0){
                    num0 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                else{
                    num1 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                    ans = num0 + num1;
                    values.setText("Result : " + Integer.toString(ans));
                }
            break;
            case R.id.subtract:
                op = "-";
                if(num0 == 0){
                    num0 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                else{
                    num1 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                    ans = num0 - num1;
                    values.setText("Result : " + Integer.toString(ans));
                }
            break;
            case R.id.multiply:
                op = "*";
                if(num0 == 0){
                    num0 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                else{
                    num1 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                    ans = num0 * num1;
                    values.setText("Result : " + Integer.toString(ans));
                }
            break;
            case R.id.divide:
                op = "/";
                if(num0 == 0){
                    num0 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0){
                    num1 = 0;
                    values.setText("");
                }
                else{
                    num1 = Integer.parseInt(values.getText().toString());
                    values.setText("");
                    ans = num0 / num1;
                    values.setText("Result : " + Integer.toString(ans));
                }
            break;
            case R.id.equals:
                if(!op.equals(null)){
                    if(num1 != 0){
                        if(op.equals("+")){
                            values.setText("");
                            /*ans = num0 + num1;*/
                            values.setText("Result : " + Integer.toString(ans));
                        }
                        else if(op.equals("-")){
                            values.setText("");/*
                            ans = num0 - num1;*/
                            values.setText("Result : " + Integer.toString(ans));
                        }
                        else if(op.equals("*")){
                            values.setText("");/*
                            ans = num0 * num1;*/
                            values.setText("Result : " + Integer.toString(ans));
                        }
                        else if(op.equals("/")){
                            values.setText("");/*
                            ans = num0 / num1;*/
                            values.setText("Result : " + Integer.toString(ans));
                        }
                    }
                    else{
                    	
                        logic();
                        
                    }
                }
            break;
        }
	}
    
}
