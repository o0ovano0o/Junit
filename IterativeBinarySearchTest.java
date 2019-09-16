package java2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IterativeBinarySearchTest {

	@Test
	void testcase1() {
		Integer[] arr = {4,3,2,1,45,23,0,6,3,45,233};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, 0);
		 assertTrue(atIndex==6);
	}
	@Test
	void testcase2() {
		Integer[] arr = {4,3,2,1,45,23,0,6,3,45,233};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, 4);
		 assertTrue(atIndex==0);
	}
	@Test
	void testcase3() {
		Integer[] arr = {4,3,2,1,45,23,0,6,3,45,233};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, 233);
		 assertTrue(atIndex==10);
	}
	@Test
	void testcase4() {
		Integer[] arr = {4,3,2,1,45,23,0,6,3,45,233};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, -1);
		 assertTrue(atIndex==-1);
	}
	@Test
	void testcase5() {
		Integer[] arr = {4,3,2,1,45,23,0,6,3,45,233};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, 3);
		 assertTrue(atIndex==1);
	}
	@Test
	void testcase6() {
		Integer[] arr = {4,3,2,1,45,23,0,6,3,45,233};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, 45);
		 assertTrue(atIndex==4);
	}
	@Test
	void testcase7() {
		String[] arr = {"a","b","e","r","v","y","o","u"};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, "y");
		 assertTrue(atIndex==5);
	}
	@Test
	void testcase8() {
		String[] arr = {"e","b","a","r","v","y","o","u"};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, "e");
		 assertTrue(atIndex==0);
	}
	@Test
	void testcase9() {
		String[] arr = {"a","b","e","r","v","y","o","u"};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, "u");
		 assertTrue(atIndex==7);
	}
	@Test
	void testcase10() {
		String[] arr = {"a","b","e","r","v","y","o","u"};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, "m");
		 assertTrue(atIndex==-1);
	}
	@Test
	void testcase11() {
		String[] arr = {"a","b","e","r","v","y","o","u"};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, "n");
		 assertTrue(atIndex==-1);
	}
	@Test
	void testcase12() {
		String[] arr = {"a","b","e","r","v","y","o","u"};
		 LinearSearch search = new LinearSearch();
		 int atIndex = search.find(arr, "b");
		 assertTrue(atIndex==1);
	}
	
	

}
