import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// Return day as String
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    // Find Day name

    public static String findDay(int month, int day, int year) {

        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().name();


    }

    public static void main(String[] args) {

        System.out.println("findDay(6,23,2021) = " + findDay(6, 23, 2021));

    }

}

//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;


// Find Currency from other countries

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

// write a program to print string and array with same method
class Solution1 {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};


        printArray(intArray);
        printArray(stringArray);
    }
}

// write a program to check User with Comparator check if score is same then sort with name

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        // Compare scores in decreasing order
        if (a.score != b.score) {
            return b.score - a.score;
        }
        // If scores are the same, compare names alphabetically
        return a.name.compareTo(b.name);
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}


// Write a program to sort with comparator if cgpa is same then compare with name if name is
// then compare with id
class Student {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
class Solution3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.getCgpa() == b.getCgpa()) {
                    if (a.getFname().equals(b.getFname())) {
                        return a.getId() - b.getId();
                    } else {
                        return a.getFname().compareTo(b.getFname());
                    }
                }
                return (int) (b.getCgpa() * 1000 - a.getCgpa() * 1000);
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}


// Check Two String with anagrams
class Anagram {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        return Arrays.equals(a1, b1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
//6.Split String and Print

class SplitStringAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = splitSentence(sentence);

        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] splitSentence(String sentence) {
        // Use regular expression to split the sentence
        String[] words = sentence.split("[^A-Za-z]+");

        return words;
    }
}
// 7. Occurance of Character in String

class OccuranceOfCharacters {


    public static void main(String[] args) {

        String str = "Ahamdabad";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        char currentChar = charArray[0];
        int count = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (currentChar == charArray[i]) {
                count++;
            } else {
                System.out.println("The Counts of Char is " + currentChar + "times" + count);
                count = 1;
                currentChar = charArray[i];
            }

        }
        System.out.println("The Counts of Char is " + currentChar + "times" + count);


    }

}

// 7. Occurance of Character in Integer in array

class OccuranceOfInteger {


    public static void main(String[] args) {

        int integerValue = 478982175;
        String integerLength = String.valueOf(integerValue);
        char[] integerArray = new char[integerLength.length()];

        for (int i = 0; i < integerLength.length(); i++) {

            integerArray[i] = integerLength.charAt(i);
            System.out.println(integerArray[i]);
        }

        Arrays.sort(integerArray);
        System.out.println(integerArray);
        char currentChar = integerArray[0];
        int count = 1;
        for (int i = 1; i < integerArray.length; i++) {
            if (currentChar == integerArray[i]) {
                count++;
            } else {
                System.out.println("The Counts of Char is " + currentChar + "times" + count);
                count = 1;
                currentChar = integerArray[i];
            }

        }
        System.out.println("The Counts of Char is " + currentChar + "times" + count);


    }

}

// 8. Remove Duplicate Elements from Integer Arraylist


class IntegerArrayList {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(14);
        arrayList.add(17);
        arrayList.add(17);
        arrayList.add(70);

        HashSet<Integer> integerHashSet = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(integerHashSet);
        for (Integer integer : arrayList) {

            System.out.println(integer);

        }


    }
}

//9. How to reverse String

class ReverseString {
    public static void revereStringWithMethod(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }

    public static void reverseStringWithoutMethod(String str) {
        String newValue = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            newValue = newValue + str.charAt(i);
        }
        System.out.println(newValue);

    }

    public static void main(String[] args) {

        String value = "vivek";


        ReverseString.revereStringWithMethod(value);
        ReverseString.reverseStringWithoutMethod(value);

    }
}

// Question no : 10 Reverse of Integer Value


class ReverseInteger {

    public static void main(String[] args) {

        int integerValue = 458744444;
        String value = String.valueOf(integerValue);
        for (int i = value.length() - 1; i >= 0; i--) {

            System.out.println(value.charAt(i));

        }


    }


}


// 11 Check Number is Pallindrom Number or Not

class CheckNumberIsP {
    public static void main(String[] args) {

        int value = 1661;
        int newValue = 1661;
        int temp = 0;
        int div = 0;


        while (value != 0) {
            div = value % 10;
            temp = temp * 10 + div;
            value = value / 10;
        }

        if (temp == newValue) {
            System.out.println("The Number is Palindrome Number");
        } else {
            System.out.println("Not a palindrom number");
        }


    }
}


// 12. ArmStrong Number


class ArmStrongNumber {


    public static void main(String[] args) {


        int number = 370;
        int number2 = number;
        int length = 0;
        int newNumber = 0;

        int arm = 0;
        while (number2 != 0) {
            length = length + 1;
            number2 = number2 / 10;
        }
        while (number != 0) {
            int multi = 1;
            int rem = number % 10;
            for (int i = 1; i <= length; i++) {

                multi = multi * rem;
            }
            arm = arm + multi;
            number = number / 10;
        }
        System.out.println(arm);
    }
}


class Practice1 {


