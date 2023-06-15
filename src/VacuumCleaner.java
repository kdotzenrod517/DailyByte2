public class VacuumCleaner {

    public static void main(String[] args) {
        System.out.println(vacuumReturnToStart("LR")); // true
        System.out.println(vacuumReturnToStart("URURD")); // false
        System.out.println(vacuumReturnToStart("RUULLDRD")); // true
    }

    // Runtime: O(N) where N is the number of moves the vacuum makes
    // Space complexity: O(1) or constant as we only need a few variables to solve the problem regardless of the number of moves the vacuum makes
    public static boolean vacuumReturnToStart(String moves){
        int UD = 0;
        int LR = 0;

        for(int i = 0; i < moves.length(); i++){
            char current = moves.charAt(i);
            if(current == 'U'){
                UD++;
            } else if (current == 'D'){
                UD--;
            } else if (current == 'L'){
                LR++;
            } else {
                LR--;
            }
        }

        return UD == 0 && LR == 0;
    }
}
