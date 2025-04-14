public class PrintCombinations {

    public static void main(String[] args) {
        String str = "abc";

        for (int length = 1; length <= 3; length++) 
        {
            for (int i = 0; i < str.length(); i++) 
            {
                if (length == 1) 
                {
                    System.out.println(str.charAt(i));
                }
                for (int j = 0; j < str.length(); j++) 
                {
                    if (length == 2 && i != j) 
                    {
                        System.out.println("" + str.charAt(i) + str.charAt(j));
                    }
                    for (int k = 0; k < str.length(); k++) 
                    {
                        if (length == 3 && i != j && j != k && i != k) 
                        {
                            System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                        }
                    }
                }
            }
        }
    }
}
