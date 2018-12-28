package com.peterzhang.openglesdemo;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    GLSurfaceView mGlSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGlSurfaceView = findViewById(R.id.sl);
        mGlSurfaceView.setEGLContextClientVersion(2);
        GLSurfaceView.Renderer renderer = new MyRender();
        mGlSurfaceView.setRenderer(renderer);
        mGlSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
