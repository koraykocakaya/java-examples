package com.kk.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 1. LinkedHashSet, hashSet'e linked oldugu icin sirali olarak veriler atilacaktir.
 * 2. Bundan dolayi insert, remove islemleri daha yavas olacaktir, sort kritik degilse hashSet kullanmak daha saglikli olacaktir
 * @author korayk
 *
 */
public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		Set<String> linkedHashSetExample = new LinkedHashSet<>();
		linkedHashSetExample.add("c");
		linkedHashSetExample.add("b");
		linkedHashSetExample.add("a");
		linkedHashSetExample.add("A");
		linkedHashSetExample.add("A");
//		linkedHashSetExample.retainAll(Arrays.asList(new String[]{"c", "b"}));
		System.out.println(linkedHashSetExample);
	}
}
