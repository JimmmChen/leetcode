package dataStructure;

import java.util.Iterator;

public class MaxPile<Key> implements Iterable<Key>{
	private Key[] pile;
	private int N;

	public MaxPile(int k) {
		pile = (Key[]) new Object[k + 1]; 
		N = 0;
	}
	
	public int size(){
		return N;
	}
	private void swim(int k) {
		while (k/2 != 0) {
			if (less(k/2,k)) {
				exchang(pile, k, k / 2);
				k /= 2;
			} else
				break;
		}
	}

	private void sink(int k) {
		while (2 * k <= N) {
			int j = 2*k;
			if (j < N && less(j,j+1))
				j++;
			if (!less(k,j))
				break;
			exchang(pile, k, j);
			k = j;
		}
	}

	public Key max() {
		return pile[1];
	}

	public void deleteMax() {
		if(N == 0)
			return;
		else{
			pile[1] = pile[N];
			N--;
			sink(1);
			pile[N+1] = null;
			if(N>0 && N == pile.length/4)
				resize(pile.length/2);
		}
	}

	public void insert(Key num) {
		N++;
		pile[N] = num;
		swim(N);
		if(N >= pile.length-1)
			resize(2*pile.length);
	}

	private void exchang(Key[] number, int i, int j) {
		Key temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	
	private boolean less(int i, int j){
		return ((Comparable<Key>) pile[i]).compareTo(pile[j]) < 0;
	}
	
	private void resize(int size){
		assert size > N;
		Key[] temp = (Key [])new Object[size];
		for(int i = 1;i <= N;i++){
			temp[i] = pile[i];
		}
		pile = temp;
	}
	@Override
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
