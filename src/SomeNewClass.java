public class SomeNewClass {
    private String text;

    public SomeNewClass(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    void showText(String text){
         System.out.println(text);
    }
}
