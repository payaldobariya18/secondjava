public class StringPractice {
    // non static method
// create an object for class StringPractice
    static StringPractice stringPractice = new StringPractice();

    public static void main(String[] args)
    {
        stringPractice.concatenate01("Java And", "Testing");
        stringPractice.contains02("Java and Testing", "and" );
        stringPractice.removepecialsymbole03("OLD:Java++^^and&&Testing**","NEW: Java and Testing");
        stringPractice.endswith04("Java Modifiers", "Java Modifier","er" );
        stringPractice.compare05("Waterfall Model","Agile Methodology", "waterfall model");
        extractnumber06();
        lenght07();
        startswith08();
        substring09();
        replace10();
    }
    void concatenate01(String name, String surname)
    {
        System.out.println(" string 1 : " + name);
        System.out.println(" string 2 : " + surname);
        System.out.println("The concatenated string : " + name + " " + surname);
        // the concatenation of name surname
    }
    void contains02(String title, String Subtitle) {
        System.out.println("original String: " + title);
        //want to write Original String: Answer
        System.out.println("Specified sequence of char values: " + Subtitle);
        // want to write Specified sequence of char value: and
        System.out.println(title.contains(Subtitle));
    }
    void removepecialsymbole03(String str, String result)
    {
        System.out.println(str);
      //str = answer
       System.out.println(result);
       // result = answer
        System.out.println(str.replaceAll("[-+.^:,]", " " ));
    }

    void endswith04(String first, String second, String third)
    {
        // Check two Strings end with third
        boolean ends1 = first.endsWith(third);
        boolean ends2 = second.endsWith(third);
       System.out.println("\"" + first + "\" ends with " + "\"" + third + "\"? " + ends1);
       // to print "Java Modifiers" ends with "er" ?
        System.out.println("\"" + second + "\" ends with " + "\"" + third + "\"? " + ends2);
    }

    void compare05(String colum01, String colum02, String colum03)
    {
        // compare given string to another string
        boolean line = colum01.equalsIgnoreCase(colum02);
        boolean subline = colum01.equalsIgnoreCase(colum03);
        System.out.println("\"" + colum01 + "\" equals \" " + colum02 + "\"? " + line);
        // to print "Waterfall Model" equals "Agile Methodology"?
        System.out.println("\"" + colum01 + "\" equals \" " + colum03 + "\"? " + subline);
        // to print "waterfall Model" equals "waterfall methodology"?
    }
     static void extractnumber06()
     {
       String input = "909My384 name is6345634  Frozen47563";

       System.out.println(input);

       System.out.println(input.replaceAll("\\D+",""));
     }

     static void lenght07()
    {
        String name = "education.com";//initiating String object name
        int length = name.length();//Calling the inbuilt Length() method
        System.out.println(name);
        System.out.println("The string length of \""+name+"\" is : " + length);
    }
    static void startswith08()
    {
       String str1 = "Simla is my favourite place.";
       String str2 = "Manali is also my favourite place.";
       String answer = "Simla";
       boolean answer1 = str1.startsWith(answer);
       boolean answer2 = str2.startsWith(answer);
      System.out.println(str1 + " starts with " + answer + " ? " + answer1);
      System.out.println(str2 + " starts with " + answer + " ? " + answer2);
    }

      static void substring09()
      {
        String str = "There was a heavy rainfall on yesterday";
        //Get a substring of the above string from
        // index 10 and ending at index 26
        String sub = str.substring(10,26);
        System.out.println("Old = " + str);// Disply two strings for coparison
        System.out.println("New = " + sub);
      }

      static void replace10()
      {
       String str = "My homework is done ";
       // replace all the 'o'character with 'A' character
       String last = str.replace('o', 'A');
       //display the strings for comparison
       System.out.println("Old : " + str);
       System.out.println("New : " + last);


      }


   }