package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene;

    BorderPane layout;
    @Override
    public void start(Stage primaryStage) throws Exception
    {
     window = primaryStage;
     window.setTitle("JavaFX_This is the title bar");

     //set window title image
        //Please connect to internet for this to load
        Image image = new Image("https://media-exp1.licdn.com/dms/image/C5103AQFk4qFdzDjcRg/profile-displayphoto-shrink_400_400/0?e=1596672000&v=beta&t=0E4mgBB1-nug6e1v_-8GjNTsr_t-sO-9N8ZOl-92Y8c");
        window.getIcons().add(image);

     //filemenu
        Menu fileMenu = new Menu("_File");

       //Handling file menu
        //menuitems
        MenuItem newfile = new MenuItem("New...");
        newfile.setOnAction(e -> System.out.println("Create a new File"));
        fileMenu.getItems().add(newfile);

        MenuItem openfile = new MenuItem("Open...");
        openfile.setOnAction(e -> System.out.println("Open a file from directory"));
        fileMenu.getItems().add(openfile);

        MenuItem savefile = new MenuItem("Save...");
        savefile.setOnAction(e -> System.out.println("Option to save file in desired directory"));
        fileMenu.getItems().add(savefile);


        fileMenu.getItems().add(new SeparatorMenuItem()); //create  a separator in the file menu

        MenuItem outfile = new MenuItem("Exit");
        outfile.setOnAction(e -> System.out.println("Option to exit from the window"));
        fileMenu.getItems().add(outfile);

        //Edit Menu
        Menu EditMenu = new Menu("_Edit");

        MenuItem cut = new MenuItem("Cut");
        cut.setOnAction(e->System.out.println("Cut selected text"));

        cut.setDisable(true);    //Disable Cut Option in Edit Menu
        EditMenu.getItems().add(cut);

        MenuItem pastetool = new MenuItem("Paste");
        pastetool.setOnAction(e->System.out.println("Paste the text on clipboard"));
        EditMenu.getItems().add(pastetool);




        //Menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(EditMenu);

        //Button control in the Center of the window
        Button button = new Button("Button Tool");
        button.setOnAction(e->System.out.println("This is a button"));

        //Setting Layout of the window

     layout = new BorderPane();
     layout.setTop(menuBar);
     layout.setCenter(button);
     layout.setBottom(new Label("The Window bottom lies here"));

     scene = new Scene(layout, 400, 400);
     window.setScene(scene);
     window.show();
    }
//Main Function
    public static void main(String[] args)
    {
        System.out.println("This program is an attempt at learning JavaFX");
        System.out.println("The menus shall print output here: ");
        System.out.println("Please connect to the internet for the favicon to load");
        System.out.println("The cut button in Edit Menu is set to disable");
        System.out.println(" ");
        launch(args);   //launch the program
    }
}
