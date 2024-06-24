package com.java8Features_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Personn {
	String name;
	String country;

	public Personn(String name, String country) {
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "name=" + name + ", country=" + country;
	}
}

public class FindAny_First {
	public static void main(String[] args) {
		Personn p1 = new Personn("maruthi", "India");
		Personn p2 = new Personn("virat", "India");
		Personn p3 = new Personn("abd", "southafrica");
		Personn p4 = new Personn("gayle", "westindies");
		Personn p5 = new Personn("maxwell", "australia");
		Personn p6 = new Personn("pooran", "westindies");

		List<Personn> persons = Arrays.asList(p1, p2, p3, p4, p5);
		Optional<Personn> s1 = persons.stream().findFirst();
		System.out.println(s1);
		Optional<Personn> s2 = persons.stream().findAny();
		System.out.println(s2);

		Optional<Personn> findfirst = persons.stream().filter(p -> p.country.equals("westindies")).findFirst();
		if (findfirst.isPresent()) {
			System.out.println(findfirst.get());
		}

		Optional<Personn> findAny = persons.stream().filter(p -> p.country.equals("southafrica")).findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		}
		System.out.println("---Using Collectors----");
		List<Personn> indians = persons.stream().filter(p -> p.country.equals("India")).collect(Collectors.toList());
		indians.forEach(p -> System.out.println(p));

		// collect names of indians from the person details
		List<String> names = persons.stream().filter(p -> p.country.equals("India")).map(i -> i.name)
				.collect(Collectors.toList());
		System.out.println(names);
	}
//	Optional[name=maruthi, country=India]
//	Optional[name=maruthi, country=India]
//	name=gayle, country=westindies
//	name=abd, country=southafrica
//	---Using Collectors----
//	name=maruthi, country=India
//	name=virat, country=India
//	[maruthi, virat]

}
