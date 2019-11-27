package com.company;

import java.util.Stack;

public class StringBuilderWithUndo {

	public StringBuilderWithUndo() {
		stringBuilder = new StringBuilder();
	}

	public StringBuilderWithUndo(int size) {
		stringBuilder = new StringBuilder(size);
	}

	StringBuilderWithUndo(String string) {
		stringBuilder = new StringBuilder(string);
	}

	void undo() {
		if (!stack.empty()) {
			stack.pop().undo();
		}
	}

	<T> void append(T t) {
		stringBuilder.append(t);
		Action action = () -> stringBuilder.delete(stringBuilder.length() - t.toString().length(),
				stringBuilder.length());

		stack.add(action);
	}

	public StringBuilderWithUndo appendCodePoint(int codePoint) {
		stringBuilder.appendCodePoint(codePoint);
		Action action = () -> stringBuilder.delete(stringBuilder.length() - Integer.toString(codePoint).length(),
				stringBuilder.length());

		stack.add(action);
		return this;
	}

	public int capacity() {
		return stringBuilder.capacity();
	}

	public char charAt(int index) {
		return stringBuilder.charAt(index);
	}

	public int codePointAt(int index) {
		return stringBuilder.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return stringBuilder.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return stringBuilder.codePointCount(beginIndex, endIndex);
	}

	void delete(int start, int end) {
		String str = stringBuilder.substring(start, end);
		stringBuilder.delete(start, end);
		Action action = () -> stringBuilder.insert(start, str);
		stack.add(action);
	}

	void deleteCharAt(int index) {
		char ch = stringBuilder.charAt(index);
		stringBuilder.deleteCharAt(index);
		Action action = () -> stringBuilder.insert(index, ch);
		stack.add(action);
	}

	public void ensureCapacity(int Capacity) {
		stringBuilder.ensureCapacity(Capacity);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		stringBuilder.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	public int indexOf(String str) {
		return stringBuilder.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return stringBuilder.indexOf(str, fromIndex);
	}

	<T> void insert(int offset, T t) {
		stringBuilder.insert(offset, t);
		Action action = () -> stringBuilder.delete(offset, offset + t.toString().length());
		stack.add(action);
	}

	public int lastIndexOf(String str) {
		return stringBuilder.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return stringBuilder.lastIndexOf(str, fromIndex);
	}

	public int length() {
		return stringBuilder.length();
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return stringBuilder.offsetByCodePoints(index, codePointOffset);
	}

	public StringBuilderWithUndo replace(int start, int end, String str) {
		String replaced = stringBuilder.substring(start, end);
		stringBuilder.replace(start, end, str);
		Action action = () -> {
			stringBuilder.replace(start, end, replaced); //end?
		};
		stack.add(action);
		return this;
	}

	public StringBuilderWithUndo reverse() {
		stringBuilder.reverse();
		Action action = () -> stringBuilder.reverse();
		stack.add(action);
		return this;
	}

	public void setCharAt(int index, char ch) { //index?
		stringBuilder.setCharAt(index, ch);
		Action action = () -> stringBuilder.deleteCharAt(index);
		stack.add(action);
	}

	public void setLength(int newLength) {
		int length = stringBuilder.length();
		stringBuilder.setLength(newLength);
		Action action = () -> stringBuilder.setLength(length);
		stack.add(action);
	}

	public CharSequence subsequence(int start, int end) {
		return stringBuilder.subSequence(start, end);
	}

	public String substring(int start) {
		return stringBuilder.substring(start);
	}

	public String substring(int start, int end) {
		return stringBuilder.substring(start, end);
	}

	public String toString() {
		return stringBuilder.toString();
	}

	public void trimToSize() {
		stringBuilder.toString();
	}

	private StringBuilder stringBuilder;
	private Stack<Action> stack = new Stack<>();


}