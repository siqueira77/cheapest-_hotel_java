public class HotelReservation {
    String date = new String();
    int[] week_day = new int[3];
    int client = 0;
    int aux = 0;
    String cheapest = new String();

    /*Procura na string passada se existe a occorrencia da palavra da semana, se existir, ela é exluida da string
    e o vetor "week_day" recebe um atributo referente ao dia da semana, isso se repete 3 vezes*/
    /*Search at String there is the abbreviation of an e specific week day, if it exist, the abbreviation is erased,
    and the vector "week_day" receives a number, and repeat 3 times*/
    public void dateVerification (String input){
        this.date = input;
        int count = 0;
        while (count <3 ){ 
                if (this.date.contains("mon")){
                    this.week_day[this.aux]=2;
                    this.aux++;
                    this.date = this.date.replaceAll("mon", "");
                }else if (this.date.contains("tues)")){
                    this.week_day[this.aux]=3;
                    this.aux++;
                    this.date = this.date.replaceAll("tues", "");                    
                }else if (this.date.contains("wed)")){
                    this.week_day[this.aux]=4;
                    this.aux++;
                    this.date = this.date.replaceAll("wed", "");
                }else if (this.date.contains("thur)")){
                    this.week_day[this.aux]=5;
                    this.aux++;
                    this.date = this.date.replaceAll("thur", "");
                }else if (this.date.contains("fri)")){
                    this.week_day[this.aux]=6;
                    this.aux++;
                    this.date = this.date.replaceAll("fri", "");
                }else if (this.date.contains("sat)")){
                    this.week_day[this.aux]=7;
                    this.aux++;
                    this.date = this.date.replaceAll("sat", "");
                }else if (this.date.contains("sun)")){
                    this.week_day[this.aux]=1;
                    this.aux++;
                    this.date = this.date.replaceAll("sun", "");
                }else{
                    System.out.println("A data foi digitada de forma errada, insira novamente: ");
                }
            count++;
        }
    }

    //compara a existencia das palavras na string para poder atribuir qual tipo de cliente a pessoa eh
    //Compare the words in the string to set how type of client the person is
    public void clientVerefication (String input){
        if(this.date.contains("Regular")){
            this.client = 1;
        }else if (this.date.contains("Reward")){
            this.client=2;
        }else{
        System.out.println("O cliente foi digitado de forma incorreta");    
        }
    }

    //faz os calculos de precos usando o cliente escolhido
    //make the calculation of the price using the client chosen
    public String regularCalculation(){
        int valor1=0;
        int valor2=0;
        int valor3=0;
        for(int i=0; i<3; i++){
            if(this.week_day[i]==1 || this.week_day[i]==7){
                valor1 = valor1 + 90;
            }else{
                valor1 = valor1 + 110;
            }
        }
        for(int i=0; i<3; i++){
            if(this.week_day[i]==1 || this.week_day[i]==7){
                valor2 = valor2 + 60;
            }else{
                valor2 = valor2 + 160;
            }
        }
        for(int i=0; i<3; i++){
            if(this.week_day[i]==1 || this.week_day[i]==7){
                valor3 = valor3 + 150;
            }else{
                valor3 = valor3 + 220;
            }
        }
        if(valor1<valor2 && valor1<valor3){
            return "Lakewood";
        }else if(valor2<valor1 && valor2<valor3){
            return "Brigewood";
        }else{
            return "Ridgewood";
        }
    }

    //faz os calculos de precos usando o cliente escolhido
    //make the calculation of the price using the client chosen
    public String rewardCalculation(){
        int valor1=0;
        int valor2=0;
        int valor3=0;
        for(int i=0; i<3; i++){
            if(this.week_day[i]==1 || this.week_day[i]==7){
                valor1 = valor1 + 80;
            }else{
                valor1 = valor1 + 80;
            }
        }
        for(int i=0; i<3; i++){
            if(this.week_day[i]==1 || this.week_day[i]==7){
                valor2 = valor2 + 50;
            }else{
                valor2 = valor2 + 110;
            }
        }
        for(int i=0; i<3; i++){
            if(this.week_day[i]==1 || this.week_day[i]==7){
                valor3 = valor3 + 40;
            }else{
                valor3 = valor3 + 100;
            }
        }
        if(valor1<valor2 && valor1<valor3){
            return "Lakewood";
        }else if(valor2<valor1 && valor2<valor3){
            return "Brigewood";
        }else{
            return "Ridgewood";
        }
    }

    //faz a chamada inicial dos metodos retornando o hotel mais barato
    //make the initian call of methods returning the cheapest hotel
    public String getCheapestHotel (String input) {
        dateVerification(input);
        clientVerefication(input);
        
        if(this.client==1){
            cheapest=regularCalculation();
        }else{
            cheapest=rewardCalculation();
        }
        
        return cheapest;
    }
}
