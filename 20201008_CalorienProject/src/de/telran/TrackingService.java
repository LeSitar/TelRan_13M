package de.telran;

public class TrackingService {

    private int total;
    private int goal;
    private HistoryItem[] history;
    private int numberHistory =0;

    public TrackingService(int historyCapacity) {
        history = new HistoryItem[historyCapacity];
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getTotal() {
        return total;
    }

    public HistoryItem[] getHistory() {
        return history;
    }

    public int getNumberHistory() {
        return numberHistory;
    }

    public void addCalories(int amount){
        total +=amount;
        history[numberHistory] = new HistoryItem(amount, "add", ++numberHistory, total);
    }


    public void removeCalories(int amount){
        total-= amount;
        if (total<0) total =0;
        history[numberHistory] = new HistoryItem(amount, "remove", ++numberHistory, total);
    }

    public void displayHistory(){
        for (int i = 0; i < numberHistory ; i++) {
            System.out.println(history[i]);
        }
    }

    public boolean isGoalMet(){
        return total<= goal;
    }


}
