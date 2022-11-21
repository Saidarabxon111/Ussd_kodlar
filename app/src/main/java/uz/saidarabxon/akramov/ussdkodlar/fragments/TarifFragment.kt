package uz.saidarabxon.akramov.ussdkodlar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import uz.saidarabxon.akramov.ussdkodlar.R
import uz.saidarabxon.akramov.ussdkodlar.adapteres.RvAdapter
import uz.saidarabxon.akramov.ussdkodlar.databinding.FragmentTarifBinding
import uz.saidarabxon.akramov.ussdkodlar.models.Ussd


class TarifFragment : Fragment(),RvAdapter.RvClick {
    private lateinit var binding: FragmentTarifBinding
    private lateinit var rvAdapter: RvAdapter
    private lateinit var list: ArrayList<Ussd>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): LinearLayout {
        binding = FragmentTarifBinding.inflate(layoutInflater)

        list = ArrayList()

        rvAdapter = RvAdapter(list, binding.root.context,this)
        binding.rv.adapter = rvAdapter


        list.add(
            Ussd(
//                "https://m.ucell.uz/media/images/img/service/ussdpp.jpg",
//                "https://m.ucell.uz/media/images/img/icons/ucell_internet.png",
                R.drawable.ussdpp.toString(),
                "Startt 10",
                "10 0000",
                "Limitdan tashqari 1 MB / 1 daq. / 1 SMS narxi – 10 so‘m"
            )
        )


        return binding.root
    }
    override fun itemClick(ussd: Ussd) {
        findNavController().navigate(R.id.aboutTarifFragment, bundleOf("ussd" to ussd))
    }



}