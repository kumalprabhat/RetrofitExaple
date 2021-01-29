package com.example.retrofitexaple;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Objects {
        @SerializedName("0")
        @Expose
        private String _0;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("1")
        @Expose
        private String _1;
        @SerializedName("sid")
        @Expose
        private String sid;
        @SerializedName("2")
        @Expose
        private String _2;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("3")
        @Expose
        private String _3;
        @SerializedName("sub_category")
        @Expose
        private String subCategory;
        @SerializedName("4")
        @Expose
        private String _4;
        @SerializedName("title_eng")
        @Expose
        private String titleEng;
        @SerializedName("5")
        @Expose
        private String _5;
        @SerializedName("title_hindi")
        @Expose
        private String titleHindi;
        @SerializedName("6")
        @Expose
        private String _6;
        @SerializedName("title_kannada")
        @Expose
        private String titleKannada;
        @SerializedName("7")
        @Expose
        private String _7;
        @SerializedName("image")
        @Expose
        private String image;
        /*@SerializedName("8")
        @Expose
        private String _8;
        @SerializedName("voice")
        @Expose
        private String voice;
        @SerializedName("9")
        @Expose
        private String _9;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("10")
        @Expose
        private String _10;
        @SerializedName("status")
        @Expose
        private String status;*/

    public Objects(String id, String sid, String category, String sub_category, String title_eng, String title_hindi, String image, String title_kannada) {
        this.id=id;
        this.sid=sid;
        this.category=category;
        this.subCategory=sub_category;
        this.titleEng=title_eng;
        this.titleHindi=title_hindi;
        this.image=image;
        this.titleKannada=title_kannada;

    }

    public String get0() {
            return _0;
        }

        public void set0(String _0) {
            this._0 = _0;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String get1() {
            return _1;
        }

        public void set1(String _1) {
            this._1 = _1;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String get2() {
            return _2;
        }

        public void set2(String _2) {
            this._2 = _2;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String get3() {
            return _3;
        }

        public void set3(String _3) {
            this._3 = _3;
        }

        public String getSubCategory() {
            return subCategory;
        }

        public void setSubCategory(String subCategory) {
            this.subCategory = subCategory;
        }

        public String get4() {
            return _4;
        }

        public void set4(String _4) {
            this._4 = _4;
        }

        public String getTitleEng() {
            return titleEng;
        }

        public void setTitleEng(String titleEng) {
            this.titleEng = titleEng;
        }

        public String get5() {
            return _5;
        }

        public void set5(String _5) {
            this._5 = _5;
        }

        public String getTitleHindi() {
            return titleHindi;
        }

        public void setTitleHindi(String titleHindi) {
            this.titleHindi = titleHindi;
        }

        public String get6() {
            return _6;
        }

        public void set6(String _6) {
            this._6 = _6;
        }

        public String getTitleKannada() {
            return titleKannada;
        }

        public void setTitleKannada(String titleKannada) {
            this.titleKannada = titleKannada;
        }

        public String get7() {
            return _7;
        }

        public void set7(String _7) {
            this._7 = _7;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        /*public String get8() {
            return _8;
        }

        public void set8(String _8) {
            this._8 = _8;
        }

        public String getVoice() {
            return voice;
        }

        public void setVoice(String voice) {
            this.voice = voice;
        }

        public String get9() {
            return _9;
        }

        public void set9(String _9) {
            this._9 = _9;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String get10() {
            return _10;
        }

        public void set10(String _10) {
            this._10 = _10;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }*/
}
