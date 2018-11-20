package com.example.maria.homework_4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.maria.homework_4.ListItemDecoration

import com.example.maria.homework_4.R
import com.example.maria.homework_4.adapters.RecyclerViewItemAdapter
import kotlinx.android.synthetic.main.fragment_days.view.*

class DaysFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_days, container, false)
        val adapter = RecyclerViewItemAdapter(mDataset, activity?.applicationContext)
        view.rv_days_list.layoutManager = LinearLayoutManager(context)
        view.rv_days_list.adapter = adapter
        view.rv_days_list.addItemDecoration(ListItemDecoration(context!!))
        return view
    }

    companion object {
        private var mDataset: Array<String> = arrayOf("Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday")
    }
}
