package com.gwtptest.client.application;

import com.gwtptest.client.application.hobby1.Hobby1Module;
import com.gwtptest.client.application.hobby2.Hobby2Module;
import com.gwtptest.client.application.home.HomeModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new HomeModule());
        install(new Hobby1Module());
        install(new Hobby2Module());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
                ApplicationPresenter.MyProxy.class);
    }
}
