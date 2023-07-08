package  com.binauralbeats.brainwave.mediation.relaxation.music

import android.app.Activity
import android.app.Application
import android.content.Context
import androidx.viewbinding.BuildConfig

class MyApplication : Application() {

companion object{

    var bannerAdId :String= "ca-app-pub-3940256099942544/6300978111"
    var nativeAdId :String= "ca-app-pub-3940256099942544/224769110"
    var interstitailAdId : String="ca-app-pub-3940256099942544/1033173712"
    var exitInterstitailAdId :String= "ca-app-pub-3940256099942544/1033173712"
    lateinit var appContext : Context
    lateinit var instance : MyApplication

}
    override fun onCreate() {

        if(BuildConfig.DEBUG){
            bannerAdId =  "ca-app-pub-3940256099942544/6300978111"
            nativeAdId =  "ca-app-pub-3940256099942544/224796110"
            interstitailAdId =  "ca-app-pub-3940256099942544/1033173712"
            exitInterstitailAdId =  "ca-app-pub-3940256099942544/1033173712"
        }else{
            bannerAdId =  "ca-app-pub-9561286834498031/2818274725"
            nativeAdId =  "ca-app-pub-9561286834498031/6615146989"
            interstitailAdId =  "ca-app-pub-9561286834498031/9652373865"
            exitInterstitailAdId = "ca-app-pub-9561286834498031/9902557825"
        }
        super.onCreate()

        appContext = applicationContext
         instance = this
    }


}



