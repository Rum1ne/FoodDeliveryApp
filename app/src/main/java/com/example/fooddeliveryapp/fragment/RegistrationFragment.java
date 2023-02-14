package com.example.fooddeliveryapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.fooddeliveryapp.databinding.FragmentRegistrationBinding;


public class RegistrationFragment extends Fragment {

    FragmentRegistrationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistrationBinding.inflate(getLayoutInflater(), container, false);
        binding.registrationButton.setOnClickListener(view -> {
            Toast.makeText(getContext(), "bup", Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }

}