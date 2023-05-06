module javafx_draw {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
