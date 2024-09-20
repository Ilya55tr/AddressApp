module AddressApp {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.prefs;
	
	opens ch.makery.address to javafx.graphics, javafx.fxml;
	opens ch.makery.address.model to javafx.graphics, javafx.fxml;
	opens ch.makery.address.view to javafx.graphics, javafx.fxml;
	opens ch.makery.address.util to javafx.graphics, javafx.fxml;
	
}
