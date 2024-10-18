package com.desafiolatam.desafio4_pruebas.viewAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.desafiolatam.desafio4_pruebas.fragments.FirstQuestionFragment
import com.desafiolatam.desafio4_pruebas.fragments.ResultsFragment
import com.desafiolatam.desafio4_pruebas.fragments.SecondQuestionFragment

class PageAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstQuestionFragment()
            1 -> SecondQuestionFragment()
            //2 -> ThirdQuestionFragment()
            //3 -> FourthQuestionFragment()
            //4 -> FithQuestionFragment()
            5 -> ResultsFragment()
            else -> FirstQuestionFragment()
        }
    }
}