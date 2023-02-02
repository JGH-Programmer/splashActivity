package git.myapplication.splashactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import git.myapplication.splashactivity.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}