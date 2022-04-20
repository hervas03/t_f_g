package com.example.t_f_g.ui.favs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.t_f_g.databinding.FragmentFavsBinding;

public class FavsFragment extends Fragment {

    private FavsViewModel favsViewModel;
    private FragmentFavsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        favsViewModel =
                new ViewModelProvider(this).get(FavsViewModel.class);

        binding = FragmentFavsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}