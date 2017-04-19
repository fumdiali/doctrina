package ng.layer7.doctrina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    // method launches learn igbo activity
    public void learnIbo(View view){
        Intent ibo = new Intent(this, IboActivity.class);
        startActivity(ibo);
    }

    // method launches learn math activity
    public void learnMath(View view){
        Intent math = new Intent(this, MathActivity.class);
        startActivity(math);
    }
}
