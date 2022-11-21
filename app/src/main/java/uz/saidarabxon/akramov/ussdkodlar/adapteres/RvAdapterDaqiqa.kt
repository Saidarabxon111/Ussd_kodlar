package uz.saidarabxon.akramov.ussdkodlar.adapteres

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.saidarabxon.akramov.ussdkodlar.databinding.ItemDaqiqaBinding
import uz.saidarabxon.akramov.ussdkodlar.databinding.ItemRvBinding
import uz.saidarabxon.akramov.ussdkodlar.models.Daqiqa
import uz.saidarabxon.akramov.ussdkodlar.models.Ussd

class RvAdapterDaqiqa(var list: List<Daqiqa>, var context: Context) : RecyclerView.Adapter<RvAdapterDaqiqa.Vh>() {

    inner class Vh( var itemDaqiqaBinding: ItemDaqiqaBinding):RecyclerView.ViewHolder(itemDaqiqaBinding.root){
        fun onBind(daqiqa: Daqiqa, position: Int,){


            itemDaqiqaBinding.name.text =daqiqa.daqiqaV
            itemDaqiqaBinding.daqiqaAbout.text =daqiqa.daqiqaAbout
            itemDaqiqaBinding.kod.text =daqiqa.daqiqaCode



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemDaqiqaBinding.inflate(LayoutInflater.from(parent.context) , parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size




}