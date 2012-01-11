package com.bsb.sample.scope.impl;

import junit.framework.TestCase;
import com.bsb.sample.scope.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}