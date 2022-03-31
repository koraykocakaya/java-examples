package collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Set unique elementler icin kullanilmaktadir
 * 2. HashSet List'teki gibi insertionOrder bulunmamaktadir, hashcode'a gore siralanir
 * 4. HashSet, add, remove, contain metotlari O(1) de calisir
 * @author korayk
 *
 */
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> hashSetExample = new HashSet<String>(16, 0.75f);
		
		hashSetExample.add("c");
		hashSetExample.add("b");
		hashSetExample.add("a");
		hashSetExample.add("A");
		hashSetExample.add("A");
		System.out.println(hashSetExample);
		
	}
}
