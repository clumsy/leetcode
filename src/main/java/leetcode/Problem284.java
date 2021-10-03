package leetcode;

import java.util.Iterator;
import java.util.NoSuchElementException;

@BeatsPercent(97.84)
@TimeComplexity(worst = Complexity.CONSTANT) // for all operations
@SpaceComplexity(worst = Complexity.CONSTANT) // for all operations
public class Problem284 {
    class PeekingIterator implements Iterator<Integer> {
        private final Iterator<Integer> iterator;
        private Integer next;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            this.next = getNext();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            if (next == null) {
                throw new NoSuchElementException();
            }
            int temp = next;
            next = getNext();
            return temp;
        }

        private Integer getNext() {
            return iterator.hasNext() ? iterator.next() : null;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }
}
