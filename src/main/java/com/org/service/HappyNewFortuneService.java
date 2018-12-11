package com.org.service;

import org.springframework.stereotype.Component;

@Component
public class HappyNewFortuneService implements FortuneNewService {

	@Override
	public String getFortune() {
		return "Today is Your Lucky Day";
	}

}
