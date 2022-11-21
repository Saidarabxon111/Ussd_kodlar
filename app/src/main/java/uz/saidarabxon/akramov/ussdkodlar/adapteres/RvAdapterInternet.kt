package uz.saidarabxon.akramov.ussdkodlar.adapteres

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.saidarabxon.akramov.ussdkodlar.databinding.ItemInternetBinding
import uz.saidarabxon.akramov.ussdkodlar.models.Internet

class RvAdapterInternet(var list: List<Internet>, var context: Context) : RecyclerView.Adapter<RvAdapterInternet.Vh>() {

    inner class Vh( var itemInternetBinding:  ItemInternetBinding):RecyclerView.ViewHolder(itemInternetBinding.root){
        fun onBind(internet: Internet, position: Int,){

            itemInternetBinding.mb.text =internet.kode
            itemInternetBinding.aboutIn.text =internet.textt

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemInternetBinding.inflate(LayoutInflater.from(parent.context) , parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size




}