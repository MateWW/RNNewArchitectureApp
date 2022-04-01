package com.rnnewarchitectureapp.newarchitecture.modules;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.rnnewarchitectureapp.codegen.NativeAnswerSolverSpec;

public class NativeAnswerSolver extends NativeAnswerSolverSpec {

    public static final String NAME = "NativeAnswerSolver";

    public NativeAnswerSolver(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public double syncOne() {
        Log.d("ReactNativeJS", "[syncOne] Running on thread: "+ Thread.currentThread().getName());
        return 0;
    }

    @Override
    public double syncTwo() {
        Log.d("ReactNativeJS", "[syncTwo] Running on thread: "+ Thread.currentThread().getName());
        return 0;
    }

    @Override
    public void asyncOne() {
        Log.d("ReactNativeJS", "[asyncOne] Running on thread: "+ Thread.currentThread().getName());
    }

    @Override
    public void asyncTwo() {
        Log.d("ReactNativeJS", "[asyncTwo] Running on thread: "+ Thread.currentThread().getName());
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }
}
