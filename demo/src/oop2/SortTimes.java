package oop2;

import java.util.Arrays;

class Time implements Comparable<Time>{
	private int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
	}
	
	public int totalSeconds() {
		return  this.h * 3600 + this.m * 60 + this.s;
	}

	@Override
	public int compareTo(Time other) {
	     return this.totalSeconds() - other.totalSeconds();
	}

}

public class SortTimes {

	public static void main(String[] args) {
		Time times[] = { new Time(10, 20, 30), new Time(1, 2, 3), new Time(10, 10, 10) };

		Arrays.sort(times);
		
		for(var t : times)
			System.out.println(t);
	}

}
