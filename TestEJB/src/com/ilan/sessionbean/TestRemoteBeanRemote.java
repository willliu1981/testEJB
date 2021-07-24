package com.ilan.sessionbean;

import javax.ejb.Remote;

@Remote
public interface TestRemoteBeanRemote {
public String say(String msg);
}
