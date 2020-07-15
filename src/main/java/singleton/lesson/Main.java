package singleton.lesson;

class Main {
    public static void main(String[] args) {

        // initializing GameEngine
        GameEngine engine = GameEngine.getInstance();

        // getting existing instance
        GameEngine engine2 = GameEngine.getInstance();

        // returns true
        System.out.println(engine == engine2);

        // using enum instead of a class to implement a singleton
        GameEngineEnum gameEngineEnum = GameEngineEnum.INSTANCE;
        gameEngineEnum.run();
    }
}
