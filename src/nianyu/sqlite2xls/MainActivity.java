package nianyu.sqlite2xls;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button mDirBtn;
	private Button mOutBtn;
	private Button mShowBtn;
	private TextView mShowTxt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		findById();
		setListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void findById(){
		mDirBtn = (Button)findViewById(R.id.mk);
		mOutBtn = (Button)findViewById(R.id.export);
		mShowBtn = (Button)findViewById(R.id.read);
		mShowTxt = (TextView)findViewById(R.id.show);
	}
	
	private void setListener(){
		
	}
}
