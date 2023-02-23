package com.yasinmaldar.droneworld11.ui.gallery;

import static android.view.KeyEvent.ACTION_DOWN;

import static com.yasinmaldar.droneworld11.R.id.idWebViewGallery;

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
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yasinmaldar.droneworld11.R;
import com.yasinmaldar.droneworld11.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    @SuppressLint("SetJavaScriptEnabled")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View v1 = inflater.inflate(R.layout.fragment_gallery, container, false);
        WebView idWebViewGallery= (WebView) v1.findViewById(R.id.idWebViewGallery);
        idWebViewGallery.getSettings().setJavaScriptEnabled(true);
        idWebViewGallery.setWebViewClient(new WebViewClient());
        idWebViewGallery.loadUrl("http://droneworldz.com/gallery.html");

        return v1;


    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}