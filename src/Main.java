import java.lang.reflect.Array;
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


class StringManipulation
{

    public static void main(String[] args) {

        String name = "rajeevpandey";
        name = name.toLowerCase();
        char [] arrayChar =  name.toCharArray();
        char [] newCharArray = new char[arrayChar.length];

        for (int i = 0; i <arrayChar.length; i++) {

            if(arrayChar[i]>= 'a' &&  arrayChar[i]<='x')
            {
                newCharArray[i] = (char) (arrayChar[i] + 2);

            }else if (arrayChar[i] == 'y')
            {
                newCharArray[i] = 'a';
            }
            else if (arrayChar[i] == 'z')
            {
                newCharArray[i] = 'b';
            }else
            {
                newCharArray[i] = newCharArray[i];
            }



        }


        for (Character ch:newCharArray) {
            System.out.println(ch);

        }





    }
}



class AccuraciesCharacterWithMap
{
    public static void main(String[] args) {


        String name = "ShivaPandey";
        name  = name.toLowerCase();
        char [] array = name.toCharArray();
        Arrays.sort(array);
        int count = 0;

        Map <Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i <array.length ; i++) {

            characterIntegerMap.put(array[i],characterIntegerMap.getOrDefault(array[i],count)+1);
        }

        var entries = characterIntegerMap.entrySet();

        for (var entry:entries) {

            System.out.println("Total count Character " + entry.getKey()  + "Total count of Character " + entry.getValue());

        }




    }
}


class ArmStrongNumbers
{


    public static void main(String[] args) {



        int value = 370;
        int value1 = value;
        int value2 = value;
        int length = 0;
        int newValue = 0;

        while (value1!=0)
        {
            length = length+1;
            value1 /= 10;
        }
        System.out.println(length);

        while (value2!=0)
        {
            int mul = 1;
            int rem = value2%10;
            System.out.println(rem);

            for (int i = 1; i <=length ; i++) {

                mul = mul*rem;
                System.out.println(mul);

            }
            value2 /=10;
            newValue = newValue + mul;

        }

        if(value == newValue)
        {
            System.out.println("Number is Arm Strong number");
        }else
        {
            System.out.println("Not Arm Strong Number");
        }





    }
}


class PalindromNumbers
{


    public static void main(String[] args) {

        int value = 1451;
        int value1 = value;
        int value2 = value;
        int newValue = 0;


        while (value!=0)
        {
            int rem = value%10;
            newValue = newValue*10+rem;
            value /= 10;
        }
        if(newValue ==  value2)
        {
            System.out.println("The Number is Palindrom Numbers");
        }else
        {
            System.out.println("The Number is Not Palindrom Number");
        }

    }
}

class LinerSearch
{

    public static void linearSearch(int [] array, int number)
    {

        for (int i = 0; i <array.length ; i++) {

            if(array[i] == number)
            {
                System.out.println("The Number is Available in Array");
            }
        }


    }


    public static void main(String[] args) {


        int [] array = {10,20,30,40,40,50,60};

        LinerSearch.linearSearch(array,2);









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

class AddCharWithAdjacent
{


    public static void main(String[] args) {

        String nameArray = "Vivek kumar pandey";
        nameArray = nameArray.toLowerCase();
        nameArray = nameArray.replaceAll("[^a-z]","");
        System.out.println(nameArray);
        char [] nameArray1 = nameArray.toCharArray();
        char  [] newArray = new char[nameArray1.length];



        for (int i = 0; i <nameArray1.length; i++) {
            if(nameArray1[i]>='a' ||  nameArray1[i]<='x')
            {
                newArray[i] =  (char) (nameArray1[i]+2);
            } else {
                     if(nameArray1[i]=='y')
                     {
                         newArray[i] =  (char) (nameArray1[i]+2);
                     }else
                     {
                        newArray[i] = newArray[i];
                     }

            }
        }


        System.out.println(newArray);










    }




}

class PrintTotalCharInJava
{


    public static void main(String[] args) {

        String details = "My name is Vivek Kumar Pandey";
        details = details.toLowerCase();
        details = details.replaceAll("[^a-z]","");
        System.out.println(details);
        char [] details1 = details.toCharArray();
        int count = 0;
        int count1 = 0;


        for (int i = 0; i <details1.length; i++) {
                count = count+1;
                count1 += 1;

        }

        System.out.println("count = " + count);
        System.out.println("count1 = " + count1);


    }
}





















































































