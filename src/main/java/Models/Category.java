package Models;

import com.sun.istack.NotNull;

import javax.persistence.*;


    @Entity
    @Table(name = "categories")

    public class Category {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "category_name")
        private @NotNull String categoryName;

        @Column(name = "category_description")
        private String description;
        @Column(name = "category_image")
        private String imageURL;

        public Category() {}

        public Category(String categoryName, String description, String imageURL) {
            super();
            this.categoryName = categoryName;
            this.description = description;
            this.imageURL = imageURL;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImageURL() {
            return imageURL;
        }

        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }
    }

