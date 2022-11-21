package uz.saidarabxon.akramov.ussdkodlar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.saidarabxon.akramov.ussdkodlar.R
import uz.saidarabxon.akramov.ussdkodlar.databinding.FragmentAboutTarifBinding
import uz.saidarabxon.akramov.ussdkodlar.models.Ussd

class AboutTarifFragment : Fragment() {

private lateinit var binding: FragmentAboutTarifBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding =FragmentAboutTarifBinding.inflate(layoutInflater)

        val ussd =arguments?.getSerializable("ussd")as Ussd

        binding.tvAbout.text =ussd.about

        return binding.root
    }

}