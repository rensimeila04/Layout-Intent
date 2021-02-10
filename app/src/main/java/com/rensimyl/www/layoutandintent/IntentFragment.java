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

    EditText name;
    Button btnSend;

    private String KEY_NAME = "NAMA";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intent, container, false);
        name = view.findViewById(R.id.edt_nama);
        btnSend = view.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ayo();
            }
        });
        return view;
    }

    private void ayo() {
        try {
            String nama = name.getText().toString();
            if (nama != null && nama != "") {
                Intent i = new Intent(getContext(), TargetActivity.class);
                i.putExtra(KEY_NAME, nama);
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