package org.ziyuzile.demo.designPattern.adapter.classAdapter;

import org.ziyuzile.demo.designPattern.adapter.A;
import org.ziyuzile.demo.designPattern.adapter.BB;

public class P extends BB implements A {
    @Override
    public void aMethod() {
        bMethod();
    }
}
