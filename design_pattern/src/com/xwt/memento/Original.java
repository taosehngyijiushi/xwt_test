package com.xwt.memento;
/**
 * 
 * @author xwt
 * 备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，属于行为模式。
 * 它是在不破坏封闭的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
 * 这样以后就可将该对象恢复到原先保存的状态。
 * 
 * 
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值

 *
 */

public class Original {
	 private String value;  
     
	    public String getValue() {  
	        return value;  
	    }  
	  
	    public void setValue(String value) {  
	        this.value = value;  
	    }  
	  
	    public Original(String value) {  
	        this.value = value;  
	    }  
	  
	    public Memento createMemento(){  
	        return new Memento(value);  
	    }  
	      
	    public void restoreMemento(Memento memento){  
	        this.value = memento.getValue();  
	    }  

}
