package observer;

import javafx.scene.layout.GridPane;

public interface Observable {
	public void addObserver(Observer obs);

	public void removeObserver();

	public void notifyObserver(GridPane gp);
}
