package com.springoot.CabMed.Class;

public class Patient {



        private int id ;
        private String title ;
        private  int prix ;

        public Patient(int id, String title, int prix) {
            this.id = id;
            this.title = title;
            this.prix = prix;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public int getPrix() {
            return prix;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setPrix(int prix) {
            this.prix = prix;
        }
    }


