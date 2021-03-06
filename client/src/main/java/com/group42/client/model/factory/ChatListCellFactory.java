package com.group42.client.model.factory;


import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import com.group42.client.model.Chat;

/**
 * This class creates a return new cell with an object
 * inside the container that displays the chat list.
 */
public class ChatListCellFactory implements Callback<ListView<Chat>, ListCell<Chat>> {

    /**
     * In general, this is the method that creates a new "ListCell" cell in the "ListView" list.
     * The list consists of these cells, which can display objects in themselves. In this case,
     * when you add a new Chat object to the ListView chat list, the user will only see the chat name.
     */
    @Override
    public ListCell<Chat> call(ListView<Chat> param) {
        return new ListCell<Chat>() {
            @Override
            protected void updateItem(Chat item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null) {
                    setText(item.getChatName());
                } else {
                    setText("");
                }
            }
        };
    }


}
