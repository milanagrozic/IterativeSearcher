
public class IterativeSearcher {

	public Object doBinarySearch(IntegerArray arrayToSearch, int i) {
		int low = 0;
		int high = arrayToSearch.length() - 1;
		
		int results = -1;
		
		while ( high >= low ) {
			int mid = (low + high) / 2;
			int value = arrayToSearch.read(mid);
			
			if (value == i) { //find first occurence next
				results = mid;
				high = mid - 1;
			} else if (value < i) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return results;	
	}
}
