package uz.mirsaidoff.healioss.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.mirsaidoff.healioss.R
import uz.mirsaidoff.healioss.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    companion object {
        fun newInstance(): MainFragment {
            val args = Bundle()

            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var navigation: Navigation
    private lateinit var binding: FragmentMainBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Navigation) {
            navigation = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvFragmentName.setOnClickListener {
            navigation.openDetailsFragment()
        }
    }
}