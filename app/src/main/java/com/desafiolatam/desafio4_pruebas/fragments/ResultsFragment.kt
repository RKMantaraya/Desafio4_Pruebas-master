package com.desafiolatam.desafio4_pruebas.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.desafiolatam.desafio4_pruebas.R
import com.desafiolatam.desafio4_pruebas.databinding.FragmentResultsBinding
import com.desafiolatam.desafio4_pruebas.viewModel.MainViewModel

class ResultsFragment : Fragment() {

    private var _binding: FragmentResultsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvFirstAnswer.text  = viewModel.getFirstAnswer()

        viewModel.getUserEmail().run {
            binding.tvUserEmail.text = this
        }
        viewModel.getUserComment().run {
            binding.tvUserComment.text = this
        }
    }

    override fun onResume() {
        super.onResume()
        binding.tvFirstAnswer.text  = viewModel.getFirstAnswer()

        viewModel.getUserEmail().run {
            binding.tvUserEmail.text = this
        }
        viewModel.getUserComment().run {
            binding.tvUserComment.text = this
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}