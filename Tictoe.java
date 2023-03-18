import java.util.Arrays;
import java.util.Scanner;

public class Tictoe {
    public static void main(String[] args) {
   int i=1;
         char [][] Board={{' ',' ', ' '},{' ',' ', ' '},{' ',' ', ' '}};
        printGameBoard(Board);
        boolean check=false;
        while(check!=true) {
            System.out.println("now turn is player1");
            Scanner in = new Scanner(System.in);
            int target = in.nextInt();
            input(Board, target);
            check=CheckWin(Board);
            if(check==true)
            {
                System.out.println("player 1  WON THE GAME ");
                printGameBoard(Board);
                break;
            }
            printGameBoard(Board);
            System.out.println("now turn is player2");
            target = in.nextInt();
            input2(Board, target);

            printGameBoard(Board);
            check=CheckWin(Board);
            if(check==true)
            {
                System.out.println("player 2 WON THE GAME ");
                printGameBoard(Board);
                break;
            }

        }


    }

       static boolean CheckWin(char [][] Board)
      {
          for (int j = 0; j <3 ; j++) {
               if(Board[0][j]!=' ' && Board[0][j]==Board[1][j] && Board[1][j]==Board[2][j] )
               {
                   return true;
               }

          }
          for (int i = 0; i < 3; i++) {
              if( Board[i][0]!=' ' && Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2] )
              {
                  return true;
              }
          }
          if( (Board[0][0] != ' ' && Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2]) ||
                  ( Board[0][2]!=' ' && Board[0][2]==Board[1][1] && Board[1][1]==Board[2][0] )  )
          {
              return true;
          }

          return false;
      }

    static  void input2(char [][] Board,int target) {
        switch (target) {
            case 1:
                Board[0][0] = 'O';
                break;
            case 2:
                Board[0][1] = 'O';
                break;
            case 3:
                Board[0][2] = 'O';
                break;
            case 4:
                Board[1][0] = 'O';
                break;

            case 5:
                Board[1][1] = 'O';
                break;

            case 6:
                Board[1][2] = 'O';
                break;
            case 7:
                Board[2][0] = 'O';
                break;
            case 8:
                Board[2][1] = 'O';
                break;
            case 9:
                Board[2][2] = 'O';
                break;
            default:
                System.out.println("invalid entry");
        }
    }

    static  void input(char [][] Board,int target)
    {
        switch (target)
        {
            case 1 :
                Board[0][0]='X';
                break;
            case 2 :
                Board[0][1]='X';
                break;
            case 3 :
                Board[0][2]='X';
                break;
            case 4 :
                Board[1][0]='X';
                break;

            case 5 :
                Board[1][1]='X';
                break;

            case 6 :
                Board[1][2]='X';
                break;
            case 7:
                Board[2][0]='X';
                break;
            case 8:
                Board[2][1]='X';
                break;
            case 9:
                Board[2][2]='X';
                break;
            default:
                System.out.println("invalid entry");
        }
    }

    static  void printGameBoard( char [][] Board )
    {

        System.out.println( Board[0][0]+" |"+Board[0][1]+" |"+Board[0][2]+" ");
        System.out.println("____");
        System.out.println(Board[1][0]+" |"+Board[1][1]+" |"+Board[1][2]+" ");
        System.out.println("____");
        System.out.println( Board[2][0]+" |"+Board[2][1]+" |"+Board[2][2]+" ");

    }

}