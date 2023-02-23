package com.yasinmaldar.droneworld11.ui.home;

import static android.view.KeyEvent.*;

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
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yasinmaldar.droneworld11.R;
import com.yasinmaldar.droneworld11.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel homeViewModel;
    private KeyEvent event;

    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        View v2 = inflater.inflate(R.layout.fragment_home, container, false);
        WebView  idWebViewHome = (WebView) v2.findViewById(R.id.idWebViewHome);
        idWebViewHome.getSettings().setJavaScriptEnabled(true);
        idWebViewHome.setWebViewClient(new WebViewClient());
        idWebViewHome.loadUrl("http://droneworldz.com/index.html");

        return v2;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}