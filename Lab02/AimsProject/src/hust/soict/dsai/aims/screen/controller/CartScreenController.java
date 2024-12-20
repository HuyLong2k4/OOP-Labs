package hust.soict.dsai.aims.screen.controller;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
    private Cart cart;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TextField tfFilter;

    private FilteredList<Media> filteredMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private Button btnPlay;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;

    @FXML
    private Button btnRemove;

    @FXML
    private Label lblTotal;

    private MenuItem ViewStore;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    void PlayClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Thông báo");
        alert.setHeaderText(null);
        alert.setContentText("Bản nhạc đã chạy :>");
        alert.show();
    }

    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);

        ObservableList<Media> updatedList = FXCollections.observableArrayList(cart.getItemsOrdered());
        filteredMedia = new FilteredList<>(updatedList, p -> true);
        tblMedia.setItems(filteredMedia);
        tblMedia.refresh();
    }

    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
        // Code xử lý đặt hàng
        if(cart.getItemsOrdered().isEmpty()) {
            return;
        } else {
            float total = cart.totalCost();
            lblTotal.setText(total + " $");
        }
    }



    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));
        // Lấy danh sách các media trong giỏ hàng
        ObservableList<Media> mediaList = FXCollections.observableArrayList(cart.getItemsOrdered());

        // Khởi tạo FilteredList với ObservableList ban đầu
        filteredMedia = new FilteredList<>(mediaList, p -> true);
        tblMedia.setItems(filteredMedia);

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observableValue, Media oldValue, Media newValue) {
                        if(newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }
                }
        );
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }
        });
    }

    private void showFilteredMedia(String filterText) {
        // Kiểm tra nếu có văn bản nhập vào
        if (filterText != null && !filterText.isEmpty()) {
            String filterTextLower = filterText.toLowerCase(); // Chuyển thành chữ thường để so sánh không phân biệt hoa/thường

            // Áp dụng bộ lọc khi người dùng chọn "By Title"
            filteredMedia.setPredicate(media -> {
                if (radioBtnFilterTitle.isSelected()) {
                    return media.getTitle().toLowerCase().contains(filterTextLower); // Kiểm tra nếu tiêu đề chứa văn bản nhập vào
                }
                return true;
            });
        } else {
            filteredMedia.setPredicate(media -> true);
        }
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if(media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }
}
