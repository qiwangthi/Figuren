public static void main(String[] args) throws Exception {
        int SpaceBetweenFigures = (int)(Math.random()*10+5);
        Figuren[] figuren = new Figuren[10];
        //0-4 are cats, 5-9 are persons
        for(int i=0; i<figuren.length; i++){
            if(i<5){
                figuren[i] = new Cat();
            }else{
                 figuren [i] = new Person();   
            }
        }
        //sort the figures by height
        for(int i=0; i<figuren.length; i++){
            for(int j=1+i; j<figuren.length; j++){
                if(figuren[i].getHeight() > figuren[j].getHeight()){
                    Figuren temp = figuren[i];
                    figuren[i] = figuren[j];
                    figuren[j] = temp;
               }     
           }
        }
        int totalWidthPanel = 0;
        int maxHeightPanel = 0;
        for(int i=0; i<figuren.length; i++){
            totalWidthPanel += figuren[i].getWidth()+spaceBetweenFigures*(figuren.length+1);
            if(figuren[i].getHeight() > maxHeightPanel){
                maxHeightPanel = figuren[i].getHeight();
            }
        }

        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setSize(totalWidthPanel, maxHeightPanel);
        panel.setBackground(color);
        /*for-Schleife von jeder Figur die Methode paintOnGraphics(g, offsetLegt, maxHeightPanel) aufgerufen werden und die Variable offsetLeft mit jeder gezeichneten Figur um deren Breite und einen spaceBetweenFigurs erhöht werden, sodass die Figuren auch nebeneinander angezeigt werden.
 */
        int offsetLeft = spaceBetweenFigures;
        for(int i=0; i<figuren.length; i++){
            figuren[i].paintOnGraphics(g, offsetLeft, maxHeightPanel);
            offsetLeft += figuren[i].getWidth() + spaceBetweenFigures;
        }
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

     

    

  

 


