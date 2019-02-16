package codingwithmitch.com.databindinggettingstarted;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import codingwithmitch.com.databindinggettingstarted.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Data binding
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}