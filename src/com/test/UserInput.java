package com.test;

public class UserInput {

	public static class TextInput {

		String str = "";

		void add(char c) {

		}

		String getValue() {
			return str;
		}

	}

	public static class NumericInput extends TextInput {

		public NumericInput() {

		}

		void add(char c) {
			if (Character.getNumericValue(c) <= 9 && Character.getNumericValue(c) >= 0) {
				str += c;
			}
		}

		String getValue() {
			return str;
		}

	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
	}

}
