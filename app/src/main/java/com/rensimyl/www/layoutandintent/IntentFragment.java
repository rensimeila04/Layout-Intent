package com.rensimyl.www.layoutandintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class IntentFragment extends Fragment {

    private EditText editText;
    private Button btnSenData;
    private String EXTRA_DATA = "EXTRA_DATA";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intent, container, false);
        btnSenData = view.findViewById(R.id.buttonsen);
        btnSenData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ayo();
            }
        });
        return view;
    }

    private void ayo() {
        try {
            String nama = editText.getText().toString();
            if (nama != null && nama != "") {
                Intent i = new Intent(getActivity(), TargetActivity.class);
                i.putExtra(EXTRA_DATA, nama);
                startActivity(i);

            } else {
                Toast.makeText(getActivity(), "YOU NEED TO FILL YOUR NAME", Toast.LENGTH_SHORT);
            }

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getActivity(), "ERROR, TRY AGAIN !", Toast.LENGTH_SHORT);
        }

    }


}