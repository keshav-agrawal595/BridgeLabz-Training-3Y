import java.util.*;

public class StudentScoreCard {
    public static int[][] generateScores(int n) {
        int[][] scores=new int[n][3];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) scores[i][j]=10+(int)(Math.random()*90);
        }
        return scores;
    }
    public static double[][] calculateResults(int[][] scores) {
        double[][] res=new double[scores.length][3];
        for(int i=0;i<scores.length;i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;
            res[i][0]=total;
            res[i][1]=Math.round(avg*100.0)/100.0;
            res[i][2]=Math.round(per*100.0)/100.0;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] scores=generateScores(n);
        double[][] res=calculateResults(scores);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer");
        for(int i=0;i<n;i++) {
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+res[i][0]+"\t"+res[i][1]+"\t"+res[i][2]);
        }
    }
}
