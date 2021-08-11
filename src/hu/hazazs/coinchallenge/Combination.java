package hu.hazazs.coinchallenge;

import java.util.LinkedList;
import java.util.List;

final class Combination {

	private final List<Integer> combination;

	Combination(List<Integer> combination) {
		this.combination = new LinkedList<>(combination);
	}

	List<Integer> getCombination() {
		return combination;
	}

}