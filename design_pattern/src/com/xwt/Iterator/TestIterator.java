package com.xwt.Iterator;

/**
 * 
 * @author xwt 
 * ���Ե���ģʽ
 */
public class TestIterator {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
