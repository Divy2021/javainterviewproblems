package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupPermutations {

	public static void main(String[] args) {
		List<String> permutations = List.of("abc", "bca", "cab", "xyz", "yzx", "zxy", "dog", "god", "odg", "eat");

		Map<String, List<String>> groupedpermutations = anagramsoflist(permutations);
		groupedpermutations.forEach((key, value) -> System.out.println("key :" + key + " value:" + value));
	}

	public static Map<String, List<String>> anagramsoflist(List<String> list) {
		Map<String, List<String>> strings = new HashMap<>();

		for (String s : list) {
			String key = s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
			strings.computeIfAbsent(key, x -> new ArrayList<>()).add(s);
		}
		return strings;
	}

//		Map<String, List<String>> groupedPermutations = groupByAnagrams(permutations);
//		System.out.println(groupedPermutations);
//		groupedPermutations.forEach((key, value) -> {
//			System.out.println("Group: " + key + " -> " + value);
//		});
//	}
//
//	public static Map<String, List<String>> groupByAnagrams(List<String> permutations) {
//		Map<String, List<String>> grouped = new HashMap<>();
//		for (String s : permutations) {
//			String key = s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
////			System.out.println(key);
//			grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
//		}
//		return grouped;
}
