package br.com.envolvedesenvolve.batalhademcs.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import br.com.envolvedesenvolve.batalhademcs.BuildConfig;
import br.com.envolvedesenvolve.batalhademcs.R;

public class AboutFragment extends Fragment {

    private View view;
    private TextView txtVersion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_about, container, false);
        txtVersion = view.findViewById(R.id.text_about);

        String versionName = "versão: " + BuildConfig.VERSION_NAME;
        txtVersion.setText(versionName);

        return view;
    }
}