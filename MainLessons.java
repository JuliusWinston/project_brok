// import java.util.Scanner;
// import java.util.Arrays;

// import credit_card.CreditCard;

// public class Main {
  // public static double sum (double[] data) {
  //   double total = 0;
  //   // for(int i = 0; i < data.length; i++) {
  //   //   System.out.println("Inside the body of the for loop");
  //   //   total += data[i];
  //   // }

  //   for (double value: data)
  //     total += value;

  //   return total;
  // }

  // public static void testContinue () {
  //   for (int i = 1; i < 10; i++) {
  //     if(i % 2 == 0) 
  //       break;
  //     System.out.println(i);
  //   }
  //   System.out.println("Outside the body of the loop containing the break statement");
  // }

//   public static void allBaseTypes () {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter an integer: ");
//     int userInt = input.nextInt();
//     System.out.println(userInt);
//     System.out.print("Enter a floating point number: ");
//     float userFloat = input.nextFloat();
//     System.out.println(userFloat);
//     System.out.print("Enter a boolean: ");
//     boolean userBooelan = input.nextBoolean();
//     System.out.println(userBooelan);
//     input.close();
//   }
//   public static void main(String[] args) {
//     allBaseTypes();
//   }
// }

// import data_structures.Scoreboard;
// import data_structures.GameEntry;

// public class Main {
//   public static void main(String[] args) {
//     Scoreboard gameBoard = new Scoreboard(10);

//     GameEntry game1 = new GameEntry("Dev", 5600);
//     GameEntry game2 = new GameEntry("Sensei", 5600);
//     GameEntry game3 = new GameEntry("Kong", 15600);
//     GameEntry game4 = new GameEntry("Dev", 57600);
//     GameEntry game5 = new GameEntry("Sensei", 25600);
//     GameEntry game6 = new GameEntry("Kong", 156000);

//     gameBoard.add(game1);
//     gameBoard.add(game2);
//     gameBoard.add(game3);
//     gameBoard.add(game4);
//     gameBoard.add(game5);
//     gameBoard.add(game6);
//     gameBoard.displayInfo();
//     System.out.println("===============================================================");
//     gameBoard.remove(5);
//     gameBoard.displayInfo();
//   }
// }

//Insertion sort
// public class Main {
//   public static int[] insertionSort(int[] arr) {
//     for(int i = 1; i < arr.length; i++) {
//       int current = arr[i];
//       int j = i;
//       while(j > 0 && arr[j - 1] > current) {
//         arr[j] = arr[j - 1];
//         j--;
//       }
//       arr[j] = current;
//     }
//     return arr;
//   }
//   public static void main(String[] args) {
//     int[] testArr = {6, 7, 8, 2, 3, 5};
//     int[] sorted = insertionSort(testArr);
//     for (int i: sorted)
//       System.out.println(i);
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     String[] names1 = {"King", "Kong", "Godzilla"};
//     String[] names2 = {"King", "Kong", "Godzilla"};

//     System.out.println(java.util.Arrays.equals(names1, names2));
//     System.out.println(java.util.Arrays.toString(names1));

//     Arrays.sort(names1);
//     System.out.println(Arrays.toString(names1));
//   }
// }
