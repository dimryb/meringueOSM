package space.rybakov.meringueosm.presentation

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.RuntimeException

class MainViewModelFactory(
    private val application: Application
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(application) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")
    }
}