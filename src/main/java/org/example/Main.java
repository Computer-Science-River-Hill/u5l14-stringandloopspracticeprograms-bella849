package org.example; //DO NOT DELETE
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int choice = -1;

while (choice != 0) {
System.out.println("\nMenu:");
System.out.println("1. Further Substring Fun");
System.out.println("2. Run of Integers");
System.out.println("3. Sum of a Range of Sequential Integers");
System.out.println("4. Repeatedly Echo a Word");
System.out.println("5. Words Separated by Dots");
System.out.println("6. Adding up Integers");
System.out.println("7. Shipping Cost Calculator");
System.out.println("0. Exit");
System.out.print("Enter your choice: ");
choice = input.nextInt();
input.nextLine();

switch (choice) {
case 1:
System.out.print("Enter a string:\n");
String original = input.nextLine();
System.out.print("Enter beginning index: ");
int begin = input.nextInt();
System.out.print("Enter ending index: ");
int end = input.nextInt();
String newString = original.substring(begin, end);
System.out.println("\nOriginal string:\n" + original);
System.out.println("\nSubstring:\n" + newString);
break;

case 2:
System.out.print("Enter Start: ");
int start = input.nextInt();
System.out.print("Enter End: ");
int finish = input.nextInt();
for (int i = start; i <= finish; i++) {
System.out.println(i);
}
break;

case 3:
System.out.print("Enter low: ");
int low = input.nextInt();
System.out.print("Enter high: ");
int high = input.nextInt();
int sumHigh = high * (high + 1) / 2;
int sumLow = (low - 1) * low / 2;
System.out.println("Sum = " + (sumHigh - sumLow));
break;

case 4:
System.out.print("Enter a word:\n");
String word = input.nextLine();
int times = word.length();
for (int i = 0; i < times; i++) {
System.out.println(word);
}
break;

case 5:
System.out.print("Enter first word:\n");
String first = input.nextLine();
System.out.print("Enter second word:\n");
String second = input.nextLine();
int dotCount = 30 - (first.length() + second.length());
System.out.print(first);
for (int i = 0; i < dotCount; i++) {
System.out.print(".");
}
System.out.println(second);
break;

case 6:
System.out.print("How many integers will be added:\n");
int count = input.nextInt();
int sum = 0;
for (int i = 0; i < count; i++) {
System.out.print("Enter an integer:\n");
sum += input.nextInt();
}
System.out.println("\nThe sum is " + sum);
break;

case 7:
while (true) {
System.out.print("Weight of Order:\n");
double weight = input.nextDouble();
if (weight <= 0) {
System.out.println("\nbye");
break;
}
double cost = 3.00;
if (weight > 10) {
cost += (weight - 10) * 0.25;
}
System.out.printf("Shipping Cost: $%.2f\n", cost);
}
break;

case 0:
System.out.println("Goodbye!");
break;

default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}

