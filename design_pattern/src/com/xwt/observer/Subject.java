package com.xwt.observer;
/**
 * 
 * @author xwt
 *	Subject�ӿ�
 *  MySubject��������ǵ�������
 *  Observer1��Observer2��������MySubject�Ķ���
 *  ��MySubject�仯ʱ��Observer1��Observer2��Ȼ�仯��
 *  AbstractSubject���ж�������Ҫ��صĶ����б����Զ�������޸ģ����ӻ�ɾ������ض���
 *  �ҵ�MySubject�仯ʱ������֪ͨ���б��ڴ��ڵĶ���
 */
public interface Subject {
	  /*���ӹ۲���*/  
    public void add(Observer observer);  
      
    /*ɾ���۲���*/  
    public void del(Observer observer);  
      
    /*֪ͨ���еĹ۲���*/  
    public void notifyObservers();  
      
    /*����Ĳ���*/  
    public void operation();  

}
