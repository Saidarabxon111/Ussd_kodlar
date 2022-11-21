package uz.saidarabxon.akramov.ussdkodlar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.saidarabxon.akramov.ussdkodlar.R
import uz.saidarabxon.akramov.ussdkodlar.adapteres.RvAdapterInternet
import uz.saidarabxon.akramov.ussdkodlar.databinding.FragmentInternetBinding
import uz.saidarabxon.akramov.ussdkodlar.models.Internet

class InternetFragment : Fragment() {
private lateinit var binding: FragmentInternetBinding
private lateinit var rvAdapterInternet: RvAdapterInternet
private lateinit var list: ArrayList<Internet>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding = FragmentInternetBinding.inflate(layoutInflater)
        list = ArrayList()

        rvAdapterInternet = RvAdapterInternet(list,binding.root.context)
        binding.rv.adapter =rvAdapterInternet

        list.add(Internet("1024 \n MB","8 900 som \n1024 MB\n31kun"))


        return binding.root
    }


}