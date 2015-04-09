package com.itec4860.dayplanner;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Timothy on 4/8/2015.
 */
public class ProjectActivity extends Activity{

    private Spinner projectTypeSpinner;
    private Button saveButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project_view);

        addItemsOnSpinner();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner() {

        projectTypeSpinner = (Spinner) findViewById(R.id.projectTypeSpinner);
        List<String> list = new ArrayList<String>();
        list.add("Month");
        list.add("Week");
        list.add("Day");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        projectTypeSpinner.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        projectTypeSpinner = (Spinner) findViewById(R.id. projectTypeSpinner);
        projectTypeSpinner.setOnItemSelectedListener(new CustomProjectTypeListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        projectTypeSpinner = (Spinner) findViewById(R.id.projectTypeSpinner);

//the save button doesn't do anything important right now
        saveButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(ProjectActivity.this,
                        "OnClickListener : " + "\nProject Type: " +
                                String.valueOf(projectTypeSpinner.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}
