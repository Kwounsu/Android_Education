package com.example.activitiydemo

import android.*
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SecondFragment.GetUserDetail {
    var TAG = "ActivityAndFragmentLifeCycle";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "===>onCreate()");
        loadFragment()
    }

    private fun loadFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val secondFragment = SecondFragment()
        secondFragment.getUserDetail = this
        fragmentTransaction.add(R.id.fragment_container, secondFragment)
        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "===>onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "===>onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "===>onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "===>onStop()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "===>onDestroy()");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "===>onRestart()");
    }

    override fun showDetails(firstName: String, lastName: String) {
        val firstFragment : FirstFragment = first_fragment as FirstFragment;
        firstFragment.showDetails(firstName,lastName)
    }
}
