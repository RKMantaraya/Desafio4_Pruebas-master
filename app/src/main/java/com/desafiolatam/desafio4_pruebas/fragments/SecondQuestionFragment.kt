package com.desafiolatam.desafio4_pruebas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.activityViewModels
import com.desafiolatam.desafio4_pruebas.databinding.FragmentSecondQuestionBinding
import com.desafiolatam.desafio4_pruebas.viewModel.MainViewModel


class SecondQuestionFragment : Fragment() {

    private var _binding: FragmentSecondQuestionBinding? =  null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondQuestionBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run {
            answer21.doOnTextChanged { text, _, _, _ ->
                viewModel.saveUserEmail(text.toString())
            }

            answer22.doOnTextChanged { text, _, _, _ ->
                viewModel.saveUserComment(text.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}