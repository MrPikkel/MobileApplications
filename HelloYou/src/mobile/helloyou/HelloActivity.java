package mobile.helloyou;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello, menu);
		return true;
	}

	public void selfDestruct(View view) {
		
		Context context = getApplicationContext();
		TextView input = (TextView) findViewById(R.id.veldinput);
		Log.v("Een string bla bla bla bla, kijk naar mij", "clicked HELLO");
		int duration = 50;
		Toast toastmetjam = Toast.makeText(context, input.getText(), duration);
		// Do something
		toastmetjam.show();

	}

	
}
