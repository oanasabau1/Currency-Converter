public class Main{
    public static void main(String[] args) {
        //I've developed the program using the MVC (Model-View-Controller) architecture
        ConverterModel model=new ConverterModel();
        ConverterView view=new ConverterView(model);
        ConverterController controller=new ConverterController(model, view);
    }
}