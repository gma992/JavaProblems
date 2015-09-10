import java.lang.reflect.Array;
import java.util.Arrays;


/*
* Our fruit guy has a bag of fruits (array of strings) where some fruits are rotten,
* he wants to replace all the rotten fruits by good ones.
*
* For example, given this array ["apple,rottenbanana,apple"] the replaced array should be
* ["apple,banana,apple"].
*
* Your task is to implement a method that will take as an argument an array of strings containing
* fruits and should return an array of strings where all the rotten fruits are replaced by good ones.

Note: if the array is null or empty you should return empty array ([]). the rotten fruit name will be
in this format rottenFruitname where is the 1st letter of the fruit name is uppercase. NB: The
returned array should be in LOWER case.
* */

/**
 * Created by Gabriel Maldonado on 10/09/15.
 */
public class FruitGuyV2 {

    public static String[] removeRotten(String[] fruitBasket) {

        String rottenCheck = "rotten";
        String[] newFruitBasket = new String[5];

        for (int i = 0; i < fruitBasket.length; i++){

            fruitBasket[i] = fruitBasket[i].toLowerCase();

            if (fruitBasket[i].contains(rottenCheck)){

                newFruitBasket[i] = fruitBasket[i].replace(rottenCheck, " ");

            } else if(fruitBasket[i] == null || fruitBasket[i].isEmpty()){

                newFruitBasket = new String[0];


            } else {

                newFruitBasket[i] = fruitBasket[i];

            }

        }
        System.out.print(Arrays.toString(newFruitBasket));
        return newFruitBasket;
    }

    public static void main(String[] args){

        String[] fruitBasket = {"apple","rottenBanana","apple", "", ""};
        removeRotten(fruitBasket);
    }
}
