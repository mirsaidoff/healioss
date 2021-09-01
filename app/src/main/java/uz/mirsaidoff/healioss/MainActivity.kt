package uz.mirsaidoff.healioss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mirsaidoff.healioss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Navigation {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, MainFragment.newInstance())
            .addToBackStack(MainFragment::class.java.name)
            .commit()
    }

    override fun openDetailsFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, DetailsFragment.newInstance())
            .addToBackStack(DetailsFragment::class.java.name)
            .commit()
    }
}