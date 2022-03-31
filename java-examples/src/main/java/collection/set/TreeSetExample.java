package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Atılan verileri sortlayarak tutmaktadir, (Collections.sort gibi dusunebilir)
 * 2. Ek olarak custom comparator vererek farkli strategy ile sortlamasi sagalanabilmektedir
 * 3. Null veri atilamaz
 * 4. Comparable olmayan bir class tipinde veri atilamaz, ayrica comparator tanimlayip set yaratilirken parametre olarak gecersek comparable olmasina ihtiyac kalmaz
 * 5. poll, subset vs. gibi metotlar implement ettigi NavigableSet'ten gelmektedir
 * 6. TreeSet thread-safe degildir
 * 7. add, remove, get islemleri O(log(n)) time, tum elemanlari print etme O(N)
 * @author korayk
 *
 */
public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<Integer> treeSetExample = new TreeSet<Integer>();
		
		treeSetExample.add(1);
		treeSetExample.add(100);
		treeSetExample.add(40);
		treeSetExample.add(4);
		treeSetExample.add(21);
		treeSetExample.remove(40);
		System.out.println(treeSetExample);
		// Bu metot o sayidan buyuk en kucuk sayiyi doner
		System.out.println(treeSetExample.ceiling(3));
		System.out.println(treeSetExample.descendingSet());
		
		Comparator<Person> customSurnameComparator = (x,y) -> x.getSurname().compareTo(y.getSurname()); 
		Set<Person> treeSetCustomObjectEx = new TreeSet<Person>(customSurnameComparator);
		
				
		treeSetCustomObjectEx.add(new Person("Koray3", "k8"));
		treeSetCustomObjectEx.add(new Person("Koray2", "k1"));
		treeSetCustomObjectEx.add(new Person("Koray", "k5"));
		treeSetCustomObjectEx.add(new Person("Koray4", "k2"));
		System.out.println(treeSetCustomObjectEx);
		
	}
}

class Person{
	private String name;
	private String surname;
	
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
//	@Override
//	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);
//	}
	
	@Override
	public String toString() {
		return "[name:" + this.name + ", surname: " + this.surname + "]";
	}
	
}
