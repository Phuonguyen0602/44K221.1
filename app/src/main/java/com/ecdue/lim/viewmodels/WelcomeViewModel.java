package com.ecdue.lim.viewmodels;

import com.ecdue.lim.events.SignInButtonClicked;
import com.ecdue.lim.events.SignUpButtonClicked;
import com.ecdue.lim.events.SkipSignInButtonClicked;

import org.greenrobot.eventbus.EventBus;

public class WelcomeViewModel extends BaseViewModel {

    public WelcomeViewModel() {
    }

    public static final String TAG = WelcomeViewModel.class.getSimpleName();
    public void onSignInClicked(){
        EventBus.getDefault().post(new SignInButtonClicked(""));
    }
    public void onSignUpClicked(){
        EventBus.getDefault().post(new SignUpButtonClicked(""));
    }
    public void onSkipClicked() {
        EventBus.getDefault().post(new SkipSignInButtonClicked(""));
    }
}
