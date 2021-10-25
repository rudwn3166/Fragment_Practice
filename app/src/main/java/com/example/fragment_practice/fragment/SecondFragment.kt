package com.example.fragment_practice.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_practice.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeColorToYellow.setOnClickListener {

            textChange.text ="노랑색 버튼이 눌렸습니다"

        }

        changeColorToWhite.setOnClickListener {

            textChange.text ="하얀색 버튼이 눌렸습니다"

        }

    }
}