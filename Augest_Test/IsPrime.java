/**Write a Java program to check whether a given number is prime or not.

Input: 29

Output: 29 is a prime number. */

class isPrime{
   private int val;
   private boolean result = false;
  
  public isPrime(int val){
    this.val = val;
  }
  
  public void checkPrime(){
    for(int i = 1 ; i <= val/2 ; i++){
        if(val/i == 0){
          result = true;
        }
    }
  }

  public void checkResult(){
    checkPrime();
    if(!result){
        System.out.println("Prime Number : " + val);
    }
    else{
        System.out.println("Not Prime Number : " + val);
    }
  }
}
class Main{
    public static void main(String args[]){
       isPrime p = new isPrime(29);
       p. checkResult();
    }
}
