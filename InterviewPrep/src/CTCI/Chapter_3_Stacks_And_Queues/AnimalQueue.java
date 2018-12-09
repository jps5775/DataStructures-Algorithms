package CTCI.Chapter_3_Stacks_And_Queues;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0; // acts as time stamp for each animal
	
	public void enqueue(Animal a){
		// set the time stamp
		a.setOrder(order);
		order++;
		
		// add the animal to the end of the correct list
		if(a instanceof Dog){ dogs.addLast((Dog)a); }
		if(a instanceof Cat){ cats.addLast((Cat)a); }
	}
	
	public Animal dequeue(){
		if(dogs.isEmpty() && cats.isEmpty()){
			return null;
		}
		// top
		//  v
		//[ 0  0  0  0  0  0  0  0  ] <- appends elements
		// tops of the queue
		Animal dog = dogs.peek();
		Cat cat = cats.peek();
		
		if(dog.isOlderThan(cat)){
			// take from the top of the queue
			return dogs.poll();
		}else{
			return cats.poll();
		}
		
	}
	
}
