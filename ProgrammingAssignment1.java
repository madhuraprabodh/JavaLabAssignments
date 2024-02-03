class SY2022bit043{

    public static char[][] arr2 = new char[5][]; // Creating a 2D character array to store char arrays
    public static int validCount = 0; // Variable to count valid registration numbers

    public static void main(String[] args) {
        validator();
        getValidRegistrationsCount();
        System.out.println("Number of valid registration numbers: " + validCount);
    }

    public static void validator() {
        // String array containing sample string elements
        String[] stringArray = {"2022bit043", "2022bcs093", "2023bme503","bcs2022078","2022bme098"};//"2023bcs567","ubhn678","789imnhtr4","2000bme765","2345bch908"};

        // Using a for loop to access each string array element
        for (int i = 0; i < stringArray.length; i++) {
            String str = stringArray[i]; // Accessing the current string element

            // Converting the string element to a character array
            char[] charArray = str.toCharArray();
            arr2[i] = charArray; // Storing the character array in arr2
        }
    }

    public static int count(char[] arr) {
        // finding the number of elements in the string
        return arr.length;
    }
    public static int one(char[] arr) {
           if (arr[0] == '2'&& arr[1]=='0') {
           return 8;}
           
           return 0;
           
         }  
    public static int firstFour(char[] arr) {
        // finding that first four array elements are digits
        
       
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(arr[i])) {
                return 0;
            }
        }
        return 1;
    }

    public static int b(char[] arr) {
        // finding that fifth letter is 'b'
        if (arr[4] == 'b') {
            return 2;
        }
        return 0;
    }

    public static int letter(char[] arr) {
        // finding that sixth and seventh are letters
        if ((arr[5]=='i'&&arr[6]=='t')|| (arr[5]=='c'&&arr[6]=='h')||(arr[5]=='c'&&arr[6]=='s')||(arr[5]=='m'&&arr[6]=='e')){
            return 3;
        }
        return 0;
    }

    public static int last(char[] arr) {
        // finding the last 3 elements are digits
        if (Character.isDigit(arr[7]) && Character.isDigit(arr[8]) && Character.isDigit(arr[9])) {
            return 4;
        }
        return 0;
    }

    public static void getValidRegistrationsCount() {
        for (char[] regNo : arr2) {
            int reg = count(regNo);
            int four = firstFour(regNo);
            int five = b(regNo);
            int letter1 = letter(regNo);
            int last1 = last(regNo);
            int one1 =one(regNo);

            if (reg == 10 && four == 1 && five == 2 && letter1 == 3 && last1 == 4&& one1==8) {
                validCount++; // Increment the count of valid registration numbers
                //System.out.println("VALID: " + new String(regNo)); // Print the valid registration number
          //  } else {
               // System.out.println("INVALID: " + new String(regNo)); // Print the invalid registration number
            }
        }
    }
}

