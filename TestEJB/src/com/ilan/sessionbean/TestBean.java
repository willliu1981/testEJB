package com.ilan.sessionbean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestBean
 */
@Stateless
@LocalBean
public class TestBean {

	int award=1000;
	
    public TestBean() {
        // TODO Auto-generated constructor stub
    }
    
    
    public int getAward(int rate) {
    	return award*rate;
    }

}
