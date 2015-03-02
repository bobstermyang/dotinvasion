package configuration;

/**
 * Created by Bobby Yang on 05/02/15.
 */
public class Configuration {

    public static final String GAME_NAME = "Square Invasion";

    //ADMOB IDS
    public static final String AD_UNIT_ID_BANNER = "ca-app-pub-3187658895150755/8159293424";
    public static final String AD_UNIT_ID_INTERSTITIAL = "ca-app-pub-3187658895150755/317069062";
    public static final float AD_FREQUENCY = 0.5f; //Number between 0 and 1



    //In APP PURCHASES IDS
    public static boolean IN_APP_PURCHASES = true;
    public static String ENCODED_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjxNbMBlae/Qavo5j+18WZpFMa5BN2W16C1jVLazjdu56XOr+0TE8iFIZ+TxiTn3VduJm9OSN3sm8jPilGlyS2TXpas/Iq/kADvcgwqiQmgv1OP6wGI9UaNu3t+NCA88umqEi8lbyNg8Lb07eJ/v4633Axhi3xSANB5y8Gu6RxwfETl2kQWUUwLdVH/iZeXtv+4kaxSINbHR5Ctu6tFnZE9/B98m0nXPPhQvn7LxVA5w8NU7eiszrHM4ysfteU19YjH7WD0yZKUrLaP8yJuVEVEqcDcpJcpv0OSaSKxyS59ZjGRJPn/mFx3CWeXmvxqlgX2pb6hoN8t4RjKRC61sKDwIDAQAB";
    public static String PRODUCT_ID = "100coins"; //Will give 100 coins to the user

    //LEADERBOARDS
    public static final String LEADERBOARD_HIGHSCORE = "CgkIlsXglusXEAIQAQ";
    public static final String LEADERBOARD_GAMESPLAYED = "CgkIlsXglusXEAIQAQ";

    //ACHIEVEMENTS
    public static final String SCORE_10 = "CgkIlsXglusXEAIQCA";
    public static final String SCORE_25 = "CgkIlsXglusXEAIQCQ";
    public static final String SCORE_50 = "CgkIlsXglusXEAIQCg";
    public static final String SCORE_100 = "CgkIlsXglusXEAIQCw";
    public static final String SCORE_150 = "CgkIlsXglusXEAIQDA";

    public static final String GAMESPLAYED_10 = "CgkIlsXglusXEAIQAw";
    public static final String GAMESPLAYED_25 = "CgkIlsXglusXEAIQBA";
    public static final String GAMESPLAYED_50 = "CgkIlsXglusXEAIQBQ";
    public static final String GAMESPLAYED_75 = "CgkIlsXglusXEAIQBg";
    public static final String GAMESPLAYED_100 = "CgkIlsXglusXEAIQBw";

    //COLORS of SQUARES
    public static final String COLOR_SQUARE_1 = "#c0392b";
    public static final String COLOR_SQUARE_2 = "#27ae60";
    public static final String COLOR_CENTER_SQUARE_1 = "#a32f23";
    public static final String COLOR_CENTER_SQUARE_2 = "#1d8f4c";
    public static final String COLOR_GOLD_SQUARE = "#f1c40f";

    //COLORS GENERAL
    public static final String COLOR_BACKGROUND = "F1F1F1";
    public static final String COLOR_FONT = "FFFFFF";
    public static final String COLOR_BANNER_WITH_SCORE = "#2980b9";
    public static final String COLOR_BANNER_WITH_GOLD_SQUARES = "#2980b9";
    public static final String COLOR_PAUSE_BUTTON = "#7f8c8d";

    //COLORS BUTTONS
    public static final String COLOR_PLAY_BUTTON = "#27ae60";
    public static final String COLOR_LEADERBOARD_BUTTON = "#c0392b";
    public static final String COLOR_ACHIEVEMENT_BUTTON = "#f1c40f";
    public static final String COLOR_RETURN_HOME_BUTTON = "#c0392b";
    public static final String COLOR_SHARE_BUTTON = "#2980b9";
    public static final String COLOR_SAVE_ME_BUTTON = "#c0392b";
    public static final String COLOR_IN_APP_PURCHASES_BUTTON = "#3b5998";

    //COLORS BANNERS
    public static final String COLOR_GAME_NAME_BANNER = "#34495e";
    public static final String COLOR_SCORE_BANNER = "#465e75";
    public static final String COLOR_HIGH_SCORE_BANNER = "#465e75";
    public static final String COLOR_GAMES_PLAYED_BANNER = "#465e75";

    //GAME VARIABLES
    public static final double MIN_TIME_BETWEEN_ENEMIES = 0.22; //TIME IN SECONDS
    public static final double MAX_TIME_BETWEEN_ENEMIES = 0.44; //TIME IN SECONDS
    public static final double GOLD_SQUARE_FREQUENCY = 0.07f; //FRECUENCY OF THE GOLD SQUARE TO APPEAR
    public static final int MAX_VELOCITY_OF_ENEMIES = 900;

    //GENERAL VARIABLES
    public static boolean DEBUG = false;


}
