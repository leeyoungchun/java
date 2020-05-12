package homework3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class Controll {

	@FXML ComboBox combox;
	@FXML TextField textfield;
	@FXML Button btn;
	@FXML TableView<PostVO> tableview;
	@FXML TableColumn<PostVO,String> num;
	@FXML TableColumn<PostVO,String> sido;
	@FXML TableColumn<PostVO,String> gugun;
	@FXML TableColumn<PostVO,String> dong;
	@FXML TableColumn<PostVO,String> bungi;
	private ObservableList<PostVO> allTableData;
	
	public void initialize() {
		
		
		 combox.getItems().addAll("동이름", "우편번호");
	     combox.setValue("동이름");
		
		num.setCellValueFactory(new PropertyValueFactory<>("num"));
		sido.setCellValueFactory(new PropertyValueFactory<>("sido"));
		gugun.setCellValueFactory(new PropertyValueFactory<>("gugun"));
		dong.setCellValueFactory(new PropertyValueFactory<>("dong"));
		bungi.setCellValueFactory(new PropertyValueFactory<>("bungi"));
		
		allTableData = FXCollections.observableArrayList();

		//allTableData.add(new PostVO("1", "홍길동1", "대전1"));
		
	}
	
	
	
	
	@FXML public void btnClick() {
		
	}

}