    public static void main(String[] args) {
//
//        long value1 = 1441L;
//        long value2 = value1;
//        long length = 0;
//        long newNumber = 0L;
//        while (value1!= 0)
//        {
//            long temp = value1%10;
//            newNumber = newNumber*10+temp;
//            System.out.println(newNumber);
//            value1 = value1/10;
//        }
//        System.out.println(newNumber);
//        if(value2== newNumber)
//        {
//            System.out.println("This number is Palindrom Number");
//        }else
//        {
//            System.out.println("Not a Palindrom Number");
//        }


        int value = 372;
        int val = 372;
        int value1 = value;
        int valueLength = 0;
        int newValue = 0;


        while (value != 0) {
            int rem = value % 10;
            valueLength++;
            value = value / 10;
        }
        while (value1 != 0) {
            int mul = 1;
            int rem = value1 % 10;
            for (int i = 1; i <= valueLength; i++) {

                mul = mul * rem;
                System.out.println(mul);
            }
            newValue = newValue + mul;
            System.out.println(newValue);
            value1 = value1 / 10;

        }
        if (val == newValue) {
            System.out.println("This is a arm strong Number");
        } else {
            System.out.println("The Is not ");
        }


    }
}

class CheckNumberIsPrime {
    public static void main(String[] args) {
        int number = 99;
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
//                System.out.println("Not a prime Number");
                count++;
            }

        }
        if (count == 0) {
            System.out.println("is  Prime ");
        } else {
            System.out.println("not a Prime");
        }


    }
}


class FindPrimeNumberInRange {

    public static boolean checkNumberIsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printNumberInRange(int start, int end) {
        for (int i = start; i <= end; i++) {

            if (checkNumberIsPrime(i)) {
                System.out.println("Number is Prime " + i);
            }
//            else {
//                System.out.println("Not Prime Number" + i);
//            }

        }
    }


    public static void main(String[] args) {

        printNumberInRange(45, 100);

    }
}


class FindSecondLargest {
    public static void secondLargestElementInArray(int[] arr) {
        Arrays.sort(arr);
        for (Integer value : arr) {
            System.out.println(value);

        }
        System.out.println(arr[arr.length - 2]);
    }

    public static void main(String[] args) {

        int[] arr = {10, 15, 658, 1, 25, 145, 15, 20};
//        secondLargestElementInArray(arr);
        System.out.println("findNumber(arr) = " + findNumber(arr));

    }

    public static int findNumber(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        for (Integer value : arr) {

            System.out.println(value);
        }

        System.out.println(arr[arr.length - 2]);

        return arr[arr.length - 2];
    }

}


class findIntegerOccurance {

    public static void checkValue1(int number) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        while (number != 0) {
            int rem = number % 10;
            System.out.println(rem);
            integerArrayList.add(rem);
            number /= 10;
        }

        System.out.println(integerArrayList);

        Collections.sort(integerArrayList);
        int currentValue = integerArrayList.get(0);
        int count = 1;
        for (int i = 1; i < integerArrayList.size(); i++) {

            if (currentValue == integerArrayList.get(i)) {
                count++;
            } else {
                System.out.println("The Count value is " + count + " " + currentValue);
                count = 1;
                currentValue = integerArrayList.get(i);
            }

        }
        System.out.println("The Count value is " + count + " " + currentValue);


    }


    public static void main(String[] args) {

//        int [] array = {10,11,10,11,15,15,14,54};
        int value = 4587964;
        findIntegerOccurance.checkValue1(value);


        String str = String.valueOf(value);
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        char currentValue = charArray[0];
        int count = 1;
        for (int i = 1; i < charArray.length; i++) {

            if (currentValue == charArray[i]) {
                count++;
            } else {
                System.out.println("The Count value is " + count + " " + currentValue);
                count = 1;
                currentValue = charArray[i];
            }

        }
        System.out.println("The Count value is " + count + " " + currentValue);


    }


}

class FindOccuranceOfNumber {


    public static void main(String[] args) {


        int value = 45845555;

        Map<Integer, Integer> integerIntegerMap = new HashMap<>();

        while (value != 0) {

            int rem = value % 10;
            integerIntegerMap.put(rem, integerIntegerMap.getOrDefault(rem, 0) + 1);
            value /= 10;
        }

        var entries = integerIntegerMap.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " Value" + entry.getValue());
        }


    }
}

class FindOccuranceChar {


    public static void main(String[] args) {


        String str = "Ahamdabad";

        str = str.toLowerCase();
        Map<Character, Integer> integerIntegerMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            char a = str.charAt(i);
            integerIntegerMap.put(a, integerIntegerMap.getOrDefault(a, count) + 1);

        }


        var entries = integerIntegerMap.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " Value" + entry.getValue());
        }


    }
}

class FactorialProgram {


    public static void main(String[] args) {

        int value = 5;
        int fact = 1;
        int newValue = 1;

        for (int i = value; i > 0; i--) {

            fact = fact * i;

        }
        System.out.println(fact);


        int a = 10;
        int b = 20;
        System.out.println("Before Sweeping ");
        System.out.println(a + " " + b);
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("After Sweeping" + a + " " + b);


        System.out.println("Without Third Variable");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Sweeping" + a + " " + b);

    }
}

class FindMissingNumbers {


    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 6, 9, 10};
        int count = 1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == count) {
//                System.out.println(array[i]);
//                System.out.println(count);
                count++;
            } else {
                System.out.println("Number is Missing" + count);
                count++;
                i--;
            }

        }


    }
}


class Singleton1 {
    private static Singleton1 instance;
    private String name;

    public Singleton1(String name) {
        this.name = name;
    }

    // Private constructor to prevent instantiation from outside the class
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


    }

    public void someMethod() {
        // Method implementation
    }
}

