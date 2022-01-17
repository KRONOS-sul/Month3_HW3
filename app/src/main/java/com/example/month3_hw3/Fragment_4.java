package com.example.month3_hw3;

import static com.example.month3_hw3.Fragment_1.Name;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class Fragment_4 extends Fragment {
    private MaterialButton button4;
    private EditText editText4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_4, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button4 = view.findViewById(R.id.btn_send);
        editText4 = view.findViewById(R.id.et_text);

        button4.setOnClickListener(view1 -> {
            MainActivity activity = (MainActivity) requireActivity();
            Bundle bundle = new Bundle();
            Fragment fragment = new Fragment_5();
            bundle.putString(Name, editText4.getText().toString());
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        });
        Bundle bundle = getArguments();
        String name = bundle.getString(Name);
        editText4.setText(name);
    }
}