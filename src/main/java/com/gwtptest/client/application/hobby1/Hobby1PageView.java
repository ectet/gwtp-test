package com.gwtptest.client.application.hobby1;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class Hobby1PageView extends ViewImpl implements Hobby1PagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, Hobby1PageView> {
    }

    @Inject
    Hobby1PageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
