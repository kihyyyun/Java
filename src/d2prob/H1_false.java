package d2prob;

import java.util.Scanner;

public class H1_false {
    public static void main(String[] args) {
        //H1
        //어떤 야구단의 승, 무승부, 패가 입력된다.
        //이 야구단의 승률 (승 / (승 + 패))를, 소숫점 세번째 자리 까지, 아래와 같이 출력하여라.
        //86승 2무 56패 승률: 0.606
























       Scanner scanner = new Scanner(System.in);

        int win  = scanner.nextInt();
        int drew = scanner.nextInt();
        int lose = scanner.nextInt();
        double winrate =((double) win / (win+lose));

        //System.out.printf(win+"승 "+drew+"무 "+lose+"패 "+ "승률: %.3f", winrate);
        System.out.println(String.format("%d승 %무 %d패 승률 : %.3f", win,drew,lose, winrate));


    }
}
