package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.activitylifecycle.databinding.FragmentBlankBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    private var cnt=0
    private lateinit var binding : FragmentBlankBinding
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("fragment","fragmentOnCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentBlankBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        Log.d("fragment","fragmentOnCreateView")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("fragment","fragmentOnViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("fragment","fragmentOnViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment","fragmentOnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment","fragmentOnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment","fragmentOnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment","fragmentOnStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("fragment","fragmentOnSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("fragment","fragmentOnDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment","fragmentOnDestroy")
    }


}