public class Main {
    public static void main(String[] args) {

        String name = "YourName";
        float earthWeight = 83.f;
        float marsGravityPercentage = 0.31f;

        float marsWeightBielecki = earthWeight * marsGravityPercentage;


        System.out.println("Weight on Mars (float): " + marsWeightBielecki);


        double marsWeightDouble = marsWeightBielecki;

        System.out.printf("Weight on Mars (double): %.4f\n", marsWeightDouble);

        int marsWeightInt = (int) marsWeightDouble;
        System.out.println("Weight on Mars (int): " + marsWeightInt);

        char marsWeightChar = (char) marsWeightInt;
        System.out.println("Weight on Mars (char): " + marsWeightChar);

        int modifiedInt = marsWeightChar + 1;
        System.out.println("Modified Weight on Mars (int): " + modifiedInt);
    }
}