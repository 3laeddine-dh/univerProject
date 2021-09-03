package com.example.universeapp.ui.fragments.Home

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.universeapp.R
import com.example.universeapp.networking.NetClient
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.layout_modal_bottom_sheet.*
import retrofit2.Call
import retrofit2.Response

class CustomBottomSheetDialogFragment : BottomSheetDialogFragment {


    constructor(AdminType: Int,UserId : Int) : super(){
        this.AdminType = AdminType
        this.UserId = UserId
    }

    lateinit var  firstButton : Button
    lateinit var  secondButton : Button
    lateinit var  thirdButton : Button

    var AdminType : Int
    var UserId : Int


    companion object {
        const val TAG = "CustomButtomSheet"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var v : View = inflater.inflate(R.layout.layout_modal_bottom_sheet, container, false)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (AdminType == 2) {
            createchannel_txt.visibility = View.GONE
            createchannel_btn.visibility = View.GONE
        }

        createchannel_btn.setOnClickListener {
            val editTextInout: EditText = EditText(requireContext())
            var btnCreate: String = "Create"
            var btnCancel: String = "Cancel"

            var AD = AlertDialog.Builder(requireContext())
            AD.setView(editTextInout)
            AD.setTitle("Create Channel")
            AD.setMessage("Enter Channel Name :")
            AD.setPositiveButton(btnCreate, object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    var input = editTextInout.text.toString()
                    NetClient.getINSTANCE().setCreateChannel(UserId, input)
                        .enqueue(object : retrofit2.Callback<Void> {
                            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                                if (response.isSuccessful) {
                                    Log.e(
                                        "tt",
                                        "on Response > Custtom Sheet > Success Create Channl"
                                    )
                                } else {
                                    Log.e("tt", "on Response > Custtom Sheet > Else Create Channel")
                                }
                            }

                            override fun onFailure(call: Call<Void>, t: Throwable) {
                                Log.e("tt", "on Response > Custtom Sheet > Failure Create Channel")
                            }
                        })
                }
            })

            AD.setNegativeButton(btnCancel, object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    AD.setCancelable(true)
                }

            })
        }
        creategroup_btn.setOnClickListener {
            val editTextInout: EditText = EditText(requireContext())
            var btnCreate: String = "Create"
            var btnCancel: String = "Cancel"

            var AD = AlertDialog.Builder(requireContext())
            AD.setView(editTextInout)
            AD.setTitle("Title")
            AD.setMessage("Enter Group Name :")
            AD.setPositiveButton(btnCreate, object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    var input = editTextInout.text.toString()

                    NetClient.getINSTANCE().setCreateGroup(UserId, input)
                        .enqueue(object : retrofit2.Callback<Void> {
                            override fun onResponse(call: Call<Void>, response: Response<Void>) {
                                if (response.isSuccessful) {
                                    Log.e("tt", "on Response > Custtom Sheet > Success")
                                } else {
                                    Log.e("tt", "on Response > Custtom Sheet > Success")
                                }
                            }

                            override fun onFailure(call: Call<Void>, t: Throwable) {
                                Log.e("tt", "on Response > Custtom Sheet > Failure")
                            }
                        })
                }
            })

            AD.setNegativeButton(btnCancel, object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {

                }

            })


        }

    }
}