@file:Suppress("unused")

package com.droidfeed.di.main

import com.droidfeed.ui.module.about.AboutFragment
import com.droidfeed.ui.module.conferences.ConferencesFragment
import com.droidfeed.ui.module.contribute.ContributeFragment
import com.droidfeed.ui.module.feed.FeedFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeNewsFragment(): FeedFragment

    @ContributesAndroidInjector
    abstract fun contributeAboutFragment(): AboutFragment

    @ContributesAndroidInjector
    abstract fun contributeHelpUsFragment(): ContributeFragment

    @ContributesAndroidInjector
    abstract fun contributeConferencesFragment(): ConferencesFragment
}