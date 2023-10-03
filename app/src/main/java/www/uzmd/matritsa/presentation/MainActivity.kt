package www.uzmd.matritsa.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.uzmd.matritsa.R
import www.uzmd.matritsa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}