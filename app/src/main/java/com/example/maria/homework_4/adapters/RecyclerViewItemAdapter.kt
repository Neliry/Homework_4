package com.example.maria.homework_4.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.maria.homework_4.R

class RecyclerViewItemAdapter
(private val mDataSet: Array<String>, private var context: Context?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val textView: TextView = v.findViewById<View>(R.id.textView) as TextView
    }

    class ZodiacViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val textView: TextView = v.findViewById<View>(R.id.textView) as TextView
        val image: ImageView = v.findViewById<View>(R.id.zodiac_image) as ImageView
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 1) {
            val v = LayoutInflater.from(viewGroup.context)
                    .inflate(R.layout.list_item, viewGroup, false)

            ViewHolder(v)
        } else {
            val v = LayoutInflater.from(viewGroup.context)
                    .inflate(R.layout.zodiac_list_item, viewGroup, false)
            ZodiacViewHolder(v)
        }
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        Log.d(TAG, "Element $position set.")
        when (viewHolder) {
            is ViewHolder -> {
                viewHolder.textView.text = mDataSet[position]
            }
            is ZodiacViewHolder -> {
                viewHolder.textView.text = mDataSet[position]
                val id: Int = context!!.resources.getIdentifier("icon_" + mDataSet[position].toLowerCase(), "drawable",
                        context!!.packageName)
                viewHolder.image.setImageResource(id)
            }
        }
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (mDataSet[0] == "Aries")
            2
        else 1
    }

    companion object {
        private val TAG = "CustomAdapter"
    }
}