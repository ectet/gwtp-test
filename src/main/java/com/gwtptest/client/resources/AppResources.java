package com.gwtptest.client.resources;


import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {

    @Source("images/travel.jpeg")
//    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal, width = 50)
    ImageResource travel();

    @Source("images/reading.jpeg")
    ImageResource reading();

    @Source("images/cal.png")
    ImageResource cal();

}