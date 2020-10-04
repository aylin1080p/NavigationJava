package com.aylingunes.navigationjava;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {
    public FirstFragment() {
        //constructor oluşturmalısın

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }


    @Override //onviewcreated görünümler oluşturulduktan sonra çağırılacak method
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tıklanınca yapılacak olanlar buraada


                goToSecond(view); //düzenli olması için bu methodu aşağıda doldur
            }
        });


    }

    public void goToSecond (View view) {

       // NavDirections action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        FirstFragmentDirections.ActionFirstFragmentToSecondFragment action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        action.setAge(26);
        Navigation.findNavController(view).navigate(action);


    }
}