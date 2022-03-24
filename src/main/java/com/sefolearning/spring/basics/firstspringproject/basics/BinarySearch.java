package com.sefolearning.spring.basics.firstspringproject.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//NOTE: the @Scope() annotation defines if every time we request an instance of this class we get always the
//      same instance ("singleton") or if we want a new instance every time ("prototype").
//      Singleton is the default scope for all beans and Spring will use it even if we don't define the @Scope annotation.

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm quickSortAlgorithm;//<- dependency variable
	//NOTE: dependency injection with conflicting similar classes can be resolved both by adding the @Primary annotation
	//      in the preferred class or by giving to the dependency variable the name of the preferred class. Example:
	//		private SortAlgorithm bubbleSortAlgorithm;
	//
	//      Another option is to add @Qualifier("<NAME>") to the relevant classes with unique qualifier names
	//      and then add the same @Qualifier("<NAME>") to the dependency variable to specify which class we want to use
	
	public int doBinarySearch(int[] numbers, int numberToSearchFor) {
		int elementIndex = -1;
		
		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		
		return elementIndex;
	}

}
