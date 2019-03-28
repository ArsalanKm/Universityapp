package Controller.Student.admin;

import Model.pageLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

import static Model.Teacher.TeacherClass.CLASS_LIST;


public class ClassesList {
    @FXML
    ListView ClassesListListView;
    @FXML
    Button BackBtm;

    public void initialize() {
        ClassesListListView.getItems().addAll(CLASS_LIST);

    }

    public void back() throws IOException {
        new pageLoader().LoadScene("../Vieww/admin/adminPanelController.fxml");

    }
}
//
//package Controller.Student;
//
//        import Model.PageLoader;
//        import Model.Teacher.CreatClass;
//        import javafx.event.ActionEvent;
//        import javafx.fxml.FXML;
//        import javafx.scene.control.Alert;
//        import javafx.scene.control.ListView;
//        import javafx.scene.input.MouseEvent;
//        import  static Controller.Student.loginController.temp;
//
//        import java.io.IOException;
//        import java.util.ArrayList;
//        import java.util.List;
//
//public class classList {
//
//    private List<String> personalList = new ArrayList<>();
//
//    @FXML
//    private ListView<String> listView ;
//
//    private  static  int selectedIndex ;
//
//
//
//    public  void  initialize(){
//
//        listView.getItems().addAll(CreatClass.CLASS_LIST);
//    }
//
//    public void findIndex(MouseEvent mouseEvent) {
//
//        listView.setOnMouseClicked(event -> {
//            selectedIndex = listView.getSelectionModel().getSelectedIndex();
//            System.out.println(selectedIndex);
//        });
//        System.out.println(selectedIndex);
//
//
//    }
//
//    public void back(ActionEvent actionEvent) throws IOException {
//        new PageLoader().load("../View/Student/page.fxml");
//    }
//
//    public void join(ActionEvent actionEvent) {
//        boolean hasBeenInTheList = false ;
//
//        CreatClass tempJoinClass = new CreatClass();
//        tempJoinClass = CreatClass.ALL_CREAT_CLASS.get(selectedIndex);
//
//
//
//
//        for (int i = 0; i < temp.JOINED_CLASS.size(); i++)
//            if (tempJoinClass.makeString().equalsIgnoreCase(temp.JOINED_CLASS.get(i))) {
//                hasBeenInTheList = true;
//                break;
//            }
//
//        //  System.out.println(tempJoinClass.makeString());
//        //System.out.println(temp.JOINED_CLASS.get(i));
//        if (hasBeenInTheList == true) {
//            Alert alert = new Alert(Alert.AlertType.ERROR, "You have already joined this class .1.. ");
//            alert.showAndWait();
//        } else {
//
//            if (tempJoinClass.getCapacity() > 0) {                                                             // join the class
//
//                temp.JOINED_CLASS.add(CreatClass.CLASS_LIST.get(selectedIndex));
//                tempJoinClass.capacity--;
//                //  temp.JOINED_CLASS.add(CreatClass.CLASS_LIST.get(selectedIndex));
//                // CreatClass.CLASS_LIST.remove(selectedIndex);
//                listView.getItems().setAll(CreatClass.CLASS_LIST);
//
//
//            } else {
//                Alert alert = new Alert(Alert.AlertType.ERROR, "The class capacity is fulL");
//                alert.showAndWait();
//            }
//        }System.out.println(tempJoinClass.getCapacity());
//
//    }
//}
