// Add any extra import statements you may need here


class Main2 {

  // Add any helper functions you may need here
  

  int[] countSubarrays(int[] arr) {
    // Write your code here
    /*int n = arr.length;
    int[] starts = new int[n];
    int[] ends = new int[n];
    int max = arr[0];
    ends[0] = 1;
    for (int i = 1; i < n; i++) {
      ends[i] = 1;
      if (arr[i] > max) {
        max = arr[i];
        ends[i] += ends[i - 1];
      }
    }
    max = arr[n - 1];
    starts[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
      starts[i] = 1;
      if (arr[i] > max) {
        max = arr[i];
        starts[i] += starts[i + 1];
      }
    }
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = starts[i] + ends[i];
    }
    return result;*/
    int n = arr.length;
    int max = arr[0];
    int max_index = 0;
    int[] max_left = new int[n];
    max_left[0] = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] >= max) {
        max_index = i;
        max = arr[i];
        max_left[i] = 0;
      } else {
        max_left[i] = max_index;
      }
    }
    max = arr[n - 1];
    max_index = n - 1;
    int[] max_right = new int[n];
    max_right[n - 1] = n - 1;
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] >= max) {
        max_index = i;
        max = arr[i];
        max_right[i] = n - 1;
      } else {
        max_right[i] = max_index;
      }
    }
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = max_right[i] - max_left[i] - 1; // (i - max_left[i]) + (max_right[i] - i) - 1
    }
    return result;
  }












  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;
  void check(int[] expected, int[] output) {
    int expected_size = expected.length; 
    int output_size = output.length; 
    boolean result = true; 
    if (expected_size != output_size) {
      result = false;
    }
    for (int i = 0; i < Math.min(expected_size, output_size); i++) {
      result &= (output[i] == expected[i]);
    }
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);  
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printIntegerArray(expected); 
      System.out.print(" Your output: ");
      printIntegerArray(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printIntegerArray(int[] arr) {
    int len = arr.length; 
    System.out.print("[");
    for(int i = 0; i < len; i++) {
      if (i != 0) {
        System.out.print(", ");
      }
      System.out.print(arr[i]);
    }
    System.out.print("]");
  }
  public void run() {
    int[] test_1 = {3, 4, 1, 6, 2};
    int[] expected_1 = {1, 3, 1, 5, 1};
    int[] output_1 = countSubarrays(test_1);
    check(expected_1, output_1);
    
    int[] test_2 = {2, 4, 7, 1, 5, 3};
    int[] expected_2 = {1, 2, 6, 1, 3, 1};
    int[] output_2 = countSubarrays(test_2);
    check(expected_2, output_2);
  
    // Add your own test cases here
    
  }
  public static void main(String[] args) {
    new Main2().run();
  }
}