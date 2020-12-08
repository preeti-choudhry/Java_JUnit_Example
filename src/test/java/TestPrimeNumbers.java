
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class TestPrimeNumbers {

    private List<Integer> primeResults;
    //List<Integer> primeResults = new ArrayList<Integer>();

    @Test
    public void testCheckPrime() throws IOException {
        System.out.println("Testing checkPrime() method!");
        try {
            File inputFile = new File("src/test/resources/test-input.txt");

            //BufferedReader br = new BufferedReader(new FileReader(inputFile));
            //int num = Integer.parseInt(br.readLine());

            Scanner in = new Scanner(inputFile);
            while (in.hasNextInt()) {
                int num = in.nextInt();
                System.out.println("Checking if " + num + " is Prime or Not!");
                PrimeNumbers pn = new PrimeNumbers();
                boolean result = pn.checkPrime(num);

                assertEquals(true, result);
                assertTrue("true",result);

                System.out.println(num + " is Prime");
            }

        } catch (IOException e) {
            System.out.print("File not found!!!");
        }
    }

    @Test
    public void testReturnPrimes() {

        System.out.println("Testing returnPrimes() method!");
        try {
            File inputFile = new File("src/test/resources/test-input.txt");

            Scanner in = new Scanner(inputFile);
            //while (in.hasNextInt()) {
                int a = in.nextInt();
                int b = in.nextInt();
                PrimeNumbers pn = new PrimeNumbers(a, b);
                primeResults = pn.returnPrimes();

                assertNotNull(primeResults);

                System.out.println("Prime numbers between " + a + " and " + b + ":");
                for (Iterator<Integer> it = primeResults.iterator(); it.hasNext(); ) {
                    Integer p = it.next();
                    System.out.println(p);

                }

            //}

        } catch (IOException e) {
            System.out.print("File not found!!!");
        }


    }

}

