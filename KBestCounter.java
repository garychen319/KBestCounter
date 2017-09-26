import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;


public class KBestCounter<T extends Comparable<T>> {

	//implemented using a max-heap that stores k elements
	PriorityQueue<T> maxHeap;
	final int k;

	//since java doesn't have a heap ADT, use priority queue to implement it
	public KBestCounter(int k_) {
		maxHeap = new PriorityQueue<>();
		this.k = k_;
	}
	
	public void count(T x) {
		maxHeap.add(x);
		if (maxHeap.size() > k)
			maxHeap.remove();
	}

	//reads in an data set in an array
	public void readData(T[] data){
		//for each value in data, add it to the max heap 1 at a time
		for (T x: data){
			maxHeap.add(x);
			//if max heap size goes over k, discard smallest element
			//priority queue remove already discards smallest element us
			if (maxHeap.size() > k){ 
				maxHeap.remove();
			}
		}
	}
	
	public List<T> kbest() {
		PriorityQueue<T> temp = new PriorityQueue<>();
		temp = new PriorityQueue<T>(new PriorityQueue<T>(maxHeap));
		ArrayList<T> result = new ArrayList<T>();
		//this "polls" (pops) the first element from the array list.
		int k_ = k;
		if(maxHeap.size() < k){
			k_ = maxHeap.size();
		}
		for (int i = 0; i < k_; i++) {
			result.add(temp.poll());
		}
		//Flips the order of the list, now goes from largest to smallest.
		ArrayList<T> result2 = new ArrayList<T>();
		for(int i=0; i<result.size(); i++){
			result2.add(result.get(result.size()-1-i));
		}
		return result2;
	}
}