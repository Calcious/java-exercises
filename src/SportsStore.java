/**
 * Created by Calcious on 11/22/16.
 */


public class SportsStore {
    public static void main(String[] args) {
        String[][] storesAndArticles = {
                {"Skechers retail", "Champs sports", "Lids", "TX Sporting", "Dunham's sports"},
                {"Badminton", "Motor sports", "Wrestling", "Golf", "Tennis", "Soccer", "Ice hockey", "Lids", "Basketball", "American football"},
                {"20", "100", "35", "48", "52", "66", "78", "12", "23", "75"}
        };
        for (int i = 0; i < storesAndArticles.length; i++)
        {
            System.out.println(storesAndArticles[i][i]);
        }
    }
}

//    The owner of a chain of sporting goods stores wants to control their
//        sales through a system. The input data is:
//
//        * The system must show the name of her 5 stores. Save this information
//        in an array
//        - [1] Skechers retail
//        - [2] Champs sports
//        - [3] Lids
//        - [4] TX Sporting
//        - [5] Dunham's sports
//        Let the owner enter the number of the store.
//        * Use another array to store the sport of the article
//        - [1] Badminton
//        - [2] Motor sports
//        - [3] Wrestling
//        - [4] Golf
//        - [5] Tennis
//        - [6] Soccer
//        - [7] Ice hockey
//        - [8] Basketball
//        - [9] Baseball
//        - [10] American football
//        Let the owner enter the number for the sport
//        * The cost of the article.
//
//        You must store all this information in a multidimensional array. Let's
//        say the input is as follows:
//
//        ```
//        Store         Sport    Price
//        TX Sporting   Soccer   20
//        TX Sporting   Golf     100
//        Champs sports Tennis   30
//        Champs sports Baseball 35
//        ```
//
//        This is how your array should look like.
//
//        ```
//        {
//        {4, 6, 20},
//        {4, 4, 100},
//        {2, 5, 30},
//        {2, 9, 35}
//        }
//        ```
//
//        Your code should be in a loop until the end of the day. Your loop should
//        finish if the owner answers `yes` to the question `Is this the last product?`
//
//        Write the Java code that calculates at the end the following:
//
//        * Total day sales for each store
//        * Total sales for each of the sports.
//        * Total sales of all stores.