public class Lesson13 {

    public static void main(String[] args) {
        String firstString = "abc";
//        String errorString = 'asd';
        String secondString = "abc";
        String loremIpsumString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Mattis pellentesque id nibh tortor id. Diam volutpat commodo sed egestas egestas. Suspendisse faucibus interdum posuere lorem ipsum dolor sit amet. Tellus elementum sagittis vitae et leo duis ut diam. Sed id semper risus in hendrerit gravida rutrum quisque. Sed id semper risus in. Malesuada fames ac turpis egestas maecenas pharetra convallis posuere morbi. Ullamcorper dignissim cras tincidunt lobortis feugiat vivamus at. Dolor morbi non arcu risus quis varius. Tristique sollicitudin nibh sit amet commodo nulla facilisi. Vel risus commodo viverra maecenas accumsan.";

        // LENGTH
        System.out.println("Length of Lorem Ipsum string is: " + loremIpsumString.length());

        System.out.println("Character at position 159 is: " + loremIpsumString.charAt(159));

        System.out.println("These two variables are NOT identical: " + firstString.equals(loremIpsumString));

        System.out.println("These two variables are identical: " + firstString.equals(secondString));

        String lowerCasename = "artjomS";
        String capitalCaseName = "Artjoms";

        System.out.println("Case sensitive equals method: " + lowerCasename.equals(capitalCaseName));
        System.out.println("Case IN-sensitive equals method: " + lowerCasename.equalsIgnoreCase(capitalCaseName));


        // REGEX + matches()
        loremIpsumString.matches("Lorem.*");
        System.out.println("This should match a word - Lorem " + loremIpsumString.matches("Lorem.*"));

        // REGEX start of the string
        loremIpsumString.matches("^Lorem.*");
        // REGEX ends with some text
        loremIpsumString.matches("Lorem$");

        // 3rd character+ == Lorem, like "ABLorem ipsum"
//        loremIpsumString.matches("\w\wLorem");

//        System a > System b some data
        String measurmentA = "10";
//        measurmentA++;
//        measurmentA + 5;
        // Will cause an error, because it is a String.
        // Cannot do math


        // PARSING
        byte parsedMeasurmentA = Byte.parseByte(measurmentA);

        // We will have 10 in the var
        System.out.println("Measurement was: " + parsedMeasurmentA);
        System.out.println(" Doubled measurement is " + parsedMeasurmentA * 2);

        String measurementB = "105.214567";

        double parsedmeasurementB = Double.parseDouble(measurementB);

        System.out.println("parsed double is: " + parsedmeasurementB);

        // Throws an error
//        String measurementC = "105.1234 Error. Error. Something is wrong";
//        double erroredMeasurement = Double.parseDouble(measurementC);

//        System.out.println("Errored measurement: " + erroredMeasurement);


        if (firstString.charAt(0) == 'a') {
            System.out.println("Variable starts with letter a");
        } else {
            System.out.println("Variable does not start with a letter a");
        }

        String trueVariable = "true";

        if (Boolean.parseBoolean(trueVariable)) {
            System.out.println("Variable trueVariable consists of TRUE");
        }

        String falseVariable = "false";
        if (Boolean.parseBoolean(falseVariable)) {
            System.out.println("This condition will never execute");
        } else {
            System.out.println("but this condition will execute");
        }

        if (true) {
            System.out.println("Tis will be ALWAYS executed");
        }

        if (false) {
            System.out.println("Will never be executed");
        }

        String numberString = "1 25 100 20000 bc 123";


        // FORMATTING
        System.out.println(String.format("This is a simple text. And this is a floating number %f. Cool! Right?",
                108.2345f));

        // 2 digits after a comma
        float float2Digits = 20123.1234567890f;
        System.out.println(String.format("here are 2 digits after a comma : %.2f", float2Digits));

        System.out.println(String.format("here are 2 digits after a comma : %.3f", float2Digits));


        // %s - string
        // %c - char
        // %d - decimal ( int, byte, short ... )
        // %f - Float
        char myChar = 'Z';
        short myShort = 1900;
        String myString = "My String";

        System.out.println(String.format("String: %s, Decimal: %d, Char: %c", myString, myShort, myChar));

        // NULL and REFERENCES
        String myname = "Artjoms";

        // Art - &123
        // joms - &124

        myname = null;

        System.out.println("My name is " + myname);

        // REGEX EXAMPLE
        String bankIBAN1 = "LV30UNLA0987654321231";
        String bankIBAN2 = "LV300UNLA098765432123";

        if (bankIBAN1.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")) {
            System.out.println("Bank IBAN1 is correct");
        }
//true
        if (bankIBAN2.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}")) {
            System.out.println("IBAN 2 is correct");
        } else {
            System.out.println("IBAN 2 is incorrect");
        }
//false

    }
}
