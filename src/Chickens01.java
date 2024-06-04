public class Chickens01 {
    int eggsPerChicken = 5;
    int chickenCount = 3;
    int eggsPerChicken2 = 4;
    int chickenCount2 = 8;
    
    public int Segunda()
    {
         int segunda = eggsPerChicken * chickenCount;
         return segunda;
    }
    
    public int Terca()
    {
        chickenCount++;
        int terca =  eggsPerChicken * chickenCount;
        return terca;
    }
    
    public int Quarta()
    {
        int newChicken = chickenCount / 2;
        int quarta =  newChicken * eggsPerChicken;
        return quarta;
    }
    
     public int Segunda2()
    {
         int segunda2 = eggsPerChicken2 * chickenCount2;
         return segunda2;
    }
    
    public int Terca2()
    {
        chickenCount2++;
        int terca2 =  eggsPerChicken2 * chickenCount2;
        return terca2;
    }
    
    public int Quarta2()
    {
        int newChicken2 = chickenCount2 / 2;
        int quarta =  newChicken2 * eggsPerChicken2;
        return quarta2;
    }
    
    
    public static void main(String[] args) {
       
        Chickens01 chicken = new Chickens01();
        int segunda =  chicken.Segunda();
        int terca =  chicken.Terca();
        int quarta = chicken.Quarta();
        
        int totalEggs = segunda + terca + quarta;
        System.out.println(totalEggs);
    }   
}
