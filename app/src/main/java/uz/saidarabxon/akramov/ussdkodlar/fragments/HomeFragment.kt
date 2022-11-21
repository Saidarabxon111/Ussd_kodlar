package uz.saidarabxon.akramov.ussdkodlar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.saidarabxon.akramov.ussdkodlar.R
import uz.saidarabxon.akramov.ussdkodlar.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
  private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)


        binding.tarif.setOnClickListener {
            findNavController().navigate(R.id.tarifFragment)
        }


        binding.daqiqalar.setOnClickListener {
            findNavController().navigate(R.id.daqiqaFragment)
        }

        binding.internet.setOnClickListener {
            findNavController().navigate(R.id.internetFragment)
        }


       return  binding.root
    }
}
