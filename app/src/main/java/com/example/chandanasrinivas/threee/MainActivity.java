package com.example.chandanasrinivas.threee;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.widget.Adapter;

        import java.util.ArrayList;
        import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> names = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, names);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}



