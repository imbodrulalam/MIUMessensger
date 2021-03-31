package com.example.miumessenger.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miumessenger.R;
import com.example.miumessenger.adapters.UsersAdapter;
import com.example.miumessenger.databinding.FragmentChatsBinding;
import com.example.miumessenger.models.Users;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class ChatsFragment extends Fragment {



    public ChatsFragment() {
        // Required empty public constructor
    }

    FragmentChatsBinding binding;
    ArrayList<Users> usersArrayList = new ArrayList<>();
    FirebaseAuth auth;
    FirebaseDatabase database = FirebaseDatabase.getInstance();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        binding = FragmentChatsBinding.inflate(inflater, container, false);
        getActivity().setTitle(R.string.menu_chats);

        UsersAdapter adapter = new UsersAdapter(usersArrayList , getContext());
        binding.chatsRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.chatsRecyclerView.setLayoutManager(layoutManager);

        database.getReference().child("users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                usersArrayList.clear();
                for(DataSnapshot  datasnapshot : snapshot.getChildren()){
                    Users users = datasnapshot.getValue(Users.class);
                    users.setUserId(datasnapshot.getKey());
                    usersArrayList.add(users);

                }
                adapter.notifyDataSetChanged();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });





        return binding.getRoot();
    }
}