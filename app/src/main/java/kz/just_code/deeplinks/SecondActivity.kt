package kz.just_code.deeplinks

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kz.just_code.deeplinks.databinding.ActivitySecondBinding

class SecondActivity:AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.data.let {
            binding.btn.text = it?.getQueryParameter("btn").toString()
        }
    }
}