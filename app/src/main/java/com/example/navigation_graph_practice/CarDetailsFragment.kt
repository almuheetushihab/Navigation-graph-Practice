package com.example.navigation_graph_practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigation_graph_practice.databinding.CarDetailsFragmentBinding


class CarDetailsFragment : Fragment() {
    private lateinit var binding: CarDetailsFragmentBinding
    private val args: CarDetailsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = CarDetailsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val string = args.data
        binding.textView.text = string




        binding.buttonSecond.setOnClickListener {
            val navController: NavController = view.findNavController()
            val action = CarDetailsFragmentDirections.actionCarDetailsFragment2ToCarFragment2()
            navController.navigate(action)
        }


    }

}

