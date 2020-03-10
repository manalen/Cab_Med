package com.springoot.CabMed.Class;

public class Patient {

        private int id ;
        private String cin;
       

        public Patient(int id, String title) {
            this.id = id;
            this.cin= title;
           
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return cin;
        }

       

        public void setTitle(String title) {
            this.cin= title;
        }

       
    }


