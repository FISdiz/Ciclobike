package cl.desafiolatam.ciclobikedesafio1

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

// clase que extiende de ViewHolder
class CyclobikeViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){

    val tvCiclovia: TextView
    val tvComuna: TextView

    init {
        tvCiclovia = itemView.findViewById(R.id.ciclovia)
        tvComuna = itemView.findViewById(R.id.comuna)
    }

}

class CycloAdapter (var lista : List<Ciclovia>) : RecyclerView.Adapter<CyclobikeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CyclobikeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CyclobikeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: CyclobikeViewHolder, position: Int) {
        val ciclovia = lista[position]
        Log.d("CycloAdapter", ciclovia.toString())

        holder.tvComuna.text = ciclovia.comuna
        holder.tvCiclovia.text = ciclovia.nombre

    }
}