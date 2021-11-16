package study.solovviha.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList:List<String> = listOf("Москва","Питер","Челябинск","Ставрополь","Новосибирск")

        val usersRecyclerView:RecyclerView=findViewById(R.id.city)
        usersRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        usersRecyclerView.adapter = UserAdapter(userNameList)

    }
}