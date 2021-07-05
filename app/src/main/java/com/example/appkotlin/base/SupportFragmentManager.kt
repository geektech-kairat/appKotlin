package pro.mitapp.muslimroad.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity


fun replaceFragment(activity: FragmentActivity?, frame: Int, fragment: Fragment, tag: String) {
    activity?.supportFragmentManager?.beginTransaction()?.replace(frame, fragment)
        ?.addToBackStack(tag)
        ?.commit()
}


