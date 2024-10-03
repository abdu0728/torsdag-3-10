import java.util.ArrayList;
public class GameMenu{
private ArrayList<String> actions;

public GameMenu(ArrayList<String> actions){
this.actions = actions;

}
public void addAction(String action) {
        actions.add(action);



}

public ArrayList<String> getActions() {
        return actions;

}
public void displayMenu(){

for(int i = 0; i<actions.size(); i++){

	System.out.println(actions.get(i));
}


}

}
