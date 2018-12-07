package org.ziyuzile.demo.designPattern.adapter.objectAdapter;

import org.ziyuzile.demo.designPattern.adapter.A;
import org.ziyuzile.demo.designPattern.adapter.B;

public class P implements A {

    private B bInstance;

    public P(B bInstance) {
        this.bInstance = bInstance;
    }

    @Override
    public void aMethod() {
        bInstance.bMethod();
    }
}
