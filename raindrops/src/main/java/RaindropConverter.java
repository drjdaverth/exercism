class RaindropConverter {

    private String raindropSpeak = "";

    String convert(int number) {
        if (number % 3 == 0)
            raindropSpeak += "Pling";
        if (number % 5 == 0)
            raindropSpeak += "Plang";
        if (number % 7 == 0)
            raindropSpeak += "Plong";
        return (raindropSpeak.isEmpty() ? Integer.toString(number) : raindropSpeak);
    }

}