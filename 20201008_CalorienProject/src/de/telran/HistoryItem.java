package de.telran;

public class HistoryItem {

    private int amount;
    private String operation;
    private int id;
    private int total;

    public HistoryItem(int amount, String operation, int id, int total) {
        this.amount = amount;
        this.operation = operation;
        this.id = id;
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HistoryItem)) return false;

        HistoryItem that = (HistoryItem) o;

        if (amount != that.amount) return false;
        if (id != that.id) return false;
        if (total != that.total) return false;
        return operation.equals(that.operation);

    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + operation.hashCode();
        result = 31 * result + id;
        result = 31 * result + total;
        return result;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", operation: " + operation +
                ", amount: " + amount +
                ", total calorie: " + total;
    }
}
