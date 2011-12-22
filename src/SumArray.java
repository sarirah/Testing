public class SumArray {

	int[] myArray = new int[3];
	
	//Let's add some things together!

	
	
	    public  int sumArray(int[] myArray) {
	    	myArray[0] = 2;
	    	myArray[1] = 3;
	    	myArray[2] = 5;
	        int i, sum = 0;
	        // Write a loop to step through the array and sum the elements
	        for (i = 0; i < myArray.length; i++) {
	            sum = sum + myArray[i];
	        }
	        // Use a return statement to send back the calculated result
	        return sum;
	    }


	    public void main(String[] args){
	    	
			new SumArray().sumArray(myArray);
	    }
	
}
