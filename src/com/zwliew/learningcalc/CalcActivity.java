package com.zwliew.learningcalc;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends Activity implements View.OnClickListener {

	Button zero, one, two, three, four, five, six, seven, eight, nine, equals, divide, delete, add, subtract, multiply, sqrt;
	EditText values;
	String op;
	double num1, ans;
	
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
        delete = (Button) findViewById(R.id.delete);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        values = (EditText) findViewById(R.id.values);
		sqrt = (Button) findViewById(R.id.sqrt);;
        
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
            delete.setOnClickListener(this);             
            add.setOnClickListener(this);  
            subtract.setOnClickListener(this);           
            multiply.setOnClickListener(this);   
			sqrt.setOnClickListener(this);

        }
        catch(Exception e){
             
        }
        
    }

	public void logic() {
		try {
    	if(op.equals("+")) {
            num1 = Double.parseDouble(values.getText().toString());
            values.setText("");
            ans = ans + num1;
            values.setText("Result : " + Double.toString(ans));
        }
        else if(op.equals("-")) {
            num1 = Double.parseDouble(values.getText().toString());
            values.setText("");
            ans = ans - num1;
            values.setText("Result : " + Double.toString(ans));
        }
        else if(op.equals("*")) {
            num1 = Double.parseDouble(values.getText().toString());
            values.setText("");
            ans = ans * num1;
            values.setText("Result : " + Double.toString(ans));
        }
        else if (op.equals("/")) {
            num1 = Double.parseDouble(values.getText().toString());
            values.setText("");
            ans = ans / num1;
            values.setText("Result : " + Double.toString(ans));
        }
    	
		} catch (NumberFormatException e) {
			
		}
    }

	@Override
	public void onClick(View v) {
		Editable str =  values.getText();
        switch(v.getId()) {
        
        	case R.id.zero:
        		if(num1 != 0) {
        			num1 = 0;
        			values.setText("");
        		}
        		str = str.append(zero.getText());
        		values.setText(str);
        	break;
        	
            case R.id.one:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(one.getText());
                values.setText(str);
            break;
            
            case R.id.two:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(two.getText());
                values.setText(str);
            break;
            
            case R.id.three:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(three.getText());
                values.setText(str);
            break;
            
            case R.id.four:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(four.getText());
                values.setText(str);
            break;
            
            case R.id.five:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(five.getText());
                values.setText(str);
            break;
            
            case R.id.six:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(six.getText());
                values.setText(str);
            break;
            
            case R.id.seven:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(seven.getText());
                values.setText(str);
            break;
            
            case R.id.eight:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(eight.getText());
                values.setText(str);
         
            break;
            
            case R.id.nine:
                if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                str = str.append(nine.getText());
                values.setText(str);
         
            break;
            
            case R.id.delete:
                ans = 0;
                num1 = 0;
                values.setText("");
                values.setHint("Enter values");
         
            break;
            
            case R.id.add:
                op = "+";
                try {
                if(ans == 0) {
                    ans = Double.parseDouble(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                else {
                    num1 = Double.parseDouble(values.getText().toString());
                    values.setText("");
                    ans = ans + num1;
                    values.setText("Result : " + Double.toString(ans));
                }
                
                } catch (NumberFormatException e) {
              
                } 
            break;
            
            case R.id.subtract:
                op = "-";
                try {
                if(ans == 0) {
                    ans = Double.parseDouble(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                else{
                    num1 = Double.parseDouble(values.getText().toString());
                    values.setText("");
                    ans = ans - num1;
                    values.setText("Result : " + Double.toString(ans));
                }
                
                } catch (NumberFormatException e) {
              
                }
            break;
            
            case R.id.multiply:
                op = "*";
                try {
                if(ans == 0) {
                    ans = Double.parseDouble(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                else {
                    num1 = Double.parseDouble(values.getText().toString());
                    values.setText("");
                    ans = ans * num1;
                    values.setText("Result : " + Double.toString(ans));
                }
                
                } catch (NumberFormatException e) {
            
                }
            break;
            
            case R.id.divide:
                op = "/";
                try {
                if(ans == 0) {
                    ans = Double.parseDouble(values.getText().toString());
                    values.setText("");
                }
                else if(num1 != 0) {
                    num1 = 0;
                    values.setText("");
                }
                else{
                    num1 = Double.parseDouble(values.getText().toString());
                    values.setText("");
                    ans = ans / num1;
                    values.setText("Result : " + Double.toString(ans));
                }
                
                } catch (NumberFormatException e) {
              
                }
            break;
            
			case R.id.sqrt:
				op = "sqrt";
				try {
					ans = Double.parseDouble(values.getText().toString());
					values.setText("");
					ans = Math.sqrt(ans);
					values.setText("Result : " + Double.toString(ans));
					
				} catch (NumberFormatException e) {
					
				}
				break;
				
            case R.id.equals:
                if(op != null) {
                    if(num1 != 0) {
                        if(op.equals("+")) {
                            values.setText("");
                            /*ans = ans + num1;*/
                            values.setText("Result : " + Double.toString(ans));
                        }
                        else if(op.equals("-")) {
                            values.setText("");
                            /*ans = ans - num1;*/
                            values.setText("Result : " + Double.toString(ans));
                        }
                        else if(op.equals("*")) {
                            values.setText("");
                            /*ans = ans * num1;*/
                            values.setText("Result : " + Double.toString(ans));
                        }
                        else if(op.equals("/")) {
                            values.setText("");
                            /*ans = ans / num1;*/
                            values.setText("Result : " + Double.toString(ans));
                        }
                    }
                    else {
                    	
                        logic();
                        
                    }
                }
            break;
        }
	}
    
}
