class SinoTibetan extends Language {
    SinoTibetan (String languageName, int speakers) {
        super(languageName, speakers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")){this.wordOrder = "subject-verb-object";}
    }
}
