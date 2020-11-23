package com.heraizen.assign18;

public class UserList {
	private String name[] = null;
	int i = 0;

	public boolean hasNext() {
		if (i != name.length) {

			return true;
		} else {
			return false;
		}
	}

	public String next() {

		String str = name[i];
		i++;
		return str;
	}

	UserList(String arr[]) {
		this.name = arr;
	}

	public static void main(String[] args) {

		UserList u = new UserList(new String[] { "You", "must", "practice", "all", "concept" });

		while (u.hasNext()) {
			System.out.println(u.next());
		}

	}
}
