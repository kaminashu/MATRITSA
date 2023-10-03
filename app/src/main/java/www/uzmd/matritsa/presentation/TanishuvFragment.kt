package www.uzmd.matritsa.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import www.uzmd.matritsa.R
import www.uzmd.matritsa.databinding.ActivityMainBinding
import www.uzmd.matritsa.databinding.FragmentTanishuvBinding
import java.lang.RuntimeException

/**
 * A simple [Fragment] subclass.
 * Use the [TanishuvFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TanishuvFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private  var _binding: FragmentTanishuvBinding?=null
    private val binding: FragmentTanishuvBinding
        get() = _binding?:throw RuntimeException("binding da hato View Yasab bo`lmadi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTanishuvBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tushunarliBtn.setOnClickListener {
            launchFragment()
        }
    }

    private fun launchFragment() {
      findNavController().navigate(R.id.action_tanishuvFragment_to_menuFragment)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TanishuvFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TanishuvFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onDetach() {
        super.onDetach()
        _binding = null
    }
}