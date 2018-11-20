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
import kotlinx.android.synthetic.main.fragment_months.view.*

class MonthsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_months, container, false)
        val adapter = RecyclerViewItemAdapter(MonthsFragment.mDataset, activity?.applicationContext)
        view.rv_months_list.layoutManager = LinearLayoutManager(context)
        view.rv_months_list.adapter = adapter
        view.rv_months_list.addItemDecoration(ListItemDecoration(context!!))
        return view
    }

    companion object {
        private var mDataset: Array<String> = arrayOf("January",
                "February",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December")
    }
}
