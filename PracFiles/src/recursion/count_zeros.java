package recursion;

public class count_zeros {
        public static void main(String[] args){
            int n = 3409007, count = 0;
            System.out.println(count(n,count));
        }

        public static int count(int n, int count){
            if( n == 0 ){
                return count;
            }
            if((n%10) == 0){
                return count(n/10, count+1);
            }else{
                 return count(n/10,count);
            }
        }

}
