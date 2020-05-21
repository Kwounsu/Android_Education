package com.example.activitiydemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class SecondFragment : Fragment() {

    interface GetUserDetail {
        fun showDetails(firstName:String, lastName:String, gender : String, address : String)
    }

    lateinit var getUserDetail : GetUserDetail
    lateinit var firstNameEditText : EditText
    lateinit var lastNameEditText : EditText
    lateinit var genderEditText : EditText
    lateinit var addressEditText : EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val showDetailButton = view.findViewById<Button>(R.id.submit_btn)
        firstNameEditText = view.findViewById(R.id.firstname_edt)
        lastNameEditText = view.findViewById(R.id.lastname_edt)
        genderEditText = view.findViewById(R.id.gender_edt)
        addressEditText = view.findViewById(R.id.address_edt)
        showDetailButton.setOnClickListener( View.OnClickListener {
            // Second Fragment -> Activity
            getUserDetail.showDetails(firstNameEditText.text.toString(),lastNameEditText.text.toString(), genderEditText.text.toString(),addressEditText.text.toString())
        })
        return view
    }

}
