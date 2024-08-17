package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuitemSellerAction(){
		System.out.println("onMenuitemSellerAction");
	}
	
	@FXML
	public void onmenuItemDepartmentAction(){
		System.out.println("onmenuItemDepartmentAction");
	}
	
	@FXML
	public void onmenuItemAboautAction(){
		System.out.println("onmenuItemAboautAction");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	

}