class LambdaExpression {


    public static void main(String[] args) {


        List<Integer> integerArrays = Arrays.asList(10, 15, 30, 50, 70, 10);


        integerArrays.stream().filter(i -> i % 2 == 0).forEach(a -> System.out.println(a));


    }
}


class StringManipulation {

    public static void main(String[] args) {

        String name = "rajeevpandey";
        name = name.toLowerCase();
        char[] arrayChar = name.toCharArray();
        char[] newCharArray = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {

            if (arrayChar[i] >= 'a' && arrayChar[i] <= 'x') {
                newCharArray[i] = (char) (arrayChar[i] + 2);

            } else if (arrayChar[i] == 'y') {
                newCharArray[i] = 'a';
            } else if (arrayChar[i] == 'z') {
                newCharArray[i] = 'b';
            } else {
                newCharArray[i] = newCharArray[i];
            }


        }


        for (Character ch : newCharArray) {
            System.out.println(ch);

        }


    }
}


class AccuraciesCharacterWithMap {
    public static void main(String[] args) {


        String name = "ShivaPandey";
        name = name.toLowerCase();
        char[] array = name.toCharArray();
        Arrays.sort(array);
        int count = 0;

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            characterIntegerMap.put(array[i], characterIntegerMap.getOrDefault(array[i], count) + 1);
        }

        var entries = characterIntegerMap.entrySet();

        for (var entry : entries) {

            System.out.println("Total count Character " + entry.getKey() + "Total count of Character " + entry.getValue());

        }


    }
}


class ArmStrongNumbers {


    public static void main(String[] args) {


        int value = 370;
        int value1 = value;
        int value2 = value;
        int length = 0;
        int newValue = 0;

        while (value1 != 0) {
            length = length + 1;
            value1 /= 10;
        }
        System.out.println(length);

        while (value2 != 0) {
            int mul = 1;
            int rem = value2 % 10;
            System.out.println(rem);

            for (int i = 1; i <= length; i++) {

                mul = mul * rem;
                System.out.println(mul);

            }
            value2 /= 10;
            newValue = newValue + mul;

        }

        if (value == newValue) {
            System.out.println("Number is Arm Strong number");
        } else {
            System.out.println("Not Arm Strong Number");
        }


    }
}


class PalindromNumbers {


    public static void main(String[] args) {

        int value = 1451;
        int value1 = value;
        int value2 = value;
        int newValue = 0;


        while (value != 0) {
            int rem = value % 10;
            newValue = newValue * 10 + rem;
            value /= 10;
        }
        if (newValue == value2) {
            System.out.println("The Number is Palindrom Numbers");
        } else {
            System.out.println("The Number is Not Palindrom Number");
        }

    }
}

class LinerSearch {

    public static void linearSearch(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == number) {
                System.out.println("The Number is Available in Array");
            }
        }


    }


    public static void main(String[] args) {


        int[] array = {10, 20, 30, 40, 40, 50, 60};

        LinerSearch.linearSearch(array, 2);


    }
}

