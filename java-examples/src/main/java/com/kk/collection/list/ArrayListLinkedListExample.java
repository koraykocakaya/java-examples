package com.kk.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1. İkisi de List interface'inden turemektedir, yapi olarak da oldukca benzerdir
 * 2. primitive typelar icin yaratilamaz
 * 3. Ikisinde de insertion ordera gore siralama olacaktir
 * 4. LinkedList prev ve next Node elementlerini tutmaktadir, bu yuzden olasi bir delete isleminde sadece yanindaki elementler birbirine baglanir
 * 5. Bu acidan data manipulation islemi coksa LinkedList, azsa ArrayList kullanman saglikli olacaktir. Ekstra element tutmadigi icin ArrayList daha az memory kullanacaktir
 * 6. Read islemleri fazlaysa arrayList kullanmak daha saglikli olacaktir
 * 7. Cache icin kullanacaksak ArrayList kullanmak daha dogru
 * 8. retain metodu parametre gecilen collectiondaki parametreler kalacak sekilde collectioni gunceller
 *  
 * @author korayk
 *
 */
public class ArrayListLinkedListExample {
	
	public static void main(String[] args) {
		List<String> linkedListEx = new LinkedList<String>();
		List<String> arrayListEx = new ArrayList<String>();
		int size = 100_000;
		
		long beginTimeLinkedList = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			linkedListEx.add(0, "Test" + i);
		}
		
		long endTimeLinkedList = System.currentTimeMillis();
		
		for(int i=0;i<size;i++) {
			arrayListEx.add(0, "Test" + i);
		}
		
		long endTimeArrayList = System.currentTimeMillis();
		
		// LinkedList sadece 0.elemente next baglayacagi icin daha hizli olacaktir, memorydeki yeri degismez
		System.out.println(size + " records insertion time for ArrayList: " + (endTimeArrayList - endTimeLinkedList) + " ms");
		System.out.println(size + " records insertion time for LinkedList: " + (endTimeLinkedList - beginTimeLinkedList) + " ms");
		
		
	}
}
