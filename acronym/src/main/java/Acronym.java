class Acronym {

    private String[] wordArray;
    private String acronym = "";
    private String phraseToConvert;

    Acronym(String phrase) {
        this.phraseToConvert = phrase;
    }

    String get() {
        wordArray = phraseToConvert.split("\\W+");
        for (int i=0; i < wordArray.length; i++) {
            acronym += wordArray[i].toUpperCase().charAt(0);
        }

        return acronym;
    }
}