class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Found the target at index mid
            } else if (array[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}

class AddCharWithAdjacent {


    public static void main(String[] args) {

        String nameArray = "Vivek kumar pandeyz";
        nameArray = nameArray.toLowerCase();
        nameArray = nameArray.replaceAll("[^a-z]", "");
        System.out.println(nameArray);
        System.out.println(nameArray);
        char[] nameArray1 = nameArray.toCharArray();
        char[] newArray = new char[nameArray1.length];


        for (int i = 0; i < nameArray1.length; i++) {
            if (nameArray1[i] >= 'a' && nameArray1[i] <= 'x') {
                newArray[i] = (char) (nameArray1[i] + 2);
            } else if (nameArray1[i] == 'y') {
                newArray[i] = 'a';
            } else if (nameArray1[i] == 'z') {
                newArray[i] = 'b';
            } else {
                newArray[i] = newArray[i];
            }

        }


        System.out.println(newArray);


    }


}

class PrintTotalCharInJava {


    public static void main(String[] args) {

        String details = "My name is Vivek Kumar Pandey";
        details = details.toLowerCase();
        details = details.replaceAll("[^a-z]", "");
        System.out.println(details);
        char[] details1 = details.toCharArray();
        int count = 0;
        int count1 = 0;


        for (int i = 0; i < details1.length; i++) {
            count = count + 1;
            count1 += 1;

        }

        System.out.println("count = " + count);
        System.out.println("count1 = " + count1);


    }
}

class InterviewBit {

    // Function to display all permutations of the string str
    public static void printAllPer(String str, String str2) {
        // check if string is empty or null
        if (str.length() == 0) {
            System.out.print(str2 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // ith character of str
            char ch = str.charAt(i);
            // Rest of the string after excluding
            // the ith character
            String str3 = str.substring(0, i) + str.substring(i + 1);
            // Recursive call
            printAllPer(str3, str2 + ch);
        }
    }

    // Driver code
    public static void main(String[] args) {
        String s = "cat";
        printAllPer(s, "");
    }
}


class CreateSingltoneClass {

    private static CreateSingltoneClass singleInstance = null;

    private CreateSingltoneClass() {

    }

    public static CreateSingltoneClass getInstance() {
        if (singleInstance == null)
            singleInstance = new CreateSingltoneClass();

        return singleInstance;
    }

    public static void main(String[] args) {

        CreateSingltoneClass obj1 = getInstance();
        System.out.println(obj1.hashCode());


    }


}

class FindArmStrongNumber {


    public static void main(String[] args) {

        int value = 371;
        int value1 = value;
        int value2 = value;
        int length = 0;
        int newValue = 0;

        while (value != 0) {
            length = length + 1;
            value /= 10;

        }


        while (value1 != 0) {
            int rem = value1 % 10;
            int mul = 1;
            for (int i = 1; i <= length; i++) {

                mul = mul * rem;
                System.out.println(mul);
            }
            newValue = mul + newValue;
            value1 = value1 / 10;
            System.out.println(newValue);

        }

        System.out.println(value2);
        System.out.println(newValue);


        if (value2 == newValue) {
            System.out.println("the is ArmStrong Number");
        } else {
            System.out.println("Not ArmStrong Number");
        }


    }

}


class PalindromNumber {


    public static void main(String[] args) {

        int value = 1241;

        int value1 = value;
        int newValue = 0;

        while (value != 0) {
            int rem = value % 10;
            newValue = newValue * 10 + rem;
            value /= 10;
        }
        if (value1 == newValue) {
            System.out.println("Palindrom number ");
        } else {
            System.out.println("Not Palindrom Number");
        }


    }
}


class CheckStringIsAnagram {


    public static void main(String[] args) {


        String str1 = "silent";
        String str2 = "listens";
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        System.out.println(str1Array);
        System.out.println(str2Array);
        if (Arrays.equals(str1Array, str2Array)) {
            System.out.println("The String is anagram");
        } else {
            System.out.println("The Number is Not Anagram");
        }


    }
}

class Occurance {
    public static void WithMap(String name) {
        name = name.toLowerCase();
        name = name.replaceAll("[^a-z]", "");
        Map<Character, Integer> integerIntegerMap = new HashMap<>();
        int count = 0;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            characterIntegerMap.put(name.charAt(i), characterIntegerMap.getOrDefault(name.charAt(i), count) + 1);

        }

        var entries = characterIntegerMap.entrySet();
        for (var entry : entries) {

            System.out.println(entry.getKey() + "times of char" + entry.getValue());

        }


    }


    public static void main(String[] args) {

        String name = "Aman Tiwari";

        WithMap(name);
//        name = name.toLowerCase();
//        name = name.replaceAll("[^a-z]","");
//        System.out.println(name);
//        int count = 1;
//        char [] nameArray = name.toCharArray();
//        Arrays.sort(nameArray);
//        char currentChar = nameArray[0];
//        for (int i = 1; i <nameArray.length; i++) {
//
//            if(nameArray[i] == currentChar)
//            {
//                count++;
//            }
//            else
//            {
//                System.out.println("The char is " + currentChar + "Times is : - " + count);
//                count=1;
//                currentChar = nameArray[i];
//            }
//
//        }
//        System.out.println("The char is " + currentChar + "Times is : - " + count);
//


    }
}


class RangeOfPrimeNumber {

    public static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("Please Enter start and End Number for find series");

        int start = 10;
        int end = 20;
        int sum = 0;

        for (int i = start; i < end; i++) {

            if (RangeOfPrimeNumber.primeNumber(i)) {
                System.out.println("Number is Prime --- " + i);
                sum = sum + i;
            }

        }
        System.out.println("sum = " + sum);


    }
}

class CheckStringIsPalindrom {


    public static void main(String[] args) {

        String value = "Anna";
        value = value.toLowerCase();
        String value1 = value;
        String newString = "";

        for (int i = value.length() - 1; i >= 0; i--) {

            newString = newString + value.charAt(i);
            System.out.println(newString);

        }

        if (value1.equals(newString)) {
            System.out.println("String is Palindrom");
        } else {
            System.out.println("String is not Palindrom"
            );
        }


    }
}

class FibonacciSeries {
    public static void main(String[] args) {

        int number = 10;

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < 8; i++) {

            c = a + b;
            System.out.println("This is" + i + "Number " + c);
            a = b;
            b = c;
        }


    }
}

class FibonacciSeriesWithRange {
    public static void main(String[] args) {

        System.out.println("Enter First Value and last value");

        int number = 10;
        int lastValue = 20;
        int number2 = number;
        int number3 = 0;
        System.out.println(number2);
        System.out.println(number);

        for (int i = 0; i < lastValue; i++) {

            number3 = number2 + number;
            System.out.println("This is" + i + "Number " + number3);
            number = number2;
            number2 = number3;
        }


    }
}

class SortingOfIntegers {


    public static void main(String[] args) {


        int[] arr = {10, 55, 45, 65, 56, 78, 1, 3, 5, 7};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }


        }

        for (Integer value : arr) {

            System.out.println(value);

        }


    }

}

class RemoveDuplicateElementFormArray {

    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();

        int[] arr = {10, 55, 55, 10, 55, 11, 12, 12, 10, 11, 12};

        for (Integer value : arr) {

            hashSet.add(value);
        }
        for (Integer value : hashSet) {
            System.out.println("The Non duplicate Value in the Array " + value);
        }


    }
}

class FindMinimumAndMaxNumber {

