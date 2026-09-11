class Pokemon{  //parent class or super class
    int power;
    String type;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }
    Pokemon(){

    }
    void print(){ //getter
        System.out.println(this.power+" "+this.type);
    }
}
class StrongPokemon extends Pokemon{ //sub class or child class 
    int speed;
}
class LegendaryPokemon extends Pokemon{ //sub class or child class 
    String ability;
}
class GodPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemon pikachu = new Pokemon();
        GodPokemon dialga = new GodPokemon();
    }    
}




// single inheritance
// LegendaryPokemon extends from Pokemon

//multiple inheritance
//LegendaryPokemon extends from Pokemon 
//Strongpokemon extends from Pokemon

//hierarchial inheritance
//LegendaryPokemon extends from Pokemon
//GodPokemon extends from LegendaryPokemon