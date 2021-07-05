package com.example.appkotlin.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appkotlin.R
import com.example.appkotlin.databinding.FragmentMainBinding
import com.example.appkotlin.presentation.adapter.MainAdapter
import pro.mitapp.muslimroad.base.BaseFragment
import pro.mitapp.muslimroad.base.replaceFragment


class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {

    private lateinit var mainAdapter: MainAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainAdapter = MainAdapter()
        binding.mainRv.adapter = mainAdapter
    }
}