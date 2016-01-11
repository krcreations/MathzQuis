package com.mathzquis;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class level1 extends Activity  implements OnClickListener{
	
	Button btnok;
	EditText txt1;
	String x;
	int ans;
	ImageButton imgbtn;
	ImageView imgView1;
	ImageView imgView2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level1);
		
		btnok=(Button)findViewById(R.id.btnok);
		txt1=(EditText)findViewById(R.id.txt1);

		btnok.setOnClickListener(this);
		
		imgView1 = (ImageView)findViewById(R.id.img1);
		imgView2 = (ImageView)findViewById(R.id.img2);
		
	}
	
	@Override
	public void onClick(View v) {
		if (v==btnok){
			x=txt1.getText().toString();
			ans=Integer.parseInt(x);
			if (ans==6){
				Toast.makeText(getApplicationContext(), "Answer Is Correct !", Toast.LENGTH_LONG).show();
				
				imgView1 .setVisibility(View.VISIBLE);
				
			
			}
			else{
				Toast.makeText(getApplicationContext(), "Answer Is Wrong !", Toast.LENGTH_LONG).show();
				imgView2 .setVisibility(View.VISIBLE);
			}
		}
		
	}
}
