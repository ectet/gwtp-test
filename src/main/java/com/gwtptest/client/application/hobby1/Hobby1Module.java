package com.gwtptest.client.application.hobby1;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class Hobby1Module extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(Hobby1PagePresenter.class, Hobby1PagePresenter.MyView.class, Hobby1PageView.class,
                Hobby1PagePresenter.MyProxy.class);
    }
}
