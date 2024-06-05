public class Chickens01 {
    int eggsPerChicken = 5;
    int chickenCount = 3;
    int eggsPerChicken2 = 4;
    int chickenCount2 = 8;
    
    public int Segunda() //calcula os ganhos de segunda
    {
         int segunda = eggsPerChicken * chickenCount;
         return segunda;
    }
    
    public int Terca()  //calcula os ganhos de terca
    {
        chickenCount++;
        int terca =  eggsPerChicken * chickenCount;
        return terca;
    }
    
    public int Quarta()  //calcula os ganhos de quarta
    {
        int newChicken = chickenCount / 2;
        int quarta =  newChicken * eggsPerChicken;
        return quarta;
    }
    
     public int Segunda2()//calcula os ganhos de segunda 2
    {
         int segunda2 = eggsPerChicken2 * chickenCount2;
         return segunda2;
    }
    
    public int Terca2() //calcula os ganhos de terca 2
    {
        chickenCount2++;
        int terca2 =  eggsPerChicken2 * chickenCount2;
        return terca2;
    }
    
    public int Quarta2()//calcula os ganhos de quarta 2
    {
        int newChicken2 = chickenCount2 / 2;
        int quarta2 =  newChicken2 * eggsPerChicken2;
        return quarta2;
    }
    
    
    public static void main(String[] args) {
       
        Chickens01 chicken = new Chickens01(); //recebe os dados
        int segunda =  chicken.Segunda();
        int terca =  chicken.Terca();
        int quarta = chicken.Quarta();
        
        int segunda2 =  chicken.Segunda2();//recebe os dados
        int terca2 =  chicken.Terca2();
        int quarta2 = chicken.Quarta2();
        
        int totalEggs = segunda + terca + quarta; //soma o total
         int totalEggs2 = segunda2 + terca2 + quarta2;//soma o total
         
        System.out.println(totalEggs); //mostra o total
        System.out.println(totalEggs2); //mostra o total

    }   
}
