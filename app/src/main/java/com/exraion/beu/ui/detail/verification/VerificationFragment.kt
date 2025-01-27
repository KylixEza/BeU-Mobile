package com.exraion.beu.ui.detail.verification

import android.content.Intent
import android.view.ViewGroup
import com.exraion.beu.base.BaseFragment
import com.exraion.beu.databinding.FragmentVerificationBinding
import com.exraion.beu.ui.history.HistoryActivity
import com.exraion.beu.util.ScreenOrientation

class VerificationFragment : BaseFragment<FragmentVerificationBinding>() {
    override fun inflateViewBinding(container: ViewGroup?): FragmentVerificationBinding =
        FragmentVerificationBinding.inflate(layoutInflater, container, false)

    override fun determineScreenOrientation(): ScreenOrientation = ScreenOrientation.PORTRAIT

    override fun FragmentVerificationBinding.binder() {
        appBarVerification.apply {
            tvTitle.text = "Order Details"
            ivFavorite.hide()
            ivArrowBack.setOnClickListener {
                activity?.finish()
            }
        }

        btnHistory.setOnClickListener {
            val intent = Intent(activity, HistoryActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
    }

}