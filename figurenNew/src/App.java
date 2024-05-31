public class App {
    public static void main(String[] args) throws Exception {
        Figur[] figuren = new Figur[10];
        figuren[0] = new Cat();
        figuren[1] = new Cat();
        figuren[2] = new Cat();
        figuren[3] = new Cat();
        figuren[4] = new Cat();
        figuren[5] = new Person();
        figuren[6] = new Person();
        figuren[7] = new Person();
        figuren[8] = new Person();
        figuren[9] = new Person();

        for(int i=0; i<figuren.length; i++){
           for(int j=1+i; j<figuren.length; j++){
               if(figuren[i].getHeight() > figuren[j].getHeight()){
                   Figur temp = figuren[i];
                   figuren[i] = figuren[j];
                   figuren[j] = temp;
               }
           }
        }
        private int spaceBetweenFigures = (int)(Math.random()*10+5);
        int totalWidthPanel = 0;
        int maxHeightPanel = 0;
            for(int i=0; i<figuren.length; i++){
            //totlwidthpanel are all the figures width and space between and bevor the first figure and after the last figure added together
            totalWidthPanel += figuren[i].getWidth();
            totalWidthPanel += spaceBetweenFigures*(figuren.length+1);
            if(figuren[i].getHeight() > maxHeightPanel){
             maxHeightPanel = figuren[i].getHeight();
            }
        }
        
    }
}
