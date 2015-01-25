package com.gwtptest.client.application.hobby2;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class Hobby2Module extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(Hobby2PagePresenter.class, Hobby2PagePresenter.MyView.class, Hobby2PageView.class,
                Hobby2PagePresenter.MyProxy.class);
    }
}
