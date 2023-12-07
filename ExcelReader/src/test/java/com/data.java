package com;

public class data {
		String sheets[] = {"home","profile","userdata","login","logout"};
		public void testExcel() {
			for(int i=0;i<sheets.length;i++) {
				System.out.println(sheets[i]);
			}
		}
}
