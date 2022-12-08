package `in`.junkielabs.adsmeta.ui.labs.three.sense2

import `in`.junkielabs.adsmeta.ui.labs.three.sense.Labs3dSenseRotation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Niraj on 08-12-2022.
 */
class Labs3dSense2ViewModel: ViewModel() {
    var bSenseRotation = MutableLiveData<Labs3dSenseRotation>()
    var bMarginLeft = MutableLiveData<Float>()


    //remember { mutableStateOf<SensorData?>(null) }

    fun addData(sensorData: Labs3dSenseRotation){
        bSenseRotation.postValue(sensorData)
    }

    fun addOffset(offsetX: Float){

        bMarginLeft.postValue(offsetX)
    }
}