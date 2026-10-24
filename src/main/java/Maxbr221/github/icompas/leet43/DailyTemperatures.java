package Maxbr221.github.icompas.leet43;

public class DailyTemperatures {
    //temperaturas = [73,74,75,71,69,72,76,73]
    // Saída: [1,1,4,2,1,1,0,0]
    public int[] dailyTemperatures(int[] temperatures) {
        int[] dias = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int count = 0;
            for(int j = i + 1; j < temperatures.length; j++){
                count++;
                if(temperatures[j] > temperatures[i]){
                    dias[i] = count;
                    break;
                }else{
                    dias[i] = 0;
                }
            }
        }
        return dias;
    }
}
