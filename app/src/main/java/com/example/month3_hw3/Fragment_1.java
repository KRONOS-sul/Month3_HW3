package com.example.month3_hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class Fragment_1 extends Fragment {
    private MaterialButton button;
    private EditText editText;

    public  final static String Name = "name";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.btn_send);
        editText = view.findViewById(R.id.et_text);

        button.setOnClickListener(view1 -> {
      MainActivity activity = (MainActivity) requireActivity();
//      MainActivity.isMainFragment = false;
            Bundle bundle = new Bundle();
            Fragment fragment = new Fragment_2();
            bundle.putString(Name,editText.getText().toString());
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        });
    }
}