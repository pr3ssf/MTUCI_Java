import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class AllInOne {
    public static void main(String [] args) {

        // 1 part
        // System.out.println("-----------Part 1-----------");
        // System.out.println(remainder(-9,45));
        // System.out.println(triArea(3, 2));
        // System.out.println(animals(2, 3, 5));
        // System.out.println(profitableGamble(0.2, 50, 9));
        // System.out.println(operation(24, 15, 9));
        // System.out.println(ctoa("\\"));
        // System.out.println(addUpTo(10));
        // System.out.println(nextEdge(8, 10));
        // System.out.println(sumOfCubes(new int[] {1, 5, 9}));
        // System.out.println(abcmath(5, 2, 1));

        // // 2 part
        // System.out.println("-----------Part 2-----------");
        // System.out.println(repeat("mice", 5));
        // System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        // System.out.println(isAvgWhole(new int[] {1, 3}));
        // System.out.println(cumulativeSum(new int[] {1, 2, 3}));
        // System.out.println(getDecimalPlaces("43.20"));
        // System.out.println(fibonacci(3));
        // System.out.println(isValid("853a7"));
        // System.out.println(isStrangePair("sparkling", "groups"));
        // System.out.println(isPrefix("automation", "auto-"));
        // System.out.println(isSuffix("arachnophobia", "-phobia"));
        // System.out.println(boxSeq(5));

        // // 3 part
        // System.out.println("-----------Part 3-----------");
        // System.out.println(solutions(new int [] {1, 0, -1}));
        // System.out.println(findZip("all zip files are zipped"));
        // System.out.println(checkPerfect(496));
        // System.out.println(flipEndChars("Cat, dog, and mouse."));
        // System.out.println(isValidHexCode("#CD5C5C"));
        // System.out.println(same(new int [] {1, 3, 4, 4, 4}, new int [] {2, 5, 7}));
        // System.out.println(isKaprekar(297));
        // System.out.println(longestZero("01100001011000"));
        // System.out.println(nextPrime(24));
        // System.out.println(rightTriangle(new int [] {145, 105, 100}));

        // // 4 part
        // System.out.println("-----------Part 4-----------");
        // System.out.println(textProcessor("10 7 hello my name is Bessie and this is my essay"));
        // System.out.println(split("((()))(())()()(()())"));
        // System.out.println(toCamelCase("hello_edabit"));
        // System.out.println(toSnakeCase("getColor"));
        // System.out.println(overTime(new String [] {"9", "17", "30", "1.5"}));
        // //TODO: refact input
        // System.out.println(BMI(new String [] {"205", "pounds", "73", "inches"}));
        // System.out.println(bugger("999"));
        // System.out.println(toStarShorthand("77777geff"));
        // System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        // System.out.println(trouble("451999277", "41177722899"));
        // System.out.println(countUniqueBooks(new String [] {"AZYWABBCATTTA", "A"}));

//        // 5 part
//        System.out.println("-----------Part 5-----------");
//        System.out.println(encrypt("Hi there!"));
//        System.out.println(decrypt("72, 33, -73, 84, -12, -3, 13, -13, -68"));
//        System.out.println(canMove("Bishop", "A7", "G1"));
//        System.out.println(canComplete("beautiful", "beautiful"));
//        System.out.println(sumDigProd(new int[] {16, 28}));
//        System.out.println(sameVowelGroup(new String[] {"toe", "ocelot", "maniac"}));
//        System.out.println(validateCard(1234567890123456l));
//        System.out.println(numToEng(10));
//        System.out.println(getSha256Hash("password123"));
//        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
//        System.out.println(hexLattice(7));

        System.out.println(bell(3)); //1
        System.out.println(translateWord("flag")); //2
        System.out.println(translateSentence("I like to eat honey waffles.")); //2
        System.out.println(validColor("rgba(255,254,255)")); //3
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[]{})); //4
        System.out.println(Arrays.toString(getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year"))); //5
        System.out.println(ulam(206)); //6
        System.out.println(longestNonrepeatingSubstring("abcbdabcbb")); //7
        System.out.println(convertToRoman(39)); //8
        System.out.println( formula("6 * 4 = 24 = 20 + 4")); //9
        System.out.println(palindromeDescendant(23336014)); //10
    }

    // 1 solve
    private static Integer remainder(int firstNumber, int secondNumber) {
        return (firstNumber%secondNumber);
    }

    // 2 solve
    private static Float triArea(float base, float height) {
        return (base * height / 2);
    }

    // 3 solve
    private static Integer animals(int chickens, int cows, int pigs) {
        return (chickens*2 + cows*4 + pigs*4);
    }

    // 4 solve
    private static Boolean profitableGamble(double prob, float prize, float pay) {
        if ((prob*prize) > pay) { /////////////
           return true;
        }
        else {
            return false;
        }     
    }

    // 5 solve
    private static String operation(int N, int a, int b){
        if (N == (a + b)) {
            return "Added";
        }
        else if (N == (a - b)) {
            return "Substracted";
        }
        else if (N == (a * b)) {
            return "Multiplied";
        }
        else if (N == (a / b)) {
            return "Devided";
        }
        else {
            return "None";
        }
    }

    // 6 solve
    private static Integer ctoa(String letter) {
         return ((int) letter.charAt(0));
    }

    // 7 solve
    private static Integer addUpTo(int num) {
        int sum = 0;
        for (int i=1; i <= num; i++ ) {
            sum = sum + i;
        }
        return sum;
    }

    // 8 solve
    private static Integer nextEdge(int firstEdge, int secondEdge) {
        return (firstEdge + secondEdge - 1);
    }

    // 9 solve
    private static Integer sumOfCubes(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        else {
            int sum = 0;
            for (int i=0; i< args.length; i++){
                sum = sum + (int) Math.pow((args[i]), 3);
            }
            return sum;
        }
    }

    // 10 solve
    private static Boolean abcmath(int a, int b, int c) {
        int sum = a;
        for (int i=0; i<2; i++) {
            sum = sum * 2;

        }
        if (sum%c == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // 11 solve
    private static String repeat(String word, int itterations) {
        String finalWord = "";
        // cycle to choose current letter
        for (int i=0; i < word.length(); i++) {
            String repeatedLetter = "";
            // cycle to repeat letter in times we have
            for (int j=0; j<itterations; j++) {
                repeatedLetter = repeatedLetter + word.charAt(i);
            }
        // add repeated letter to final word
        finalWord += repeatedLetter;
        }
        return finalWord;
    }

    // 12 solve
    private static Integer differenceMaxMin(int [] args) {
        int min = args[0];
        int max = args[0];
        for (int i=0; i<args.length; i++) {if (args[i]<min) {
            min = args[i];
            }
        }
        for (int j=0; j<args.length; j++) {if (args[j]>max) {
            max = args[j];
            }
        }
        return (max-min);
    }

    // 13 solve
    private static Boolean isAvgWhole(int [] args) {
        int sum = 0;
        for (int i=0; i<args.length; i++) {sum += args[i]; }
        // condition beetwen double and integer
        if ((double) sum/args.length == (int) sum/args.length) {return true;}
        else {return false;}
    }

    // 14 solve 
    private static String cumulativeSum(int[] args) {
        int currentSum = 0;
        int[] lateArray = new int[args.length];
        // cycle to add newcaracters in final array
        for (int i=0; i<args.length; i++) {currentSum += args[i]; lateArray[i] = currentSum;}
        // add first number in string to start cycle
        String lateWord = Integer.toString(lateArray[0]);
        // cycle to print answer in string
        for (int j=1; j<args.length; j++) {lateWord = lateWord + ", " + Integer.toString(lateArray[j]);}

        return lateWord;
    }

    // 15 solve 
    private static int getDecimalPlaces(String number) {
        for (int i=0; i<number.length(); i++) {
            // Current letter to match with coma
            String curLet = "" + number.charAt(i);
            if (curLet.equals(".")) {
                int numOfPlaces = 0;
                // if we have current letter coma, start counting letters after it
                for (int j = i+1; j<number.length(); j++) {
                    numOfPlaces += 1;
                }
                return numOfPlaces;
            }
        }
        int numOfPlaces = 0;
        return numOfPlaces;
    }

    // 16 solve 
    private static int fibonacci(int number) {
        int firstNum = 0;
        int secondNum = 1;
        int finalNum = 0;
        for (int i=0; i<number; i++) {
            finalNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = finalNum;
        }
        return finalNum;
    }

    // 17 solve 
    private static Boolean isValid(String index) {
        return index.length()>5 ? false : index.matches("^[0-9]+$");
    }

    // 18 solve
    private static Boolean isStrangePair(String firstWord, String secondWord) {
        // equails Null and Null
        if ((firstWord.length() == 0) && (secondWord.length() == 0)) {return true;}
        // equails Null and complete word
        else if ((firstWord.length() == 0) || (secondWord.length() == 0)) {return false;}
        // equails complete words
        else if (((int) firstWord.charAt(0) == (int) secondWord.charAt(secondWord.length()-1)) && ((int) firstWord.charAt(firstWord.length()-1) == (int) secondWord.charAt(0))) {
            return true;
        }
        else return false;
    }

    // 19 solve prefix
    private static Boolean isPrefix(String word, String prefix) {
        String prefixClear = prefix.substring(0, prefix.length() - 1);
        return word.startsWith(prefixClear);
    }
    // 19 colve suffix
    private static Boolean isSuffix(String word, String suffix) {
        String suffixClear = suffix.substring(1, suffix.length());
        return word.endsWith(suffixClear);
    }

    // 20 solve
    private static int boxSeq(int step) {
        if (step == 0) {return 0;}
        int sum = 1;
        for (int i=0; i<step; i=i+2) {
            sum += 2;
        }
        if (step%2==0) {return sum-1;}
        else return sum;
    }

    // 21 solve
    private static int solutions(int [] n) {
        Double diskr = Math.pow(n[1], 2) - 4*n[0]*n[2];
        if (diskr > 0) {return 2;}
        else if (diskr == 0) {return 1;}
        else return 0;
    }

    // 22 solve
    private static int findZip(String str) {
        String strToFind = str.toLowerCase();
        int trigger = 0;
        int position = 0;
        for (int i=0; i<strToFind.length()-2; i++) {
            if (( strToFind.charAt(i) == 'z') && (strToFind.charAt(i+1) == 'i') && ( strToFind.charAt(i+2) == 'p')) {
                trigger += 1;
                position = i;
            }
        }
        if (trigger <= 1) {return -1;}
        else return position;
    }

    // 23 solve
    private static Boolean checkPerfect(int number) {
        int sum = 0;
        for (int i=1; i<number-1; i++) {
            if (number%i==0) {
                sum += i;
            }
        }
        return sum==number;
    }

    // 24 solve
    private static String flipEndChars(String str) {
        if (str.length() < 2) {return "Incompatible";}
        if (str.length() == 2) {return str.substring(1, str.length()) + str.substring(0, str.length()-1);}
        else {
            if ((int) str.charAt(0) == (int) str.charAt(str.length()-1)) {
                return "Two's a pair.";
            }
            else {
                //// writing first and last letters to substring
                return str.substring(str.length()-1, str.length()) + str.substring(1, str.length()-1) + str.substring(0, 1);
            }
        }
    }

    // 25 solve
    private static Boolean isValidHexCode(String code) {
        if (code.substring(0, 1).equals("#") && code.length()==7) {
            return code.substring(1, code.length()).matches("^[0-9a-fA-F]+$");
        }
        else return false;
    }

    // 26 solve
    private static Boolean same(int [] arr1, int [] arr2) {
        // TODO: refactor this code add array to set problem
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i=0; i<arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i=0; i<arr2.length; i++) {
            set2.add(arr2[i]);
        }
        return set1.size() == set2.size();
    }

    // 27 solve
    private static Boolean isKaprekar(int n) {
    // TODO: make code simpler
     String nSquare = Integer.toString(n*n);
     int nSquareLength = nSquare.length();
     if (nSquareLength == 1) {
        return (nSquare.equals(Integer.toString(n)));
     }
     if (nSquareLength%2!=0) {
        if  (Integer.parseInt(nSquare.substring(0, nSquareLength/2)) + Integer.parseInt(nSquare.substring(nSquareLength/2, nSquareLength)) != n) {
            return false;
        }
        return true;
     }
     else {
        if  (Integer.parseInt(nSquare.substring(0, nSquareLength/2)) + Integer.parseInt(nSquare.substring(nSquareLength/2, nSquareLength)) != n) {
            return false;
        }
        return true;
     }
    }

    // 28 solve
    private static String longestZero(String line) {
        String [] str = line.split("1");
        String outputStr ="";
        for (int i=0; i<str.length; i++) {
            if (str[i].length() > outputStr.length()) {
                outputStr = str[i];
            }
        }
        return outputStr;
    }

    // 29 solve
    private static int nextPrime(int num) {
        int flag = num;
        int currentNum = num+1;
        // checking input num for prime
        for (int i=2; i<num; i++) {
            if (num%i==0) {flag = 0;}
        }
        if (flag == num) {return num;}
        // searching next prime num with infinite cycle
        while (flag != -1) {
            flag = -1;
            for (int i=2; i<currentNum; i++) {
                if (currentNum%i==0) {flag = 0;}
            }
            if (flag == -1 ) {return currentNum;}
            currentNum += 1;
        }
        return 1;
    }

    // 30 solve
    private static Boolean rightTriangle(int [] args) {
        int a = args[0];
        int b = args[1];
        int c = args[2];
        
        if (b>a) {a=args[1]; b=args[0];}
        if (c>a) {a=args[2]; c=args[1];}
        
        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }

    // 31 solve
    private static String textProcessor(String str) {
        String [] line = str.split(" ");
        int symbolCount = Integer.parseInt(line[1]);
        String outputStr = "";
        int currentCount = 0;
        for (int i=2; i<line.length; i++) {
            
            if (currentCount + line[i].length() <= symbolCount) {
                outputStr += line[i] + " ";
                currentCount += line[i].length();
            }
            else {
                currentCount = line[i].length();
                outputStr += "\n" +line[i] + " ";
            } 
        }
        return outputStr;
    }

    // 32 solve
    private static String split(String line) {
        int leftCase = 0;
        int rightCase = 0;
        String outputLine = "";
        String currentLine = "";
        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i) == '(') {leftCase += 1; currentLine += line.substring(i, i+1);}
            else if (line.charAt(i) == ')') {rightCase += 1; currentLine += line.substring(i, i+1);}

            if (leftCase == rightCase) {
                outputLine += currentLine + "\n";
                currentLine = "";
                leftCase = 0;
                rightCase = 0;
            }
        }
        return outputLine;
    }

    // 33 solve
    private static String toCamelCase(String word) {
        String outputString = "";
        int beginIndex = 0;
        int currentIndex = 0;
        while (currentIndex < word.length()-1) {
            if (word.substring(currentIndex, currentIndex+1).equals("_")) {
                outputString += word.substring(beginIndex, currentIndex) + word.substring(currentIndex+1, currentIndex+2).toUpperCase();
                currentIndex += 2;
                beginIndex = currentIndex;
                if (word.indexOf("_", currentIndex+2) == -1) {
                    return outputString += word.substring(currentIndex, word.length());
                }
            }
            else currentIndex += 1;
        }
        return outputString;
    }

    private static String toSnakeCase(String word) {
        String outputString = "";
        int currentIndex = 0;
        int beginIndex = 0;
        while (currentIndex < word.length()-1) {
            if (word.substring(currentIndex, currentIndex+1).matches("^[A-Z]+$")) {
                outputString += word.substring(beginIndex, currentIndex) + "_" + word.substring(currentIndex, currentIndex+1).toLowerCase();
                currentIndex += 1;
                beginIndex = currentIndex;

                if (!word.substring(currentIndex, word.length()-1).chars().anyMatch(Character::isUpperCase)) {
                    return outputString += word.substring(currentIndex, word.length());
                }
            }
            else currentIndex += 1;
        }
        return outputString;
    }

    // 34 solve
    private static String overTime(String [] args) {
        double beginWork = Double.parseDouble(args[0]);
        double endWork = Double.parseDouble(args[1]);
        double hourlyRate = Double.parseDouble(args[2]);
        double overRate = Double.parseDouble(args[3]);

        if (endWork > 17.00) {return "overwork " + "$" + String.valueOf((17.00-beginWork)*hourlyRate + (endWork-17.00)*hourlyRate * overRate);}
        else return "normalwork " + "$" + String.valueOf((endWork-beginWork)*hourlyRate);
    }

    // 35 solve
    private static String BMI(String [] args) {
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[2]);
        double indexBMI = 0;
        if (args[1].equals("pounds")) {weight *= 0.45;}
        if (args[3].equals("inches")) {height += 0.025;}

        double hundred = Math.pow(10, 2);
        indexBMI = Math.ceil((weight / Math.pow(height, 2)) * hundred) / hundred;

        if (indexBMI>25) {return indexBMI + " Overweight";}
        else if (indexBMI<18.5) {return indexBMI + " Underweight";}
        else return indexBMI + " Normal weight";
    }

    // 36 solve
    private static int bugger(String str) {
        int currentNum = toCalculate(str);
        int itterations = 1;
        if (str.length()==1) {return 0;}
        while (currentNum > 9) {
            itterations += 1;
            currentNum = toCalculate(Integer.toString(currentNum));
        }
        return itterations;
    }

    public static int toCalculate(String str) {
        int outputNum = 1;
        int arraySum [] = new int[str.length()];
        for (int i=0; i<str.length(); i++) {
            arraySum[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for (int i=0; i<arraySum.length; i++) {
            outputNum *= arraySum[i];
        }
        return outputNum;
    }

    // 37 solve
    static private String toStarShorthand(String lines) {
        String outputStr = "";
        int counter = 0;
        String line = lines + "0";
        for (int i=0; i<line.length()-1; i++) {
            //add first char of secuence
            if (!line.substring(i, i+1).equals(line.substring(i+1, i+2)) && counter==0) {outputStr += line.substring(i, i+1);}

            else if (line.substring(i, i+1).equals(line.substring(i+1, i+2))) {
                counter += 1;
            }
            else {outputStr += line.substring(i, i+1) + "*" + (counter+1); counter = 0;}
        }
        return outputStr;
    }

    // 38 solve 
    static private Boolean doesRhyme(String line1, String line2) {
        String lineCheck1 = line1;
        String lineCheck2 = line2;
        if (lineCheck1.substring(lineCheck1.length()-1, lineCheck1.length()).matches("[?!.]($|\\s)")) {
            lineCheck1 = lineCheck1.substring(0, lineCheck1.length()-1);
        }

        if (lineCheck2.substring(lineCheck2.length()-1, lineCheck2.length()).matches("[?!.]($|\\s)")) {
            lineCheck2 = lineCheck2.substring(0, lineCheck2.length()-1);
        }
        
        if (lineCheck1.substring(lineCheck1.length()-2, lineCheck1.length()).equals(lineCheck2.substring(lineCheck2.length()-2, lineCheck2.length()))) {
            return true;
        }
        else return false;
    }

    // 39 solve
    private static Boolean trouble(String first, String second) {
        int numChar = 0;
        for (int i=0; i<first.length()-2; i++) {
            if ((first.charAt(i) == first.charAt(i+1)) && (first.charAt(i) == first.charAt(i+2))) {
                numChar = first.charAt(i);
            }
        }
        if (numChar == 0) {return false;}
        // second cycle to check the char in second word of num wich repeats 3 times in first word else return false 
        for (int i=0; i<second.length()-1; i++) {
            if ((second.charAt(i) == numChar) && (second.charAt(i+1) == numChar)) {
                return true;
            }
        }
        return false;
    }

    // 40 solve ???????? ???????? ?? ?????????????????? ?? ???????????? ???????????????? ?????????? ?????????????? ?? ?????????????????? ???? ??????????????????
    private static int countUniqueBooks(String [] args) {
        String[] strArray = args[0].split("");
        Set<String> s = new HashSet<String>();
        int counter = 0;
        for (int i=0; i<strArray.length; i++) {
            if (strArray[i].equals(args[1])) {
                counter += 1;
            }
            if (counter%2!=0) {
                s.add(strArray[i]);
            }
        }
        return s.size()-1;
    }

    //41 solve 
    private static String encrypt(String args) {
        String outputString = String.valueOf((int) args.charAt(0));
        for (int i=1; i<args.length(); i++) {
            outputString += " " + (args.charAt(i) - args.charAt(i-1));
        }
        return outputString;
    }

    private static String decrypt(String args) {
        String[] toDecr = args.split(", ");
        //char firstLetter = (char)Integer.parseInt(toDecr[0]);
        String outputString = "";
        
        for (int i=0; i<toDecr.length+1; i++) {
            int letter = 0;
            for (int j=0; j<i; j++) {
                letter += Integer.parseInt(toDecr[j]);
            }
            outputString += (char) letter;
        }
        return outputString;
    }

    //42 solve TODO: refact
    private static boolean canMove(String p, String c, String t) {
        // ?????????? +
        if (p.equals("pawn")) {
            if (c.charAt(0) == t.charAt(0)) {

                if (c.charAt(1) == '2' && t.charAt(1) == '4') {
                    return true;
                }

                if (c.charAt(1) == '7' && t.charAt(1) == '5') {
                    return true;
                }

                if (Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 1) {
                    return true;
                }
            }
        }

        //???????? +
        if (p.equals("bishop")) {
            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == Math.abs((int) c.charAt(1) - (int) t.charAt(1))) {
                return true;
            }
        }

        //?????????? +
        if (p.equals("rook")) {
            if (c.charAt(0) == t.charAt(0) || c.charAt(1) == t.charAt(1)) {
                return true;
            }
        }

        //???????? +
        if (p.equals("knight")) {

            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == 2 && Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 1) {
                return true;
            }
            if (Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 2 && Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == 1) {
                return true;
            }
        }

        //????????????
        if (p.equals("king")) {
            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) <= 1 && Math.abs((int) c.charAt(1) - (int) t.charAt(1)) <= 1) {
                return true;
            }
        }

        //????????????????
        if (p.equals("queen")) {
            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == Math.abs((int) c.charAt(1) - (int) t.charAt(1))) {
                return true;
            }
            if (c.charAt(0) == t.charAt(0) || c.charAt(1) == t.charAt(1)) {
                return true;
            }
        }
        return false;
    }

    //43 solve
    private static Boolean canComplete(String small, String full) {
        int flag = 0;
        for (int i=0; i<full.length(); i++) {
            if (small.charAt(flag) == full.charAt(i))
                flag++;
        }
        if (flag == small.length())
            return true;
        else 
            return false;
    }

    //44 solve 
    private static int sumDigProd(int[] args) {
        int sum = 0;
        for (int i = 0; i<args.length;i++)
            sum += args[i];
        
        while (sum>9) {
            String num = Integer.toString(sum);
            sum = 1;
            for (int i = 0; i<num.length();i++) {
                sum *= Integer.parseInt(String.valueOf(num.charAt(i)));
            }
        }
        return sum;
    }

    //45 solve 
    private static String sameVowelGroup(String [] args) {
        String outputString = "";
        char[] firsChars = args[0].toCharArray();
        Set<Character> vow = new HashSet<>();
        // vow in first word which is base
        for (char _let : firsChars) {
            if (_let == 'a' || _let == 'e' || _let == 'i' || _let == 'o' || _let == 'u' || _let == 'y') {
                vow.add(_let);
            }
        }

        // vow in later words comparison

        // first circle on all later words
        for (String _str : args) {
            boolean flag = true;
            // second circle on letters in each word
            for (char _let : _str.toCharArray()) {
                if (_let == 'a' || _let == 'e' || _let == 'i' || _let == 'o' || _let == 'u' || _let == 'y') {
                    if (!vow.contains(_let)) {
                        flag = false;
                        break;
                    }
                }
            }
            // building output string
            if (flag) {outputString += _str + " ";}
        }
        return outputString;
    }

    //46 solve
    private static Boolean validateCard(Long number) {

        int numLength = String.valueOf(number).length();
        if ((numLength<14) || (numLength>19)) {return false;}
        
        int lastN = (int) (number%10);
        number /= 10;
        StringBuilder strNumber = new StringBuilder(String.valueOf(number)).reverse();

        int currChange = 0;
        for (int i = 0; i < strNumber.length(); i += 2) {
            currChange = Integer.parseInt(strNumber.charAt(i) + "") * 2;
            
            strNumber.replace(i, i + 1, String.valueOf(currChange));
        }
        currChange = 0;
        for (char x : strNumber.toString().toCharArray()) {
            currChange += Integer.parseInt(x + "");
        }

        return ((10 - (currChange % 10)) == lastN);
    }   

    //47 solve 
    private static String numToEng(int n) {
        String[] d0_9 = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] d10_19 = { "ten", "eleven", "twelve", "thirten", "fourten", "fifteen", "sixteen", "seventeen", "eighten", "nineteen" };
        String[] d20_90 = { "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String num = Integer.toString(n);

        int dCount = num.length();

        // for 1 length
        if (dCount == 1) {return d0_9[Integer.parseInt(num)];}
        // for 2 length
        if ((dCount == 2) && (n < 20)) {return d10_19[Integer.parseInt(num.substring(1, 2))];}
        //for other 2 length
        if ((dCount == 2) && (num.charAt(1) == '0') && (n>19)) {return d20_90[Integer.parseInt(num.substring(0, 1))-1];}
        // for 3 length
        if (dCount == 3) {
            StringBuilder sb = new StringBuilder();
            int[] digits = new int[3];
            int k = 0;
            // separating on each letter
            while (n != 0) {
                digits[k] = n % 10;
                n = n / 10;
                k++;
            }
            // creating ENG for hundred position
            sb.append(d0_9[digits[2]]).append(" hundred ");
            if (digits[1] == 1) {
                int c = digits[1] + digits[2];
                sb.append(d10_19[c]);
                return sb.toString();
            }
            // creating ENG for ten and one position
            if (digits[1] > 1)
                sb.append(d20_90[digits[1] - 1]).append(" ");
            if (digits[0] > 0)
                sb.append(d0_9[digits[0]]);
            return sb.toString();
        }
        return "";
    }

    //48 solve
    private static String getSha256Hash(String msg) {
        String result = "";
        // importing class
        MessageDigest md;
        try {
            // added
            md = MessageDigest.getInstance("SHA-256");
            byte[] hashes = md.digest(msg.getBytes());
            for (int i = 0; i < hashes.length; i++) {
                String hex = Integer.toHexString(0xff & hashes[i]);
                if (hex.length() == 1)
                    result += 0;
                result += hex;
            }
            // ?????????????????? ???????????????????? ??????????????????
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    //49 solve
    private static String correctTitle(String str) {
        String[] strings = str.split(" ");
        String output = "";

        // first cycle for preparing and building output string
        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                output += " ";
            }
            String[] _strings = strings[i].split("-");

            for (int j = 0; j < _strings.length; j++) {
                if (j > 0) {
                    output += "-";
                }
                // ignore special words
                if (_strings[j].equalsIgnoreCase("and")
                        || _strings[j].equalsIgnoreCase("the")
                        || _strings[j].equalsIgnoreCase("of")
                        || _strings[j].equalsIgnoreCase("in")) {
                    output += _strings[j].toLowerCase();
                } else {
                    // uppercase for else each word
                    output += _strings[j].substring(0, 1).toUpperCase();
                    output += _strings[j].substring(1).toLowerCase();
                }
            }
        }

        return output;
    }

    //50 solve
    private static String hexLattice(int n) {
        int i = 0;
        boolean isHex = false;
        // aquare our numbers
        while (3 * i * (i + 1) + 1 <= n) {
            if (3 * i * (i + 1) + 1 == n)
                isHex = true;
            i++;
        }
        String str = "";
        if (isHex) {
            int l = i;
            int m = i;
            String str2;
            for (int j = 0; j < 2 * i - 1; j++) {
                str += "\n";
                str2 = "";
                for (int k = 1; k < m; k++) {
                    str2 += " ";
                }
                str += str2;
                for (int k = 0; k < l; k++) {
                    str += " o";
                }
                str += str2 + " ";
                l += (j < i - 1) ? 1 : -1;
                m += (j < i - 1) ? -1 : 1;
            }
            str = str.replaceFirst("\n", "");
            return str;
        } else
            return "Invalid";
    }


    // 51 solve
    public static int bell(int n) { //Bell number (an array of n elements can be split into non-empty subsets)
        int[] sets = new int[n];
        int previous;
        int cur;
        sets[0] = 1;
        // iterating through all values in number pieces
        for (int i=1; i<n; ++i) {
            previous = sets[0];
            sets[0] = sets[i - 1];
            for (int j=1; j<=i; ++j) {
                cur = sets[j];
                sets[j] = sets[j-1] + previous;
                previous = cur;
            }
        }
        return sets[n - 1];
    }

    // 52.1 solve
    public static String translateWord(String a) { //translate into pig Latin
        StringBuilder res = new StringBuilder();
        StringBuilder cons = new StringBuilder();
        int k=0;
        // if first letter is vowel then put yay in the tale
        if (isVowel(a.charAt(0))) {
            res.append(a).append("yay");
        }
        else {
            // calculating num of not vowel letters in the head of the word
            for (int i=0; i<a.length(); i++) {
                if (!isVowel(a.charAt(i))) cons.append(a.charAt(i));
                else {
                    k = i;
                    break;
                }
            }
            // put all not vowel letters in the last part
            for (int i=k; i<a.length(); i++) {
                res.append(a.charAt(i));
            }
            res.append(cons).append("ay");
        }
        return(res.toString());
    }

    // 52.2 solve
    public static String translateSentence(String a) { // translating a sentence
        // condition for comas and etc
        String newA = a.replaceAll("[.?!]", "");
        // split on each word
        String[] words = newA.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word: words) {
            // translating each word in sentence
            res.append(translateWord(word) + " ");
        }
        res.deleteCharAt(res.length()-1); // deleting last whitespace
        res.append(a.charAt(a.length()-1));
        return(res.toString());
    }

    // 52 - reusage to find vowel item in first place in word
    public static boolean isVowel(Character a) {
        String strA = a.toString().toLowerCase();
        if ("a".equals(strA) || "i".equals(strA) || "o".equals(strA) || "e".equals(strA) || "u".equals(strA))
            return true;
        else return false;
    }

    // 53 solve
    public static boolean validColor(String s){ // right format for RGBA
        // split to 3 or 4 expressions to check
        String[] opt = (s.substring(s.indexOf("(") + 1, s.indexOf(")"))).split(",");
        int optInt = 0;
        double optDoub = 0;
        // condition to check type RGBA or RGB
        if (s.contains("rgba") && opt.length != 4)
            return false;
        if (s.contains("rgb") && opt.length != 3)
            return false;
        for (String cur : opt) {
            if ("".equals(cur))
                return false;
            if (cur.contains("."))
                optDoub = Double.valueOf(cur);
            else optInt = Integer.valueOf(cur);
            if (!s.contains("rgba") && cur.contains("."))
                return false;
            if (optInt<0 || optInt>255)
                return false;
            if (s.contains("rgba") && (cur.contains(".") && optDoub>1.0 || (cur.contains(".") && optDoub<0)))
                return false;
        }
        return true;
    }

    // 54 solve
    public static String stripUrlParams(String url, String[] paramsToStrip) { // deleting recurring params
        // if no any params return url
        if (!url.contains("?"))
            return url;
        // deleting recurring params
        else {
            StringBuilder res = new StringBuilder();
            String[] request = url.split("\\?");
            res.append(request[0]).append("?");
            String[] params = request[1].split("&");
            HashMap<String, String> map = new HashMap<>();
            for (String i : params) {
                String[] val = i.split("=");
                map.put(val[0], val[1]);
            }
            HashSet<String> noRepeat = new HashSet<>();
            noRepeat.addAll(Arrays.asList(paramsToStrip));
            int k = 1;

            // building end word
            for (String key : map.keySet()) {
                if(!noRepeat.contains(key)){
                    if(k > 1)
                        res.append("&");
                    res.append(key).append("=").append(map.get(key));
                    k++;
                }
            }
            return res.toString();
        }
    }

    // 55 solve
    public static String[] getHashTags(String a) { // transform 3 longest words into hashtags
        // split to each word
        a = a.replaceAll(",", "");
        String[] arr = a.split(" ");
        int k = 0;
        int maxLenght = 0;
        StringBuilder maxWord = new StringBuilder();
        StringBuilder res = new StringBuilder();
        // condition of less than 3 words
        if (arr.length < 3) {
            for (String word : arr)
                res.append("#").append(word.toLowerCase()).append(",");
        }
        else {
            // calc words
            for (int i=0; i<3; i++) {
                for (int j=0; j<arr.length; j++) {
                    if (arr[j].length() != maxLenght) {
                        if(arr[j].length() >= maxLenght){
                            maxLenght = arr[j].length();
                            maxWord = new StringBuilder(arr[j].toLowerCase());
                            k = j;
                        }
                    }
                }
                // build words
                arr[k] = " ";
                res.append("#").append(maxWord).append(",");
                maxLenght = 0;
            }
        }
        String[] resArr = res.toString().split(",");
        return resArr;
    }

    // 56 solve
    public static int ulam(int n) {
        ArrayList<Integer> ulam = new ArrayList<>();
        ulam.add(1);
        ulam.add(2);
        int i;
        int j;
        for (i=3, j=2; j<n; i++) {
            int m = 0;
            for (int k=0; k<ulam.size()-1; k++) {
                for (int l = k + 1; l < ulam.size(); l++) {
                    if (ulam.get(k) + ulam.get(l) == i)
                        m++;
                    // conditions to check number of ways to do num
                    if (m > 1)
                        break;
                }
                if (m > 1)
                    break;
            }
            if (m == 1) {
                ulam.add(i);
                j++;
            }
        }
        return i - 1;
    }

    // 57 solve
    public static String longestNonrepeatingSubstring(String a) { // longest substring
        StringBuilder res = new StringBuilder();
        StringBuilder cur = new StringBuilder();
        for(int i=0; i<a.length(); ++i) {
            for (int j=i; j<a.length(); ++j) {
                if (!cur.toString().contains(String.valueOf(a.charAt(j))))
                    cur.append(a.charAt(j));
                else {
                    if (cur.length() > res.length())
                        res = new StringBuilder(cur);
                    cur = new StringBuilder();
                    break;
                }
            }
        }
        return (res.toString());
    }

    // 58 solve
    public static String convertToRoman(int num) { // translate into roman
        StringBuilder res = new StringBuilder();
        // translate each discharge
        while(num != 0){
            if(num >= 1000){
                num -= 1000;
                res.append("M");
            }
            else if(num >= 900){
                num -= 900;
                res.append("CM");
            }
            else if(num >= 500){
                num -= 500;
                res.append("D");
            }
            else if(num >= 400){
                num -= 400;
                res.append("CD");
            }
            else if(num >= 100){
                num -= 100;
                res.append("C");
            }
            else if(num >= 90){
                num -= 90;
                res.append("XC");
            }
            else if(num >= 50){
                num -= 50;
                res.append("L");
            }
            else if(num >= 40){
                num -= 40;
                res.append("XL");
            }
            else if(num >= 10){
                num -= 10;
                res.append("X");
            }
            else if(num >= 9){
                num -= 9;
                res.append("IX");
            }
            else if(num >= 5){
                num -= 5;
                res.append("V");
            }
            else if(num >= 4){
                num -= 4;
                res.append("IV");
            }
            else if(num > 0){
                num -= 1;
                res.append("I");
            }
        }
        return res.toString();
    }

    // 59 solve
    public static boolean formula(String a) { // check formula to rightness
        String[] values = a.split("=");
        for (int i=0; i<values.length-1; i++) {
            // condition to return
            if (calc(values[i]) != calc(values[i+1]))
                return false;
        }
        return true;
    }

    public static int calc(String a) { // processing mathematics
        String newA = a.replaceAll(" ", "");
        String[] val;
        if (newA.contains("*")) {
            val = newA.split("\\*");
            return (Integer.parseInt(val[0]) * Integer.parseInt(val[1]));
        }
        if (newA.contains("+")) {
            val = newA.split("\\+");
            return (Integer.parseInt(val[0]) + Integer.parseInt(val[1]));
        }
        if (newA.contains("/")) {
            val = newA.split("/");
            return (Integer.parseInt(val[0]) / Integer.parseInt(val[1]));
        }
        if (newA.contains("-")) {
            val = newA.split("\\-");
            return (Integer.parseInt(val[0]) - Integer.parseInt(val[1]));
        }
        else return Integer.parseInt(newA);
    }

    // 60 solve
    public static boolean palindromeDescendant(int num) { //palindrome
        boolean symmetrical = false;
        while (num > 9) {
            // condition to palindrome and break
            if (symmetrical(num)) {
                symmetrical = true;
                break;
            }
            num = sumDigits(num);
        }
        return symmetrical;
    }

    public static boolean symmetrical(int num) { // symmetry
        int reversenum = 0;
        int n = num;
        if (n < 0)
            n *= -1;
        while (n != 0) {
            reversenum *= 10;
            reversenum += n%10;
            n /= 10;
        }
        return (reversenum == num);
    }

    // do if not symmetrical
    public static int sumDigits(int n) { // sum neighbor digits
        String strN = Integer.toString(n);
        StringBuilder res = new StringBuilder();
        for(int i=0; i<strN.length()-1; i+=2) {
            int cur1 = Integer.parseInt(Character.toString(strN.charAt(i)));
            int cur2 = Integer.parseInt(Character.toString(strN.charAt(i+1)));
            int sum = cur1 + cur2;
            res.append(Integer.toString(sum));
        }
        return Integer.parseInt(res.toString());
    }
}