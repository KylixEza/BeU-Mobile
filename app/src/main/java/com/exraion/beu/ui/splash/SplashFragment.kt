package com.exraion.beu.ui.splash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.exraion.beu.R
import com.exraion.beu.base.BaseFragment
import com.exraion.beu.databinding.FragmentSplashBinding
import com.exraion.beu.util.ScreenOrientation
import kotlinx.coroutines.delay
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    private val viewModel by viewModel<SplashViewModel>()

    override fun inflateViewBinding(container: ViewGroup?): FragmentSplashBinding =
        FragmentSplashBinding.inflate(layoutInflater, container, false)

    override fun determineScreenOrientation(): ScreenOrientation = ScreenOrientation.PORTRAIT

    override fun FragmentSplashBinding.binder() {
        lifecycleScope.launchWhenStarted {
            delay(1000)
            viewModel.uiState.collect {
                view?.apply {
                    when (it) {
                        SplashUIState.FirstRun -> {
                            findNavController().navigate(
                                SplashFragmentDirections.actionSplashFragmentToOnBoardingFragment()
                            )
                        }
                        SplashUIState.LoggedIn -> {
                            findNavController().navigate(
                                SplashFragmentDirections.actionSplashFragmentToBaseActivity()
                            )
                            activity?.finish()
                        }
                        SplashUIState.NotLoggedIn -> {
                            findNavController().navigate(
                                SplashFragmentDirections.actionSplashDestinationToAuthDestination()
                            )
                        }
                        else -> {}
                    }
                }
            }
        }
    }

}