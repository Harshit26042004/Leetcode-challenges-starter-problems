public class HarshadNumber {

        public int sumOfTheDigitsOfHarshadNumber(int x) {
            int out = -1;
            int sum = 0;
            int temp = x;
            while(temp>0){
                sum += temp%10;
                temp/=10;
            }
            if(x%sum==0){
                return sum;
            }
            return out;
        }

}
