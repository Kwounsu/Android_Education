package com.example.activitiydemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FirstFragment : Fragment(){
    var TAG = "ActivityAndFragmentLifeCycle";

    lateinit var firstnameTxt : TextView
    lateinit var lastnameTxt : TextView
    lateinit var genderTxt : TextView
    lateinit var addressTxt : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "==Fragment=> onCreateView()");
        // Choose the layout to inflate
        val view =  inflater.inflate(R.layout.fragment_first, container, false)
        firstnameTxt = view.findViewById<TextView>(R.id.firstName_txt)
        lastnameTxt = view.findViewById<TextView>(R.id.lastName_txt)
        genderTxt = view.findViewById<TextView>(R.id.gender_txt)
        addressTxt = view.findViewById<TextView>(R.id.address_txt)
        return view
    }

    fun showDetails(firstname : String, lastname : String, gender : String, address : String){
        firstnameTxt.setText(firstname)
        lastnameTxt.setText(lastname)
        genderTxt.setText(gender)
        addressTxt.setText(address)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "==Fragment=> onAttach()");
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "==Fragment=> onCreate()");
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "==Fragment=> onActivityCreated()");
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "==Fragment=> onStart()");
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "==Fragment=> onResume()");
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "==Fragment=> onPause()");
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "==Fragment=> onStop()");
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "==Fragment=> onDestroyView()");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "==Fragment=> onDestroy()");
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "==Fragment=> onDetach()");
    }
}
