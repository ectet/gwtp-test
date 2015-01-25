package com.gwtptest.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.gwtptest.Project";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
