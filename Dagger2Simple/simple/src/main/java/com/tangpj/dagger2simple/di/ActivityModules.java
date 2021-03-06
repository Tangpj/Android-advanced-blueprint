package com.tangpj.dagger2simple.di;

import com.tangpj.dagger2simple.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityModules {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}