import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    int start,end,anyNumber;

    public PrimeNumbers() {

    }

    public PrimeNumbers(int x) {
        this.anyNumber = x;
    }

    public PrimeNumbers(int n, int m) {
        this.start = n;
        this.end = m;
    }

    public boolean checkPrime(int num)
    {
        boolean isPrime = false;
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public List<Integer> returnPrimes(){

        List<Integer> allPrimes = new ArrayList<Integer>();

        for(int i=start; i<=end; i++ )
        {
            if(checkPrime(i))
            {
                allPrimes.add(i);
            }
        }
        return allPrimes;
    }

}
