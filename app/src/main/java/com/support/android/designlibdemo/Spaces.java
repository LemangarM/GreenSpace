package com.support.android.designlibdemo;

import java.util.Random;

/**
 * Created by Mohamed on 10/12/2016.
 */
public class Spaces {

    private static final Random RANDOM = new Random();

    public static int getRandomSpaceDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.space_1;
            case 1:
                return R.drawable.space_2;
            case 2:
                return R.drawable.space_3;
            case 3:
                return R.drawable.space_4;
            case 4:
                return R.drawable.space_5;
        }
    }

    public static final String[] sSpaceStrings = {

            "aaaa", "bbbb"

//            "Square Laurent Prache", "Square Ozanam", "Jardin des Champs Elysées",
//            "SQUARE DU VERT GALANT", "Square Boucicaut", "Square Pierre de GAULLE",
//            "Square Santiago du Chili","Square des Recollets", "Jardin de l'église St-Jean-Denys"

    };

}
