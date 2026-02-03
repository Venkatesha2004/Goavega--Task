package goavega.task.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TimeRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String string = sc.nextLine();
			String s[] = string.trim().split(",");
			ArrayList<Integer> al = new ArrayList<>();
			for (String str : s) {
				if (str.contains("-")) {
					String a[] = str.split("-");
					if (a.length == 2) {
						int f = Integer.parseInt(a[0]);
						int l = Integer.parseInt(a[1]);
						for (int i = f; i <= l; i++) {
							if (!al.contains(i)) {
								al.add(i);
							}
						}
					} else {
						System.out.print("Invalid input farmat");
						return;
					}
				} else {
					int i = Integer.parseInt(str);
					if (!al.contains(i)) {
						al.add(i);
					}
				}
			}
			Collections.sort(al);
			for (int i = 0; i < al.size(); i++) {
				System.out.print(al.get(i));
				if (i < al.size() - 1) {
					System.out.print(" ");
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid input farmat");
		} finally {
			sc.close();
		}
	}
}
