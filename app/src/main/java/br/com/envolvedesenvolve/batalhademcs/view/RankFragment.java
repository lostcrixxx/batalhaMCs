package br.com.envolvedesenvolve.batalhademcs.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import br.com.envolvedesenvolve.batalhademcs.R;

public class RankFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_rank, container, false);

        ImageView boxFirst = view.findViewById(R.id.img_box_first);
        boxFirst.setBackgroundColor(Color.YELLOW);
        ImageView boxTwo = view.findViewById(R.id.img_box_two);
        boxTwo.setBackgroundColor(Color.YELLOW);
        ImageView boxTree = view.findViewById(R.id.img_box_tree);
        boxTree.setBackgroundColor(Color.YELLOW);

        return view;
    }
}