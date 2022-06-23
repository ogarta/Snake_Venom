package com.svute.snakevenom;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends Fragment {
    TextView txtInforProject, textInforApp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        addControls(view);
        addEvent();
        return view;
    }

    private void addEvent() {
        txtInforProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://qrco.de/bd6miP" +
                        "");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        textInforApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new InforAppFragment());
            }
        });
    }

    private void addControls(View view) {
        txtInforProject = view.findViewById(R.id.textViewInfoProject);
        textInforApp = view.findViewById(R.id.textViewInfoApp);
    }

    private void replaceFragment(Fragment fragment){
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment, "findThisFragment")
                .addToBackStack(null)
                .commit();
    }
}