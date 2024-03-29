package com.undira.tiundira.ui.main;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import com.undira.tiundira.DBHandler;
import com.undira.tiundira.Undira;
import com.undira.tiundira.databinding.FragmentMainBinding;

/**
 * A placeholder fragment containing a simple view.
 */
@SuppressLint("ValidFragment")
public class PlaceholderFragment extends Fragment {
    private DBHandler dbHandler;
    @SuppressLint("ValidFragment")
    public PlaceholderFragment() {
        this.dbHandler = dbHandler;
    }

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
private FragmentMainBinding binding;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this,
                new ViewModelProvider.NewInstanceFactory()).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);

        dbHandler = new DBHandler(getActivity());
        Undira course = dbHandler.getCourseById(index);
        String a = (course != null) ? course.getContent() : "Course content not available";
        pageViewModel.setText(a);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

      binding = FragmentMainBinding.inflate(inflater, container, false);
      View root = binding.getRoot();

        final TextView textView = binding.sectionLabel;
        pageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}