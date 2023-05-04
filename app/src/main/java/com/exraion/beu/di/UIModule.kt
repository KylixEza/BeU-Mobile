package com.exraion.beu.di

import com.exraion.beu.adapter.category.CategoryAdapter
import com.exraion.beu.adapter.ingredient.IngredientAdapter
import com.exraion.beu.adapter.ingredient_tool.IngredientToolAdapter
import com.exraion.beu.adapter.leaderboard.LeaderboardAdapter
import com.exraion.beu.adapter.menu_list_horizontal.MenuListHorizontalAdapter
import com.exraion.beu.adapter.profile_additional_settings.ProfileAdditionalSettingAdapter
import com.exraion.beu.adapter.step.StepAdapter
import com.exraion.beu.adapter.voucher.VoucherAdapter
import com.exraion.beu.adapter.voucher.terms_conditions.VoucherTermsAndConditionsAdapter
import com.exraion.beu.ui.auth.login.LoginViewModel
import com.exraion.beu.ui.auth.register.RegisterViewModel
import com.exraion.beu.ui.detail.ingredient.IngredientViewModel
import com.exraion.beu.ui.detail.menu.DetailMenuViewModel
import com.exraion.beu.ui.detail.order.OrderViewModel
import com.exraion.beu.ui.home.HomeViewModel
import com.exraion.beu.ui.leaderboard.LeaderboardViewModel
import com.exraion.beu.ui.onboard.OnBoardingViewModel
import com.exraion.beu.ui.profile.ProfileViewModel
import com.exraion.beu.ui.splash.SplashViewModel
import com.exraion.beu.ui.voucher.VoucherViewModel
import com.exraion.beu.ui.voucher.detail.DetailVoucherViewModel
import com.exraion.beu.ui.voucher.my_voucher.MyVoucherViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel(get()) }
    viewModel { OnBoardingViewModel() }
    viewModel { LoginViewModel(get()) }
    viewModel { RegisterViewModel(get()) }
    viewModel { HomeViewModel(get(), get()) }
    viewModel { DetailMenuViewModel(get()) }
    viewModel { IngredientViewModel(get()) }
    viewModel { OrderViewModel(get(), get()) }
    viewModel { LeaderboardViewModel(get()) }
    viewModel { ProfileViewModel(get()) }
    viewModel { VoucherViewModel(get()) }
    viewModel { MyVoucherViewModel(get()) }
    viewModel { DetailVoucherViewModel(get(),get()) }
}

val adapterModule = module {
    factory { MenuListHorizontalAdapter() }
    factory { CategoryAdapter() }
    factory { LeaderboardAdapter() }
    factory { IngredientToolAdapter() }
    factory { StepAdapter() }
    factory { IngredientAdapter() }
    factory { ProfileAdditionalSettingAdapter() }
    factory { VoucherAdapter() }
    factory { VoucherTermsAndConditionsAdapter() }
}