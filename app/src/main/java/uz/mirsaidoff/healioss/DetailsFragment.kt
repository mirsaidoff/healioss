package uz.mirsaidoff.healioss

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.mirsaidoff.healioss.databinding.FragmentDetailsBinding
import uz.mirsaidoff.healioss.databinding.FragmentMainBinding

class DetailsFragment : Fragment() {

    companion object {
        fun newInstance(): DetailsFragment {
            val args = Bundle()

            val fragment = DetailsFragment()
            fragment.arguments = args
            return fragment
        }
    }

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}