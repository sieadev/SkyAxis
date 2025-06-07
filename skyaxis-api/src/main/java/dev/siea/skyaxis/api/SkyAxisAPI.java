package dev.siea.skyaxis.api;


public class SkyAxisAPI {
    private static SkyAxisAPI instance;

    public static SkyAxisAPI getInstance() {
        if (instance == null) {
            throw new IllegalStateException("SkyAxisAPI is not initialized!");
        }
        return instance;
    }

    public static void initialize(SkyAxisAPI api) {
        if (instance != null) {
            throw new IllegalStateException("SkyAxisAPI is already initialized!");
        }
        instance = api;
    }

}