package com.yasinmaldar.droneworld11.ui.about;

import static android.view.KeyEvent.ACTION_DOWN;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.yasinmaldar.droneworld11.R;
import com.yasinmaldar.droneworld11.databinding.FragmentAboutBinding;

public class aboutFragment extends Fragment {

    private FragmentAboutBinding binding;

    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {





        View v = inflater.inflate(R.layout.fragment_about, container, false);
        WebView idWebViewAbout = (WebView) v.findViewById(R.id.idWebViewAbout);
        idWebViewAbout.getSettings().setJavaScriptEnabled(true);
        idWebViewAbout.setWebViewClient(new WebViewClient());
        idWebViewAbout.loadUrl("http://droneworldz.com/about.html");

        return v;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}