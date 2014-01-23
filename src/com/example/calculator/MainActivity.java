package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	String num1="",num2="";
	String opr="";
	Double number1,number2;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	public void clear(View ButtonClear){
		EditText ScreenView   = (EditText) findViewById(R.id.screen);
		//Button one = (Button) findViewById(R.id.Button1);
		ScreenView.setText("");
		opr = "";
		num1 ="";
		num2 ="";
	}

	public void click0(View Button0){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 if(screen.getText() != "0"){
			 screen.setText(num1+ "0");
			 num1=screen.getText().toString();
		  }
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			if(screen.getText() != "0"){		
				screen.setText(num2);
				screen.setText(num2+ "0");
				num2=screen.getText().toString();
		} 
	  }
	}
	public void click1(View Button1){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "1");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "1");
			num2=screen.getText().toString();
		}
		 
	}
	public void click2(View Button2){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "2");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "2");
			num2=screen.getText().toString();
		}
		 
	}
	public void click3(View Button3){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "3");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "3");
			num2=screen.getText().toString();
		}
		 
	}
	public void click4(View Button4){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "4");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "4");
			num2=screen.getText().toString();
		}
		 
	}
	public void click5(View Button5){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "5");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "5");
			num2=screen.getText().toString();
		}
		 
	}
	public void click6(View Button6){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "6");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "6");
			num2=screen.getText().toString();
		}
		 
	}
	public void click7(View Button7){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "7");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "7");
			num2=screen.getText().toString();
		}
		 
	}
	public void click8(View Button8){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "8");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "8");
			num2=screen.getText().toString();
		}
		 
	}
	public void click9(View Button9){
		if (opr == ""){
		 TextView screen = (EditText)findViewById(R.id.screen);		 
		 //if(screen.getText() == "0"){screen.setText("");}
		 num1=screen.getText().toString();
         screen.setText(num1+ "9");
         num1=screen.getText().toString();
		}
		else {
			TextView screen = (EditText)findViewById(R.id.screen);
			screen.setText(num2);
	        screen.setText(num2+ "9");
			num2=screen.getText().toString();
		}
		 
	}
	
	public void dot(View ButtonDot){
		if (opr == ""){
			 TextView screen = (EditText)findViewById(R.id.screen);		  
			 num1=screen.getText().toString();
			 if(!num1.contains(".")){
	         screen.setText(num1+ ".");
	         num1=screen.getText().toString();
			}
		}
			else {
				TextView screen = (EditText)findViewById(R.id.screen);
				screen.setText(num2);
				if(!num2.contains(".")){
		        screen.setText(num2+ ".");
				num2=screen.getText().toString();
				}
			}
	}
	
	public void plus(View ButtonPlus){
		TextView screen = (EditText)findViewById(R.id.screen);
		num1 = screen.getText().toString();
		opr = "plus";                                                                                                   
	}
	public void minus(View ButtonMinus){
		TextView screen = (EditText)findViewById(R.id.screen);
		num1 = screen.getText().toString();
		opr = "minus";                                                                                                   
	}
	
	public void times(View ButtonTimes){
		TextView screen = (EditText)findViewById(R.id.screen);
		num1 = screen.getText().toString();
		opr = "times";                                                                                                   
	}
	public void divide(View ButtonDivide){
		TextView screen = (EditText)findViewById(R.id.screen);
		num1 = screen.getText().toString();
		opr = "divide";                                                                                                   
	}
	public void plusMinus(View ButtonPlusMinus){
		TextView screen = (EditText)findViewById(R.id.screen);
		double temp = 0.0;
		temp = (-1)*Double.parseDouble(screen.getText().toString());
		if (opr==""){
			num1 = Double.toString(temp);
			screen.setText(num1);
			}
		else{
			num2 = Double.toString(temp);
			screen.setText(num2);
		    }                                                                        
	}
	
	
	
	public void equal(View ButtonEqual){
		TextView screen = (EditText)findViewById(R.id.screen);
		String current = screen.getText().toString();
		Double result = 0.0;
		if (opr == ""){screen.setText(current);}
		else {
		Double number1 = Double.parseDouble(num1);
		Double number2 = Double.parseDouble(num2);
		if (opr == "plus"){
			result = number1+number2;
		}
		if (opr == "minus"){
			result = number1-number2;
		}
		if (opr == "times"){
			result = number1*number2;
		}
		if (opr == "divide"){
			result = number1/number2;
		}
		if (Double.isNaN(result) || Double.isInfinite(result)){
			screen.setText("0");
		}
		screen.setText(result.toString());
		}
		opr = "";
		num1 ="";
		num2 ="";
	}

}