    public static void main(String[] args) {


        int[] array = {45, 10, 45, 6, 44, 15};
        Arrays.sort(array);
        System.out.println("The Minimum number is " + array[0]);
        System.out.println("The Maximum number is " + array[array.length - 1]);
        for (Integer values : array) {
            System.out.println(values);

        }

    }
}

class CheckStringAreAnagram {


    public static void main(String[] args) {


        String str1 = "silent";
        String str2 = "listen";

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        if (Arrays.equals(str1Array, str1Array)) {
            System.out.println("The String are Anagram");
        } else {
            System.out.println("Not anagram ");
        }


    }
}

class CountVowelsAndConsonants {


    public static void main(String[] args) {

        int vowelCount = 0;
        int consonantCount = 0;


        String str = "Ahamadabadjklmnopqrst";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount += 1;
            } else {
                consonantCount += 1;
            }

        }
        System.out.println("vowelCount = " + vowelCount);
        System.out.println("consonantCount = " + consonantCount);


    }
}

class RemoveSpecificElementFromArray {


    public static void main(String[] args) {


        int[] array = {10, 15, 40, 65, 70, 12};
        int[] array1 = new int[array.length - 1];
        int removeElement = 10;
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != removeElement) {
                array1[newIndex] = array[i];
                newIndex++;
            }
        }
        for (Integer value : array1) {
            System.out.println(value);

        }
    }

}

class findSecondLargestNumber {

    public static void withMethod(int[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 2]);
    }

    public static void withoutMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        System.out.println(array[array.length - 2]);


    }

    public static void main(String[] args) {


        int[] array = {10, 15, 40, 65, 70, 12};
        withMethod(array);


        int[] array1 = {10, 15, 40, 65, 70, 12};
        withoutMethod(array1);


    }
}


class MatchingElementsInArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] matchingElements = findMatchingElements(array1, array2);

        System.out.print("Matching elements: ");
        for (int element : matchingElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findMatchingElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int element : array1) {
            set.add(element);
        }

        int[] matchingElements = new int[array1.length];
        int count = 0;

        for (int element : array2) {
            if (set.contains(element)) {
                matchingElements[count++] = element;
            }
        }

        // Trim the matchingElements array to remove unused elements
        int[] result = new int[count];
        System.arraycopy(matchingElements, 0, result, 0, count);

        return result;
    }
}


class ReverseNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverseNumber = 0;
        while (number != 0) {
            int rem = number % 10;
            reverseNumber = reverseNumber * 10 + rem;
            number /= 10;
        }
        System.out.println("reverseNumber = " + reverseNumber);


    }
}

class SumOfAllElementInArray {


    public static void main(String[] args) {


        int sum = 0;
        int[] array1 = {1, 2, 3, 4, 5};

        for (Integer value : array1) {

            sum = sum + value;

        }
        System.out.println("sum = " + sum);

    }

}

class CheckStringContainsOneDigit {


    public static void main(String[] args) {


        String str = "VivekPandey";
//        str = "v";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            count++;

        }

        if (count == 1) {
            System.out.println("There is only one Char in The String");
        } else {
            System.out.println("There is more than one Char in the String");
        }


        if (str.length() == 1) {
            System.out.println("There is only one Char in The String");

        } else {
            System.out.println("There is more than one Char in the String");

        }


    }
}

class CheckStringHaveOnlyDigit {


    public static void main(String[] args) {

        int count = 1;

        String value = "12345";

        for (int i = 0; i < value.length(); i++) {

            if (value.charAt(i) == '1' || value.charAt(i) == '2' || value.charAt(i) == '3' ||
                    value.charAt(i) == '4' || value.charAt(i) == '5' || value.charAt(i) == '6' || value.charAt(i) == '7' || value.charAt(i) == '8' || value.charAt(i) == '9')
            {
                continue;
            }else
            {
                    count++;
                    break;
            }

        }

        if(count==1)
        {
            System.out.println("This String have only digits");
        }else
        {
            System.out.println("This String have String values also ");
        }


    }

}

class FindDuplicateCharInString
{


    public static void main(String[] args) {

        String str1 = "Vivek Kumar Pandey";
        str1 = str1.toLowerCase();
        str1 = str1.replaceAll("[^a-z]","");
        char [] strChar = str1.toCharArray();
        Arrays.sort(strChar);
        char currentChar = strChar[0];
        int count = 1;
        for (int i = 1; i <strChar.length; i++) {


            if(strChar[i]==currentChar)
            {
                count++;
            }else
            {
                System.out.println("The char : " + currentChar + "times" + count);
                count= 1;
                currentChar = strChar[i];
            }


        }
        System.out.println("The char : " + currentChar + " :  times" + count);










    }
}


class CheckNumberIsPerfectSquire
{

    public static void main(String[] args) {


        System.out.println("Enter value");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int sqrtNumber = (int) Math.sqrt(value);

        if(value>0)
        {
            if(value == sqrtNumber*sqrtNumber)
            {
                System.out.println("The Number is Perfect Squire");
            }else
            {
                System.out.println("number is Not perfect Squire");
            }
        }else
        {
            System.out.println("Enter Value greater Than 0");
        }


    }
}

class LongestIncreasingSubarray {
    public static int findLongestIncreasingSubarray(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
                System.out.println(maxLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 5, 7, 8, 9, 10, 1 };
        int result = findLongestIncreasingSubarray(arr);
        System.out.println("The length of the longest increasing subarray is: " + result);
    }
}

