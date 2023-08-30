package org.jsp.Springdemo2Nsir;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
	public void process() {
		System.out.println("world best cpu");
	}
}
