package com.exraion.beu.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.exraion.beu.data.repository.user.UserRepository
import com.exraion.beu.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProfileViewModel(
    private val repository: UserRepository
) : ViewModel() {
    
    private val _user = MutableStateFlow<User?>(null)
    val user = _user.asStateFlow()
    
    init {
        viewModelScope.launch {
            repository.getUserDetail().collect {
                _user.value = it.data
            }
        }
    }
    
}