package com.xwt.composite;
/**
 * 
 * @author xwt
 *	测试组合模式
 */
public class TestComposite {
	 TreeNode root = null;  
	  
	    public TestComposite(String name) {  
	        root = new TreeNode(name);  
	    }  
	  
	    public static void main(String[] args) {  
	    	TestComposite tree = new TestComposite("A");  
	        TreeNode nodeB = new TreeNode("B");  
	        TreeNode nodeC = new TreeNode("C");  
	          
	        nodeB.add(nodeC);  
	        tree.root.add(nodeB);  
	        System.out.println("build the tree finished!");  
	    }  

}
