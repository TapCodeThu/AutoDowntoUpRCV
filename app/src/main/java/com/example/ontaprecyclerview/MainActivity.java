package com.example.ontaprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.id_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        userAdapter = new UserAdapter();
        userAdapter.setData(getListUser());
        recyclerView.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.anhgaixinh01,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh02,"Yến Nhi"));
        list.add(new User(R.drawable.anhgaixinh03,"Trâm Anh"));
        list.add(new User(R.drawable.anhgaixinh04,"Quỳnh Nga"));
        list.add(new User(R.drawable.anhgaixinh05,"Như Ngọc"));
        list.add(new User(R.drawable.anhleeminho,"Lee Min Hoo"));
        list.add(new User(R.drawable.anhmessi,"Messi"));
        list.add(new User(R.drawable.anhneimar,"Neir Ma"));
        list.add(new User(R.drawable.anhgaixinh01,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh02,"Yến Nhi"));
        list.add(new User(R.drawable.anhgaixinh03,"Trâm Anh"));
        list.add(new User(R.drawable.anhgaixinh04,"Quỳnh Nga"));
        list.add(new User(R.drawable.anhgaixinh05,"Như Ngọc"));
        list.add(new User(R.drawable.anhleeminho,"Lee Min Hoo"));
        list.add(new User(R.drawable.anhmessi,"Messi"));
        list.add(new User(R.drawable.anhneimar,"Neir Ma"));
        list.add(new User(R.drawable.anhgaixinh01,"Ngọc Huyền"));
        list.add(new User(R.drawable.anhgaixinh02,"Yến Nhi"));
        list.add(new User(R.drawable.anhgaixinh03,"Trâm Anh"));
        list.add(new User(R.drawable.anhgaixinh04,"Quỳnh Nga"));
        list.add(new User(R.drawable.anhgaixinh05,"Như Ngọc"));
        list.add(new User(R.drawable.anhleeminho,"Lee Min Hoo"));
        list.add(new User(R.drawable.anhmessi,"Messi"));
        list.add(new User(R.drawable.anhneimar,"Neir Ma"));
        return list;
    }
}