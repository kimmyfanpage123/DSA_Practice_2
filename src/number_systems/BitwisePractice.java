package number_systems;

public class BitwisePractice {
    public static void main(String[] args) {
        int numberOne = 5;
        int numberTwo = 18;
        //int result = numberOne++ | 16 ^ numberTwo >> 2 % numberOne & 7;
        int resultOne = numberOne++;
        int resultTwo = 2 % numberOne;
        int resultThree = numberTwo >> resultTwo;
        int resultFour = resultThree & 7;
        int resultFive = 16 ^ resultFour;
        int resultSix = resultOne | resultFive;

        System.out.println(resultSix);
    }
}
