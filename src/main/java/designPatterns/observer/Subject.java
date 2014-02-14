package designPatterns.observer;

import java.util.LinkedList;
import java.util.List;


/**
 * notifyObservers:
 * 
 * for each ob in observers
 * {
 *      ob.update();
 * }
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Subject 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addObserver(Observer ob) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void notifyObservers(List<Observer> obs) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void removeObserver(Observer ob) ;
	
	
}

