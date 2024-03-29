package vues.communs;

import amazon_projet.Recup_image;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextAlignment;

public class Produit extends VBox {

	private int idProduct;
	private Label article;
	private String imgPath;
	private ImageView imView;
	private Label prix;
	private Label description;
	private String categorieProduct;

	public Produit(int id, String img, String nomArticle, String price, String txt, String categorie) {

		this.idProduct = id;
		this.article = new Label(nomArticle);
		this.imgPath = img;
		Recup_image recup = new Recup_image(this.imgPath);
		this.imView = new ImageView(recup.getImg());
		this.imView.setFitHeight(80);
		this.imView.setFitWidth(80);
		this.article.setGraphic(imView);
		this.article.setContentDisplay(ContentDisplay.TOP);
		this.prix = new Label(price + "€");
		this.description = new Label(txt);
		this.categorieProduct = categorie;
		VBox.setMargin(this.description, new Insets(2, 2, 2, 2));
		VBox.setMargin(this.prix, new Insets(2, 2, 2, 2));
		VBox.setMargin(this.article, new Insets(2, 2, 2, 2));

		this.article.setFont(Font.font("Arial", 20));
		this.article.setWrapText(true);
		this.article.setMaxWidth(100);
		this.article.setAlignment(Pos.CENTER);
		this.article.setTextAlignment(TextAlignment.CENTER);
		this.prix.setFont(new Font("Arial", 25));
		this.prix.setTextFill(Color.ORANGE);
		this.prix.setWrapText(true);
		this.prix.setMaxWidth(100);
		this.prix.setAlignment(Pos.CENTER);
		this.prix.setTextAlignment(TextAlignment.CENTER);
		this.description.setFont(Font.font("Arial", FontPosture.ITALIC, 15));
		this.description.setWrapText(true);
		this.description.setMaxWidth(100);
		this.description.setAlignment(Pos.CENTER);
		this.description.setTextAlignment(TextAlignment.CENTER);

		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(8, 8, 8, 8));
		this.setAlignment(Pos.CENTER);
		this.getChildren().add(article);
		this.getChildren().add(prix);
		this.getChildren().add(this.description);
	}

	public int getIdProduct() {
		return idProduct;
	}

	public Label getArticle() {
		return this.article;
	}

	public ImageView getImView() {
		return this.imView;
	}

	public Label getPrix() {
		return this.prix;
	}

	public Label getDescription() {
		return this.description;
	}

	public String getCategorieProduct() {
		return categorieProduct;
	}

	public boolean equals(Produit prod) {
		if (this.getIdProduct() == prod.getIdProduct())
			return true;
		else
			return false;
	}

	public String getImgPath() {
		return imgPath;
	}
}
