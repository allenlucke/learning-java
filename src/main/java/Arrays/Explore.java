package Arrays;

public class Explore {
    public static void main(String[] args) {
        String[] friends = {"Ben", "Alena", "Jerry"};

        //Iterating using the enhanced for loop
        for (String friend : friends) {
            System.out.printf("Hey %s! The movie starts at 7, See you there! %n", friend);
        }
        //Iterating using the standard for loop
        for(int i = 0; i < friends.length; i++) {
            String friend = friends[i];
            System.out.printf("Hey %s! The movie starts at 7, See you there! %n", friend);
        }

        int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};

        for(int i =0; i < bensScoreCard.length; i++) {
            System.out.printf("Hole #%d: %d %n",
                    i + 1,
                    bensScoreCard[i]);
        }

    }
}
