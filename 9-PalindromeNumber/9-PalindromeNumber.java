// Last updated: 10/22/2025, 3:24:57 PM
class Solution {
    public boolean isPalindrome(int x) {

        // no negatives numbers are palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}

//      String numAsString = String.valueOf(x);
//      ArrayList<Integer> arr = new ArrayList<Integer>();

//      for (int strIdx = 0; strIdx < numAsString.length(); strIdx++) {
//         arr.add(numAsString.charAt(strIdx) - '0');
//      }

//     // System.out.println("num as array: ");
//     // for (Integer p : arr) {
//     //     System.out.print(p + " ");
//     // }

//     // all single-digit numbers are palindromes
//      if (arr.size() == 1) {
//         return true;
//      }

//     // if length of array is odd, remove middle number
//     if (((arr.size() % 2) != 0) && (arr.size() > 3)) {
//         arr.remove((arr.size() / 2) - 1);
//     } else if (arr.size() == 3) {
//         arr.remove(1);
//     }

//     if (arr.size() == 2) {
//         if (arr.get(0) == (arr.get(1))) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }

//     ArrayList<Integer> secondHalf = new ArrayList<Integer>();

//     int midpoint = arr.size() / 2;
    
//     for (int start = 0; start <= midpoint; start++) {

//     }

//     // for (int start = 0; start <= midpoint; start++) {
//     //     for (int end = arr.size() - 1; end >= midpoint; end--) {
//     //         System.out.println("start index at " + start + " is " + arr.get(start));
//     //         System.out.println("end index at " + end + " is " + arr.get(end));
//     //         if (arr.get(start) != arr.get(end)) {
//     //             return false;
//     //         }
//     //     }
//     // }
//     return true;
//     }
// }
    


    // // if length's odd, remove the middle number
    // if ((arr.size() % 2) != 0) {
    //     int middleIdx = (arr.size() / 2);
    //     arr.remove(middleIdx);
    // } 

    // System.out.println("removed");

    // for (Integer t : arr) {
    //     System.out.print(t + " ");
    // }

    // ArrayList<Integer> secondHalf = new ArrayList<Integer>();

    // for (int j = arr.size() - 1; j > (arr.size() / 2); j--) {
    //     secondHalf.add(arr.remove(j));
    // }

    // System.out.println("first half");

    // for (Integer t : arr) {
    //     System.out.print(t + " ");
    // }

    // System.out.println("second half");

    // for (Integer s : secondHalf) {
    //     System.out.print(s + " ");
    // }

    // if (arr.size() == secondHalf.size()) {
    //     for (int idx = 0; idx < arr.size(); idx++) {
    //         if (arr.get(idx) != (secondHalf.get(idx))) {
    //             return false;
    //         }
    //     }
    //     return true;
    // } else {
    //     throw new IllegalArgumentException();
    // }
    // }