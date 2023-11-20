package curs.narcis.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel: ViewModel() {
    private val _location = mutableStateOf<LocationData?>(LocationData(41.372490, 2.119990))
    val location: State<LocationData?> = _location

    fun updateLocation(newLocationData: LocationData){
        _location.value = newLocationData
    }

}