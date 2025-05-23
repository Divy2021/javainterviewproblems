package com.test.sample;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test2 {

	interface Creator {
		default String getCreatedTitle() {
			return "title";
		}
	}

	static class Author implements Creator {
		private String firstName, lastname;
		private LocalDate date;

		public Author() {
		}

		public Author(String firstName, String lastname, LocalDate date) {
			this.firstName = firstName;
			this.lastname = lastname;
			this.date = date;
		}

	}

	static class Sculptor extends Author {
		@Override
		public String getCreatedTitle() {
			return "Unknown";
		}
	}

	public static void main(String... p) {
		LinkedHashSet<? super Creator> creators = new LinkedHashSet<>();
		creators.add(new Author("first", "last", null));
		creators.add(new Author("first", "last", null));
		creators.add(new Sculptor());
		printTitlesForUniqueCreators(creators);
	}

	private static void printTitlesForUniqueCreators(HashSet<? super Creator> creators) {
		System.out.println(creators);
		creators.forEach(it -> System.out.println(((Creator) it).getCreatedTitle()));
	}
}
