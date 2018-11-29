package xyz.samuelwang.springdemo.service;

import org.springframework.util.StopWatch;

import java.text.NumberFormat;

public class MyService {

	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("1");
		spend();
		stopWatch.stop();
		stopWatch.start("2");
		spend();
		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());
	}

	private static void spend() {
		long a = 0L;
		for (int i = 0; i < 100000000; i++) {
			a += i;
		}
		System.out.println(a);
	}
}
