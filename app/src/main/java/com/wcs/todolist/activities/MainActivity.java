package com.wcs.todolist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.wcs.todolist.R;
import com.wcs.todolist.adapters.TodoAdapter;
import com.wcs.todolist.models.Todo;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Todo description1 = new Todo("Faire la quete 07", "Maintenant");
        Todo description2 = new Todo("Faire la quete 08", "Ensuite");
        Todo description3 = new Todo("Faire la quete 09", "Plus Tard");
        Todo description4 = new Todo("Faire la quete 10", "Encore plus tard");

        List<Todo> todos = Arrays.asList(description1, description2, description3, description4);

        ListView listTodo = findViewById(R.id.listTodo);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, todos);
        listTodo.setAdapter(adapter);
    }
}
