package com.kk.collection.set;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * 1. TreeSet'in thread-safe versiyonu gibi dusunulebilir
 * 2. add, remove, get islemleri O(log(n)) time 
 * @author korayk
 *
 */
public class ConcurrentSkipListSetExample {
	
	public static void main(String[] args) {
		Set<Integer> concurrentSkipListSetExample = new ConcurrentSkipListSet<Integer>();
		
		concurrentSkipListSetExample.add(1);
		concurrentSkipListSetExample.add(100);
		concurrentSkipListSetExample.add(40);
		concurrentSkipListSetExample.add(4);
		concurrentSkipListSetExample.add(21);

		System.out.println(concurrentSkipListSetExample);
	}
}
