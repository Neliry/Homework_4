package com.example.maria.homework_4.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.maria.homework_4.R
import com.example.maria.homework_4.fragments.DaysFragment
import com.example.maria.homework_4.fragments.MonthsFragment
import com.example.maria.homework_4.fragments.ZodiacSignsFragment


class FragmentPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DaysFragment()
            1 -> MonthsFragment()
            else -> ZodiacSignsFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> mContext.getString(R.string.category_days)
            1 -> mContext.getString(R.string.category_months)
            2 -> mContext.getString(R.string.category_zodiac_signs)
            else -> null
        }
    }

}