class findGCD
{

    public static int getHCM(int value1, int value2)
    {
        while (value1%value2!=0)
        {
            int rem = value1%value2;
            value1 = value2;
            value2 = rem;
        }
        int gcd = value2;
        return gcd;

    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter First Value");
        int value1 = sc.nextInt();
        System.out.println("Enter First Value");
        int value2 = sc.nextInt();
        int or1 = value1;
        int or2 = value2;

        int gct = findGCD.getHCM(value1,value2);
        System.out.println(gct);
        System.out.println(or1*or2);
        System.out.println((or1*or2)/gct);


    }

}

class LCMMultipleNumbers {
    public static int findGCD(int num1, int num2) {

        while (num1%num2!=0)
        {
            int rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        return gcd;

    }

    public static int findLCM(int num1, int num2) {
        return ((num1*num2)/findGCD(num1,num2));
    }

    public static int findLCMMultipleNumbers(int[] numbers) {
        int firstNumber = numbers[0];

        for (int i = 1; i <numbers.length; i++) {

            firstNumber = findLCM(firstNumber,numbers[i]);
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        int[] numbers = { 46, 12, 14, 15 };
        int lcm = findLCMMultipleNumbers(numbers);
        System.out.println("LCM of the numbers is: " + lcm);
    }
}


class FindLCM
{

    public static int findGCD(int number1, int number2)
    {
        while(number1%number2!=0)
        {
            int rem = number1%number2;
            number1 = number2;
            number2 = rem;
        }
        return number2;
    }

    public static int findLCM1(int [] array)
    {
        int lcm = array[0];
        for (int i = 1; i <array.length; i++) {
            lcm = ((lcm*array[i])/findGCD(lcm,array[i]));
        }

        return lcm;
    }


    public static void main(String[] args) {

        int[] array = { 46, 12, 14, 15 };
        int value = findLCM1(array);
        System.out.println(value);
    }

}
class CountFrequency
{


    public static void main(String[] args) {

        int [] array = {45,10,15,30,45,87,11};
        int count = 0;
        for (Integer value :array) {
            count++;

        }
        System.out.println(count);


    }
}
class SumOfAllDigitNumber
{


    public static void main(String[] args) {


        int number = 45897444;
        int sum = 0;
        while (number!=0)
        {
            int rem = number%10;
            sum = sum+rem;
            number /=10;
        }
        System.out.println("sum of Total Numbers is : = " + sum);


    }


}

class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6}; // Array of consecutive numbers with one missing number
        int n = arr.length + 1; // 'n' is the length of the original sequence plus one

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of the first 'n' natural numbers
        int totalSum = (n * (n + 1)) / 2;

        // Calculate the sum of the elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The difference between the total sum and array sum is the missing number
        return totalSum - arraySum;
    }
}
class FindSumOfDigit
{


    public static void main(String[] args) {

        int number = 5749774;
        int count = 0;

        while(number!=0)
        {
            int rem = number%10;
            count = count+rem;
            number /=10;
        }


        System.out.println("count = " + count);


    }
}

class FindStringPalindrom
{

    public static void main(String[] args) {

        String str1 = "civic";
        String str2 = "civic";
        String str3 = "";

        for (int i =str2.length()-1; i>=0 ; i--) {


            str3 = str3 + str2.charAt(i);
        }
        System.out.println(str3);
        if(str1.equals(str3))
        {
            System.out.println("The Given String is Palindrome");
        }else
        {
            System.out.println("String is not Palindrome String");
        }


    }
}

class FindRangePrime
{

    public static boolean checkNumber(int number)
    {

        if(number<=1)
        {
            return false;
        }

        for (int i = 2; i<number; i++) {
            if(number%i==0)
                return false;

        }
        return true;
    }

    public static void checkNumberIsPrimeInSeries(int start, int end)
    {

        int count = 0;
        for (int i = start; i <end; i++) {

            if(checkNumber(i)) {
                System.out.println("The Number is in Series" + i);
                count = count + i;
            }

        }
        System.out.println("The Total count of prime number is " + count);



    }


    public static void main(String[] args) {
        checkNumberIsPrimeInSeries(3,10);







    }
}

class ArmStrong
{


    public static void main(String[] args) {


        int number = 240;
        int number1 = number;
        int length = 0;
        int newValue = 0;

        while (number!=0)
        {
            length++;
            number /= 10;
        }

        while (number1!=0)
        {
            int rem = number1%10;
            int mul = 1;

            for (int i = 0; i <length; i++) {
                mul = mul*rem;

            }
            newValue = newValue+mul;
            number1 /=10;
        }

        System.out.println("newValue = " + newValue);


    }
}
class FindNumberIsPerfectOrNot
{
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false; // A positive integer is required for a perfect number
        }

        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == num;
    }



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }



    }
}

class MedianFinder {
    public static double findMedian(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        if (n % 2 == 0) {
            // Array length is even, so median is the average of the two middle elements.
            int mid1 = n / 2;
            int mid2 = mid1 - 1;
            return (double) (nums[mid1] + nums[mid2]) / 2.0;
        } else {
            // Array length is odd, so median is the middle element.
            int mid = n / 2;
            return (double) nums[mid];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7, 6 };
        double median = findMedian(arr);
        System.out.println("Median: " + median);
    }
}

