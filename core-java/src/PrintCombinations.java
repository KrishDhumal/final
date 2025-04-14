public class PrintCombinations {

    public static void main(String[] args) {
        String str = "abc";

        for (int n = 1; n <= 3; n++) 
        {
            for (int i = 0; i < str.length(); i++) 
            {
                if (n == 1) 
                {
                    System.out.println(str.charAt(i));
                }
                for (int j = 0; j < str.length(); j++) 
                {
                    if (n == 2 && i != j) 
                    {
                        System.out.println("" + str.charAt(i) + str.charAt(j));
                    }
                    for (int k = 0; k < str.length(); k++) 
                    {
                        if (n == 3 && i != j && j != k && i != k) 
                        {
                            System.out.println("" + str.charAt(i) + str.charAt(j) + str.charAt(k));
                        }
                    }
                }
            }
        }
    }
}
