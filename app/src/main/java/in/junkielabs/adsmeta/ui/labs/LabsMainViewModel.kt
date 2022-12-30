package `in`.junkielabs.adsmeta.ui.labs

import `in`.junkielabs.adsmeta.tools.livedata.LiveDataEvent
import `in`.junkielabs.adsmeta.ui.base.ViewModelBase
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by Niraj on 20-11-2022.
 */
class LabsMainViewModel: ViewModelBase() {


    private val _mEventNavigate = MutableLiveData<LiveDataEvent<Int>>()
    val mEventNavigate: MutableLiveData<LiveDataEvent<Int>> = _mEventNavigate



    fun navigateToApp(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.NAV_APP))

    }
    fun navigateToSample1(){
//        Log.i("LabsMainViewModel", "navigateToSample1")
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.SAMPLE_1))
    }

    fun navigateTo3d(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.THREE_D))
    }

    fun navigateTo3dSense(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.THREE_D_SENSE))

    }
    fun navigateTo3dSense2(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.THREE_D_SENSE2))

    }

    fun navigateTo3dModel(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.THREE_D_MODEL))

    }

    fun navigateToDefault(){
//        Log.i("LabsMainViewModel", "navigateToDefault")
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.DEFAULT))
    }

    fun navigateToJson(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.JSON))
    }

    fun navigateTemplate(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.TEMPLATE))
    }

    fun navigateTemplateSense(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.TEMPLATE_SENSE))
    }


    fun navigateToAdListFragment(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.AD_LIST))

    }
    fun navigateToInfoFragment(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.INFO))

    }

    fun navigateTemplateAd(){
        _mEventNavigate.postValue(LiveDataEvent(LabsConstants.Navigation.AD))

    }

}