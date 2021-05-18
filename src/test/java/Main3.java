// Add any extra import statements you may need here


class Main3 {

  // Add any helper functions you may need here
  

  int minOverallAwkwardness(int[] arr) {
    // Write your code here
    int n = arr.length;
    int[] seating = new int[n];
    seating[1] = 1;
    seating[2] = 2; // does not matter how to seat 3 persons or less
    for (int i = 3; i < n; i++) {
      int min_index = 0;
      int min = 0;
      for (int j = 0; j <= i; j++) {
        int akw_left  = j == 0 ? Math.abs(arr[i] - arr[seating[i - 1]]) : Math.abs(arr[i] - arr[seating[j - 1]]);
        int akw_right = j == i ? Math.abs(arr[i] - arr[seating[0    ]]) : Math.abs(arr[i] - arr[seating[j]]);
        int max = Math.max(akw_left, akw_right);
        int current = j == 0 ? Math.abs(arr[seating[i - 1]] - arr[seating[0]]) : Math.abs(arr[seating[j - 1]] - arr[seating[j]]);
        if (max <= current && current > min) {
          min_index = j;
          min = current;
        }
      }
      for (int k = i; k > min_index; k--) {
        seating[k] = seating[k - 1];
      }
      seating[min_index] = i;
    }
    int result = 0;
    for (int i = 0; i < n - 1; i++) {
      result += Math.abs(arr[i] - arr[i + 1]);
    }
    result += Math.abs(arr[0] - arr[n - 1]);
    return result;
  }












  // These are the tests we use to determine if the solution is correct.
  // You can add your own at the bottom, but they are otherwise not editable!
  int test_case_number = 1;
  void check(int expected, int output) {
    boolean result = (expected == output);
    char rightTick = '\u2713';
    char wrongTick = '\u2717';
    if (result) {
      System.out.println(rightTick + " Test #" + test_case_number);
    }
    else {
      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
      printInteger(expected); 
      System.out.print(" Your output: ");
      printInteger(output);
      System.out.println();
    }
    test_case_number++;
  }
  void printInteger(int n) {
    System.out.print("[" + n + "]");
  }
  
  public void run() {
    int[] arr_1 = {5, 10, 6, 8};
    int expected_1 = 4;
    int output_1 = minOverallAwkwardness(arr_1);
    check(expected_1, output_1);

    int[] arr_2 = {1, 2, 5, 3, 7};
    int expected_2 = 4;
    int output_2 = minOverallAwkwardness(arr_2);
    check(expected_2, output_2);
    
    // Add your own test cases here
    
  }
  
  public static void main(String[] args) {
    new Main3().run();
  }
}