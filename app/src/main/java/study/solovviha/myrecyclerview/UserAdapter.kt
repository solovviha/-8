package study.solovviha.myrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val sityNamelist:List<String>) : RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        val userItemView= LayoutInflater.from(parent.context).inflate(R.layout.city, parent, false)

        return UserViewHolder(userItemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userName=sityNamelist[position]
        holder.bind(userName)
    }

    override fun getItemCount(): Int {
        return sityNamelist.size
    }
}

private fun LayoutInflater.inflate(city: Int) {

}
