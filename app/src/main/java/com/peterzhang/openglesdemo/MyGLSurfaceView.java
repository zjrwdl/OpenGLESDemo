package com.peterzhang.openglesdemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

public class MyGLSurfaceView extends GLSurfaceView {
    public MyGLSurfaceView(Context context) {
        super(context);
    }

    public MyGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void setGLWrapper(GLWrapper glWrapper) {
        super.setGLWrapper(glWrapper);
    }

    @Override
    public void setDebugFlags(int debugFlags) {
        super.setDebugFlags(debugFlags);
    }

    @Override
    public int getDebugFlags() {
        return super.getDebugFlags();
    }

    @Override
    public void setPreserveEGLContextOnPause(boolean preserveOnPause) {
        super.setPreserveEGLContextOnPause(preserveOnPause);
    }

    @Override
    public boolean getPreserveEGLContextOnPause() {
        return super.getPreserveEGLContextOnPause();
    }

    @Override
    public void setRenderer(Renderer renderer) {
        super.setRenderer(renderer);
    }

    @Override
    public void setEGLContextFactory(EGLContextFactory factory) {
        super.setEGLContextFactory(factory);
    }

    @Override
    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory factory) {
        super.setEGLWindowSurfaceFactory(factory);
    }

    @Override
    public void setEGLConfigChooser(EGLConfigChooser configChooser) {
        super.setEGLConfigChooser(configChooser);
    }

    @Override
    public void setEGLConfigChooser(boolean needDepth) {
        super.setEGLConfigChooser(needDepth);
    }

    @Override
    public void setEGLConfigChooser(int redSize, int greenSize, int blueSize, int alphaSize, int depthSize, int stencilSize) {
        super.setEGLConfigChooser(redSize, greenSize, blueSize, alphaSize, depthSize, stencilSize);
    }

    @Override
    public void setEGLContextClientVersion(int version) {
        super.setEGLContextClientVersion(version);
    }

    @Override
    public void setRenderMode(int renderMode) {
        super.setRenderMode(renderMode);
    }

    @Override
    public int getRenderMode() {
        return super.getRenderMode();
    }

    @Override
    public void requestRender() {
        super.requestRender();
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        super.surfaceCreated(holder);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        super.surfaceDestroyed(holder);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        super.surfaceChanged(holder, format, w, h);
    }

    @Override
    public void surfaceRedrawNeededAsync(SurfaceHolder holder, Runnable finishDrawing) {
        super.surfaceRedrawNeededAsync(holder, finishDrawing);
    }

    @Override
    public void surfaceRedrawNeeded(SurfaceHolder holder) {
        super.surfaceRedrawNeeded(holder);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void queueEvent(Runnable r) {
        super.queueEvent(r);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
