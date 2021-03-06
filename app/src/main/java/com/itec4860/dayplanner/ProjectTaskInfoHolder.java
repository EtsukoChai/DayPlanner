package com.itec4860.dayplanner;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Class: ProjectTaskInfoHolder
 * @author Joshua Campbell
 * @version 1.0
 * Course: ITEC 4860 Spring 2015
 * Written: April 28, 2015
 * 
 * This class...
 * 
 * Purpose: 
 */
public class ProjectTaskInfoHolder
{
    private EditText taskNameEditText;
    private TextView dueDateTextView;
    private CheckBox completedStatusCheckBox;
    private RelativeLayout errorMessageContainer;
    private TextView dueDateErrorMsgTextView;
    private int taskDueMonth;
    private int taskDueDay;
    private int taskDueYear;

    public ProjectTaskInfoHolder(EditText taskName, TextView dueDate, CheckBox completedStatus,
                                 RelativeLayout errorMsgContainer, TextView errorMsg)
    {
        taskNameEditText = taskName;
        dueDateTextView = dueDate;
        completedStatusCheckBox = completedStatus;
        errorMessageContainer = errorMsgContainer;
        dueDateErrorMsgTextView = errorMsg;
    }

    public String getTaskName()
    {
        return taskNameEditText.getText().toString();
    }

    public EditText getTaskNameEditText()
    {
        return taskNameEditText;
    }

    public TextView getDueDateTextView()
    {
        return dueDateTextView;
    }

    public void clearError()
    {
        dueDateTextView.setError(null);
        dueDateErrorMsgTextView.setText("");
        errorMessageContainer.setVisibility(View.GONE);
    }

    public void setError(String errorMsg)
    {
        dueDateTextView.setError("");
        dueDateErrorMsgTextView.setText(errorMsg);
        errorMessageContainer.setVisibility(View.VISIBLE);
    }

    public TextView getDueDateErrorMsgTextView()
    {
        return dueDateErrorMsgTextView;
    }

    public String getDueDate()
    {
        return dueDateTextView.getText().toString();
    }

    public int isTaskCompleted()
    {
        if (completedStatusCheckBox.isChecked())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public void setMonthDayYear(int month, int day, int year)
    {
        taskDueMonth = month;
        taskDueDay = day;
        taskDueYear = year;
    }

    public int getTaskDueMonth()
    {
        return taskDueMonth;
    }

    public int getTaskDueDay()
    {
        return taskDueDay;
    }

    public int getTaskDueYear()
    {
        return taskDueYear;
    }
}
