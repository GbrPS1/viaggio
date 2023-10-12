package com.example.viaggio

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.viaggio.databinding.ActivityTlIndexTuristaBinding

class tl_index_turista : AppCompatActivity() {

    private lateinit var binding: ActivityTlIndexTuristaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTlIndexTuristaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_tl_index_turista)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
    fun abrirInicio(v: View?) {
        val intent1 = Intent(applicationContext, tl_index_turista::class.java)
        startActivity(intent1)
    }
    fun abrirlocal(v: View?) {
        val intent1 = Intent(applicationContext, tl_local::class.java)
        startActivity(intent1)
    }

}