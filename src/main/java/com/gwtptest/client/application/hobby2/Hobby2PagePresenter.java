package com.gwtptest.client.application.hobby2;

import javax.inject.Inject;

import com.gwtptest.client.application.ApplicationPresenter;
import com.gwtptest.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class Hobby2PagePresenter extends Presenter<Hobby2PagePresenter.MyView, Hobby2PagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.hobby2)
    public interface MyProxy extends ProxyPlace<Hobby2PagePresenter> {
    }

    @Inject
    Hobby2PagePresenter(EventBus eventBus,
                        MyView view,
                        MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
}
