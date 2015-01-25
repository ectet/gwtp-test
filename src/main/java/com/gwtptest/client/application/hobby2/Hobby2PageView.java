package com.gwtptest.client.application.hobby2;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.Button;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hobby2PageView extends ViewImpl implements Hobby2PagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, Hobby2PageView> {
    }

    @Inject
    Hobby2PageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        dateField.getElement().setPropertyString("placeholder", "  /  /    ");
//        DateTimeFormat dtFormat = DateTimeFormat.getFormat("mm/dd/yyyy");
//        dateField.setFormat();DateBox.Fo
        dateField.setFormat(new DateBox.DefaultFormat
                (DateTimeFormat.getFormat("dd/MM/yyyy")));
    }

    @UiField
    Button sendButton;

    @UiField
    DateBox dateField;

    @UiField
    TextBox nameField;

    @UiField
    Image calImg;

    @UiHandler("sendButton")
    void onSend(ClickEvent event) {
        Logger logger = Logger.getLogger("SendAndReset");
        if(nameField.getValue().isEmpty() || dateField.getTextBox().getValue().isEmpty()){
            //logger.log(Level.SEVERE, "Both field are required - form not submitted!");
            Window.alert("Both field are required - form not submitted!");
            return;
        }

        String toLog = "Name is: " + nameField.getValue() + " Date is: " + dateField.getTextBox().getValue();
        logger.log(Level.SEVERE, toLog);

        // Clear fields
        nameField.setValue("");
        dateField.getTextBox().setValue("");
    }

    @UiHandler("calImg")
    void handleClick(ClickEvent e) {
        //Window.alert("Hello, AJAX");
        dateField.showDatePicker();
    }

}
