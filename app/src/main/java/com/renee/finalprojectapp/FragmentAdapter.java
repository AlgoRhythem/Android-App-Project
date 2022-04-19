package com.renee.finalprojectapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        if (position == 0){
            args.putString(FirstFragment.TITLE, "Do you Remember When you watched your favorite Movie, tv show, cartoon, or anime for the first time? \n\n" +
                    "Well, we aim to test your nostalgic love for your childhood, teen, and even adult faves in this app. Swipe over to the 'Game' section to get started in this games' Disney Edition!");
            fragment.setArguments(args);
            return fragment;
        } else if (position == 1){
            args.putString(FirstFragment.TITLE, "Welcome to 'Remember When'! \n\n" +
                    "Lets talk gaming, shall we?  Hope you can recall everything Disney, because we will ask questions only the hardest core fans will recall.\n\n" +
                    "Don't believe me? Hit the 'play' button below to get started and prove your pudding!");
            fragment.setArguments(args);
            return fragment;
        } else {
            args.putString(FirstFragment.TITLE, "Got questions, or run into an issue?  Contact us once this section goes live!");
            fragment.setArguments(args);
            return fragment;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
