package hu.hazazs.coinchallenge;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	private static List<Integer> combination = new ArrayList<>();
	private static Set<Combination> combinations = new LinkedHashSet<>();

	public static void main(String[] args) {
		System.out.println(numberOfCombinations(new int[] { 1, 2, 5 }, 7, 0, 0));
		combinations.forEach(c -> System.out.println(c.getCombination()));
	}

	private static int numberOfCombinations(int[] coins, int amount, int index, int level) {
		while (combination.size() != level) {
			combination.remove(combination.size() - 2);
		}
		if (amount == 0) {
			combinations.add(new Combination(combination));
			return 1;
		}
		if (amount < 0) {
			return 0;
		}
		int combos = 0;
		for (int i = index; i < coins.length; i++) {
			combination.add(coins[i]);
			combos += numberOfCombinations(coins, amount - coins[i], i, level + 1);
		}
		return combos;
	}

}