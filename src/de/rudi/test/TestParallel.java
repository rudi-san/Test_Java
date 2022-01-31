package de.rudi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class TestParallel extends RecursiveAction {
	private static final long serialVersionUID = 1L;
	private int start;
	private int end;
	private long[] l;
	private long[] ausgabe;
	public TestParallel (int start, int end, long[] l, long[] ausgabe) {
		this.start		= start;
		this.end		= end;
		this.l			= l;
		this.ausgabe	= ausgabe;
	}
	
	@Override
	protected void compute() {
		if (start==end) 
			ausgabe[start]			= l[start] * 2;
		else {
//			if (end<start)
//				System.out.println("Start="+start+";End="+end+";ausgabe="+Arrays.toString(ausgabe));
			int mid		= (end - start) / 2 + start;
			invokeAll(new TestParallel(start, mid, l, ausgabe),
					  new TestParallel(mid+1, end, l, ausgabe));
		}
	}

	public static void main(String[] args) {
		long[] l	= new long[320000];
		Arrays.fill(l, 12L);
		long[] ausgabe	= new long[320000];
		new TestParallel(0, 319999, l, ausgabe).compute();
		for (int i=0;i<10;++i)
			System.out.println(l[i]+" "+ausgabe[i]);
	}

}
