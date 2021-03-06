package com.dcc.covidtracker

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import androidx.multidex.BuildConfig
import androidx.multidex.MultiDex
import com.dcc.covidtracker.localDatabase.roomDatabase.RoomDatabase
import com.dcc.covidtracker.localDatabase.sharedPreference.SharedPreferenceImpl
import com.example.chatbotdemo.utility.ReleaseApkTreeLog
import timber.log.Timber


class CovidTrackerApp : Application(), Application.ActivityLifecycleCallbacks {

    /**
     * Room Database*/
    private lateinit var covidDatabase: RoomDatabase

    /**
     * SharedPreference*/
    private lateinit var sharedPreference: SharedPreferenceImpl
    /**
     * checking internet connection*/
    private var isInterestingActivityVisible = false

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
        //Register Activity Callbacks
        registerActivityLifecycleCallbacks(this)

        /**Initialize Timber-Log as Per Build Wise**/
        when {
            BuildConfig.DEBUG -> {
                Timber.plant(Timber.DebugTree())
            }
            else -> {
                Timber.plant(ReleaseApkTreeLog())
            }
        }
    }

    /**
     * Static Field*/
    companion object {
        private lateinit var instance: CovidTrackerApp


        fun isInterestingActivityVisible(): Boolean {
            return instance.isInterestingActivityVisible
        }

        /**
         * getting context from application class*/
        fun getApplicationContext(): Context {
            //Timber.e("Context--ApplicationContext")
            return instance.applicationContext
        }

        /**
         * getting  SharedPref through application class*/
        fun getPref(): SharedPreferenceImpl {
            //Timber.e( "LocalDatabase--SharedPref")
            return instance.sharedPreference
        }

        /**
         *getting RoomDatabase through application class*/
        fun getRoomDatabase(): RoomDatabase {
            //Timber.e( "Room--LocalDatabase")
            return instance.covidDatabase
        }

    }


    override fun attachBaseContext(context: Context?) {
        super.attachBaseContext(context)
        /**initialize multiDex for over 65k methods in application class*/
        MultiDex.install(context)
    }


    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        Timber.e("onActivityCreated--${activity.componentName.className}")
    }

    override fun onActivityStarted(activity: Activity) {
        Timber.e("onActivityStarted--${activity.componentName.className}")
    }

    override fun onActivityResumed(activity: Activity) {
        Timber.e("onActivityResumed--${activity.componentName.className}")
        //if (activity is BaseActivity) {
            isInterestingActivityVisible = true
        //}
    }

    override fun onActivityPaused(activity: Activity) {
        Timber.e("onActivityPaused--${activity.componentName.className}")
    }

    override fun onActivityStopped(activity: Activity) {
        Timber.e("onActivityStopped--${activity.componentName.className}")
        //if (activity is BaseActivity) {
        isInterestingActivityVisible = false
        //}

    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        Timber.e("""onActivitySaveInstanceState--${activity.componentName.className}""")
    }

    override fun onActivityDestroyed(activity: Activity) {
        Timber.e("onActivityDestroyed--${activity.componentName.className}")
        //if (activity is BaseActivity) {
        isInterestingActivityVisible = false
        // }
    }


}
