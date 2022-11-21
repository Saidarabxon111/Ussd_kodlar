package uz.saidarabxon.akramov.ussdkodlar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.saidarabxon.akramov.ussdkodlar.R
import uz.saidarabxon.akramov.ussdkodlar.adapteres.RvAdapterDaqiqa
import uz.saidarabxon.akramov.ussdkodlar.databinding.FragmentDaqiqaBinding
import uz.saidarabxon.akramov.ussdkodlar.models.Daqiqa

class DaqiqaFragment : Fragment() {

    private lateinit var binding: FragmentDaqiqaBinding
private lateinit var rvAdapterDaqiqa: RvAdapterDaqiqa
private lateinit var list:ArrayList<Daqiqa>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding =FragmentDaqiqaBinding.inflate(layoutInflater)

        list = ArrayList()

        rvAdapterDaqiqa = RvAdapterDaqiqa(list,binding.root.context)
        binding.rv.adapter =rvAdapterDaqiqa


                list.add(Daqiqa(" 200 daqiqa","O‘zbekiston bo‘yicha 100 daqiqa \n4000 so‘m\n30 kun","*130#"))



        return binding.root
    }


}