package com.example.navigation_graph_practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.navigation_graph_practice.databinding.FragmentCarBinding


class CarFragment : Fragment() {
    private lateinit var binding: FragmentCarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val navController: NavController = view.findNavController()
            val action =
                CarFragmentDirections.actionCarFragmentToCarDetailsFragment22("Hello, I am from CarFragment")

            navController.navigate(action)

        }
    }


}