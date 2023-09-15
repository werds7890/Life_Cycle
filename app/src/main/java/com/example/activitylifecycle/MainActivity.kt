package com.example.activitylifecycle

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    fun Activity.showToast(message:String)= Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate","Main1onCreate")
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            showToast("환영합니다.")
            startActivity(intent)
        }

        binding.fragmentBtn.setOnClickListener {
            setFragment(BlankFragment())
            showToast("환영합니다.")
        }
    }

    private fun setFragment(frag: Fragment){
        supportFragmentManager.commit {
            replace(R.id.mainLayout,frag)
            setReorderingAllowed(true)
            addToBackStack(null)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart","Main1onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume","Main1onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause","Main1onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop","Main1onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy","Main1onDestroy")
    }
}