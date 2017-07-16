package com.example.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by best tech on 7/16/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    List<Employee> Employees ;
    int layout ;
    Context context ;

    public MyAdapter(Context context , List<Employee> Employee , int layout ){
        this.context = context ;
        this.Employees = Employee ;
        this.layout = layout;
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layout,parent,false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final Employee Employee = Employees.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,Employees.get(position).getName(),Toast.LENGTH_SHORT).show();

            }
        });
        holder.im.setImageResource(Employee.getImageid());
        holder.nametext.setText(Employee.getName());
        holder.agetext.setText(Employee.getAge()+"");
        holder.deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }

    @Override
    public int getItemCount() {
        return Employees.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView im ;
        TextView nametext ;
        TextView agetext ;
        Button deletebtn ;


        public MyViewHolder(View itemView) {
            super(itemView);
            im = (ImageView) itemView.findViewById(R.id.im);
            nametext = (TextView) itemView.findViewById(R.id.textname);
            agetext = (TextView)itemView.findViewById(R.id.textage);
            deletebtn = (Button)itemView.findViewById(R.id.delete_btn);
        }
    }
}
