package com.wcs.todolist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wcs.todolist.R;
import com.wcs.todolist.models.Todo;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<Todo> {

    public TodoAdapter(Context context, List<Todo> todos) {
        super(context, 0, todos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO 1 : Get the data item for this position
        Todo item = getItem(position);

        // TODO 2 : Check if an existing view is being reused, otherwise inflate the view
        if (null == convertView) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_todo, parent, false);
        }

        // TODO 3 : Lookup view for data population
        TextView description = convertView.findViewById(R.id.textDescription);
        TextView date = convertView.findViewById(R.id.textDate);

        // TODO 4 : Populate the data into the template view using the data object
        description.setText(item.getDescription());
        date.setText(item.getDate());
        // Return the completed view to render on screen
        return convertView;
    }
}
