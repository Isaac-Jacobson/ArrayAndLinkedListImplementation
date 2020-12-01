/**
 * MyArrayList.java - student implementation of ArrayList Author: Isaac Jacobson
 * Date: 10/30/19 Class: CS165 Email: isaac.j.main@gmail.com
 *
 * @param <E> the type of elements in this list
 */
public class MyArrayList<E> implements IArrayList<E> {

	/**
	 * Declare underlying array
	 */
	private E[] underlyingArray;

	/**
	 * Current size
	 */
	private int listSize;

	public final static double CAPACITY_INCREASE = 0.5;

	/**
	 * Constructs an empty list with the specified initial capacity.
	 * 
	 * @param initialCapacity the initial capacity of the list
	 */
	public MyArrayList(int initialCapacity) {
		this.underlyingArray = new E[initialCapacity];
	}

	/**
	 * Constructs an empty list with an initial capacity of ten. Because we are
	 * using generics you will have to create a new array of type Object and cast it
	 * to type E.
	 * <p>
	 * Think about constructor chaining.
	 */
	public MyArrayList() {
		this.underlyingArray = (E) new Object[10];
	}

	/**
	 * Special debug method
	 */
	public void printDebug() {
		Debug.printf("ArrayList.size() = %d\n", listSize);
		Debug.printf("ArrayList.capacity() = %d\n", underlyingArray.length);
		for (int index = 0; index < listSize; index++) {
			E e = (E) underlyingArray[index];
			String sElement = e.getClass().getName() + "@" + Integer.toHexString(e.hashCode());
			System.err.printf("ArrayList[%d]:  %s: %s\n", index, sElement, e.toString());
		}
	}

	// If the array is full, expand its capacity by an additional 50% (defined
	// through
	// CAPACITY_INCREASE), using integer math. For example, if the current capacity
	// is 15
	// the new capacity will be 22, and if the current capacity is 22 the new
	// capacity
	// will be 33.
	@Override
	public boolean add(E e) {
		int temp = underlyingArray.legnthp;
		if (size == underlyingArray.length) {
			reallocateArray((1 + CAPACITY_INCREASE) * underlyingArray.length);

		}
		underlyingArray[temp] = e;
		return true;
	}

	// If the array is full, expand its capacity by an additional 50% (defined
	// through
	// CAPACITY_INCREASE), using integer math. For example, if the current capacity
	// is 15
	// the new capacity will be 22, and if the current capacity is 22 the new
	// capacity
	// will be 33.
	@Override
	public void add(int index, E e) {
		if (size == underlyingArray.length) {
			reallocateArray((1 + CAPACITY_INCREASE) * underlyingArray.length);

		}
		underlyingArray[index] = e;
	}

	@Override
	public boolean remove(Object o) {
		int index = indexOf(o);
		if (index != -1) {
			underlyingArray[index] = null;
			return true;
		}
		return false;
	}

	@Override
	public E remove(int index) {
		E f = underlyingArray[index];
		underlyingArray[index] = null;
		return f;
	}

	@Override
	public void removeRange(int fromIndex, int toIndex) {
		for (int i = fromIndex; i < toIndex; i++) {
			underlyingArray[i] = null;
		}
	}

	@Override
	public E get(int index) {
		return underlyingArray[imdex];
	}

	@Override
	public E set(int index, E e) {
		E f = underlyingArray[i];
		underlyingArray[i] = e;
		return f;
	}

	@Override
	public boolean contains(Object o) {
if(indexOf(o) != -1) {
	retun true;
}
		return false;
	}

	@Override
	public int indexOf(Object o) {
for(int i = 0; i , underlyingArray.length; i++) {
	if(underlyingArray[i] == o|| underlyingArray[i].(o)) {
		return i;
	}
}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		int f = -1;
		for(int i = 0; i , underlyingArray.length; i++) {
			if(underlyingArray[i] == o|| underlyingArray[i].(o)) {
				f = i;
			}
		}
				return f;
	}

	@Override
	public void clear() {
		for(int i = 0; i , underlyingArray.length; i++) {
		underlyingArray[i] = null;
		
		}
	}

	@Override
	public int size() {
		int f = 0;
		for(int i = 0; i , underlyingArray.length; i++) {
			if(underlyingArray[i] != null) {
				f++;
			}
		}	return f;}

	@Override
	public boolean isEmpty() {
		return (size() == 0);
	}

	// use the reallocateArray method
	public void trimToSize() {
	}

	private void reallocateArray(int capacity) {
		E[] temp = new E[capacity];
		for (int i = 0; i < capacity; i++) {
			temp[i] = underlyiongArray[i];
		}
		underlyingArray = temp;
	}

}
