public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;
    //********Language Constructor********
    public Language (String langName, int speakers, String region, String wdOrder){

        this.name = langName;
        this.numSpeakers = speakers;
        this.regionSpoken = region;
        this.wordOrder = wdOrder;
    }

    //Method to display Language info
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ". The language follows the word order: " + this.wordOrder + "." );
    }

    public static void main(String[] args){
        Language chontal = new Mayan("Chontal", 37000);
        Language mandarin = new SinoTibetan("Mandarin Chinese", 1000);
        Language burmese = new SinoTibetan("Burmese", 1399);

        Language [] languages = {chontal, mandarin, burmese};
        for (Language language:languages){
            language.getInfo();
        }
    }
}
