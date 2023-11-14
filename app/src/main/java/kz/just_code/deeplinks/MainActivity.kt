package kz.just_code.deeplinks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kz.just_code.deeplinks.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this, SecondActivity::class.java)
        intent?.data.let {
            binding.title.text = it?.getQueryParameter("message").toString()
        }
        binding.nextBtn.setOnClickListener {
            startActivity(intent)
        }
    }
}