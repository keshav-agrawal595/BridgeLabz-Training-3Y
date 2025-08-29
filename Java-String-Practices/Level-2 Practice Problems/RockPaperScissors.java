import java.util.Scanner;
public class RockPaperScissors {
    public static String getComputerChoice() {
        int r=(int)(Math.random()*3);
        if(r==0) return "rock";
        else if(r==1) return "paper";
        return "scissors";
    }
    public static int findWinner(String user,String comp){
        if(user.equals(comp)) return 0;
        if(user.equals("rock")&&comp.equals("scissors")) return 1;
        if(user.equals("scissors")&&comp.equals("paper")) return 1;
        if(user.equals("paper")&&comp.equals("rock")) return 1;
        return -1;
    }
    public static String[][] stats(int userWins,int compWins,int total){
        String[][] arr=new String[2][3];
        arr[0][0]="User";arr[1][0]="Computer";
        arr[0][1]=String.valueOf(userWins);
        arr[1][1]=String.valueOf(compWins);
        arr[0][2]=String.valueOf((userWins*100)/total);
        arr[1][2]=String.valueOf((compWins*100)/total);
        return arr;
    }
    public static void display(String[][] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\tWins:"+arr[i][1]+"\tWin%:"+arr[i][2]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int userWins=0,compWins=0;
        for(int i=0;i<games;i++){
            String user=sc.next();
            String comp=getComputerChoice();
            int res=findWinner(user,comp);
            if(res==1) userWins++;
            else if(res==-1) compWins++;
            System.out.println("User:"+user+" Computer:"+comp);
        }
        String[][] arr=stats(userWins,compWins,games);
        display(arr);
    }
}
