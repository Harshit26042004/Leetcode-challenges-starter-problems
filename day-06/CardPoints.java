public class CardPoints {

        public int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length;
            int count = 0;
            int sum = 0;
            for(int i=n-1;i>=n-k;i--){
                sum += cardPoints[i];
            }
            count = sum;
            for(int i=0;i<k;i++){
                sum -= cardPoints[n-k+i];
                sum += cardPoints[i];
                count = count<sum?sum:count;
            }
            return count;


        }
}
