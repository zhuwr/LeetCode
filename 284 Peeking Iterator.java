// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    Integer peek = null;
    Iterator<Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peek != null) {
            return peek;
        } else {
            peek = iterator.next();
            return peek;
        }
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer temp;
	    if(peek != null) {
	        temp = peek;
	        peek = null;
	    } else {
	        temp = iterator.next();
	    }
	    return temp;
	}

	@Override
	public boolean hasNext() {
	    return (peek != null || iterator.hasNext());
	}
}
