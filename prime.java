public class prime{
    public static void main(String[] args) {
        int n = 50;
        // Prime(n);
        checkprime(n);
    }

    // public static void Prime(int n){
    //     Boolean [] br = new Boolean[n+1];

    //     for(int i = 0 ; i < n ;i++){
    //         br[i] = true ;
    //     }

    //     for(int i= 2 ; i * i <= n ; i++){
    //         for(int j = 2; j*i <= n ; j++){
    //             br[i*j] = false ;
    //         }
    //     }
    //     int count =0;
    //     for (int i = 1; i < br.length; i++) {
    //         if(br[i] == true){
    //             count++;
    //             System.out.println( i + " is prime");
                
    //         }
    //     }
    //     System.out.println(count);

    // }

    public static void checkprime(int n){
        int count =0;
        for (int i = 1; i <=50; i++) {
            if(chkprime(i)){
                System.out.println(i+ " is prime");
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean chkprime(int n){
        int count =0;
        for (int i = 2; i <= n/2; i++){
            if(n % i ==0){
                count++;
            }
        }
        if(count == 0){
            return true ;
        }
        return false ;
    }
}