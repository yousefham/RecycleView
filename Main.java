package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ListView list1 = (ListView)findViewById(R.id.list1);
        final List<Employee> Employee = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.setName("ahmed");
        e1.setAge(12);
        e1.setImageid(R.drawable.ic_man);
        Employee.add(e1);

        Employee e2 = new Employee();
        e2.setName("yousef");
        e2.setAge(22);
        e2.setImageid(R.drawable.ic_man);
        Employee.add(e2);

        Employee e3 = new Employee();
        e3.setName("mah");
        e3.setAge(30);
        e3.setImageid(R.drawable.ic_man);
        Employee.add(e3);

        Employee e4 = new Employee();
        e4.setName("Ramy");
        e4.setAge(21);
        e4.setImageid(R.drawable.ic_man);
        Employee.add(e4);

        Employee e5 = new Employee();
        e5.setName("Ramy");
        e5.setAge(21);
        e5.setImageid(R.drawable.ic_man);
        Employee.add(e5);

        Employee e6 = new Employee();
        e6.setName("Ramy");
        e6.setAge(21);
        e6.setImageid(R.drawable.ic_man);
        Employee.add(e6);

        Employee e7 = new Employee();
        e7.setName("Ramy");
        e7.setAge(21);
        e7.setImageid(R.drawable.ic_man);
        Employee.add(e7);



        RecyclerView rv = (RecyclerView) findViewById(R.id.recycleview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);

        MyAdapter adapter = new MyAdapter(getApplicationContext(),Employee,R.layout.listview);
        rv.setAdapter(adapter);





    }
}
