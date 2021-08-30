package com.example.notificationcounterupdated;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class notificationcount {
    private TextView notificationNumber;

    private final int MAX_NUMBER = 99;
    private final int MIN_NUMBER = 0;
    private int notification_number_counter =0;

   public notificationcount(View view){
        notificationNumber = view.findViewById(R.id.textView);

    }

    public void increament(){

        if(notification_number_counter>MAX_NUMBER){

            Log.d("Counter","Maximum number reached");
        }
        else{
            notification_number_counter++;
            notificationNumber.setText(String.valueOf(notification_number_counter));
        }
    }
    public void decrement(){

        if(notification_number_counter<=MIN_NUMBER){

            Log.d("Counter","Minimum number reached");
        }
        else{
            notification_number_counter--;
            notificationNumber.setText(String.valueOf(notification_number_counter));
        }
    }

    public void reset() {
        if (notification_number_counter == 0) {
            Log.d("alert"," notification count is already 0 ");
        }
        else{
            notification_number_counter=0;
            notificationNumber.setText(String.valueOf(notification_number_counter));
        }
    }

}
