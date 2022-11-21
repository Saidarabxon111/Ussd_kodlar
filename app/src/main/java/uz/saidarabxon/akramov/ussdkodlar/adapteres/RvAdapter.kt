package uz.saidarabxon.akramov.ussdkodlar.adapteres

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.saidarabxon.akramov.ussdkodlar.R
import uz.saidarabxon.akramov.ussdkodlar.databinding.ItemInternetBinding
import uz.saidarabxon.akramov.ussdkodlar.databinding.ItemRvBinding
import uz.saidarabxon.akramov.ussdkodlar.fragments.TarifFragment
import uz.saidarabxon.akramov.ussdkodlar.models.Daqiqa
import uz.saidarabxon.akramov.ussdkodlar.models.Internet
import uz.saidarabxon.akramov.ussdkodlar.models.Ussd

class RvAdapter(var list: List<Ussd>, var context: Context,var rvClick: RvClick) : RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh( var itemRvBinding: ItemRvBinding ):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(ussd: Ussd, position: Int){

//            Glide.with(context).load(ussd.image).into(itemRvBinding.img)
            itemRvBinding.img.setImageResource(ussd.image.toInt())
            itemRvBinding.tvName.text =ussd.tarifName
            itemRvBinding.tvSum.text =ussd.summa
//            itemRvBinding.img.setImageResource(R.drawable.ussdpp.toString()) = ussd.image

            itemRvBinding.card.setOnClickListener {
                rvClick.itemClick(ussd)
            }




        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context) , parent, false ))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {

        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size


    interface RvClick {
        fun itemClick(ussd: Ussd)

    }

}