class FindPower
{
    public static void findPower(int number, int squire)
    {
        int power = 1;
        for (int i = 1; i <=squire; i++) {

            power = power*number;
        }
        System.out.println("Total power value is " + power);
    }



    public static void main(String[] args) {



        FindPower.findPower(2,8);
    }


}
class FindOccurance
{
    public static void findOccurance(String str1)
    {
        str1 = str1.toLowerCase();
        Map <Character, Integer> integerMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i <str1.length(); i++) {

            Character ch = str1.charAt(i);
            integerMap.put(ch,integerMap.getOrDefault(ch,count)+1);

        }

        var entris = integerMap.entrySet();
        for (var entry:entris) {
            System.out.println("The Character is  " + entry.getKey() + "The times is coming"
                    + entry.getValue());

        }


    }

    public static void findOccuranceWithoutMap(String str1)
    {
        str1 = str1.toLowerCase();
        char [] strChar1 = str1.toCharArray();
        int count = 1;
        Arrays.sort(strChar1);
        char currentChar = strChar1[0];
        for (int i = 1; i <strChar1.length; i++) {

            if(strChar1[i] == currentChar)
            {
                count++;
            }else
            {
                System.out.println("The Character is  " + currentChar + "The times is coming"
                        + count);
                currentChar = strChar1[i];
                count = 1;
            }
        }
        System.out.println("The Character is  " + currentChar + "The times is coming"
                + count);








    }



    public static void main(String[] args) {

        String str1 = "Ahamdabad";
//        findOccurance(str1);
        findOccuranceWithoutMap(str1);



    }
}
class SortCharAlphabeticalOrder
{

    public static void main(String[] args) {

        String str = "Ahamdabad";
        str = str.toLowerCase();
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String original = new String(charArray);
//                Arrays.toString(charArray);
        System.out.println(original);




    }
}



class FindFirstNonDuplicateChar {
    public static char findFirstNonDuplicate(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrences of each character in the string
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeated character
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "Ahabmdabad";
        char firstNonDuplicate = findFirstNonDuplicate(str);

        if (firstNonDuplicate != '\0') {
            System.out.println("The first non-repeated character is: " + firstNonDuplicate);
        } else {
            System.out.println("No non-repeated character found in the string.");
        }
    }
}

class FindNonRepeatedCharacter
{

    public static void main(String[] args) {


        String name = "ahamdabad";
        int count = 0;
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i <name.length(); i++) {

            char ch = name.charAt(i);
            map.put(ch,map.getOrDefault(ch,count)+1);
        }

        var entries = map.entrySet();
        System.out.println(entries);
        for (var entry:entries) {
            if (entry.getValue()==1)
            {
                System.out.println("The Character are " + entry.getKey()+entry.getValue());
            }

        }
    }
}
class FindSumOfAllNumbersInArray
{
    public static void main(String[] args) {

        int[] array = {10,20,45,68,4985,11,13,45};
        int count = 0;
        for (Integer value:array) {
            if(value%2==0)
            {
                count = count+value;
            }

        }
        System.out.println(count);



    }
}

class FindCommonElementInArray
{

    public static void findInter(int [] arr1, int [] arr2)
    {
        ArrayList <Integer> integers = new ArrayList<>();
        HashSet <Integer> hashSet = new HashSet<>();
//
        for (Integer value:arr1) {
             hashSet.add(value);
        }
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        int count = 0;
        for (Integer value:arr2) {
            if(hashSet.contains(value))
            {
                integerHashMap.put(value,integerHashMap.getOrDefault(value,count)+1);
            }

        }
        var entries  = integerHashMap.entrySet();
        for (var entry:entries) {

            if(entry.getValue()>0)
            {
                System.out.println("The value is contains " + entry.getKey());
            }
        }




    }


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        findInter(arr1,arr2);




    }
}
class FindUnionInArray
{




    public static void main(String[] args) {



    }
}






































