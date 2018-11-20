package com.example.maria.homework_4.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.maria.homework_4.ListItemDecoration
import com.example.maria.homework_4.R
import com.example.maria.homework_4.adapters.RecyclerViewItemAdapter
import kotlinx.android.synthetic.main.fragment_zodiac_signs.view.*

class ZodiacSignsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_zodiac_signs, container, false)
        view.rv_zodiac_signs_list.layoutManager = GridLayoutManager(context, 3)
        view.rv_zodiac_signs_list.adapter = RecyclerViewItemAdapter(mDataset, activity?.applicationContext)
        view.rv_zodiac_signs_list.addItemDecoration(ListItemDecoration(context!!))
        return view
    }

    companion object {
        private var mDataset: Array<String> = arrayOf("Aries",
                "Taurus",
                "Gemini",
                "Cancer",
                "Leo",
                "Virgo",
                "Libra",
                "Scorpio",
                "Sagittarius",
                "Capricorn",
                "Aquarius",
                "Pisces")
    }
}
