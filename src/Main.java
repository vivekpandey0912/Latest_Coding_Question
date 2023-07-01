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

        LocalDate localDate = LocalDate.of(year,month,day);
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
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
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

class Player{
    String name;
    int score;

    Player(String name, int score){
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

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}


// Write a program to sort with comparator if cgpa is same then compare with name if name is
// then compare with id
class Student{
    private int id;
    private String fname;
    private double cgpa;
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
class Solution3
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, new Comparator<Student>()
        {
            public int compare(Student a, Student b)
            {
                if(a.getCgpa()==b.getCgpa())
                {
                    if(a.getFname().equals(b.getFname()))
                    {
                        return a.getId()-b.getId();
                    }else{
                        return a.getFname().compareTo(b.getFname());
                    }
                }
                return (int) (b.getCgpa()*1000 - a.getCgpa()*1000);
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}


// Check Two String with anagrams
class Anagram {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char a1[] = a.toCharArray();
        char b1 [] = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1,b1))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
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

class OccuranceOfCharacters
{


    public static void main(String[] args) {

        String str = "Ahamdabad";
        str = str.toLowerCase();
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        char currentChar = charArray[0];
        int count = 1;
        for (int i = 1; i <charArray.length; i++) {
            if(currentChar == charArray[i])
            {
                    count++;
            }else
            {
                System.out.println("The Counts of Char is " + currentChar + "times" + count);
                count = 1;
                currentChar = charArray[i];
            }

        }
        System.out.println("The Counts of Char is " + currentChar + "times" + count);


    }

}

// 7. Occurance of Character in Integer in array

class OccuranceOfInteger
{


    public static void main(String[] args) {

        int integerValue = 478982175;
        String integerLength = String.valueOf(integerValue);
        char [] integerArray = new char[integerLength.length()];

        for (int i = 0; i <integerLength.length(); i++) {

            integerArray[i] = integerLength.charAt(i);
            System.out.println(integerArray[i]);
        }

        Arrays.sort(integerArray);
        System.out.println(integerArray);
        char currentChar = integerArray[0];
        int count = 1;
        for (int i = 1; i <integerArray.length; i++) {
            if(currentChar == integerArray[i])
            {
                count++;
            }else
            {
                System.out.println("The Counts of Char is " + currentChar + "times" + count);
                count = 1;
                currentChar = integerArray[i];
            }

        }
        System.out.println("The Counts of Char is " + currentChar + "times" + count);


    }

}

// 8. Remove Duplicate Elements from Integer Arraylist


class IntegerArrayList
{


    public static void main(String[] args) {


        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(11);
        arrayList.add(14);
        arrayList.add(17);
        arrayList.add(17);
        arrayList.add(70);

        HashSet <Integer> integerHashSet = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(integerHashSet);
        for (Integer integer: arrayList) {

            System.out.println(integer);

        }





    }
}

//9. How to reverse String

class ReverseString
{
    public static void revereStringWithMethod(String str)
    {
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }
    public static void reverseStringWithoutMethod(String str)
    {
        String newValue = "";
        for (int i = str.length()-1; i>=0; i--) {

            newValue  = newValue + str.charAt(i);
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


class ReverseInteger
{

    public static void main(String[] args) {

        int integerValue = 458744444;
        String value = String.valueOf(integerValue);
        for (int i = value.length()-1; i >=0 ; i--) {

            System.out.println(value.charAt(i));

        }






    }


}