//        2. Write a program to check if a number is prime.
//
//        3. Write a program to find the factorial of a number.
//
//        4. Write a program to reverse a string.
//
//        5. Write a program to check if a string is a palindrome.
//
//        6. Write a program to find the Fibonacci series up to a given number.
//
//        7. Write a program to sort an array of integers in ascending order.
//
//        8. Write a program to remove duplicates from an array.
//
//        9. Write a program to find the maximum and minimum numbers in an array.
//
//        10. Write a program to check if two strings are anagrams.
//
//        11. Write a program to find the largest and smallest elements in an array.
//
//        12. Write a program to count the number of vowels and consonants in a string.
//
//        13. Write a program to reverse a number.
//
//        14. Write a program to check if a number is an Armstrong number.
//
//        15. Write a program to find the second largest number in an array.
//
//        16. Write a program to remove a specific element from an array.
//
//        17. Write a program to find the common elements between two arrays.
//
//        18. Write a program to find the sum of all elements in an array.
//
//        19. Write a program to check if a string contains only digits.
//
//        20. Write a program to find the duplicate characters in a string.
//
//        21. Write a program to check if a number is a perfect square.
//
//        22. Write a program to find the length of the longest increasing subarray in an array.
//
//        23. Write a program to find the GCD (Greatest Common Divisor) of two numbers.
//
//        24. Write a program to find the LCM (Least Common Multiple) of two numbers.
//
//        25. Write a program to rotate an array to the right by a given number of steps.
//
//        26. Write a program to count the frequency of each element in an array.
//
//        27. Write a program to find the missing number in an array of consecutive numbers.
//
//        28. Write a program to find the sum of digits of a number.
//
//        29. Write a program to check if a string is a valid palindrome ignoring non-alphanumeric characters.
//
//        30. Write a program to check if a number is a perfect number.
//
//        31. Write a program to find the median of an array.
//
//        32. Write a program to find the power of a number using recursion.
//
//        33. Write a program to find the number of occurrences of a character in a string.
//
//        34. Write a program to check if a string is a valid parentheses expression.
//
//        35. Write a program to sort an array of strings in alphabetical order.
//
//        36. Write a program to find the first non-repeated character in a string.
//
//        37. Write a program to find the sum of all even numbers in an array.
//
//        38. Write a program to find the number of prime numbers in a given range.
//
//        39. Write a program to find the intersection of two arrays.
//
//        40. Write a program to find the union of two arrays.
//
//        41. Write a program to check if a number is a palindrome.
//
//        42. Write a program to reverse the words in a sentence.
//
//        43. Write a program to check if a string is a valid email address.
//
//        44. Write a program to find the common characters between two strings.
//
//        45. Write a program to remove all whitespace characters from a string.
//
//        46. Write a program to find the length of the longest palindrome substring in a string.
//
//        47. Write a program to find the sum of the digits of a factorial number.
//
//        48. Write a program to remove all duplicates from a string.
//
//        49. Write a program to find the sum of the diagonal elements in a matrix.
//
//        50. Write a program to find the transpose of a matrix.
//
//        51. Write a program to find the number of trailing zeros in a factorial number.
//
//        52. Write a program to check if a number is a strong number.
//
//        53. Write a program to find the square root of a number using Newton's method.
//
//        54. Write a program to find the common elements between multiple arrays.
//
//        55. Write a program to check if a string is a valid IP address.
//
//        56. Write a program to find the sum of all prime numbers in a given range.
//
//        57. Write a program to count the number of words in a string.
//
//        58. Write a program to find the number of even and odd numbers in an array.
//
//        59. Write a program to check if a number is a perfect power.
//
//        60. Write a program to find the sum of the digits raised to the power of their position in a number.
//
//        61. Write a program to find the largest prime factor of a number.
//
//        62. Write a program to convert a binary number to decimal.
//
//        63. Write a program to find the length of the longest common prefix in an array of strings.
//
//        64. Write a program to find the sum of the squares of the digits of a number.
//
//        65. Write a program to find the sum of the series: 1 + 1/2 + 1/3 + ... + 1/n.
//
//        66. Write a program to check if a number is a palindrome in binary representation.
//
//        67. Write a program to reverse the order of words in a sentence.
//
//        68. Write a program to find the number of trailing zeros in the factorial of a number.
//
//        69. Write a program to find the number of occurrences of each character in a string.
//
//        70. Write a program to check if a string is a valid URL.
//
//        71. Write a program to find the sum of the product of corresponding elements in two arrays.
//
//        72. Write a program to find the sum of all odd digits in a number.
//
//        73. Write a program to find the sum of all numbers below a given number that are divisible by 3 or 5.
//
//        74. Write a program to find the number of ways to climb a staircase with n steps, given that you can climb either 1 or 2 steps at a time.
//
//        75. Write a program to check if a number is a strong palindrome.
//
//        76. Write a program to find the sum of all amicable numbers below a given number.
//
//        77. Write a program to check if a string is a valid ISBN number.
//
//        78. Write a program to find the number of occurrences of each word in a sentence.
//
//        79. Write a program to find the sum of all square numbers below a given number.
//
//        80. Write a program to check if a string is a valid XML tag.
//
//        81. Write a program to find the number of trailing zeros in the binary representation of a number.
//
//        82. Write a program to find the sum of all numbers that can be formed using the digits of a given number.
//
//        83. Write a program to find the sum of all amicable numbers below a given limit.
//
//        84. Write a program to check if a number is a Harshad number.
//
//        85. Write a program to find the sum of all odd Fibonacci numbers below a given number.
//
//        86. Write a program to check if a string is a valid JSON object.
//
//        87. Write a program to find the number of trailing zeros in the hexadecimal representation of a number.
//
//        88. Write a program to find the sum of all prime numbers below a given number.
//
//        89. Write a program to check if a number is a happy number.
//
//        90. Write a program to find the sum of all happy numbers below a given number.
//
//        91. Write a program to check if a string is a valid credit card number.
//
//        92. Write a program
//
//        to find the number of trailing zeros in the octal representation of a number.
//
//        93. Write a program to find the sum of the digits in the factorial of a number.
//
//        94. Write a program to check if a number is a narcissistic number.
//
//        95. Write a program to find the number of trailing zeros in the factorial of a number using a recursive approach.
//
//        96. Write a program to check if a string is a valid palindrome using a stack.
//
//        97. Write a program to find the number of trailing zeros in the binary representation of a number using bitwise operations.
//
//        98. Write a program to check if a number is a Kaprekar number.
//
//        99. Write a program to find the sum of the digits in a given number until it becomes a single-digit number.
//
//        100. Write a program to check if a string is a valid Roman numeral.
//


































































































