package com.mathzquis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Thread load= new Thread(){
        	public void run()
        	{
        	try {
				int load =0;
				while (load<5000)
				{
					sleep(100);
					load=load+100;
				}
				
				startActivity(new Intent("com.mathzquis.CLEARSCREEN"));
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
    		
    		finally {
    			finish();
    		}
        	}
        	
        };
        load.start();
    }


    
    
    
    
    
    @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}







	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}







	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}







	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}







	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}







	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}







	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
